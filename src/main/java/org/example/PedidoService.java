package org.example;

public class PedidoService {

    public void finalizarPedido(CarrinhoDeCompras carrinho) {
        double total = carrinho.calcularTotal();
        System.out.println("Pedido finalizado com sucesso! Total: R$ " + total);
    }

}
