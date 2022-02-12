package com.kruger.vacunacion.empleadosvacunados.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kruger.vacunacion.empleadosvacunados.entidad.EmpleadoVacunado;
import com.kruger.vacunacion.empleadosvacunados.repository.EmpleadoVacunadoRepository;


@Service
public class EmpleadoVacunadoServicio {

	@Autowired
	private EmpleadoVacunadoRepository empleadoVacunadoRepository;

	public List<EmpleadoVacunado> getEmpleadosVacunados() {
		return empleadoVacunadoRepository.findAll();
	}

	public Optional<EmpleadoVacunado> getEmpleadoPorId(Integer id) {
		return empleadoVacunadoRepository.findById(id);
	}

	public void addEmpleado(EmpleadoVacunado emp) {
		empleadoVacunadoRepository.save(emp);
	}

	public void deleteEmpleado(Integer id) {
		boolean existe = empleadoVacunadoRepository.existsById(id);
		if (!existe) {
			throw new IllegalStateException("No existe el empleado");
		}
		empleadoVacunadoRepository.deleteById(id);
	}
}
