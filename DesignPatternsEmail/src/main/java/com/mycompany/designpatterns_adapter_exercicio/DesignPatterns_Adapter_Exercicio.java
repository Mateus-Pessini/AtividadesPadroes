package com.mycompany.designpatterns_adapter_exercicio;

public class DesignPatterns_Adapter_Exercicio {

    public static void main(String[] args) {
        ProvedorEmail gmailAdapter = new GmailAdapter();
        EmailClient emailClient = new EmailClient(gmailAdapter);
        emailClient.checaEmail();
    }
}
