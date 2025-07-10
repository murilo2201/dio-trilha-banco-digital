## 💳 Desafio Banco Digital - Java 🏦  
Bem-vindo ao projeto que simula um sistema bancário orientado a objetos, com múltiplos clientes, contas, bancos e regras de negócio! 🚀

---

### ✨ Sobre o Projeto  
Este sistema permite criar bancos, cadastrar clientes, abrir contas (corrente e poupança), realizar depósitos, saques e transferências entre contas com **validação de saldo e exceções personalizadas**. Tudo isso usando os pilares da **POO em Java**.

---

### 💡 Funcionalidades  

- 🏛️ Cadastro de múltiplos bancos  
- 👤 Cadastro de clientes com contas em diferentes bancos  
- 💸 Depósitos, saques e transferências entre contas  
- 🚫 Validação de saldo com exceção customizada (`SaldoInsuficienteException`)  
- 📋 Listagem de contas por banco  
- 📢 Feedback no console após cada operação  
- ⚙️ Interface `IConta` garante padrão entre tipos de conta  
- 📦 Uso do **Lombok** para reduzir código repetitivo  

---

### 🏃 Como Rodar

Para executar o sistema, siga os passos abaixo:

1.  **Compile os arquivos**: Abra seu terminal ou prompt de comando na pasta onde os arquivos `.java` estão localizados e execute o seguinte comando:

    javac *.java

2.  **Execute a aplicação**: Após a compilação, execute a aplicação com o comando:

    java Main

O sistema automaticamente executará algumas operações e exibirá os resultados diretamente no console 💬.

---

### ⚠️ Exceções

* **SaldoInsuficienteException**: Esta exceção é lançada sempre que um cliente tenta realizar um saque ou uma transferência que excede o saldo disponível em sua conta.

---

### 👨‍💻 Autor

**Murilo França** 

