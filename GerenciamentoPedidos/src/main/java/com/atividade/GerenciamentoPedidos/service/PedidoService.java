package com.atividade.GerenciamentoPedidos.service;

import com.atividade.GerenciamentoPedidos.entity.Pedido;
import com.atividade.GerenciamentoPedidos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping(path = "/pedidos")
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodosPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> procurarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public void deletarPorId(Long id) {
        pedidoRepository.deleteById(id);
    }
}
