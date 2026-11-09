# Exercícios de lógica de programação

Este diretório reúne o código dos quatro exercícios e a descrição do que cada um pede.

## Exercício 1 — Tabuada

**Enunciado:** leia um número informado pelo usuário e exiba a tabuada desse número de 1 a 10.

O programa solicita um número de 1 a 10 e imprime os produtos de `n × 1` até `n × 10`.

## Exercício 2 — Cálculo do IMC

**Enunciado:** leia a altura e o peso do usuário, calcule o IMC usando `peso / (altura * altura)` e exiba a classificação correspondente:

- IMC menor ou igual a 18,5: abaixo do peso;
- de 18,6 a 24,9: peso ideal;
- de 25,0 a 29,9: levemente acima do peso;
- de 30,0 a 34,9: obesidade grau I;
- de 35,0 a 39,9: obesidade grau II (severa);
- a partir de 40,0: obesidade grau III (mórbida).

O código usa os limites numéricos entre as faixas (18,5, 25, 30, 35 e 40) para classificar valores decimais sem lacunas.

## Exercício 3 — Pares ou ímpares no intervalo

**Enunciado:** leia um primeiro número e um segundo número maior que o primeiro. Peça a escolha entre pares e ímpares e mostre os números que correspondem à escolha dentro do intervalo, incluindo os limites, em ordem decrescente.

## Exercício 4 — Divisões com resto zero

**Enunciado:** leia um número inicial e, em seguida, outros números. Ignore os números menores que o inicial. Continue enquanto a divisão do número informado pelo número inicial tiver resto zero; encerre quando houver resto diferente de zero.

O número inicial não pode ser zero, pois não é possível dividir por zero.

**Nota sobre a resolução:** precisei da ajuda da IA para terminar este exercício, pois tive um pouco de dificuldade ao montar a lógica do código. Ao enviar meu código incompleto, recebi a seguinte orientação:

> Seu raciocínio está no caminho certo! Você já identificou duas das condições mais importantes do exercício:
> - `num2 < num1`: verifica se o número informado é menor que a referência.
> - `num2 % num1 == 0`: verifica se a divisão tem resto zero.
>
> O que faltou foi principalmente entender como organizar a repetição.

## Como executar

Com o JDK instalado, compile e execute a partir da raiz do repositório:

```bash
javac exercicios/Main.java
java -cp exercicios Main
```

O programa apresenta um menu para escolher qual exercício executar.
