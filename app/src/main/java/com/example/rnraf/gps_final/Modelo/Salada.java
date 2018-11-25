package com.example.rnraf.gps_final.Modelo;


public class Salada{
    /* Documentação sobre a classe Salada, Grupo 13 - Projeto VyteServir - Gestão de Projeto de Software - 2018/2019
     *
     *    Classe Salada:
     *    - Esta classe encapsula flags para saber qual/quais os elementos da salada que o utilizador quer;
     *    - O construtor coloca tudo a false porque todos os checkboxes da salada estão desselecionados por predefinição
     *
     */
    //------Variáveis-----//

    public boolean alface;
    public boolean couveRoxa;
    public boolean tomate;
    public boolean beterraba;
    public boolean cenoura;
    public boolean broculos;

    //--------------------//

    //-----Construtor-----//

    public Salada(){
        alface = false;
        couveRoxa = false;
        tomate = false;
        beterraba = false;
        cenoura = false;
        broculos = false;
    }

    //--------------------//

    //------------------Setters-------------------//

    public void setAlface(boolean alface){
        this.alface = alface;
    }

    public void setCouveRoxa(boolean couveRoxa){
        this.couveRoxa = couveRoxa;
    }

    public void setTomate(boolean tomate){
        this.tomate = tomate;
    }

    public void setBeterraba(boolean beterraba){
        this.beterraba = beterraba;
    }

    public void setCenoura(boolean cenoura){
        this.cenoura = cenoura;
    }

    public void setBroculos(boolean broculos){
        this.broculos = broculos;
    }

    //----------------------------------------------//

    //------------------Getters--------------------//

    public boolean isAlface(){
        return alface;
    }

    public boolean isCouveRoxa(){
        return couveRoxa;
    }

    public boolean isTomate(){
        return tomate;
    }

    public boolean isBeterraba(){
        return beterraba;
    }

    public boolean isCenoura(){
        return cenoura;
    }

    public boolean isBroculos(){
        return broculos;
    }

    //----------------------------------------------//

}

