package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caneca caneca1 = new Caneca(1, "Dia das mães", 25.00);
        Caneca caneca2 = new Caneca(2, "Dia dos pais", 25.00);
        Caneca caneca3 = new Caneca(3, "Café minha vida", 38.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem(caneca1);
        carrinho.adicionarItem(caneca2);
        carrinho.adicionarItem(caneca3);

        PedidoService pedido = new PedidoService();
        pedido.finalizarPedido(carrinho);
    }
}
