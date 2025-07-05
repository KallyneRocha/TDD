# 🧮 Calculadora de Operações Básicas com TDD

Este projeto tem como objetivo demonstrar a aplicação dos princípios do **Desenvolvimento Orientado a Testes (TDD)** em Java, utilizando uma **calculadora** como exemplo simples e prático.

---

## 🎯 Objetivo

Aplicar os três passos do ciclo TDD:

1. **Red** – Escrever testes que inicialmente falham;
2. **Green** – Implementar o código mínimo necessário para os testes passarem;
3. **Refactor** – Melhorar a qualidade do código mantendo os testes passando.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Ferramenta de Testes**: JUnit 5
- **IDE**: IntelliJ IDEA (também compatível com Eclipse ou VSCode com suporte a testes)

---

## 📚 Descrição do Problema

A classe `Calculadora` implementa quatro operações matemáticas básicas:

| Método        | Descrição                                      |
|---------------|-----------------------------------------------|
| `somar(a, b)` | Retorna a soma de dois inteiros               |
| `subtrair(a, b)` | Retorna a subtração entre dois inteiros    |
| `multiplicar(a, b)` | Retorna a multiplicação entre dois inteiros |
| `dividir(a, b)` | Retorna a divisão inteira de dois inteiros. **Lança exceção se b for zero.** |

---

## 🧪 Estrutura dos Testes

Todos os métodos foram testados individualmente na classe `CalculadoraTest` utilizando JUnit.  
Incluímos também um teste específico para validar o lançamento de exceção ao dividir por zero.

Exemplo de teste:

```java
@Test
public void testDividirPorZero() {
    assertThrows(ArithmeticException.class, () -> {
        calculadora.dividir(5, 0);
    });
}
```

##🧬 Organização do Projeto
```java
css
Copiar
Editar
CalculadoraTDD/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Calculadora.java
│   └── test/
│       └── java/
│           └── CalculadoraTest.java
├── pom.xml
└── README.md
```
O projeto segue a estrutura padrão de um projeto Maven.

## Ciclo TDD na Prática
🔴 Red: Escri testes para cada método antes de implementá-los;

🟢 Green: Criei a classe Calculadora com os métodos necessários;

🟡 Refactor: Extraí a validação de divisão por zero para um método separado e melhoramos a documentação do código.

## Como Executar

### 1. Clone o repositório:

bash
Copiar
Editar
git clone <url-do-repositório>
Abra o projeto em uma IDE com suporte a Maven.

### 2. Rode os testes:

Pelo terminal:

bash
Copiar
Editar
mvn test
Ou direto pela IDE (botão "Run Test").
