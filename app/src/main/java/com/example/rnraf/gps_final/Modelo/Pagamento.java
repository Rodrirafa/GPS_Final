package com.example.rnraf.gps_final.Modelo;

public class Pagamento{
    /* Documentação sobre a classe Pagamento, Grupo 13 - Projeto VyteServir - Gestão de Projeto de Software - 2018/2019
     *
     *     Classe Pagamento:
     *     - Esta classe encapsula doubles para armazenar o valor com que se vai pagar (valor) e o preço da refeição,
     *       uma vez que o preço varia consoante o estatuto do utilizador.
     *
     *
     *
     *
     */

    //------Variáveis------//

    private double preco;
    private double valor;

    //---------------------//

    //------Construtor------//

    public Pagamento(){
    }

    //---------------------//

    //------------------Getters-------------------//

    public double getPreco(){
        return preco;
    }

    public double getValor(){
        return valor;
    }

    //-------------------------------------------//

    //------------------Setters-------------------//

    public void setValor(float valor){
        this.valor = valor;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    //--------------------------------------------//

}


