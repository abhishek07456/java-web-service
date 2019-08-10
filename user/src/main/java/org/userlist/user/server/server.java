package org.userlist.user.server;
 import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.userlist.user.model.*;

import org.userlist.user.database.*;
@Path("/bringo")
public class server {
 
	public database obj=new database();
 	@GET
 	@Path("/userlist")
	@Produces(MediaType.APPLICATION_JSON)
	 public List<usermodel> getuser() {
 		return obj.senduser();
 		
	 }
	 @GET
	 	@Path("/userlist/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		 public List<usermodel> getspecficuser(@PathParam("id") int id) {
	 		return obj.specficUser(id);
	 		
		 }
	 @GET
	 	@Path("/adduser")
		@Produces(MediaType.TEXT_PLAIN)
		 public String insertuser() {
	 		return obj.adduser();
	 		
		 }
 }

