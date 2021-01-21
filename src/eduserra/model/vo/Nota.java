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
public class Nota {
    private int ide;
    private float redacao[] = new float[3];
    private float linguagens[] = new float[3];
    private float natureza[] = new float[3];
    private float humanas[] = new float[3];
    private float matematica[] = new float[3];
    private float redacaoEnem;
    private float linguagensEnem;
    private float naturezaEnem;
    private float humanasEnem;
    private float matematicaEnem;

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public float getRedacaoEnem() {
        return redacaoEnem;
    }

    public void setRedacaoEnem(float redacaoEnem) {
        this.redacaoEnem = redacaoEnem;
    }

    public float getLinguagensEnem() {
        return linguagensEnem;
    }

    public void setLinguagensEnem(float linguagensEnem) {
        this.linguagensEnem = linguagensEnem;
    }

    public float getNaturezaEnem() {
        return naturezaEnem;
    }

    public void setNaturezaEnem(float naturezaEnem) {
        this.naturezaEnem = naturezaEnem;
    }

    public float getHumanasEnem() {
        return humanasEnem;
    }

    public void setHumanasEnem(float humanasEnem) {
        this.humanasEnem = humanasEnem;
    }

    public float getMatematicaEnem() {
        return matematicaEnem;
    }

    public void setMatematicaEnem(float matematicaEnem) {
        this.matematicaEnem = matematicaEnem;
    }
    
    
    public float[] getRedacao() {
        return redacao;
    }

    public void setRedacao(float[] redacao) {
        this.redacao = redacao;
    }

    public float[] getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(float[] linguagens) {
        this.linguagens = linguagens;
    }

    public float[] getNatureza() {
        return natureza;
    }

    public void setNatureza(float[] natureza) {
        this.natureza = natureza;
    }

    public float[] getHumanas() {
        return humanas;
    }

    public void setHumanas(float[] humanas) {
        this.humanas = humanas;
    }

    public float[] getMatematica() {
        return matematica;
    }

    public void setMatematica(float[] matematica) {
        this.matematica = matematica;
    }
}
