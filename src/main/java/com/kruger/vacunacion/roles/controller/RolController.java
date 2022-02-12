package com.kruger.vacunacion.roles.controller;

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

import com.kruger.vacunacion.roles.entidad.Rol;
import com.kruger.vacunacion.roles.servicios.RolServicio;


@RestController
@RequestMapping(path = "api/v1/roles")
public class RolController {

	@Autowired
	private RolServicio rolServicio;

	@GetMapping
	public List<Rol> getRol() {
		return this.rolServicio.getRol();
	}

	@PostMapping
	public void addRol(@RequestBody Rol obj) {
		rolServicio.addRol(obj);
	}

	@DeleteMapping(path = "{rolId}")
	public ResponseEntity<String> deletRol(@PathVariable("rolId") Integer id) {
		rolServicio.deleteRol(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "{rolId}")
	public void updateRol(@PathVariable("rolId") Integer id, @RequestParam(required = false) String nombre) {
	}
}
