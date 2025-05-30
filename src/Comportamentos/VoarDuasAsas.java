package Comportamentos;

import Interfaces.InterfaceDosComportamentosDeVoar;

public class VoarDuasAsas implements InterfaceDosComportamentosDeVoar {
    
    @Override
    public String voar(){
        return "Ele voa com 2 asas";
    }
}
