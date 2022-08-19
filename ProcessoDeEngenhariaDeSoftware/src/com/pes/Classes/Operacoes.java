/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pes.Classes;

/**
 *
 * @author User
 */
public class Operacoes {

//                               SE LIGA!
    
    
    
//para encontrar as anotações, press ctrl+f e digite "atencao", só lembre de deletar a anotação depois.
//qualquer coisa que você precise anotar pra fazer depois, faça uma anotação com "atencao" pra ficar fácil de achar depois. 
    


//                               SE LIGA!
    private double valorUm = 0;
    private double valorDois = 0;

    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

    public double calcularSoma() {
        return (valorUm + valorDois);
    }

    public double calcularMultiplicacao() {
        return (valorUm * valorDois);
    }

    public double calcularDivisao() {
        return (valorUm / valorDois);
    }

    public double calcularSubtracao() {
        return (valorUm - valorDois);
    }

    public double calcularPotencia() {//atencao: lembrar de colocar tratamento de exceçao
        //o valor dois não pode ser valor real, deve ser um valor inteiro.
        return (Math.pow(valorUm, valorDois));
    }

    public double calcularPorcentagem() {
        return (valorUm / 100);
    }

    public double calcularRaizQuadrada() {
        return (Math.sqrt(valorUm));
    }
}
