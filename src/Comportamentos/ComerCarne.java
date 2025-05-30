package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAlimentar;

public class ComerCarne implements InterfaceDosComportamentosDeAlimentar{
    
    @Override
    public String alimentar(){
        return "Ele se alimenta de carne";
    }
}
