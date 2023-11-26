package com.example.designpatterns_chains;

class BaseSolicitacaoHandler implements SolicitacaoHandler {
    private SolicitacaoHandler proximoHandler;

    public void setProximoHandler(SolicitacaoHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }

    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        if (proximoHandler != null) {
            proximoHandler.processarSolicitacao(solicitacao);
        }
    }
}
