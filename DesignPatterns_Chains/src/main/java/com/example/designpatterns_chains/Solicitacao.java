package com.example.designpatterns_chains;

public class Solicitacao {
    private String tipo;
    private boolean isCLevel;

    public Solicitacao(String tipo, boolean isCLevel) {
        this.tipo = tipo;
        this.isCLevel = isCLevel;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isCLevel() {
        return isCLevel;
    }
}
