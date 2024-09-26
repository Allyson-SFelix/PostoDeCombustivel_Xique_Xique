# Posto de Combustivel Xique Xique (EM DESENVOLVIMENTO)
Sistema de gerenciamento de vendas e estoque de um posto de combustível e da conveniência.

## Descrição 
Este projeto tem como objetivo auxiliar o gestor na resolução de problemas relacionados com a manutenção e precauções sobre o desenvolvimento da sua empresa através de um gerenciador de vendas e estoque, que permite o acesso pelos seus funcionários e pelo gestor. 

Implementado as seguintes funcionalidades:
- Menus
    - Gerente
    - Frentista 
    - Atendente

    Para cada menu selecionado, existirá determinadas opções como:
    - Vendas
    - Estoque

    Já para cada menu interno selecionado, opções como:
    - Listar, editar, selecionar e remover
    
    OBS: Esse sistema foi projetado levando em consideração que o gerente tem o maior poder de controle da empresa, tendo acesso a todos os menus desenvolvidos.

## Instalação
### Pré-requisitos
1. **Java Development Kit (JDK)** versão 21 ou superior

    - Certifique-se de que o JDK está configurado no PATH do sistema para que os comandos `javac` e `java` funcionem corretamente. [Guia de Configuração do PATH](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux).

    - Baixe e instale o JDK a partir do site oficial da Oracle: [JDK Downloads](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)

2. **Ferramentas de Build**
    - Maven: [Instalação do Maven](https://maven.apache.org/install.html)





### Passos para instalar
1. Clone o repositório:
   ```bash
   git clone https://github.com/Allyson-SFelix/PostoDeCombustivel_Xique_Xique.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd xiquexique/src/main/java/com/posto/xiquexique/Xiquexique.java
   ```


### 4. **Como Usar**
- Ao executar o arquivo recomendado, será necessário utilizar o usuário e a senha inicial de acesso
`` admin : admin ``
- Guia para utilização:
1. Realizar o login com as credenciais informadas
2. Selecionar o menu desejado
3. ...
4. Quando selecionado o menu "Estoque", aparecerá as seguintes opções:
    - Listar 
        - Aparecerá uma tabela com os itens presente no estoque e a opção "Sair"
    - Inserir
        - Aparecerá 3 campos de entrada, sendo o primeiro relacionado com o nome do produto a ser cadastrado, o segundo campo relacionado com a quantidade de itens a ser cadastrado e o ultimo campo relacionado com o preço do produto.
        - Após preenchido esses campos deverá ser acionado o botão "Adicionar no estoque", sendo informado na caixa de texto abaixo o resumo dos itens a serem cadastrados.
        - Logo abaixo, para realizar o cadastrado no estoque, deverá ser acionado o botão "Confirmar" 
    - Editar
        - Aparecerá uma tabela com os itens presente no estoque, e ao ser selecionado na tabela algum determinado produto aparecerá na caixa de texto acima, e para editar esse produto selecionado deve-se clicar no botão "Editar"
        - Nessa opção, o usuário poderá alterar o preço unitário do produto e poderá alterar também a quantidade do produto selecionado.
        - Ao terminar a edição será necessário clicar no botão "Concluir"
    - Remover
        - Aparecerá uma tabela com os itens presente no estoque, e ao ser selecionado na tabela algum determinado produto aparecerá na caixa de texto acima, e para editar esse produto selecionado deve-se clicar no botão "Remover"
        - Nessa opção, o usuário terá removido o produto do estoque permanentemente.
    - Sair
        
OBS: Para realizar a saída da opção selecionada no canto inferior da janela terá um botão denominado "Sair", sendo a única opção para saída da opção selecionada, contudo para fechar o programa é necessário fazer o logout e clicar na opção na parte superior a direita no botão "X".

```markdown
## Como Usar
Após a instalação, execute o comando a seguir para iniciar a aplicação:
```bash
python main.py

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
