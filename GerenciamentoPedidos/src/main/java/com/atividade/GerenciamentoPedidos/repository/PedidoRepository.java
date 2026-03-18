package com.atividade.GerenciamentoPedidos.repository;

import com.atividade.GerenciamentoPedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}