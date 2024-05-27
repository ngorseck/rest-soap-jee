package com.samanecorp.wssoap.webservice;


import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class FactureWebServiceImpl implements FactureWebService {

	@Override
	public FactureDto save(@WebParam(name =  "facture") FactureDto factureDto) {
		
		FactureDto facture = new FactureDto();
		facture.setId(1L);
		facture.setMontant(25000);
		
		
		return facture;
	}

	@Override
	public FactureDto get(@WebParam(name =  "idFacture") long idFacture) {
		
		FactureDto facture = new FactureDto();
		facture.setId(idFacture);
		facture.setMontant(25000);
		
		
		return facture;
	}

}
