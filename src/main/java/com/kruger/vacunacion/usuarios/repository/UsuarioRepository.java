package com.kruger.vacunacion.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kruger.vacunacion.usuarios.entidad.Usuario;

@Repository
public interface UsuarioRepository 
	extends JpaRepository<Usuario, Integer>{
}