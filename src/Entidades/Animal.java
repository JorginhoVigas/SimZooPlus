/*
    Ednalva Rodrigues e Jorge Vigas
 */
package Entidades;

import Interfaces.InterfaceDosComportamentosDeAlimentar;
import Interfaces.InterfaceDosComportamentosDeAndar;
import Interfaces.InterfaceDosComportamentosDeEmitirSom;
import Interfaces.InterfaceDosComportamentosDeVoar;
import DataUtility.DataUtility;
import java.util.Date;
import lombok.*;

@Getter
@Setter
public abstract class Animal {

    private String nome;
    private String cor;
    private String descricao;
    private int identificador;
    private char sexo;
    private Date dataNascimento;
    private Especie especie;
    private Date dataUltimaConsultaVeterinaria;

    private InterfaceDosComportamentosDeAlimentar ComportamentoDeAlimentar;
    private InterfaceDosComportamentosDeAndar ComportamentoDeAndar;
    private InterfaceDosComportamentosDeEmitirSom ComportamentoDeEmitirSom;
    private InterfaceDosComportamentosDeVoar ComportamentoDeVoar;

    public Animal() {

        especie = new Especie();
    }

    public abstract String apresentar();

    public int calcularIdade(Date dataNascimento) {
        return DataUtility.calcularIdade(dataNascimento);
    }

    public String alimentar() {
        return "Comer carne";
    }

    public String emitirSomMiau() {
        return "Miau miau miau";
    }

    public String andar() {
        return "Andar de quatro patas";
    }

    public String voar() {
        return "Voar de avião";
    }

    public String latir() {
        return "Au au au";
    }

    public String rugir() {
        return "Roam roam roam";
    }

    public String emitirSom() {
        return "Hommm hommm hommm";
    }

}
