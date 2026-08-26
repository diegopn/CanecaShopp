## Diagrama de Classe
```mermaid
classDiagram
    accTitle: Diagrama de classe - E-commerce de Canecas
    accDescr: Estrutura contendo as entidades Caneca e CarrinhoDeCompra associadas ao PedidoService
    class Caneca{
        -int id
        -String descricao
        -double preco
        +getPreco() double
    }
    class CarrinhoDeCompras{
        -List-Caneca- itens
        +adicionarItem(Caneca caneca) void
        +calcularTotal() double
    }
    class PedidoService{
        +finalizarPedido(CarrinhoDeCompras carrinho) void
    }
    
    CarrinhoDeCompras *-- Caneca: possui de 0 a n
    PedidoService *-- CarrinhoDeCompras: processa
```

## Diagrama de Sequência
```mermaid
sequenceDiagram
    accTitle: Diagrama de classe - Finalizar Pedido
    accDescr: Fluxo de finalização de um pedido disponível
    
    actor Cliente
    participant Service as PedidoService
    participant Carrinho as CarrinhoDeCompras
    
    
    Cliente ->> Service: finalizarPedido(carrinho)
    activate Service
    
    Service ->> Carrinho: calcularTotal()
    activate Carrinho
    
    Carrinho -->> Service: retorno double (total)
    deactivate Carrinho
    
    Note over Service: Processa pagamento a atualiza estoque fictício
    Service -->> Cliente: Confirmação de Sucesso
    deactivate Service
    
```

