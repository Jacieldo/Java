package db;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDB {
	private List<Usuario> usuariolist = new ArrayList<>();

	public List<Usuario> getUsuariolist() {
		return usuariolist;
	}
	
	public void addNovoUsuario(Usuario usuario) {
		int id = usuariolist.size() + 1;
		usuario.setId(id);
		usuariolist.add(usuario);
	}
}
