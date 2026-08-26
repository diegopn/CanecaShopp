package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Caneca> itens = new ArrayList<>();

    public void adicionarItem(Caneca caneca) {
        this.itens.add(caneca);
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(Caneca::getPreco)
                .sum();
    }
}