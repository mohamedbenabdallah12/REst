package org.example.banque.web;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.banque.entities.compte;
import org.example.banque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/compte")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<compte> CompteList(){
        return compteRepository.findAll();
    }
    @Path("/compte/{ID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public compte getcp(@PathParam(value = "ID") Long Id ){
        return compteRepository.findById(Id).get();
    }
    @Path("/compte")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public compte creer(compte compte ){
        return compteRepository.save(compte);
    }
    @Path("/compte/{ID}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public compte compteUpdate(compte compte ,@PathParam(value = "ID") Long Id ){
        compte.setId(Id);
        return compteRepository.save(compte);

    }
    @Path("/compte/{ID}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void supprimer(@PathParam(value = "ID") Long Id ){
        compteRepository.deleteById(Id);
    }



}
