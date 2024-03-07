package test.java;

import org.junit.Test;
import main.java.Moto;
import main.java.factory.AutomovelFactory;
import main.java.AvaliacaoSeguranca;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

public class MotoTest {
    
    @Test
    public void criaUmMoto() {
        AvaliacaoSeguranca avaliacao = new AvaliacaoSeguranca(7.5, LocalDateTime.now());
        Moto novoMoto = new Moto("Vermelho", 2023, avaliacao);

        // assertThat(valorObtido).isEqualTo(valorEsperado)
        assertThat(novoMoto.getCor()).isEqualTo("Vermelho");
        assertThat(novoMoto.getQuantidadeDeRodas()).isEqualTo(2);
        assertThat(novoMoto.getAno()).isEqualTo(2023);
        assertThat(novoMoto.getTipo()).isEqualTo("<MOTO>");
    }

    @Test
    public void aClasseMotoDeveTerDadosDefault() {
        assertThat(Moto.QUANTIDADE_DE_RODAS).isEqualTo(2);
        assertThat(Moto.TIPO).isEqualTo("<MOTO>");
    }
}
