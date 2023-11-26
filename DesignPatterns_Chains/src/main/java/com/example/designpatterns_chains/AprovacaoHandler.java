package com.example.designpatterns_chains;

class AprovacaoHandler extends BaseSolicitacaoHandler {
    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        // Lógica específica para o passo "Aprovação"
        System.out.println("Processando Aprovação");
        super.processarSolicitacao(solicitacao);
    }
}