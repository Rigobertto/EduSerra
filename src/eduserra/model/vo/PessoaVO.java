/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduserra.model.vo;

/**
 *
 * @author rigor
 */
public class PessoaVO {
    private String nome;
    private int idade;
    private String genero;
    private Ender endereco;
    private String telefone;
    private String email;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
	if(nome == null || nome.isEmpty()){
            System.out.println("Nome nulo ou vazio");
        }else{
            this.nome = nome.toUpperCase();
        }
    }
	
    public int getIdade() {			
	return this.idade;
    }
    public void setIdade(int idade) {
	if(idade < 0){
            System.out.println("Idade menor que zero");
        }else{// Provavelmente uma futura excepcion para idades menores que 0
            this.idade = idade;
        }
    }

    public String getGenero() {
	return this.genero;
    }
    public void setGenero(String genero) {
	genero = genero.toUpperCase();
	if(genero.equals("M") || genero.equals("F") || genero.equals("O")){
            this.genero = genero;
        }
    }

    public Ender getEndereco(){
        return endereco;
    }

    public void setEndereco(Ender endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNumero(String telefone) {
        if(telefone == null || telefone.isEmpty()){
            System.out.println("telefone nulo ou vazio");
        }else{
            this.telefone = telefone;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.isEmpty()){
            System.out.println("email errado more");
        }else{
            this.email = email;
        }
    }
    
}
