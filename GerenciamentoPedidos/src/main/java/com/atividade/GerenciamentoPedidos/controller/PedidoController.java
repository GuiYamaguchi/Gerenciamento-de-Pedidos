package com.atividade.GerenciamentoPedidos.controller;

import com.atividade.GerenciamentoPedidos.entity.Pedido;
import com.atividade.GerenciamentoPedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarTodosPedidos() {
        return pedidoService.listarTodosPedidos();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> procurarPorId(@PathVariable Long id) {
        return pedidoService.procurarPorId(id);
    }

    @DeleteMapping
    public void deletarPorId(@PathVariable Long id) {
        pedidoService.deletarPorId(id);
    }

}