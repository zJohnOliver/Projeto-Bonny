
package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        // Cadastro de produtos
        Livro livro1 = new Livro("Livro 1", "Autor 1", "Editora A", 29.90, 10, "123456789");
        Revista revista1 = new Revista("Revista 1", "Editora B", 12.50, 5, "Mensal");
        Jornal jornal1 = new Jornal("Jornal 1", "Editora C", 5.00, 15, "28/03/2023");
        estoque.add(livro1);
        estoque.add(revista1);
        estoque.add(jornal1);

        // Consulta de produtos
        System.out.println("Consulta de produtos");
        System.out.println("Digite o tipo de consulta (1 - Título, 2 - Autor):");
        int tipoConsulta = input.nextInt();
        input.nextLine(); // Consumindo o \n deixado pelo nextInt()

        switch (tipoConsulta) {
            case 1:
                System.out.println("Digite o título:");
                String titulo = input.nextLine();
                for (Produto produto : estoque) {
                    if (produto.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println(produto.toString());
                    }
                }
                break;
            case 2:
                System.out.println("Digite o autor:");
                String autor = input.nextLine();
                for (Produto produto : estoque) {
                    if (produto instanceof Livro && ((Livro) produto).getAutor().equalsIgnoreCase(autor)) {
                        System.out.println(produto.toString());
                    }
                }
                break;
            default:
                System.out.println("Tipo de consulta inválido!");
                break;
        }

        // Venda de produtos
        System.out.println("Venda de produtos");
        System.out.println("Digite o índice do produto a ser vendido:");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(i + " - " + estoque.get(i).getTitulo());
        }
        int indiceProduto = input.nextInt();
        Produto produtoVendido = estoque.get(indiceProduto);
        if (produtoVendido.getQuantidadeEmEstoque()> 0) {
            produtoVendido.vender(indiceProduto);
            System.out.println("Produto vendido com sucesso!");
        } else {
            System.out.println("Produto indisponível em estoque!");
        }
    }
}
