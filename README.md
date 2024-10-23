# Posto de Combustível Xique Xique 

Sistema de gerenciamento de vendas e estoque de um posto de combustível e da conveniência.

## Descrição

Este projeto tem como objetivo auxiliar o gestor na resolução de problemas relacionados à manutenção e precauções no desenvolvimento da sua empresa, por meio de um gerenciador de vendas e estoque que permite o acesso pelos seus funcionários e pelo gestor.

### Funcionalidades Implementadas:
- Menus:
    - Gerente
    - Frentista
    - Atendente

    Para cada menu selecionado, existem as seguintes opções:
    - Vendas
    - Estoque
    - Adicionar Funcionários (Apenas para o Gerente)
    - Mudar Senha (Apenas para o Gerente)

    Já para cada menu interno selecionado, opções como:
    - Listar, editar, selecionar e remover

    **OBS**: Este sistema foi projetado levando em consideração que o gerente tem o maior poder de controle da empresa, tendo acesso a todos os menus desenvolvidos.

### Pré-requisitos para Executar

1. **Java Runtime Environment (JRE)**:
   - Você pode baixar a versão mais recente do JRE no site oficial da Oracle: [Oracle JRE Downloads](https://www.oracle.com/java/technologies/javase-jre8-downloads.html).

2. **Maven**:
   - Certifique-se de que o Maven esteja instalado. Você pode baixar a versão mais recente do Maven no site oficial: [Maven Downloads](https://maven.apache.org/download.cgi).
   - Após a instalação, verifique se o Maven está configurado corretamente executando o comando `mvn -v` no terminal.


### Passos para Instalar:

1. Clone o repositório:
    ```bash
    git clone https://github.com/Allyson-SFelix/PostoDeCombustivel_Xique_Xique.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd xiquexique/src/main/java/com/posto/xiquexique/Xiquexique.java
    ```

3. Execute este arquivo:

   1º Etapa (Compilar o arquivo):
    ```bash
    javac Xiquexique.java
    ```

    2º Etapa (Executar o arquivo):
    ```bash
    java Xiquexique
    ```

## Como Usar

- Ao executar o arquivo recomendado, será necessário utilizar o usuário e a senha inicial de acesso:
    ```
    admin : admin
    ```

### Guia para Utilização:

1. Realize o login com as credenciais informadas.

2. Selecione o menu desejado (Gerente | Frentista | Atendente).

3. Quando selecionar o menu "Vendas", os seguintes campos aparecerão:
    - No canto superior direito, haverá um botão para a opção "Adicionar Vendas", que permite adicionar novas vendas.
        - Nesta opção, existirão três campos/botões: o primeiro mostra os itens no estoque, o segundo permite selecionar a quantidade de itens vendidos e o terceiro adiciona a venda. Para confirmar a venda, clique no botão "Concluído".
    - No canto inferior esquerdo, aparecerá um botão "Acessar", que permite listar as vendas realizadas e remover a venda selecionada.
        - Uma tabela listará as vendas realizadas, e haverá um botão "Remover" no canto superior esquerdo. Ao selecionar este botão, as vendas serão exibidas como opções em forma de botões; selecionar um botão irá remover a venda e os itens retornarão ao estoque.
    - Sair.

4. Quando selecionar o menu "Estoque", as seguintes opções aparecerão:
    - **Listar**: Exibe uma tabela com os itens no estoque e a opção "Sair".
    - **Inserir**: Três campos aparecerão para inserir o nome do produto, a quantidade de itens e o preço do produto.
        - Após preencher esses campos, clique no botão "Adicionar no estoque", e um resumo dos itens será exibido abaixo.
        - Para concluir o cadastro, clique em "Confirmar".
    - **Editar**: Uma tabela com os itens do estoque será exibida. Ao selecionar um item, ele aparecerá em um campo de texto. Para editar, clique no botão "Editar".
        - O preço unitário e a quantidade do produto podem ser alterados. Após editar, clique em "Concluir".
    - **Remover**: Uma tabela com os itens do estoque será exibida. Ao selecionar um item, ele aparecerá em um campo de texto. Para remover o produto, clique em "Remover", e o produto será removido permanentemente.
    - Sair.

5. Quando selecionar o menu "Adicionar Funcionários" (aparecerá apenas para o Gerente), as seguintes opções aparecerão:
    - Haverão três campos de texto: nome, CPF e senha para cadastrar o novo funcionário, além de dois botões para definir se o novo funcionário será Frentista ou Vendedor.

6. Quando selecionar o menu "Mudar Senha" (aparecerá apenas para o Gerente), as seguintes opções aparecerão:
    - Haverão três campos de texto: a senha anterior, a nova senha e a repetição da nova senha para confirmação. Clique em "Confirmar" para concluir a alteração.

**OBS**: Para sair de qualquer opção selecionada, clique no botão "Sair" no canto inferior da janela. Para fechar o programa, faça logout e clique no botão "X" no canto superior direito.

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um *fork* do projeto.
2. Crie uma nova *branch*:
    ```bash
    git checkout -b feature/nova-funcionalidade
    ```

3. Envie suas alterações:
    ```bash
    git push origin feature/nova-funcionalidade
    ```

4. Abra um *pull request*.
