package Model;

import interfaceFuncional.Autentica;

public class Cliente implements Autentica {
    private String nome;
    private boolean status;
    private String senha;


    public Cliente(String nome, boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;

    }
public Cliente(){


}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean autenticaSenha(String senha) {
        if (this.senha!= senha){
            System.out.println("nao autentificado");
            return false;
        }
        System.out.println("autentificado");
        return true;
    }
}
