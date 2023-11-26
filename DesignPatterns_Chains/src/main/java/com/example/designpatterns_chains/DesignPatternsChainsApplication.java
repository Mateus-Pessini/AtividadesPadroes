package com.example.designpatterns_chains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsChainsApplication {

    public static void main(String[] args) {
        SolicitacaoHandler pedidoHandler = new PedidoHandler();
        SolicitacaoHandler envioComprovantesHandler = new EnvioHandler();
        SolicitacaoHandler analiseHandler = new AnaliseHandler();
        SolicitacaoHandler aprovacaoHandler = new AprovacaoHandler();

        pedidoHandler.setProximoHandler(envioComprovantesHandler);
        envioComprovantesHandler.setProximoHandler(analiseHandler);
        analiseHandler.setProximoHandler(aprovacaoHandler);

        Solicitacao solicitacao = new Solicitacao("Reembolso", true);

        pedidoHandler.processarSolicitacao(solicitacao);
    }
}

