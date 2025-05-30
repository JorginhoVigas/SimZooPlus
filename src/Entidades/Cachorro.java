package Entidades;

import Comportamentos.*;
import Interfaces.*;
import DataUtility.*;
import lombok.*;

@Getter
@Setter
public class Cachorro extends Animal {
    
    private boolean temPedrigre;

    @Override
    public String apresentar() {
        setComportamentoDeAndar(new AndarQuatroPatas());
        setComportamentoDeEmitirSom(new EmitirSomLatir());
        setComportamentoDeAlimentar(new ComerRacao());

        getComportamentoDeAndar().andar();
        getComportamentoDeEmitirSom().emitirSom();
        getComportamentoDeAlimentar().alimentar();

        return "Sou um Cachorro!"
                + "\n Nome: " + getNome()
                + "\n Cor: " + getCor()
                + "\n Descrição: " + getDescricao()
                + "\n Identificador: " + getIdentificador()
                + "\n Sexo: " + getSexo()
                + "\n Data de Nascimento: " + DataUtility.formatarDateNoPadrao(getDataNascimento())
                + "\n Especie: " + getEspecie().getDescricao()
                + "\n Data da última consulta veterinária: " + DataUtility.formatarDateNoPadrao(getDataUltimaConsultaVeterinaria())
                + "\n Tem pedigre: " + (temPedrigre ? "Sim" : "Não");
    }

}
