package com.gurkan.TurkishIdentificationNo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class IdentificationClient {
	
	private Person person = null;
	private KPSPublicSoap soap;
	private ResponseImp responseImp;
	
	public IdentificationClient(Person person) {
		this.person = person;
		soap  = new KPSPublicSoapProxy();
	}
	
	public Response checkIdentificationNo()
	{
		responseImp = new ResponseImp();
		List<String> err = new ArrayList<String>();
		responseImp.setErrors(err);
		
		try{
			responseImp.setValid(soap.TCKimlikNoDogrula(person.getTcNo(), person.getName().toUpperCase(), person.getSurname().toUpperCase(), person.getBirthday()));
		}catch (NumberFormatException e) {
			err.add(e.getMessage());
		}catch (RemoteException ex) {
			String errors = ex.getMessage().split("--->")[1];
			for (int i=0; i< errors.split("\n").length; i++)
				err.add(errors.split("\n")[i].trim());
		}
		return responseImp;
	}

}
