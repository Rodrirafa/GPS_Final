package com.example.rnraf.gps_final.Modelo;


public class Pedido
{
//         Documentação sobre a classe Pedido, Grupo 13 - Projeto VyteServir - Gestão de Projeto de Software - 2018/2019
//
//         Classe Pedido:
//         - Esta Classe representa o Modelo, no MVC;
//         - A classe encapsula as classes Pagamento e Salada;
//         - A classe contem enumerators para Tipo de Prato, Bebida e Sobremesa;
//         - O construtor não tem parâmetros, uma vez que o grupo decidiu ter uma abordagem em que o objeto pedido é inicializado
//           sem definição de variáveis. As varíaveis são mudadas quando existe alteração do estado de radio buttons e checkboxes
//
//
    //-------Enumeradores------//

    private enum TipoPrato{
        NENHUM,
        PRATO_CARNE,
        PRATO_PEIXE,
        PRATO_VEGETARIANO,

    }

    private enum Bebida{
        NENHUMA,
        AGUA,
        REFRIGERANTE
    }

    private enum Sobremesa{
        NENHUMA,
        SALADA_DE_FRUTA,
        GELATINA,
        LEITE_CREME,
        MOUSSE,
        FRUTA
    }

    //-----------------------//

    //-------Variáveis--------//

    private boolean sopa;   // Variável que representa se o utilizador quer sopa ou não. false = não quer sopa; true = quer sopa.
    private boolean pao;    // Variável que representa se o utilizador quer pão ou não. false = não quer pão; true = quer pão.
    private Salada salada;  // Variável: objeto do tipo "Salada" que representa os diferentes componentes da salada que o utilizador quer.
    private TipoPrato tipoPrato; // Varíável do tipo enumerador "TipoPrato" que indica qual o tipo de prato que o utilizador quer
    private Bebida bebida;       // Varíável do tipo enumerador "Bebida" que indica qual a bebida que o utilizador quer.
    private Sobremesa sobremesa; // Varíável do tipo enumerador "Sobremesa" que indica qual a sobremesa que o utilizador quer.
    private Pagamento pagamento; // Varíável: objecto do tipo "Bebida" que indica qual a bebida que o utilizador quer.

    //-----------------------//

    //-------Construtor------//

    public Pedido(){                //Construtor apenas com inicialização de variáveis por pré-definição

        salada = new Salada();
        pagamento = new Pagamento();
        tipoPrato = getTipoPrato("Carne");      //Carne é o valor predifinido para tipo prato
        bebida = getBebida("Nenhuma");         //Nenhuma bebida é o valor predifinido para bebida
        sobremesa = getSobremesa("Nenhuma");   // Nenhuma sobremesa é o valor predifinido para sobremesa
        pagamento = null;
        sopa = false;
        pao = false;

    }

    //-----------------------//

    //------------------Getters----------------//

    public boolean isPao(){
        return pao;
    }

    public boolean isSopa(){
        return sopa;
    }

    public Pagamento getPagamento(){
        return pagamento;
    }

    public Salada getSalada(){
        return salada;
    }

    public TipoPrato getTipoPratoAtual(){
        return tipoPrato;
    }

    public Bebida getBebida(){
        return bebida;
    }

    public Sobremesa getSobremesa(){
        return sobremesa;
    }

    public TipoPrato getTipoPrato(String stringComparacao){   // getter que devolve o inteiro associado a cada elemento do enumerado
        if(stringComparacao == "Carne")
            return TipoPrato.PRATO_CARNE;
        else if(stringComparacao == "Peixe")
            return TipoPrato.PRATO_PEIXE;
        else if(stringComparacao == "Vegetariano")
            return TipoPrato.PRATO_VEGETARIANO;
        else if(stringComparacao == "Nenhum")
            return TipoPrato.NENHUM;
        else
            return TipoPrato.NENHUM;
    }

    public Sobremesa getSobremesa(String stringComparacao){  // getter que devolve o inteiro associado a cada elemento do enumerado
        if(stringComparacao == "Nenhuma")
            return Sobremesa.NENHUMA;
        else if(stringComparacao == "Salada de Fruta")
            return Sobremesa.SALADA_DE_FRUTA;
        else if(stringComparacao == "Gelatina")
            return Sobremesa.GELATINA;
        else if(stringComparacao == "Leite de Creme")
            return Sobremesa.LEITE_CREME;
        else if(stringComparacao == "Mousse")
            return Sobremesa.MOUSSE;
        else if(stringComparacao == "Fruta")
            return Sobremesa.FRUTA;
        else
            return Sobremesa.NENHUMA;
    }

    public Bebida getBebida(String stringComparacao){   // getter que devolve o inteiro associado a cada elemento do enumerado
        if(stringComparacao == "Nenhuma")
            return Bebida.NENHUMA;
        else if(stringComparacao == "Água")
            return Bebida.AGUA;
        else if (stringComparacao == "Refrigerante")
            return Bebida.REFRIGERANTE;
        else
            return  Bebida.NENHUMA;
    }

    //----------------------------------//

    //-------Getters da salada--------//

    public boolean isAlface(){
        return salada.isAlface();
    }

    public boolean isCouveRoxa(){
        return salada.isCouveRoxa();
    }

    public boolean isTomate(){
        return salada.isTomate();
    }

    public boolean isBeterraba(){
        return salada.isBeterraba();
    }

    public boolean isCenoura(){
        return salada.isCenoura();
    }

    public boolean isBroculos(){
        return salada.isBroculos();
    }

    //----------------------------------------------//

    //---------------Getters do Pagamento-----------//

    public double getPreco(){
        return pagamento.getPreco();
    }

    public double getValor() {
        return pagamento.getValor();
    }

    //-------------------Setters--------------------//

    public void setSopa(boolean sopa){
        this.sopa = sopa;
    }

    public void setPao(boolean pao){
        this.pao = pao;
    }

    public void setTipoPrato(TipoPrato tipoPrato){
        this.tipoPrato = tipoPrato;
    }

    public void setBebida(Bebida bebida){
        this.bebida = bebida;
    }

    public void setSobremesa(Sobremesa sobremesa){
        this.sobremesa = sobremesa;
    }

    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void setValor(float valor){
        pagamento.setValor(valor);
    }

    public void setPreco(float preco){
        pagamento.setPreco(preco);
    }

    //------------------------------//

    //-------Setters da salada--------//

    public void setAlface(boolean alternancia){
        salada.setAlface(alternancia);
    }

    public void setCouveRoxa(boolean alternancia){
        salada.setCouveRoxa(alternancia);
    }

    public void setTomate(boolean alternancia){
        salada.setTomate(alternancia);
    }

    public void setBeterraba(boolean alternancia){
        salada.setBeterraba(alternancia);
    }

    public void setCenoura(boolean alternancia){
        salada.setCenoura(alternancia);
    }

    public void setBroculos(boolean alternancia){
        salada.setBroculos(alternancia);
    }

    //----------------------------------//


}
