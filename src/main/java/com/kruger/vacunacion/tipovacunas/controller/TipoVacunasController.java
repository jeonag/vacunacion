package com.kruger.vacunacion.tipovacunas.controller;

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

import com.kruger.vacunacion.tipovacunas.entidad.TipoVacuna;
import com.kruger.vacunacion.tipovacunas.servicios.TipoVacunasServicio;

@RestController
@RequestMapping(path = "api/v1/tipovacuna")
public class TipoVacunasController {

	@Autowired
	private TipoVacunasServicio tipoVacunaServicio;

	@GetMapping
	public List<TipoVacuna> getEmpleados() {
		return this.tipoVacunaServicio.getTipoVacuna();
	}

	@PostMapping
	public void addTipoVacuna(@RequestBody TipoVacuna obj) {
		tipoVacunaServicio.addTipoVacuna(obj);
	}

	@DeleteMapping(path = "{tipoVacunaId}")
	public ResponseEntity<String> deletTipoVacuna(@PathVariable("tipoVacunaId") Integer id) {
		tipoVacunaServicio.deleteTipoVacuna(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "{tipoVacunaId}")
	public void updateTipoVacuna(@PathVariable("tipoVacunaId") Integer id,
			@RequestParam(required = false) String nombre) {
	}
}
