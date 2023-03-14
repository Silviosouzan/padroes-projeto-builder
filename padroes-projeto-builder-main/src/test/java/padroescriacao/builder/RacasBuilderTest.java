package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacasBuilderTest {



    @Test
    void deveRetornarExcecaoParaRacasSemNome() {
        try {
            RacasBuilder RacasBuilder = new RacasBuilder(racas);
            Racas racas = RacasBuilder
                    .setIdade(20)
                    .setNome("")
                    .setRaca("Macaco")
                    .setCor("Amarelo")
                    .setVariedade("AnimalRaca")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarRacasCadastrado() {
        RacasBuilder RacasBuilder = new RacasBuilder(racas);
        Racas racas = RacasBuilder
                .setIdade(20)
                .setNome("Zero")
                .setRaca("Macaco")
                .setCor("Marrom")
                .setVariedade("AnimalRacas")
                .build();

        assertNotNull(racas);
    }






}
