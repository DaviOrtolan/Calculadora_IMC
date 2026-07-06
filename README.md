# 🧮 Calculadora de IMC em Java

Um aplicativo de console simples em Java desenvolvido para calcular o Índice de Massa Corporal (IMC) de um usuário, fornecendo a classificação da saúde com base nos padrões da Organização Mundial da Saúde (OMS).

## Funcionalidades

*   **Entrada de dados:** Recebe o peso (em kg) e a altura (em metros) do usuário.
*   **Cálculo preciso:** Utiliza a fórmula matemática oficial do IMC.
*   **Classificação imediata:** Informa o IMC do usuário.

## Como o IMC é calculado?

O Índice de Massa Corporal é calculado dividindo o peso do usuário pelo quadrado de sua altura. A fórmula matemática aplicada no código é:

$$IMC = \frac{peso}{altura^2}$$

## Tabela de Classificação

O programa avalia o resultado com base nos seguintes intervalos:

| IMC | Classificação |
| :--- | :--- |
| Abaixo de 18.5 | Abaixo do peso |
| Entre 18.5 e 24.9 | Peso normal |
| Entre 25.0 e 29.9 | Sobrepeso |
| Entre 30.0 e 34.9 | Obesidade Grau I |
| Entre 35.0 e 39.9 | Obesidade Grau II |
| Maior ou igual a 40.0 | Obesidade Grau III (Mórbida) |

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:
*   [Java JDK](https://www.oracle.com/java/technologies/downloads/) (versão 11 ou superior recomendada).
*   Um editor de código ou IDE (VS Code, IntelliJ IDEA, Eclipse, etc.).

