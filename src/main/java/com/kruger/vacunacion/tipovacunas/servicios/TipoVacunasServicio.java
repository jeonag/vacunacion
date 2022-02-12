package com.kruger.vacunacion.tipovacunas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kruger.vacunacion.tipovacunas.entidad.TipoVacuna;
import com.kruger.vacunacion.tipovacunas.repository.TipoVacunasRepository;

@Service
public class TipoVacunasServicio {

	@Autowired
	private TipoVacunasRepository tipoVacunasRepository;

	public List<TipoVacuna> getTipoVacuna() {
		return tipoVacunasRepository.findAll();
	}

	public void addTipoVacuna(TipoVacuna obj) {
		tipoVacunasRepository.save(obj);
	}

	public void deleteTipoVacuna(Integer id) {
		boolean existe = tipoVacunasRepository.existsById(id);
		if (!existe) {
			throw new IllegalStateException("No existe el tipo vacuna");
		}
		tipoVacunasRepository.deleteById(id);
	}
}
