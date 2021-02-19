/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

/**
 * Filtro per cercare un utente per una certa funzionalita
 * 
 */
public class UtenteFunzionalitaFilter {

	/**
	 * User
	 */
	private Integer idUtente = null;
	
	/**
	 * User
	 */
	private String user = null;
	
	/**
	 * Pwd
	 */
	private String pwd = null;
	
	/**
	 * Id funzionalita
	 */
	private Integer idFunzionalita = null;

	
	public UtenteFunzionalitaFilter()
	{
		
	}
	
	public UtenteFunzionalitaFilter(String user, String pwd, Integer idFunzionalita)
	{
		this.user = user;
		this.pwd = pwd;
		this.idFunzionalita = idFunzionalita;
	}
	
	public UtenteFunzionalitaFilter(Integer idUtente, Integer idFunzionalita) 
	{
		this.idUtente = idUtente;
		this.idFunzionalita = idFunzionalita;
	}
	
	public Integer getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getIdFunzionalita() {
		return idFunzionalita;
	}

	public void setIdFunzionalita(Integer idFunzionalita) {
		this.idFunzionalita = idFunzionalita;
	}
	
	
	
	
}
