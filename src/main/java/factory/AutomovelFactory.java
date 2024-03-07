package main.java.factory;

import main.java.Automovel;
import main.java.AvaliacaoSeguranca;
import main.java.Carro;
import main.java.Moto;

import java.time.LocalDateTime;


public class AutomovelFactory {
    // public static Automovel criaAutomovel(String cor, int quantidadeDeRodas, int ano, String tipo, AvaliacaoSeguranca avaliacao) {
	// 	if (quantidadeDeRodas == 2 || quantidadeDeRodas == 4) {
    //         return Automovel.getInstance(cor, quantidadeDeRodas, ano, tipo, avaliacao);
    //     }

    //     throw new IllegalArgumentException("Quantidade de rodas precisa ser igual a 2 ou 4");
	// }

    public static Carro criaCarro(String cor, int ano, AvaliacaoSeguranca avaliacao) {
        if (ano < 2000) {
            throw new IllegalArgumentException("O ano do carro precisa ser maior ou igual a 2000!");
        }

        if (avaliacao.isExpired(LocalDateTime.now())) {
            throw new IllegalArgumentException("A avaliação de segurança está expirada!");
        }

        return new Carro(cor, ano, avaliacao);
    }

    public static Moto criaMoto(String cor, int ano, AvaliacaoSeguranca avaliacao) {
        return new Moto(cor, ano, avaliacao);
    }
}