package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAlimentar;

public class ComerFeno implements InterfaceDosComportamentosDeAlimentar{
    
    @Override
    public String alimentar(){
        return "Ele se alimenta de feno";
    }
}
