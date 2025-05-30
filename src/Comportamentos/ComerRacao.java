package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeAlimentar;

public class ComerRacao implements InterfaceDosComportamentosDeAlimentar {

    @Override
    public String alimentar() {
        return "Ele se alimenta de ração";
    }
}