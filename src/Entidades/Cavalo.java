package Entidades;

import Comportamentos.*;
import Interfaces.*;
import DataUtility.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
public class Cavalo extends Animal {

    private Date dataInstalacaoFerradura;  // alterado para java.util.Date

    public Cavalo() {
        setComportamentoDeAndar(new AndarQuatroPatas());
        setComportamentoDeEmitirSom(new EmitirSomRelinchar());
        setComportamentoDeAlimentar(new ComerFeno());
    }

    @Override
    public String apresentar() {
        return "Sou um Cavalo!"
                + "\n Nome: " + getNome()
                + "\n Cor: " + getCor()
                + "\n Descrição: " + getDescricao()
                + "\n Identificador: " + getIdentificador()
                + "\n Sexo: " + getSexo()
                + "\n Data de Nascimento: " + DataUtility.formatarDateNoPadrao(getDataNascimento())
                + "\n Especie: " + getEspecie().getDescricao()
                + "\n Data da última consulta veterinária: " + DataUtility.formatarDateNoPadrao(getDataUltimaConsultaVeterinaria())
                + "\n Data da instalação da ferradura: " + (dataInstalacaoFerradura != null ? DataUtility.formatarDateNoPadrao(dataInstalacaoFerradura) : "Não informado");
    }
}
