package com.example.designpatterns_chains;

class AnaliseHandler extends BaseSolicitacaoHandler {
    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        // Lógica específica para o passo "Análise"
        System.out.println("Processando Análise");
        super.processarSolicitacao(solicitacao);
    }
}
