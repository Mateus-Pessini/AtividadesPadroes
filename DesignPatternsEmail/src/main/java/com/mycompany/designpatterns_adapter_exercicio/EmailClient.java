package com.mycompany.designpatterns_adapter_exercicio;

public class EmailClient {
    private ProvedorEmail provider;

    public EmailClient(ProvedorEmail provider) {
        this.provider = provider;
    }

    public void checaEmail() {
        provider.conecta();
        provider.pegarEmails();
    }
}
