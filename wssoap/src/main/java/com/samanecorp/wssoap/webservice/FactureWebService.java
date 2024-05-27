package com.samanecorp.wssoap.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface FactureWebService {

	@WebMethod
	public FactureDto save(FactureDto factureDto);
	
	@WebMethod
	public FactureDto get(long idFacture);
}
