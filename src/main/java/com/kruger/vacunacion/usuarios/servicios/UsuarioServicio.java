package com.kruger.vacunacion.usuarios.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kruger.vacunacion.usuarios.entidad.Usuario;
import com.kruger.vacunacion.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioServicio {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> getUsuario() {
		return usuarioRepository.findAll();
	}

	public void addUsuario(Usuario emp) {
		usuarioRepository.save(emp);
	}

	public void deleteTUsuario(Integer id) {
		boolean existe = usuarioRepository.existsById(id);
		if (!existe) {
			throw new IllegalStateException("No existe el usuario");
		}
		usuarioRepository.deleteById(id);
	}
}
