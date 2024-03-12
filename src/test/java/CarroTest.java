package test.java;

import org.junit.Test;
import main.java.Carro;
import main.java.factory.AutomovelFactory;
import main.java.AvaliacaoSeguranca;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

public class CarroTest {
    
    @Test
    public void criaUmCarro() {
        AvaliacaoSeguranca avaliacao = new AvaliacaoSeguranca(7.5, LocalDateTime.now());
        Carro novoCarro = new Carro("Branco", 2020, avaliacao);
        

        // assertThat(valorObtido).isEqualTo(valorEsperado)
        assertThat(novoCarro.getCor()).isEqualTo("Branco");
        assertThat(novoCarro.getQuantidadeDeRodas()).isEqualTo(4);
        assertThat(novoCarro.getAno()).isEqualTo(2020);
        assertThat(novoCarro.getTipo()).isEqualTo("<CARRO>");
    }

    @Test
    public void aClasseCarroDeveTerDadosDefault() {
        assertThat(Carro.QUANTIDADE_DE_RODAS).isEqualTo(4);
        assertThat(Carro.TIPO).isEqualTo("<CARRO>");
    }
}
