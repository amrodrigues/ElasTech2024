package com.soulcodeapi.demo.Repositories;

import com.soulcodeapi.demo.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Ejb3TransactionAnnotationParser;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
