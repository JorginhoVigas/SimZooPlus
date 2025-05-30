package Entidades;

import Comportamentos.*;
import Interfaces.*;
import DataUtility.*;
import lombok.*;

@Getter
@Setter
public class Leao extends Animal {

    private double tamanhoDaJuba;

    @Override
    public String apresentar() {
        setComportamentoDeAndar(new AndarQuatroPatas());
        setComportamentoDeEmitirSom(new EmitirSomRugir());
        setComportamentoDeAlimentar(new ComerCarne());

        getComportamentoDeAndar().andar();
        getComportamentoDeEmitirSom().emitirSom();
        getComportamentoDeAlimentar().alimentar();

        return "Sou um Leao!"
                + "\n Nome: " + getNome()
                + "\n Cor: " + getCor()
                + "\n Descrição: " + getDescricao()
                + "\n Identificador: " + getIdentificador()
                + "\n Sexo: " + getSexo()
                + "\n Data de Nascimento: " + DataUtility.formatarDateNoPadrao(getDataNascimento())
                + "\n Especie: " + getEspecie().getDescricao()
                + "\n Data da última consulta veterinária: " + DataUtility.formatarDateNoPadrao(getDataUltimaConsultaVeterinaria())
                + "\n Qual é o tamanho da juba? " + (tamanhoDaJuba);
    }
}
