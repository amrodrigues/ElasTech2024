package com.soulcodeapi.demo.repository;

import com.soulcodeapi.demo.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
