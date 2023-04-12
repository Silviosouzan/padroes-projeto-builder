
import java.util.Date;

public class AlunoNavalBuilder {

    private AlunoNaval aluno;

    public AlunoNavalBuilder() {
        aluno = new AlunoNaval();
    }

    public AlunoNaval build() {
        if (aluno.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (aluno.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return aluno;
    }

    public AlunoNavalBuilder setMatricula(int matricula) {
        aluno.setMatricula(matricula);
        return this;
    }

    public AlunoNavalBuilder setNome(String nome) {
        aluno.setNome(nome);
        return this;
    }

    public AlunoNavalBuilder setDataNascimento(Date dataNascimento) {
        aluno.setDataNascimento(dataNascimento);
        return this;
    }

    public AlunoNavalBuilder setNomeMae(String nomeMae) {
        aluno.setNomeMae(nomeMae);
        return this;
    }

    public AlunoNavalBuilder setNomePai(String nomePai) {
        aluno.setNomePai(nomePai);
        return this;
    }

    public AlunoNavalBuilder setCpf(String cpf) {
        aluno.setCpf(cpf);
        return this;
    }

    public AlunoNavalBuilder setRg(String rg) {
        aluno.setRg(rg);
        return this;
    }

    public AlunoNavalBuilder setEscolaAnterior(String escolaAnterior) {
        aluno.setEscolaAnterior(escolaAnterior);
        return this;
    }

    public AlunoNavalBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        aluno.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public AlunoNavalBuilder setEnderecoNumero(int enderecoNumero) {
        aluno.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public AlunoNavalBuilder setEnderecoComplemento(String enderecoComplemento) {
        aluno.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public AlunoNavalBuilder setEnderecoBairro(String enderecoBairro) {
        aluno.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public AlunoNavalBuilder setEnderecoCidade(String enderecoCidade) {
        aluno.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public AlunoNavalBuilder setEnderecoUF(String enderecoUF) {
        aluno.setEnderecoUF(enderecoUF);
        return this;
    }

    public AlunoNavalBuilder setCep(String cep) {
        aluno.setCep(cep);
        return this;
    }

    public AlunoNavalBuilder setEmail(String email) {
        aluno.setEmail(email);
        return this;
    }

    public AlunoNavalBuilder setCelular(String celular) {
        aluno.setCelular(celular);
        return this;
    }

    public AlunoNavalBuilder setCarreiraPai(String carreiraPai) {
        aluno.setCarreiraPai(carreiraPai);
        return this;
    }

    public AlunoNavalBuilder setCarreiraMae(String carreiraMae) {
        aluno.setCarreiraMae(carreiraMae);
        return this;
    }
}
