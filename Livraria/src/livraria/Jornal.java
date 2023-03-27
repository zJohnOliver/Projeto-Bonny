
package livraria;

public class Jornal extends Produto {
    private String dataPublicacao;

    public Jornal(String titulo, String editora, double preco, int quantidade, String dataPublicacao) {
        super(titulo, null, editora, preco, quantidade);
        this.dataPublicacao = dataPublicacao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Jornal [titulo=" + this.getTitulo() + ", editora=" + this.getEditora() + ", preco=" + this.getPreco() +
            ", quantidade=" + this.getQuantidadeEmEstoque()+ ", dataPublicacao=" + dataPublicacao + "]";
    }
}

