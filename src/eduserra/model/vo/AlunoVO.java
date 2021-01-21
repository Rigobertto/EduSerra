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
public class AlunoVO extends PessoaVO{
    private int ide;
    private String curso;
    private Nota nota;
    private boolean aprovacao;
    private String cursoAprovado;
    private String lingua;

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public boolean getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

    public String getCursoAprovado() {
        return cursoAprovado;
    }

    public void setCursoAprovado(String cursoAprovado) {
        this.cursoAprovado = cursoAprovado;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua){
        lingua = lingua.toUpperCase();
        if(lingua.equals("E") || lingua.equals("I")){
            this.lingua = lingua;
        }else{
            System.out.println("Lingua errada!");
        }
    }
}
