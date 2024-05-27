package com.samanecorp.wsrest.rs;

import com.samanecorp.wsrest.dto.FactureDto;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/factures")
public class FactureController {

	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public FactureDto save () {
		
		FactureDto facture = new FactureDto();
		facture.setNmero(1L);
		facture.setMontant(25000);
		
		
		return facture;
	}
	
	@GET
	@Path("/{idFacture}")
	@Produces(MediaType.APPLICATION_JSON)
	public FactureDto get (@PathParam("idFacture") long id) {
		
		FactureDto facture = new FactureDto();
		facture.setNmero(id);
		facture.setMontant(25000);
		
		
		return facture;
	}
}
