package com.kruger.vacunacion.empleados.controller;

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

import com.kruger.vacunacion.empleados.entidad.Empleado;
import com.kruger.vacunacion.empleados.servicios.EmpleadosServicio;

@RestController
@RequestMapping(path = "api/v1/empleado")
public class EmpleadosController {

	@Autowired
	private EmpleadosServicio empServicio;

	@GetMapping
	public List<Empleado> getEmpleados() {
		return this.empServicio.getEmpleados();
	}

	@PostMapping
	public void addEmpleado(@RequestBody Empleado emp) {
		empServicio.addEmpleado(emp);
	}

	@DeleteMapping(path = "{empleadoId}")
	public ResponseEntity<String> deletEmpleado(@PathVariable("empleadoId") Integer id) {
		empServicio.deleteEmpleado(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "{empleadoId}")
	public void updateEmpleado(@PathVariable("empleadoId") Integer id, @RequestParam(required = false) String nombres,
			@RequestParam(required = false) String apellidos) {

	}
}
