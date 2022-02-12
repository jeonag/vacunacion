package com.kruger.vacunacion.empleados.config;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kruger.vacunacion.empleados.entidad.Empleado;
import com.kruger.vacunacion.empleados.repository.EmpleadoRepository;

@Configuration
public class EmpleadoConfig {

	@Bean
	CommandLineRunner commandLineRunner(EmpleadoRepository repository) {
		return args -> {
			Empleado juan = new Empleado(1751, "Juan", "Perez", "jp@gmail.com", "Quito", 9922, 1,
					LocalDate.of(2020, Month.APRIL, 10));
			Empleado pedro = new Empleado(1751, "Pedro", "Perez", "jp@gmail.com", "Quito", 9922, 1,
					LocalDate.of(2020, Month.APRIL, 10));
			repository.saveAll(List.of(juan, pedro));
		};
	}
}
