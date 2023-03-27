
package livraria;

public class Produto {
    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private int quantidadeEmEstoque;
    
    // construtor
    public Produto(String titulo, String autor, String editora, double preco, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    // método para venda de um produto
    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Não há estoque suficiente para a venda desejada.");
        }
    }
    
    // método toString sobrescrito nas subclasses
    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora +
               "\nPreço: R$ " + preco + "\nQuantidade em estoque: " + quantidadeEmEstoque;
    }
}

