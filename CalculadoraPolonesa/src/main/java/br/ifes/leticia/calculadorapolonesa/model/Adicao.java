/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.calculadorapolonesa.model;

import br.ifes.leticia.calculadorapolonesa.control.ElevaExpressao;
import br.ifes.leticia.calculadorapolonesa.control.SemOperacao;

/**
 *
 * @author Leticia
 */
public class Adicao extends ElevaExpressao{
    
    @Override
    protected String[] matchingWords() {
        return new String[]{"+"};
    }
    
    @Override
    public int trataOperacao(String operacao, int[] operandos) {
        // TODO Auto-generated method stub
        int result;
        if(operacao.equals("+")){
            result = operandos[0] + operandos[1];
        }else{
            if(prox_operacao!=null)
                result = prox_operacao.trataOperacao(operacao, operandos);
            else
                throw new SemOperacao("Sem mais operacoes");
        }

        return result;

    }

   
}
