/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fatec;

/**
 * Se a herança for baseada na classe RunTimeException será criado uma exceção NÃO VERIFICADA,
 * se baseada na classe Exception será criado uma exceção VERIFICADA
 * @author Felix Petiz Bonilho
 */
public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException() {
        //sempre deve chamar o construtor da superclasse
        super();
    }

    public SaldoInsuficienteException(String message) {
        //sempre deve chamar o construtor da superclasse
        super(message);
    }
}
