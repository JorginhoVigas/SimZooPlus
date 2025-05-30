package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAndar;

public class AndarDuasPatas implements Interfaces.InterfaceDosComportamentosDeAndar{
    
    @Override
    public String andar(){
        return "Ele anda com 2 patas";
    }
}
