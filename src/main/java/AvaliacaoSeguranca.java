package main.java;

import java.time.LocalDateTime;

public class AvaliacaoSeguranca {

    public static int MAX_MESES_VALIDADE = 18;
    private double nota;
    private LocalDateTime dataAvaliacao;
    private LocalDateTime validadeAvaliacao;

    public AvaliacaoSeguranca(double nota, LocalDateTime dataAvaliacao) {
        this.nota = nota;
        this.dataAvaliacao = dataAvaliacao;
        this.validadeAvaliacao = dataAvaliacao.plusMonths(MAX_MESES_VALIDADE);
    }

    public double getNota() {
        return nota;
    }

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }

    public LocalDateTime getValidadeAvaliacao() {
        return validadeAvaliacao;
    }

    public boolean isExpired(LocalDateTime now) {
        // if (now.isAfter(this.validadeAvaliacao) || now.isBefore(this.dataAvaliacao)) {
        //     return true;
        // } else {
        //     return false;
        // }
        return now.isAfter(this.validadeAvaliacao) || now.isBefore(this.dataAvaliacao);
    }

    

    
}
