package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;


public class primeiro_programa_itellij {
    public static void main(String[] args) {
        Gato gato = new Gato("Lani","marrom", 2);
        livro livro1 = new livro("game of throne", 500);

        System.out.println(gato);
        System.out.println(livro1);

    }
}

class livro{
    private String nome;
    private Integer paginas;

    public livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof livro)) return false;
        livro livro = (livro) o;
        return Objects.equals(getNome(), livro.getNome()) && Objects.equals(getPaginas(), livro.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}