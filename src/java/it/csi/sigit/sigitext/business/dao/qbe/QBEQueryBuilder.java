package it.csi.sigit.sigitext.business.dao.qbe;

import it.csi.sigit.sigitext.business.dao.metadata.DAOMetadata;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.log4j.Logger;
import it.csi.sigit.sigitext.business.dao.util.*;

/**
 * Classe per la costruzione dinamica delle query basate sugli esempi.
 * La classe e' generica e viene istanziata in ogni DataAccessObject
 * in modo da gestire le query relativamente ad un particolare tipo di 
 * esempi. 
 * @generated
 * @param <TEX> classe degli esempi
 */
public class QBEQueryBuilder<TEX extends AbstractExample> {

	protected static final Logger LOG = Logger.getLogger(Constants.APPLICATION_CODE);

	/**
	 * I metadati relativi al DataAccesObject a cui e' associato
	 * il query builder.
	 * @generated
	 */
	private final DAOMetadata metadata;

	/**
	 * Costruttore della classe QBEQueryBuilder.
	 * @generated
	 * @param metadata i metadati del DAO
	 */
	public QBEQueryBuilder(DAOMetadata p_metadata) {
		this.metadata = p_metadata;
	}

	/**
	 * Metodo di utilita' che produce una lista dei nomi delle colonne
	 * previste dalla tabella associata al DataAccessObject.
	 * Le informazioni sono prese dall'oggetto DAOMetadata fornito in input.
	 * @param md i metadati della tabella associata al DataAccessObject
	 * @return una stringa contenente i nomi dei parametri separati da ","
	 */
	private String formatColumnNames(DAOMetadata md) {
		if (md != null) {
			String[] names = md.getColumnNames();
			if (names != null) {
				StringBuilder ris = new StringBuilder("");
				String currName = null;
				for (int i = 0; i < names.length; i++) {
					currName = names[i];
					ris.append(currName);
					if (i < names.length - 1)
						ris.append(",");
				}
				return ris.toString();
			} else
				return "????";
		} else
			return "????";
	}

	/**
	 * (Per future evoluzioni)
	 * @param propName
	 * @param pkClass
	 * @return true se la property <propName> e' una property di PK all'interno del DTO
	 * corrispondente alla <pkClass>
	 */
	private boolean isInPK(String propName, Class exampleClass) {
		// per future evoluzioni.
		// per il momento restituisce sempre true
		return true;
	}

	/**
	 * Crea la query a partire dagli esempi forniti in input.
	 * Gli esempi forniti in input sono suddivisi in due insiemi:
	 * - gli esempi positivi
	 * - gli esempi negativi
	 * la query e' costruita in modo che vadano in output i record che 
	 * soddisfano almeno uno degli esempi positivi e che non soddisfano 
	 * nessuno degli esempi negativi.
	 * Relativamente a ciascun esempio un record soddisfa tale esempio
	 * se soddisfa tutti i FieldCheck in esso valorizzati. I FieldCheck 
	 * non valorizzati non conocorrono a costruire la query.
	 * Nel caso di DataAccessObject con LookupResolver, sono gestiti anche
	 * esempi con criteri su DTO di secondo livello (quelli relativi alle 
	 * tabelle gestite dai LookupResolver).
	 * In aggiunta, se il parametro usesDistinct e' valorizzato a true,
	 * viene inserita una clausola distinct.
	 * (N.B: l'utilita' di questa modalita' e' da verificare in quanto
	 * la keyword DISTINCT viene inserita davanti alla lista completa di 
	 * colonne...).
	 * N.B: a causa della forte dinamicita' della struttura della query, la query
	 * risultante non e' un prepared statement ma una query testuale
	 * gia' completa. questo rappresenta una potenziale fonte di problemi di sicurezza
	 * (SQL Injection). Il problema si elimina se vengono filtrati a monte i
	 * valori che vanno a finire nei filed check degli esempi (es. filtrando
	 * i campi della UI da cui tali valori derivano).   
	 * @generated
	 * @param posEx la lista degli esempi positivi
	 * @param negEx la lista degli esempi negativi
	 * @param usesDistinct se true inserisce la keyword DISTINCT in testa alla
	 *        clausola SELECT
	 * @return la stringa corrispondente alla query.
	 */
	public String createFromExamples(List<TEX> posEx, List<TEX> negEx, boolean usesDistinct) {

		String sql = "SELECT " + (usesDistinct ? "DISTINCT " : "") + formatColumnNames(metadata) + " FROM "
				+ metadata.getTableName() + " WHERE ";
		StringBuilder sqlSelect = new StringBuilder(sql);

		StringBuilder where = new StringBuilder("");
		String posExClause = "";
		String negExClause = "";
		if (posEx != null && !posEx.isEmpty()) {
			posExClause = createFromExamples(posEx, false);
		}
		if (negEx != null && !negEx.isEmpty()) {
			negExClause = createFromExamples(negEx, false);
		}
		if (posExClause.length() > 0 && negExClause.length() > 0) {

			where.append(posExClause + " AND NOT " + negExClause);
		} else {

			where.append(posExClause + negExClause); // uno dei due e' ""
			// rimuovo l'ultimo AND
		}

		sqlSelect.append("(");
		sqlSelect.append(where);
		sqlSelect.append(")");
		return sqlSelect.toString();

	}

	/**
	 * 
	 * @param examples lista di esempi
	 * @param conjunctive se true le singolk clausole sono unite dall'operatore AND, 
	 * se false da OR.
	 * @return la clausola derivante dalla concatenazione delle singole espressioni
	 * relative agli esempi, concatenate con AND o OR a seconda del valore del parametro
	 * conjunctive. Tutta la clausola &egrave; racchiusa da "(" e "(".
	 * (<expr_ex_1> AND|OR <expr_ex2> AND|OR ... <expr_ex_n>)
	 */
	public String createFromExamples(List<TEX> examples, boolean conjunctive) {
		StringBuilder clause = new StringBuilder("");
		String operator = conjunctive ? "AND " : " OR ";
		for (TEX ex : examples) {
			String currExClause = createWhereClauseForSingleExample(ex);
			clause.append(currExClause);
			if (!(examples.get(examples.size() - 1) == ex))
				clause.append(operator);
		}
		return "(" + clause.toString() + ")";
	}

	/**
	 * Crea una parte di clausola where a fronte di un singolo esempio.
	 * Per ogni FieldChk valorizzato aggiunge un termine della clausola.
	 * @param example
	 * @return l'espressione associata all'esempio.
	 * (<term_chk_1> AND <term_chk_2> .... <term_chk_n>)
	 */
	public String createWhereClauseForSingleExample(TEX example) {
		return createSubClause4Example(example, null, false);
	}

	/**
	 * crea una sotto-clausola per l'esempio specificato
	 * @param example
	 * @param prefixPropName prefisso (opzionale) che permette di seguire la struttura annidata
	 *                       degli examples in caso di LookupResolver. Se il metodo e' invocato
	 *                       con questo parametro non nullo significa che si sta costruendo una 
	 *                       sotto-clausola where relativa ad un example annidato.
	 *                       Funziona solo per un livello di annidamento.
	 * @param pkFieldsOnly se true => considera solo le property dell'example che sono in PK.
	 * @return
	 */
	public String createSubClause4Example(AbstractExample example, String prefixPropName, boolean pkFieldsOnly) {
		StringBuilder clause = new StringBuilder("");

		try {
			BeanInfo bi = Introspector.getBeanInfo(example.getClass());
			PropertyDescriptor pd[] = bi.getPropertyDescriptors();
			for (int i = 0; i < pd.length; i++) {
				PropertyDescriptor currPD = pd[i];
				if (FieldChk.class.isAssignableFrom(currPD.getPropertyType())
						&& (!pkFieldsOnly || isInPK(currPD.getName(), example.getClass()))) {
					FieldChk currChk = (FieldChk) (currPD.getReadMethod().invoke(example, new Object[]{}));
					if (currChk == null)
						continue;
					String term = createTerm4FieldChk(currChk, currPD, prefixPropName);
					clause.append(term + " AND ");
				} else if (AbstractExample.class.isAssignableFrom(currPD.getPropertyType())) {
					AbstractExample subEx = (AbstractExample) (currPD.getReadMethod().invoke(example, new Object[]{}));
					if (subEx == null)
						continue;
					String term = createSubClause4Example(subEx, currPD.getName(), true);
					clause.append(term + " AND ");
				}
			}
			// alla fine rimuove l'ultimo "AND"
			clause = new StringBuilder(clause.substring(0, clause.length() - 5));
		} catch (IntrospectionException e) {
			// TODO
			LOG.error("[QBEQueryBuilder::createSubClause4Example] creazione sotto-clausola", e);

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			LOG.error("[QBEQueryBuilder::createSubClause4Example] creazione sotto-clausola", e);

		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			LOG.error("[QBEQueryBuilder::createSubClause4Example] creazione sotto-clausola", e);

		}
		return "(" + clause.toString() + ")";
	}

	/**
	 * Formatta l'oggetto in modo che sia utilizzabile nella query costruita a partire
	 * dagli esempi.
	 * @param val
	 * @return
	 */
	public String formatValue(Object val) {

		String resultValue = "null";

		if (val != null) {
			if (val instanceof String) {
				return "'" + ((String) val).replaceAll("'", "''") + "'";
			}

			else if (val instanceof Number) {
				resultValue = val.toString();
			}

			else if (val instanceof java.util.Date) {
				resultValue = makeToDateTerm((java.util.Date) val);
			}

		}
		return resultValue;
	}

	/**
	 * crea l'espressione "to_date" da inserire nella query SQL
	 * @param date la data da utilizzare
	 * @return toDate('<data>','DD/MM/YYYY HH24:MI:SS')
	 */
	private static String makeToDateTerm(java.util.Date date) {
		StringBuilder retvalue = new StringBuilder("");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.DAY_OF_MONTH)) + "/");
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.MONTH) + 1) + "/");
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.YEAR)) + "-");
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.HOUR_OF_DAY)) + ":");
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.MINUTE)) + ":");
		retvalue.append(Integer.toString(cal.get(java.util.Calendar.SECOND)));
		retvalue = new StringBuilder("to_date('" + retvalue + "','DD/MM/YYYY HH24:MI:SS')");
		return retvalue.toString();
	}

	/**
	 * Crea il singolo termine della clausola WHERE per il singolo FieldCheck.
	 * Delega l'esecuzione a metodi specifici per i vari tipi di check.
	 * @param chk il check d ainserire nella clausola WHERE
	 * @param pd il property descriptor associato al check
	 * @param prefixPropName il prefisso per raggiungere la property (utilizzato
	 *        in caso di esempi annidati)
	 * @return
	 */
	public String createTerm4FieldChk(FieldChk chk, PropertyDescriptor pd, String prefixPropName) {
		if (chk instanceof EqChk)
			return createTerm4FieldChk((EqChk) chk, pd, prefixPropName);
		else if (chk instanceof RangeChk)
			return createTerm4FieldChk((RangeChk) chk, pd, prefixPropName);
		else if (chk instanceof RegexpChk)
			return createTerm4FieldChk((RegexpChk) chk, pd, prefixPropName);
		else if (chk instanceof NullChk)
			return createTerm4FieldChk((NullChk) chk, pd, prefixPropName);
		else if (chk instanceof InSetChk)
			return createTerm4FieldChk((InSetChk) chk, pd, prefixPropName);
		else
			throw new IllegalArgumentException("field check non gestito:" + chk.getClass());
	}

	/**
	 * Crea il singolo temrine della clausola WHERE, relativamente al check
	 * di tipo EqChk.
	 * - se il check ha il flag ignoreCase valorizzato a true il termine viene 
	 *   costruito secondo il pattern UPPER(lhs) = UPPER(rhs)
	 * - se il check contiene delle wildcard il termine viene costruito secondo 
	 *   il pattern lhs LIKE(rhs)
	 * - se il check e' negato il termine viene modificato di conseguenza  
	 * @param chk il check da inserire nella clausola WHERE
	 * @param pd il property descriptor associato al check
	 * @param prefixPropName il prefisso per raggiungere la property (utilizzato
	 *        in caso di esempi annidati)
	 * @return
	 */
	public String createTerm4FieldChk(EqChk chk, PropertyDescriptor pd, String prefixPropName) {
		String colName = metadata.getColumnName(prefixPropName, pd.getName());
		StringBuilder term = new StringBuilder("");
		term.append("(");
		String lside = chk.isIgnoreCase() ? "UPPER(" + colName + ")" : colName;
		String rside = chk.isIgnoreCase() ? "UPPER(" + formatValue(chk.getExVal()) + ")" : formatValue(chk.getExVal());
		if (!chk.valueHasWildcards()) {
			term.append(lside + (chk.isNegate() ? " <> " : " = ") + rside);
		} else {
			term.append(lside + (chk.isNegate() ? " NOT LIKE( " : " LIKE( ") + rside + ")");
		}
		term.append(")");
		return term.toString();
	}

	/**
	 * Crea il singolo temrine della clausola WHERE, relativamente al check
	 * di tipo NullChk.
	 * @param chk il check da inserire nella clausola WHERE
	 * @param pd il property descriptor associato al check
	 * @param prefixPropName il prefisso per raggiungere la property (utilizzato
	 *        in caso di esempi annidati)
	 * @return
	 */
	public String createTerm4FieldChk(NullChk chk, PropertyDescriptor pd, String prefixPropName) {
		String colName = metadata.getColumnName(prefixPropName, pd.getName());
		StringBuilder term = new StringBuilder("");
		term.append("(");
		term.append(colName + " IS " + (chk.isNegate() ? " NOT" : "") + " NULL");
		term.append(")");
		return term.toString();
	}

	/**
	 * Crea il singolo temrine della clausola WHERE, relativamente al check
	 * di tipo RangeChk.
	 * - se il check include o meno il lowerbound/upperbound, il termine viene 
	 *   modificato di conseguenza con l'eventuale utilizzo della clausola BETWEEN 
	 * @param chk il check d ainserire nella clausola WHERE
	 * @param pd il property descriptor associato al check
	 * @param prefixPropName il prefisso per raggiungere la property (utilizzato
	 *        in caso di esempi annidati)
	 * @return
	 */
	public String createTerm4FieldChk(RangeChk chk, PropertyDescriptor pd, String prefixPropName) {
		String colName = metadata.getColumnName(prefixPropName, pd.getName());
		StringBuilder term = new StringBuilder("");
		term.append("(");
		if (chk.isNegate())
			term.append("NOT ");
		if (chk.isLBIncluded() && chk.isUBIncluded()) {
			term.append(colName + " BETWEEN " + formatValue(chk.getLowerBound()) + " AND "
					+ formatValue(chk.getUpperBound()));
		} else {
			term.append(colName + (chk.isLBIncluded() ? " >= " : " > ") + formatValue(chk.getLowerBound()));
			term.append(" AND " + colName + (chk.isUBIncluded() ? " <= " : " < ") + formatValue(chk.getUpperBound()));
			if (chk.isNegate()) {
				term = new StringBuilder("(NOT " + term + ")");
			}
		}
		term.append(")");
		return term.toString();
	}
}
