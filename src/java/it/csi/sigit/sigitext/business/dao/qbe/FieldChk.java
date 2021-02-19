package it.csi.sigit.sigitext.business.dao.qbe;

/**
 * 
 * @generated
 *
 */
public abstract class FieldChk {

	/**
	 * @generated
	 */
	public FieldChk mustBeTrue() {
		this.negate = false;
		return this;
	}

	/**
	 * @generated
	 */
	public FieldChk mustBeFalse() {
		this.negate = true;
		return this;
	}

	/**
	 * @generated
	 */
	protected boolean negate = false;

	/**
	 * @generated
	 */
	public void setNegate(boolean val) {
		negate = val;
	}

	/**
	 * @generated
	 */
	public boolean isNegate() {
		return negate;
	}
}
