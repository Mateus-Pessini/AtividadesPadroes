package org.example;

public class Main {
    public static void main(String[] args) {
        Imagem imagem1 = new ProxyImage("foto1.jpg");
        Imagem imagem2 = new ProxyImage("foto2.jpg");

        imagem1.exibir();
        imagem2.exibir();

    }
}