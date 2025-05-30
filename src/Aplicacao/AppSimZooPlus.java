package Aplicacao;

import Entidades.*;
import java.util.Date;
import DataUtility.DataUtility;

public class AppSimZooPlus {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Barao");
        cachorro.setCor("Preto");
        cachorro.setDescricao("Pastor Alemao Capa Preta");
        cachorro.setIdentificador(101);
        cachorro.setSexo('M');
        cachorro.setDataNascimento(DataUtility.converterStringParaDate("31/08/2008"));
        cachorro.getEspecie().setDescricao("Canina");
        cachorro.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("28/03/2013"));
        cachorro.setTemPedrigre(true);

        Gato gato = new Gato();
        gato.setNome("Anya");
        gato.setCor("Preto");
        gato.setDescricao("Gata Doméstica");
        gato.setIdentificador(102);
        gato.setSexo('F');
        gato.setDataNascimento(DataUtility.converterStringParaDate("28/04/2022"));
        gato.getEspecie().setDescricao("Felina");
        gato.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("28/05/2024"));
        gato.setDosmestico(true);

        Cavalo cavalo = new Cavalo();
        cavalo.setNome("Ben");
        cavalo.setCor("Bege");
        cavalo.setDescricao("Cavalo de Elite");
        cavalo.setIdentificador(103);
        cavalo.setSexo('M');
        cavalo.setDataNascimento(DataUtility.converterStringParaDate("30/08/2020"));
        cavalo.getEspecie().setDescricao("Equina");
        cavalo.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("28/05/2024"));
        cavalo.setDataInstalacaoFerradura(DataUtility.converterStringParaDate("28/05/2025"));

        Galinha galinha = new Galinha();
        galinha.setNome("Coco");
        galinha.setCor("Amarelo com Preto e Manchas Brancas");
        galinha.setDescricao("Galinha de granja");
        galinha.setIdentificador(104);
        galinha.setSexo('F');
        galinha.setDataNascimento(DataUtility.converterStringParaDate("20/07/2020"));
        galinha.getEspecie().setDescricao("Aves");
        galinha.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("14/07/2021"));
        galinha.setEDeGranja(true);

        Girafa girafa = new Girafa();
        girafa.setNome("Melman");
        girafa.setCor("Amarelo com Manchas");
        girafa.setDescricao("Girafa Alta");
        girafa.setIdentificador(105);
        girafa.setSexo('M');
        girafa.setDataNascimento(DataUtility.converterStringParaDate("30/10/2010"));
        girafa.getEspecie().setDescricao("Girafa");
        girafa.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("05/12/2024"));
        girafa.setTamanhoLingua(45.7);

        Leao leao = new Leao();
        leao.setNome("Simba");
        leao.setCor("Dourado");
        leao.setDescricao("Leao da Savana");
        leao.setIdentificador(106);
        leao.setSexo('M');
        leao.setDataNascimento(DataUtility.converterStringParaDate("17/03/2012"));
        leao.getEspecie().setDescricao("Felidae");
        leao.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("17/05/2015"));
        leao.setTamanhoDaJuba(25.4);

        Onca onca = new Onca();
        onca.setNome("Bagheera");
        onca.setCor("Preto");
        onca.setDescricao("Onça Preta");
        onca.setIdentificador(107);
        onca.setSexo('F');
        onca.setDataNascimento(DataUtility.converterStringParaDate("21/09/2015"));
        onca.getEspecie().setDescricao("Felidae");
        onca.setDataUltimaConsultaVeterinaria(DataUtility.converterStringParaDate("17/08/2017"));
        onca.setTemFilhotes(true);

        System.out.println(cachorro.apresentar());
        System.out.println();
        System.out.println(gato.apresentar());
        System.out.println();
        System.out.println(cavalo.apresentar());
        System.out.println();
        System.out.println(galinha.apresentar());
        System.out.println();
        System.out.println(girafa.apresentar());
        System.out.println();
        System.out.println(leao.apresentar());
        System.out.println();
        System.out.println(onca.apresentar());
    }
}
