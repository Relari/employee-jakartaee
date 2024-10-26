package com.pe.relari.resources;

import com.pe.relari.service.EmployeeService;

import com.pe.relari.service.impl.EmployeeServiceImpl;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author Relari
 */

@Path("/api/v1/employees")
public class EmployeeResource {

    private static final EmployeeService employeeService = EmployeeServiceImpl.getInstance();

//    public EmployeeResource(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response employees(){
        return Response
                .ok(employeeService.getEmployees())
                .build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findEmployee(@PathParam("id") Integer id){
        return Response
                .ok(employeeService.searchEmployee(id))
                .build();
    }
}
