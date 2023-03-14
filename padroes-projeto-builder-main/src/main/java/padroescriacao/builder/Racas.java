package padroescriacao.builder;

import java.util.Date;

public class Racas {

    private static int idade;
    private static String nome;
    private static String raca;
    private String variedades;
    private String cor;



    public Racas() {

        this.nome = "";
    }

    public static int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }



    public String getVariedades() {
        return variedades;
    }

    public void setVariedades(String variedades) {
        this.variedades = variedades;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String porte) {
        this.cor = cor;
    }







}