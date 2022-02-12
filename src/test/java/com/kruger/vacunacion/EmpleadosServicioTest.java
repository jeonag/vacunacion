package com.kruger.vacunacion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.kruger.vacunacion.empleados.repository.EmpleadoRepository;
import com.kruger.vacunacion.empleados.servicios.EmpleadosServicio;

@ExtendWith(MockitoExtension.class)
public class EmpleadosServicioTest {
	
	@InjectMocks EmpleadosServicio empleadoServicio;
	@Mock EmpleadoRepository empleadpRep;
	@Test
	void returnGetList() {
		assertDoesNotThrow(()->empleadoServicio.getEmpleados());
	}
}
