/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.util.Comparator;

public class ComparatorUtil {
	
	public static Comparator<ComparatorDto> compareCamparatorDtoByData(){
		Comparator<ComparatorDto> result = new Comparator<ComparatorDto>() {
			
			public int compare(ComparatorDto o1, ComparatorDto o2) {
				
				int i = o2.getData().compareTo(o1.getData()); 
				
				return i;
			}
		};
		return result;
	}
	
	public static Comparator<ComparatorDto> compareCamparatorDtoByProgressivo(){
		Comparator<ComparatorDto> result = new Comparator<ComparatorDto>() {
			
			public int compare(ComparatorDto o1, ComparatorDto o2) {
				
				int i = o1.getProgressivo().compareTo(o2.getProgressivo()); 

				return i;
			}
		};
		return result;
	}
}