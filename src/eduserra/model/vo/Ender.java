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
public class Ender {
    private String vila;
    private String rua;
    private int numeroCasa;
    private String referencia;

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        vila = vila.toUpperCase();
        String vilas[] = {"RN", "BR", "GB", "AC", "AM", "MA", "PR", "PB", "CE", "RS", "SP", "RJ", "ES", "GO", "AL", "BA", 
            "PE", "MT", "PA", "PI", "SC", "SE", "MG", "G III"};
        for(int i = 0; i < 23; i++){ //Lembrar de verificar depois
            if(vilas[i].equals(vila)) {
                this.vila = vila;
            }else{
                System.out.println("Vila errada!");
            }
        }
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua) {
        if(rua == null || rua.isEmpty()){
            System.out.println("rua nulo ou vazio");
        }else{
            this.rua = rua.toUpperCase();
        }
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa){
        if(numeroCasa > 0){
            this.numeroCasa = numeroCasa;
        }else{
            System.out.println("numero abaixo de zero more");
        }
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        if(referencia == null || referencia.isEmpty()){
            System.out.println("rua nulo ou vazio");
        }else{
            this.referencia = referencia.toUpperCase();
        }
    } 
}
