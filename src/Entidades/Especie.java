package Entidades;

import lombok.*;

@Getter
@Setter
public class Especie {

    private int idade;
    private String descricao;

    public void Apresentar() {
        System.out.println("Tem: " + idade + "anos"
                + "\n Descrição: " + descricao);
    }
}
