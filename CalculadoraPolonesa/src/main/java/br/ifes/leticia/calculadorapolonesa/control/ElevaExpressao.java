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
public abstract class ElevaExpressao implements Expressao{

    protected Expressao prox_operacao;
    
    @Override
    public abstract int trataOperacao(String operacao, int[] operandos);
   
    @Override
    public void setProx_operacao(Expressao prox_operacao) {
        this.prox_operacao = prox_operacao;
    }
    public Expressao getProx_operacao() {
        return prox_operacao;
    }
    protected abstract String[] matchingWords();
    
}
