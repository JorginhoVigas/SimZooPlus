package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeEmitirSom;

public class EmitirSomMiar implements Interfaces.InterfaceDosComportamentosDeEmitirSom{
    
    @Override
    public String emitirSom(){
        return "Miau miau miau";
    }
}
