package com.kruger.vacunacion.empleadosvacunados.controller;

import java.util.List;
import java.util.Optional;

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

import com.kruger.vacunacion.empleadosvacunados.entidad.EmpleadoVacunado;
import com.kruger.vacunacion.empleadosvacunados.servicios.EmpleadoVacunadoServicio;


@RestController
@RequestMapping(path = "api/v1/empleadosvacunados")
public class EmpleadoVacunadoController {

	@Autowired
	private EmpleadoVacunadoServicio empVacunadoServicio;

	@GetMapping
	public List<EmpleadoVacunado> getEmpleadosVacunados() {
		return this.empVacunadoServicio.getEmpleadosVacunados();
	}

	@GetMapping("{empleadoId}")
	public Optional<EmpleadoVacunado> getEmpleadoPorId(@PathVariable Integer id) {
		return this.empVacunadoServicio.getEmpleadoPorId(id);
	}

	@PostMapping
	public void addEmpleado(@RequestBody EmpleadoVacunado obj) {
		empVacunadoServicio.addEmpleado(obj);
	}

	@DeleteMapping(path = "{empleadoId}")
	public ResponseEntity<String> deletEmpleadoVacunado(@PathVariable("empleadoId") Integer id) {
		empVacunadoServicio.deleteEmpleado(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "{empleadoId}")
	public void updateEmpleadoVacunado(@PathVariable("empleadoId") Integer id, @RequestParam(required = false) String nombres,
			@RequestParam(required = false) String apellidos) {
	}
}