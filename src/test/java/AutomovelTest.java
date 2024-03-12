package test.java;

import org.junit.Ignore;
import org.junit.Test;

import main.java.Automovel;
import main.java.Carro;
import main.java.AvaliacaoSeguranca;
import main.java.factory.AutomovelFactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

// Essa classe ainda faz sentido?
public class AutomovelTest {

    @Test
    public void euPossoCriarUmNovoAutomovel() {
        AvaliacaoSeguranca avaliacao = new AvaliacaoSeguranca(7.5, LocalDateTime.now());

        //Automovel automovel = new Automovel("Vermelho", 4, 2023, "Carro", avaliacao);
        Automovel automovel = new Carro("Vermelho", 2023, avaliacao);

        assertThat(automovel.getCor()).isEqualTo("Vermelho");
        assertThat(automovel.getQuantidadeDeRodas()).isEqualTo(4);
        assertThat(automovel.getAno()).isEqualTo(2023);
        assertThat(automovel.getTipo()).isEqualTo("Carro");
    }
}

