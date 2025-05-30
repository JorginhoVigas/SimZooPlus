package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAndar;

public class AndarQuatroPatas implements InterfaceDosComportamentosDeAndar {

    @Override
    public String andar() {
        return "Ele anda com 4 patas";
    }
}
