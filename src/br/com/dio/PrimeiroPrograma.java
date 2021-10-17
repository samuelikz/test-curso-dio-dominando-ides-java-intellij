package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);
        /*int a = 5;
        int b = 3;

        System.out.println("Hello World > " + (a+b));*/
//        Livro livro0 = new Livro(nomeLivro: "w", numPagina:300);
    }
}

class Livro{
    private String nomeLivro;
    private Integer numPagina;

    public Livro(String nomeLivro, Integer numPagina) {
        this.nomeLivro = nomeLivro;
        this.numPagina = numPagina;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}