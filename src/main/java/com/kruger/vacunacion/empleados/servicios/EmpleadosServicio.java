package com.kruger.vacunacion.empleados.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kruger.vacunacion.empleados.entidad.Empleado;
import com.kruger.vacunacion.empleados.repository.EmpleadoRepository;

@Service
public class EmpleadosServicio {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public List<Empleado> getEmpleados() {
		return empleadoRepository.findAll();
	}

	public void addEmpleado(Empleado emp) {
		empleadoRepository.save(emp);
	}

	public void deleteEmpleado(Integer id) {
		boolean existe = empleadoRepository.existsById(id);
		if (!existe) {
			throw new IllegalStateException("No existe el empleado");
		}
		empleadoRepository.deleteById(id);
	}
}
