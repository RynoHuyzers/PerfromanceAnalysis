package com.performanceanalysis.leagueoflegends.rest;


import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@ApplicationPath("/summoner")
public class SummonerRest extends Application {

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getSummonerByName(@PathParam("id") String id){
        Response response = Response.ok().build();
        return response;
    }
}
