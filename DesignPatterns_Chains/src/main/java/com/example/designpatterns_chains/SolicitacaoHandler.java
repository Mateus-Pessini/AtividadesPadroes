package com.example.designpatterns_chains;

public interface SolicitacaoHandler {
    void processarSolicitacao(Solicitacao solicitacao);

    void setProximoHandler(SolicitacaoHandler envioComprovantesHandler);
}
