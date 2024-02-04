package com.example.resource;
import com.example.model.Order;
import com.example.service.OrderRepositoryI;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
@Path("orders")
public class OrderResource {
    @Inject
    private OrderRepositoryI orderRepositoryI;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getAllOrders()
    {
        return orderRepositoryI.getAll();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order){
        orderRepositoryI.add(order);
    }
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrdrerById(@PathParam("id") Integer id){
        return orderRepositoryI.getById(id);
    }
}
