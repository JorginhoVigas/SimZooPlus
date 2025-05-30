package Entidades;

import Comportamentos.*;
import Interfaces.*;
import DataUtility.*;
import lombok.*;

@Getter
@Setter
public class Gato extends Animal {

    private boolean dosmestico;

    @Override
    public String apresentar() {
        setComportamentoDeAndar(new AndarQuatroPatas());
        setComportamentoDeEmitirSom(new EmitirSomMiar());
        setComportamentoDeAlimentar(new ComerRacao());

        getComportamentoDeAndar().andar();
        getComportamentoDeEmitirSom().emitirSom();
        getComportamentoDeAlimentar().alimentar();

        return "Sou um Gato!"
                + "\n Nome: " + getNome()
                + "\n Cor: " + getCor()
                + "\n Descrição: " + getDescricao()
                + "\n Identificador: " + getIdentificador()
                + "\n Sexo: " + getSexo()
                + "\n Data de Nascimento: " + DataUtility.formatarDateNoPadrao(getDataNascimento())
                + "\n Especie: " + getEspecie().getDescricao()
                + "\n Data da última consulta veterinária: " + DataUtility.formatarDateNoPadrao(getDataUltimaConsultaVeterinaria())
                + "\n É domestico? " + (dosmestico ? "Sim" : "Não");
    }
}
