package com.mycompany.designpatterns_adapter_exercicio;

import com.mycompany.designpatterns_adapter_exercicio.gmailClient.GmailClient;

public class GmailAdapter implements ProvedorEmail {
    private GmailClient gmailClient;

    public GmailAdapter() {
        this.gmailClient = new GmailClient();
    }

    @Override
    public void conecta() {
        gmailClient.login();
    }

    @Override
    public void pegarEmails() {
        gmailClient.getEmails();
    }
}