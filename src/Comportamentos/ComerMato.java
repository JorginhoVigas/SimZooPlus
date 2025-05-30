package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAlimentar;
        
public class ComerMato implements InterfaceDosComportamentosDeAlimentar{

    @Override
    public String alimentar(){
        return "Ele se alimenta de acacia";
    }
}
