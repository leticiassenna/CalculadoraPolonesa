/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.calculadorapolonesa.control;


/**
 *
 * @author Leticia
 */
public interface Expressao {
    public int trataOperacao(String operacao,int[] operandos);
    public void setProx_operacao(Expressao subtracao);
}
