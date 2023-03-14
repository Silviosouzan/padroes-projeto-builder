package padroescriacao.builder;

public class RacasBuilder {

    private Racas racas;

    public RacasBuilder(Racas racas) {
        this.racas = racas;
        Racas Racas = new Racas();
    }

    public Racas build() {

        if (Racas.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (Racas.getIdade()<= 0){
            throw new IllegalArgumentException("Idade inválida");
        }

        if (Racas.getRaca().equals("")) {
            throw new IllegalArgumentException("Raça inválida");
        }

        if (Racas.getVariedades().equals("")) {
            throw new IllegalArgumentException("Porte inválido");
        }

        if (Racas.getCor().equals("")) {
            throw new IllegalArgumentException("Cor inválida");
        }

        Racas Racas;
        return Racas;
    }

    public RacasBuilder setIdade(int idade) {
        Racas.setIdade(idade);
        return this;
    }

    public RacasBuilder setNome(String nome) {
        Racas.setNome(nome);
        return this;
    }


    public RacasBuilder setRaca(String raca) {
        Racas.setRaca(raca);
        return this;
    }



    public RacasBuilder setVariedade(String variedades) {
        Racas.setVariedades(variedades);
        return this;
    }

    public RacasBuilder setCor(String cor) {
        Racas.setCor(cor);
        return this;
    }


}
