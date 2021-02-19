/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.math.BigInteger;
import java.util.Date;

public class ComparatorDto {

	int idData;
	Date data;
	BigInteger progressivo;
	
	
	public int getIdData() {
		return idData;
	}
	public void setIdData(int idData) {
		this.idData = idData;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public BigInteger getProgressivo() {
		return progressivo;
	}
	public void setProgressivo(BigInteger progressivo) {
		this.progressivo = progressivo;
	}

	public ComparatorDto() {
		

	}
	
	public ComparatorDto(int idData, Date data) {
		this.idData = idData;
		this.data = data;

	}
	
	public ComparatorDto(int idData, BigInteger progressivo) {
		this.idData = idData;
		this.progressivo = progressivo;

	}
}
