package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeEmitirSom;

public class EmitirSomLatir implements Interfaces.InterfaceDosComportamentosDeEmitirSom{
    
    @Override
    public String emitirSom(){
        return "Au au au";
    }
}
