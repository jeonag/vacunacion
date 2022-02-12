package com.kruger.vacunacion.tipovacunas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kruger.vacunacion.tipovacunas.entidad.TipoVacuna;

@Repository
public interface TipoVacunasRepository 
	extends JpaRepository<TipoVacuna, Integer>{
}