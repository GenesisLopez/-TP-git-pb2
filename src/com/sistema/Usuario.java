package com.sistema;

public class Usuario {

	private String nuevoUsuario;
	private String nombreUsuario;
	private String usuario;
	private String contraseña;
	private Boolean usuariosLogueados;
	private Boolean usuariosBloqueados;


	
	public Usuario(String nuevoUsuario, String nombreUsuario, String usuario, String contraseña,
			Boolean usuariosLogueados, Boolean usuariosBloqueados) {
		super();
		this.nuevoUsuario = nuevoUsuario;
		this.nombreUsuario = nombreUsuario;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.usuariosLogueados = usuariosLogueados;
		this.usuariosBloqueados = usuariosBloqueados;
	}

	

	public String getNuevoUsuario() {
		return nuevoUsuario;
	}

	public void setNuevoUsuario(String nuevoUsuario) {
		this.nuevoUsuario = nuevoUsuario;
	}

	

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Boolean getUsuariosLogueados() {
		return usuariosLogueados;
	}
	
	public void setUsuariosLogueados(Boolean usuariosLogueados) {
		this.usuariosLogueados = usuariosLogueados;
	}
	
	public Boolean getUsuariosBloqueados() {
		return usuariosBloqueados;
	}
	
	public void setUsuariosBloqueados(Boolean usuariosBloqueados) {
		this.usuariosBloqueados = usuariosBloqueados;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}
	
	
	
}
