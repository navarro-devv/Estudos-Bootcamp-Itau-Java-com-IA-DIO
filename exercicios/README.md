# Exercícios de lógica de programação

Este diretório contém os enunciados dos quatro exercícios e o código enviado para resolvê-los em [`Main.java`](Main.java). Solicitei para o Copilot acrescentar apenas um pequeno menu com "cases" no início do script do meu código, para facilitar a seleção/execução de qual método (sendo cada metódo uma resolução) escolher que preferir avaliar.

## Exercício 1 — Tabuada

**Enunciado:** escreva um código em que o usuário informe um número e seja exibida a tabuada desse número de 1 a 10.

O código solicita um número e exibe os resultados da multiplicação por 1 até 10.

## Exercício 2 — Cálculo do IMC

**Enunciado:** leia a altura e o peso do usuário, calcule o IMC usando `peso / (altura * altura)` e exiba a classificação:

- menor ou igual a 18,5: abaixo do peso;
- entre 18,6 e 24,9: peso ideal;
- entre 25,0 e 29,9: levemente acima do peso;
- entre 30,0 e 34,9: obesidade grau I;
- entre 35,0 e 39,9: obesidade grau II (severa);
- maior que 40,0: obesidade grau III (mórbida).

O código apresenta a classificação com as condições implementadas originalmente.

## Exercício 3 — Pares ou ímpares no intervalo

**Enunciado:** leia um primeiro número, um segundo número maior que o primeiro e a escolha entre pares e ímpares. Exiba os números do tipo escolhido dentro do intervalo, incluindo os números informados, em ordem decrescente.

**Observação:** o código original percorre o intervalo de `num1` até `num2`, portanto exibe os resultados em ordem crescente. A lógica foi preservada, conforme solicitado.

## Exercício 4 — Divisões com resto zero

**Enunciado:** leia um número inicial e, em seguida, outros números. Ignore números menores que o inicial. Continue enquanto o número informado dividido pelo inicial tiver resto zero; encerre quando houver resto diferente de zero.

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

O menu permite selecionar um dos quatro exercícios.
