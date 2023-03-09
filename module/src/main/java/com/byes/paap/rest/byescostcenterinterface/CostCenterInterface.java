package com.byes.paap.rest.byescostcenterinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.byes.paap.rest.byescostcenterinterface.dto.CostCentersDTO;
import com.byes.paap.rest.byescostcenterinterface.dto.ResponseDTO;
import com.planonsoftware.jaxrs.api.v9.context.IJaxRsResourceContext;

@Path("/costCenters")
public class CostCenterInterface
{
    @Context 
    IJaxRsResourceContext jaxrsContext;

    @POST
    @Path("/updateCostCenters")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrder(CostCentersDTO costCenters) {
        ResponseDTO response = new ResponseDTO();
        response.setStatus(200);
        response.setStatusDescription("Cost center created/updated.");
        return Response.ok().entity(response).build();
    }
           
}