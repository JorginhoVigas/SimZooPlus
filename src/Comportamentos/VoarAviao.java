package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeVoar;

public class VoarAviao implements InterfaceDosComportamentosDeVoar{
    
    @Override
    public String voar(){
        return "Ele voa de aviao";
    }
}
