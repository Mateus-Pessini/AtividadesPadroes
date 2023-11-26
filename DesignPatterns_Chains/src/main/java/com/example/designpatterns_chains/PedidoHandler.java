package com.example.designpatterns_chains;

class PedidoHandler extends BaseSolicitacaoHandler {
    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        // Lógica específica para o passo "Pedido"
        System.out.println("Processando Pedido");
        super.processarSolicitacao(solicitacao);
    }
}