package com.kruger.vacunacion.roles.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kruger.vacunacion.roles.entidad.Rol;
import com.kruger.vacunacion.roles.repository.RolRepository;

@Service
public class RolServicio {

	@Autowired
	private RolRepository rolRepository;

	public List<Rol> getRol() {
		return rolRepository.findAll();
	}

	public void addRol(Rol obj) {
		rolRepository.save(obj);
	}

	public void deleteRol(Integer id) {
		boolean existe = rolRepository.existsById(id);
		if (!existe) {
			throw new IllegalStateException("No existe el rol");
		}
		rolRepository.deleteById(id);
	}
}
