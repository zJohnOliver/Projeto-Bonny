Problemática:
Um sistema de gerenciamento de uma livraria precisa ser desenvolvido, considerando os conceitos de POO, para que seja possível cadastrar, editar, excluir e consultar 
informações de livros, revistas e jornais disponíveis na loja. Além disso, deve ser possível registrar as vendas realizadas e gerar relatórios de vendas e estoque.

Encapsulamento:
Os atributos das classes Livro, Revista e Jornal serão definidos como privados e seus respectivos métodos setters e getters serão utilizados para acessá-los e 
modificá-los.

Uso de Herança:
Será criada uma superclasse chamada Produto, que conterá os atributos gerais de um produto, como título, autor, editora, preço e quantidade em estoque. Em seguida, 
serão criadas três subclasses: Livro, Revista e Jornal, que herdarão os atributos da superclasse Produto e terão atributos específicos, como ISBN para o Livro, 
periodicidade para a Revista e data de publicação para o Jornal. Por fim, será criada uma classe de teste para instanciar objetos das subclasses e realizar as 
operações de cadastro, edição, exclusão e consulta de produtos.

Uso de polimorfismo:
Serão implementados dois tipos de polimorfismo: sobrescrita de métodos e referenciamento de objetos de tipos diferentes a partir de uma mesma variável. Será criado um 
método toString() na classe Produto, que será sobrescrito nas subclasses Livro, Revista e Jornal para imprimir as informações específicas de cada tipo de produto. Além 
disso, será criado um método para realizar a venda de um produto, que receberá como parâmetro um objeto da classe Produto. O downcasting será utilizado para executar 
comportamentos especializados das subclasses Livro, Revista e Jornal.

Sobrecarga de métodos:
Será utilizada a sobrecarga de métodos na classe de teste para realizar a consulta de produtos. Serão criados dois métodos com o mesmo nome, mas com diferentes 
parâmetros: um método que recebe o título do produto como parâmetro e outro que recebe o autor do produto como parâmetro. Isso permitirá consultar produtos de diferentes 
formas, de acordo com as informações disponíveis.
