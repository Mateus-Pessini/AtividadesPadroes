package com.example.designpatterns_chains;

class EnvioHandler extends BaseSolicitacaoHandler {
    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        System.out.println("Processando Envio de Comprovantes");
        super.processarSolicitacao(solicitacao);
    }
}