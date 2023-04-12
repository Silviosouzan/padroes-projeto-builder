import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoNavalBuilderTest {

    @Test
    void deveRetornarExcecaoParaAlunoSemMatricula() {
        try {
            AlunoNavalBuilder alunoNavalBuilder = new AlunoNavalBuilder();
            AlunoNaval aluno = alunoNavalBuilder
                    .setNome("Aluno 1")
                    .setEmail("aluno1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNome() {
        try {
            AlunoNavalBuilder alunoNavalBuilder = new AlunoNavalBuilder();
            AlunoNaval aluno = alunoNavalBuilder
                    .setMatricula(1)
                    .setEmail("aluno1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoNavalValido() {
        AlunoNavalBuilder alunoNavalBuilder = new AlunoNavalBuilder();
        AlunoNaval aluno = alunoNavalBuilder
                .setMatricula(1)
                .setNome("Aluno 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(aluno);
    }
}
