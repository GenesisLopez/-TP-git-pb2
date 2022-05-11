package com.sistema;

import java.util.HashSet;

public class Sistema {

	private String nombreDelSistema;
	private Integer cantidadMaximaDeUsuarios;
	private HashSet<Usuario> listaDeUsuarios;
	

	

	public Sistema(String nombreDelSistema, Integer cantidadMaximaDeUsuarios, HashSet<Usuario> listaDeUsuarios) {
		super();
		this.nombreDelSistema = nombreDelSistema;
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
		this.listaDeUsuarios = listaDeUsuarios;
		
	}
	public Boolean incorporarUsuario(Usuario nuevoUsuario) {

		if (listaDeUsuarios.contains(nuevoUsuario)) {

			System.out.println("El usuario ya esxiste");

			return false;

		} else {

			listaDeUsuarios.add(nuevoUsuario);

			return true;
		}
	}
	public Integer calcularLaCantidadDeUsuariosLogueados() {
		
		int cantidadDeUsuariosLogueados = 0;
		
		for (Usuario usuario : listaDeUsuarios) {
			if(usuario.getUsuariosLogueados()) {
				
				cantidadDeUsuariosLogueados++;	
				
				}
		}
		return cantidadDeUsuariosLogueados;
	}
	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		
		int cantidadDeUsuariosBloqueados = 0;
		
		for (Usuario usuario : listaDeUsuarios) {
			if(usuario.getUsuariosBloqueados()) {
				
				cantidadDeUsuariosBloqueados++;	
				}
		}
		return cantidadDeUsuariosBloqueados; 
		
	}
	public Integer calcularElPorcentajeDeUsuariosLogueados() {
		
		int usuariosLogueados = 0;
		int totalDeUsuarios = listaDeUsuarios.size();
		
		for (Usuario usuario : listaDeUsuarios) {
			
			if(usuario.getUsuariosLogueados()) {
				
				usuariosLogueados++;
					
			}
			
		}
		return usuariosLogueados * 100 / totalDeUsuarios;
		
		
	}
	public void  calcularEdadPromedio() {
		
	}
	public Boolean loguearUsuario(String usuario, String contraseña) {
		
		return null;
	}
	

	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public void setNombreDelSistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
	}

	public Integer getCantidadMaximaDeUsuarios() {
		return cantidadMaximaDeUsuarios;
	}

	public void setCantidadMaximaDeUsuarios(Integer cantidadMaximaDeUsuarios) {
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
	}

	public HashSet<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public void setListaDeUsuarios(HashSet<Usuario> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}
	
	
}
