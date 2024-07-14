# Java

## Anatomia de Classes
  - Todo arquivo é uma classe, até mesmo o que irá conter o método main
  - Classe é derfinida por atriutos e métodos (vars e funcs)
  - Nomeação dos arquivos Primeira letra maiúscula a cada palavra nova inicia-se maiúscula
  - Variáveis: camelCase; Constantes: UPPER_CASE
  - String concat => string1.concat(string2) ou string1 = string1 + string2;
  - Métodos: nome = verbos, camelCase

## Tipos e Variáveis
  - fortemente tipado
  - primitivos: 
    - byte: 1b, short: 2b, int: 4b, long: 8b
    - fracionários: float: 4b, double: 8b
  - declaração: tipo - nome - atribuição
  - possui casting: short numero2 = (short) numero1
  - Constantes definido por: final, ex: final String BR = "Brasil"

## Operadores
  - Atribuição, Aritméticos, Unários, Relacionais(comparador), Lógicos: os mesmos das linguagens no geral ["=",">","<",">=","<=","+","-","*","/","^","++","--","!","&&","||",...]
  - Ao fazer atribuições de tipos com String ele irá considerar as diferenças na hora de realizar a operação, ex: String x = "1" +1+1 = 12; pois concatenou 1 e (1+1)
  - A ordem do incremento importa na chamada de métodos: .print(++num) ou .print(num++), soma antes de printar ou soma depois de printar
  - Ternário: if em linha => se CONDIÇÃO ? true : false; -> igual no JS

## Métodos
  - Verbos, camelCase
  - CleanCode: atribuir 1 responsabilidade para cada método
  - Retorno da função
  - vazio = void
  - visibilidade: public, private, protected
  
## Escopo
  - funcionamento normal como o de outras linguagens usais.

## Palavras Reservadas
  - int, float,import, public, package ... todas em minusculo

## Java Doc
  - Tags, comentários e comando javadoc

## Terminal e Argumentos
  - executando pela IDE, editar o launch.json
  - scanner pega os valores do terminal, e pode conevrter para um tipo