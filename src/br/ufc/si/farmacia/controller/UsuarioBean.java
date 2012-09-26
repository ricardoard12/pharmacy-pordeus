package br.ufc.si.farmacia.controller;

import br.ufc.si.farmacia.model.Usuario;

public class UsuarioBean {
  private Usuario usuario;
    
    
	public Usuario getUsuario() {
	return usuario;
}


public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}


	public UsuarioBean() {
	
	this.usuario = new Usuario();
}


	public String validarUsuario(){
    	if(this.usuario.getLogin().equals("mardson") && this.usuario.getSenha().equals("123")){
    		return "acesso";
    	}
    	return "falha";
    }//fim do método
    
    
}//fim da classe
