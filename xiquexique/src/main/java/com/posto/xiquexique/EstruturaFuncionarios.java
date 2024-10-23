package com.posto.xiquexique;

import java.util.ArrayList;


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
    private ArrayList<HeapVenda> vendas;


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

        esquerda = direita = null;
    }


    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">

    public String getFuncao(){
        if(this.nome.startsWith("f")){
            return "frentista";
        } else if(this.nome.startsWith("v")){
            return "atendente";
        } else {
            return "gerente";
        }
    }

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

    public ArrayList<HeapVenda> getVendas() {
        return vendas;
    }

    public HeapVenda getVenda(int index){
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getId() == index) {
                return this.vendas.get(i);
            }
        }
        return null;
    }

    public void setHeap(int index, HeapVenda venda){ 
        this.vendas.set(index, venda);
    }

    public void removeHeap(int index){
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getId() == index) {
                this.vendas.remove(i);
                return;
            }
        }
    }

    public float getPrecoVenda(int index){
        return this.vendas.get(index).getValorTotal();
    }

    public int getQuantidadeVendida(int index){
        return this.vendas.get(index).getQuantidadeTotal();
    }

    // </editor-fold>
    
    public int compararVendas(HeapVenda venda, int index){
        return this.vendas.get(index).getCreationTime().compareTo(venda.getCreationTime());
    }

    public void addVenda(HeapVenda venda){
        if(this.vendas == null){
            this.vendas = new ArrayList<>();
        }
        venda.setId(this.vendas.size());
        this.vendas.add(venda);
    }

    public void inserirFuncionarios(String nome, String cpf, String senha){
        EstruturaFuncionarios novo = new EstruturaFuncionarios(nome, cpf, senha);
        if(nome.startsWith("f")){
            inserirFrentista(novo);
        } else {
            inserirVendedor(novo);
        }
    }

    private void inserirFrentista(EstruturaFuncionarios novo){
        if(this.esquerda == null){
            this.esquerda = novo;
        } else {
            this.esquerda.inserir(novo);
        }
    }

    private void inserirVendedor(EstruturaFuncionarios novo){
        if(this.direita == null){
            this.direita = novo;
        } else {
            this.direita.inserir(novo);
        }
    }

    

    private EstruturaFuncionarios balancear(EstruturaFuncionarios root){
        root.altura = Math.max(altura(root.esquerda), altura(root.direita)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.esquerda) >= 0)
            return rotacaoDireita(root);

        if (balance > 1 && getBalance(root.esquerda) < 0) {
            return rotacaoDuplaDireita(root);
        }

        if (balance < -1 && getBalance(root.direita) <= 0)
            return rotacaoEsquerda(root);

        if (balance < -1 && getBalance(root.direita) > 0) {
            return rotacaoDuplaEsquerda(root);
        }

        return root;
    }

    /**
     * Insere um novo funcionário na árvore
     * e balanceia a árvore
     * 
     * @param novo Funcionário a ser inserido
     */
    private void inserir(EstruturaFuncionarios novo) {
        this.inserir(this,novo);
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
        if (root == null)
            return (novo);

        if (getOrdem(root, novo) < 0)
            root.esquerda = inserir(root.esquerda, novo);
        else if (getOrdem(root, novo) > 0)
            root.direita = inserir(root.direita, novo);
        else 
            return root;


        return balancear(root);
    }

    /**
     * Exclui um funcionário da árvore
     * 
     * @param nome Nome do funcionário a ser excluído
     * @return Árvore sem o funcionário excluído
     */
    public EstruturaFuncionarios excluirNo(String nome) {
        EstruturaFuncionarios no = buscar(nome);
        if (no == null) {
            return null;
        }
        return excluirNo(this, no);
    }
    
    /**
     * Exclui um funcionário da árvore
     * 
     * @param root Raiz da árvore
     * @param deletando Funcionário a ser excluído
     * @return Árvore sem o funcionário excluído
     */
    public EstruturaFuncionarios excluirNo(EstruturaFuncionarios root, EstruturaFuncionarios deletando) {
        if (root == null)
            return root;
        

        if (getOrdem(root, deletando) < 0)
            root.esquerda = excluirNo(root.esquerda, deletando);
        else if (getOrdem(root, deletando) > 0)
            root.direita = excluirNo(root.direita, deletando);
        else {
            if ((root.esquerda == null) || (root.direita == null)) {
                EstruturaFuncionarios temp = null;
                if (temp == root.esquerda)
                    temp = root.direita;
                else
                    temp = root.esquerda;

                if (temp == null) {
                    root = null;
                } else 
                    root = temp;
            } else {
                EstruturaFuncionarios temp = getMinValueNode(root.direita);

                copiarNo(temp, root);

                root.direita = excluirNo(root.direita, temp);
            }
        }

        if (root == null)
            return root;

        return balancear(root);
    }

    /**
     * Copia um No da arvore para outro
     * 
     * @param origem No a ser copiado
     * @param destino No que receberá a cópia
     */
    public void copiarNo(EstruturaFuncionarios origem, EstruturaFuncionarios destino){
        destino.setNome(origem.getNome());
        destino.setCpf(origem.getCpf());
        destino.setSenha(origem.getSenha());
        destino.setEsquerda(origem.getEsquerda());
        destino.setDireita(origem.getDireita());
        destino.setAltura(origem.getAltura());
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
        } else if (nome.startsWith("f")){
            return this.esquerda.buscar(nome, true);
        } else if (nome.startsWith("v")){
            return this.direita.buscar(nome, false);
        } else {
            return null;
        }

    }

    /**
     * Busca se existe um CPF na arvore
     * 
     * @param Cpf CPF do funcionário a ser buscado
     * @return caso exista o CPF retorna true, caso contrário retorna false
     */
    public boolean buscarCPF(String Cpf){
        if(this.cpf.equals(Cpf)){
            return true;
        } else if(this.esquerda != null){
            return this.esquerda.buscarCPF(Cpf);
        } else if(this.direita != null){
            return this.direita.buscarCPF(Cpf);
        } else {
            return false;
        }
    }

    /**
     * Busca um funcionário na árvore
     * 
     * @param nome Nome do funcionário a ser buscado
     * @param b Se é frentista ou não
     * @return Funcionário buscado
     */
    private EstruturaFuncionarios buscar(String nome, boolean b){
        if(this.nome.equals(nome)){
            return this;
        } else if(this.nome.compareTo(nome) < 0){
            if(this.esquerda == null){
                return null;
            } else {
                return this.esquerda.buscar(nome, b);
            }
        } else {
            if(this.direita == null){
                return null;
            } else {
                return this.direita.buscar(nome, b);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Rotações">
    /**
     * Retorna a altura de um nó
     * @param N Nó a ser verificado
     * @return Altura do nó
     */
    private int altura(EstruturaFuncionarios N) {
        if (N == null) 
            return 0;
        return N.altura;
    }

    /**
     * Rotação à direita de um nó da árvore AVL
     * @param y Nó a ser rotacionado
     * @return Árvore rotacionada à direita
     */
    private EstruturaFuncionarios rotacaoDireita(EstruturaFuncionarios y) {
        EstruturaFuncionarios x = y.esquerda;
        EstruturaFuncionarios T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    /**
     * Rotação à esquerda de um nó da árvore AVL
     * @param x Nó a ser rotacionado
     * @return Árvore rotacionada à esquerda
     */
    private EstruturaFuncionarios rotacaoEsquerda(EstruturaFuncionarios x) {
        EstruturaFuncionarios y = x.direita;
        EstruturaFuncionarios T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }


    /**
     * Rotação dupla à direita
     * 
     * @param y Nó a ser rotacionado
     * @return Árvore rotacionada duplamente à direita
     */
    private EstruturaFuncionarios rotacaoDuplaDireita(EstruturaFuncionarios y) {
        y.esquerda = rotacaoEsquerda(y.esquerda);
        return rotacaoDireita(y);
    }

    /**
     * Rotação dupla à esquerda
     * 
     * @param x Nó a ser rotacionado
     * @return Árvore rotacionada duplamente à esquerda
     */
    private EstruturaFuncionarios rotacaoDuplaEsquerda(EstruturaFuncionarios x) {
        x.direita = rotacaoDireita(x.direita);
        return rotacaoEsquerda(x);
    }
    // </editor-fold>

    

    
}
