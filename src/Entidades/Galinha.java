package Entidades;

import Comportamentos.*;
import Interfaces.*;
import DataUtility.*;
import lombok.*;

@Getter
@Setter
public class Galinha extends Animal {

    private boolean eDeGranja;

    @Override
    public String apresentar() {
        setComportamentoDeAndar(new AndarDuasPatas());
        setComportamentoDeEmitirSom(new EmitirSomCacarejar());
        setComportamentoDeAlimentar(new ComerRacao());

        getComportamentoDeAndar().andar();
        getComportamentoDeEmitirSom().emitirSom();
        getComportamentoDeAlimentar().alimentar();

        return "Sou uma Galinha!"
                + "\n Nome: " + getNome()
                + "\n Cor: " + getCor()
                + "\n Descrição: " + getDescricao()
                + "\n Identificador: " + getIdentificador()
                + "\n Sexo: " + getSexo()
                + "\n Data de Nascimento: " + DataUtility.formatarDateNoPadrao(getDataNascimento())
                + "\n Especie: " + getEspecie().getDescricao()
                + "\n Data da última consulta veterinária: " + DataUtility.formatarDateNoPadrao(getDataUltimaConsultaVeterinaria())
                + "\n É de granja: " + (eDeGranja ? "Sim" : "Não");

    }
}
