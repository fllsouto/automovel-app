package main.java;

import java.util.Collections;
import java.util.List;

public enum Cores {
    WHITE("<BRANCO>"),
    RED("<VERMELHO>"),
    YELLOW("<AMARELO>"),
    BLACK("<PRETO>"),
    BLUE("<AZUL>"),
    GREEN("<VERDE>"),
    PURPLE("<ROXO>"),
    ORANGE("<LARANJA>");

    private String cor;

    private Cores(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public static int quantidadeDeCores() {
        return Cores.values().length;
    }
}
