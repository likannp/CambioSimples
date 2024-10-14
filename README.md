# Cambio Simples

Este é um projeto de conversão de moedas que utiliza a API **ExchangeRate-API** para 
realizar as conversões entre diferentes moedas.

## Funcionalidades

- Conversão entre **Dólar** (USD), **Peso Argentino** (ARS), **Real Brasileiro** (BRL) e **Peso Colombiano** (COP).
- A conversão é realizada usando uma API externa que fornece as taxas de câmbio em tempo real.
- O programa permite ao usuário selecionar a opção de conversão desejada e inserir um valor para conversão.
- O usuário também pode sair do programa a qualquer momento.

## Tecnologias Usadas

- **Java**: Linguagem de programação principal do projeto.
- **HttpClient (Java 11+)**: Usado para fazer as requisições HTTP à API de câmbio.
- **ExchangeRate-API**: API externa para obtenção de taxas de câmbio.
- **JSON**: Formato utilizado para parsear os dados recebidos da API.

## Requisitos

- **Java 11 ou superior** (necessário para usar `HttpClient` nativo).

## Como Executar

### 1. Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/CambioSimples.git
cd CambioSimples
```

### 2. Compilar o Projeto

Use o Maven para compilar o projeto:

```bash
mvn clean compile
```

### 3. Executar o Projeto

Para rodar o projeto, execute o seguinte comando Maven:

```bash
mvn exec:java -Dexec.mainClass="cambiosimples.Main"
```

### 4. Usar a Aplicação

Após executar o comando acima, o programa pedirá para que você escolha uma opção de conversão:

```
****************************
Seja bem-vindo/a ao Cambio Simples =]
1) Dólar  =>>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
Escolha uma opção válida:
****************************
```

Escolha uma das opções e depois insira o valor a ser convertido. O programa irá mostrar o valor convertido com base na taxa de câmbio obtida da API.

### 5. Sair

Para sair do programa, basta escolher a opção **7** no menu de opções.

## Estrutura do Projeto

- **Main.java**: Classe principal que contém a interface do usuário e a lógica de controle de fluxo.
- **CurrencyService.java**: Interface que define o contrato para conversão de moedas.
- **CurrencyConverterServiceImpl.java**: Implementação do serviço de conversão de moedas que usa a API externa para buscar as taxas de câmbio e realizar a conversão.