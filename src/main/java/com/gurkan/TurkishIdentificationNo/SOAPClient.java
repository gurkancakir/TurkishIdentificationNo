package com.gurkan.TurkishIdentificationNo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class SOAPClient {
	

    public static void main(String args[]) throws Exception {
    	
    	//kontrol edilecek bilgiler
    	long tcno = 11111111111L;
    	String name = "GÜRKAN MUSTAFA";
    	String surname = "ÇAKIR";
    	int birthday = 1993;
    	
    	boolean sonuc = false;
    	
    	KPSPublicSoap tc = new KPSPublicSoapProxy();
    	
    	try{
        	 sonuc = tc.TCKimlikNoDogrula(tcno, name, surname, birthday);
    	}catch (NumberFormatException e) {
		   e.printStackTrace();
		}catch (RemoteException ex) {
		   ex.printStackTrace();
		}

    	System.out.println(sonuc == true ? "TC true" : "Tc false");
    }

}
