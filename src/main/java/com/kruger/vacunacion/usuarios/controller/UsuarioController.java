package com.kruger.vacunacion.usuarios.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kruger.vacunacion.usuarios.entidad.Usuario;
import com.kruger.vacunacion.usuarios.servicios.UsuarioServicio;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServicio usuariosServicio;

	@GetMapping
	public List<Usuario> getUsuario() {
		return this.usuariosServicio.getUsuario();
	}

	@PostMapping
	public void addUsuario(@RequestBody Usuario obj) {
		usuariosServicio.addUsuario(obj);
	}

	@DeleteMapping(path = "{usuarioId}")
	public ResponseEntity<String> deletUsuario(@PathVariable("usuarioId") Integer id) {
		usuariosServicio.deleteTUsuario(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "{usuarioId}")
	public void updateUsuario(@PathVariable("usuarioId") Integer id, @RequestParam(required = false) String nombre) {
	}
}
