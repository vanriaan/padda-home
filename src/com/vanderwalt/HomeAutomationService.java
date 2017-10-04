package com.vanderwalt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/HomeAutomationService") 
public class HomeAutomationService
{
  @GET
  @Path("/shoppingList") 
  @Produces(MediaType.APPLICATION_JSON) 
  public String getShoppingList(){ 
     return "{'name':'groceries','items':['bread', 'milk']}"; 
  }  
}
