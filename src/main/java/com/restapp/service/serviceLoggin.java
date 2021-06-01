package com.restapp.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import restapp.vo.VOUsuarios;

@Path("/javaTest")
public class serviceLoggin {
	
	
	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuarios validarUsuario (VOUsuarios vo) {
	
		vo.setUserValido(false);
		if(vo.getUsuario().equals("JR") && vo.getPassword().equals("revo")) {
			vo.setUserValido(true);
		}
	 return vo;

}
}
