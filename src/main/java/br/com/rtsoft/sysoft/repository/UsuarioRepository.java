package br.com.rtsoft.sysoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rtsoft.sysoft.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}