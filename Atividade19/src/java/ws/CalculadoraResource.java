/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author 17114290048
 */
@Path("calculadora")
public class CalculadoraResource {

    @Context
    private UriInfo context;

    
    public CalculadoraResource() {
    }

    
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int somar(@QueryParam(value = "a") int a, @QueryParam(value = "b") int b) {
        return a + b;
    }
    
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int subtrair(@QueryParam(value = "a") int a, @QueryParam(value = "b") int b) {
        return a - b;
    }
    
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int multiplicar (@QueryParam(value = "a") int a, @QueryParam(value = "b") int b) {
        return a * b;
    }
    
    
    @DELETE
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int dividir (@QueryParam(value = "a") int a, @QueryParam(value = "b") int b) {
        return a / b;
    }

   
  
}
