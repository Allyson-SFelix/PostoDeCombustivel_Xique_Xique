package com.posto.xiquexique;


/**
 * Classe que representa a estrutura de funcionários
 * 
 * Trata-se de uma AVL de funcionários
 * Onde a raiz é o gerente
 * a esquerda fica os frentistas e a direita os vendedores
 * 
 * @author aliran
 */
public class EstruturaFuncionarios {

    private String nome;
    private String cpf;
    private String senha;
    private EstruturaFuncionarios esquerda;
    private EstruturaFuncionarios direita;
    private int altura;

    /**
     * Construtor da classe
     * 
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param senha Senha do funcionário
     */
    public EstruturaFuncionarios(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;

        this.esquerda = null;
        this.direita = null;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">

    private EstruturaFuncionarios getMinValueNode(EstruturaFuncionarios node) {
        EstruturaFuncionarios current = node;
        while (current.esquerda != null)
            current = current.esquerda;
        return current;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public EstruturaFuncionarios getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(EstruturaFuncionarios esquerda) {
        this.esquerda = esquerda;
    }

    public EstruturaFuncionarios getDireita() {
        return direita;
    }

    public void setDireita(EstruturaFuncionarios direita) {
        this.direita = direita;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private int getBalance(EstruturaFuncionarios N) {
        if (N == null)
            return 0;
        return altura(N.esquerda) - altura(N.esquerda);
    }

    private int getOrdem(EstruturaFuncionarios root, EstruturaFuncionarios novo){
        if(root == null)
            return 0;
        return novo.getNome().compareTo(root.getNome());
    }
    // </editor-fold>
    
    /**
     * Insere um novo funcionário na árvore
     * e balanceia a árvore
     * 
     * @param novo Funcionário a ser inserido
     */
    public EstruturaFuncionarios inserir(EstruturaFuncionarios novo) {
        return this.inserir(this, novo);
    }

    /**
     * Insere um novo funcionário na árvore
     * e balanceia a árvore
     * 
     * @param root Raiz da árvore
     * @param novo Funcionário a ser inserido
     * @return Árvore com o novo funcionário inserido e balanceada
     */
    private EstruturaFuncionarios inserir(EstruturaFuncionarios root, EstruturaFuncionarios novo) {
        // Passo 1: Inserção normal de uma árvore binária de busca
        if (root == null)
            return (novo);

        if (getOrdem(root, novo) < 0)
            root.esquerda = inserir(root.esquerda, novo);
        else if (getOrdem(root, novo) > 0)
            root.direita = inserir(root.direita, novo);
        else // Chaves duplicadas não são permitidas
            return root;

        // Passo 2: Atualizar a altura do nó ancestral
        root.altura = 1 + Math.max(altura(root.esquerda), altura(root.direita));

        // Passo 3: Obter o fator de balanceamento deste nó ancestral
        int balance = getBalance(root);

        // Passo 4: Realizar rotações apropriadas

        // Caso de Desbalanceamento Esquerda-Esquerda
        if (balance > 1 && getOrdem(root.esquerda, novo) < 0)
            return rotacaoDireita(root);

        // Caso de Desbalanceamento Direita-Direita
        if (balance < -1 && getOrdem(root.direita, novo) > 0)
            return rotacaoDireita(root);

        // Caso de Desbalanceamento Esquerda-Direita
        if (balance > 1 && getOrdem(root, novo) > 0) {
            rotacaoDuplaDireita(root);
        }

        // Caso de Desbalanceamento Direita-Esquerda
        if (balance < -1 && getOrdem(root, novo) < 0) {
            rotacaoDuplaEsquerda(root);
        }

        // Retornar o ponteiro do nó (inalterado) caso esteja balanceado
        return root;
    }

    public EstruturaFuncionarios excluirNo(String nome) {
        EstruturaFuncionarios no = buscar(nome);
        if (no == null) {
            return null;
        }
        return excluirNo(this, no);
    }
    
    public EstruturaFuncionarios excluirNo(EstruturaFuncionarios root, EstruturaFuncionarios deletando) {
        // Passo 1: Remoção normal de uma árvore binária de busca
        if (root == null)
            return root;
        

        if (getOrdem(root, deletando) < 0)
            root.esquerda = excluirNo(root.esquerda, deletando);
        else if (getOrdem(root, deletando) > 0)
            root.direita = excluirNo(root.direita, deletando);
        else {
            // Nó com apenas um filho ou nenhum
            if ((root.esquerda == null) || (root.direita == null)) {
                EstruturaFuncionarios temp = null;
                if (temp == root.esquerda)
                    temp = root.direita;
                else
                    temp = root.esquerda;

                // Caso de nó sem filhos
                if (temp == null) {
                    root = null;
                } else // Caso de um único filho
                    root = temp;
            } else {
                // Nó com dois filhos: obter o sucessor (menor na subárvore direita)
                EstruturaFuncionarios temp = getMinValueNode(root.direita);

                // Copiar o sucessor para o nó atual
                root = temp;

                // Remover o sucessor
                root.direita = excluirNo(root.direita, temp);
            }
        }

        // Se a árvore tinha apenas um nó
        if (root == null)
            return root;

        // Passo 2: Atualizar a altura do nó atual
        root.altura = Math.max(altura(root.esquerda), altura(root.direita)) + 1;

        // Passo 3: Obter o fator de balanceamento deste nó
        int balance = getBalance(root);

        // Passo 4: Realizar rotações apropriadas

        // Caso de Desbalanceamento Esquerda-Esquerda
        if (balance > 1 && getBalance(root.esquerda) >= 0)
            return rotacaoDireita(root);

        // Caso de Desbalanceamento Esquerda-Direita
        if (balance > 1 && getBalance(root.esquerda) < 0) {
            return rotacaoDuplaDireita(root);
        }

        // Caso de Desbalanceamento Direita-Direita
        if (balance < -1 && getBalance(root.direita) <= 0)
            return rotacaoEsquerda(root);

        // Caso de Desbalanceamento Direita-Esquerda
        if (balance < -1 && getBalance(root.direita) > 0) {
            return rotacaoDuplaEsquerda(root);
        }

        return root;
    }

    /**
     * Busca um funcionário na árvore
     * 
     * @param nome Nome do funcionário a ser buscado
     * @return Funcionário buscado
     */
    public EstruturaFuncionarios buscar(String nome) {
        if (this.nome.equals(nome)) {
            return this;
        } else if (this.nome.compareTo(nome) < 0) {
            if (this.esquerda == null) {
                return null;
            } else {
                return this.esquerda.buscar(nome);
            }
        } else {
            if (this.direita == null) {
                return null;
            } else {
                return this.direita.buscar(nome);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Rotações">

    private int altura(EstruturaFuncionarios N) {
        if (N == null) 
            return 0;
        return N.altura;
    }

    private EstruturaFuncionarios rotacaoDireita(EstruturaFuncionarios y) {
        EstruturaFuncionarios x = y.esquerda;
        EstruturaFuncionarios T2 = x.direita;

        // Realizando a rotação
        x.direita = y;
        y.esquerda = T2;

        // Atualizando as alturas
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        // Retornando a nova raiz
        return x;
    }

    // Função para fazer uma rotação à esquerda
    private EstruturaFuncionarios rotacaoEsquerda(EstruturaFuncionarios x) {
        EstruturaFuncionarios y = x.direita;
        EstruturaFuncionarios T2 = y.esquerda;

        // Realizando a rotação
        y.esquerda = x;
        x.direita = T2;

        // Atualizando as alturas
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        // Retornando a nova raiz
        return y;
    }



    /**
     * Rotação à direita
     * 
     * @return Árvore rotacionada à direita
     */
    public EstruturaFuncionarios rotacaoDireita() {
        return this.rotacaoDireita(this);
    }

    /**
     * Rotação à esquerda
     * 
     * @return Árvore rotacionada à esquerda
     */
    public EstruturaFuncionarios rotacaoEsquerda() {
        return this.rotacaoEsquerda(this);
    }

    /**
     * Rotação dupla à direita
     * 
     * @return Árvore rotacionada duplamente à direita
     */
    public EstruturaFuncionarios rotacaoDuplaDireita() {
        this.esquerda = this.esquerda.rotacaoEsquerda();
        return this.rotacaoDireita();
    }

    private EstruturaFuncionarios rotacaoDuplaDireita(EstruturaFuncionarios y) {
        y.esquerda = rotacaoEsquerda(y.esquerda);
        return rotacaoDireita(y);
    }

    /**
     * Rotação dupla à esquerda
     * 
     * @return Árvore rotacionada duplamente à esquerda
     */
    public EstruturaFuncionarios rotacaoDuplaEsquerda() {
        this.direita = this.direita.rotacaoDireita();
        return this.rotacaoEsquerda();
    }

    private EstruturaFuncionarios rotacaoDuplaEsquerda(EstruturaFuncionarios x) {
        x.direita = rotacaoDireita(x.direita);
        return rotacaoEsquerda(x);
    }
    // </editor-fold>

    

    
}
