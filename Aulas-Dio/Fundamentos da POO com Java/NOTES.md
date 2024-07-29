# Java

## Conceito

- Public: acessivel a todos os pactoes e classes; Private: apenas por si mesma, Protected: Acessível apenas por si, classes filhas e mesmo pacote , Default: acessível apenas dentro do mesmo pacote.
- Encapsulamento: Escoder a lógica e disponibinilizar apenas o método. Ex métodos private dentro de um único métopdo público.
- Herança: Caracteristicas e Comportamentos herdados por classes filhas.
- Abstração: A capacidade de ocultar detalhes irrelevantes ou complexos de um problema e focar nos aspectos essenciais. EX: Definir como abstract em uma classe pai resulta na classe filha precisar ter um método com esse nome, porém não importa a lógica dentro dele. (Intercace?). AO definir na filha usa-se @Overrride. è possível definir uma variável da classe pai e atribuir uma instância da classe filha. Por conta do polimorfismo e do abstract é possível chamar o método nessa variável pai e ele usará a lógica do método da classe filha.
- Polimorfismo: Multiplas formas de realizar a mesma ação. Mesmo método definido de formas diferentes.
