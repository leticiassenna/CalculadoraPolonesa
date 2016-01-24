/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.calculadorapolonesa.model;

import br.ifes.leticia.calculadorapolonesa.control.Expressao;
import br.ifes.leticia.calculadorapolonesa.control.Operadores;
import java.util.Stack;

/**
 *
 * @author Leticia
 */
public class AbstractAvaliador implements Operadores{
    private final Expressao calcular;
    
	
    AbstractAvaliador(){
            Expressao adicao = new Adicao();
            Expressao subtracao = new Subtracao();
            Expressao multiplicacao = new Multiplicacao();
            Expressao divisao = new Divisao();
            
            adicao.setProx_operacao(subtracao);
            subtracao.setProx_operacao(multiplicacao);
            multiplicacao.setProx_operacao(divisao);
            
            this.calcular = adicao;
    }

    @Override
    public int realizaOperacao(String[] operandos_operacao) {
        
        int[] operandos = new int [2];
        operandos[0] = Integer.parseInt(operandos_operacao[0]);
        operandos[1] = Integer.parseInt(operandos_operacao[1]);
        return calcular.trataOperacao(operandos_operacao[2],operandos );
        /*    
        Stack<Operadores> expressoes = new Stack<>();
        boolean palavraEncontrada = false;
        
        if(matchingWords().length == 0){
            palavraEncontrada = true;
        }
       
        for(String token: rota.split(" ")){
            
            if(cidades.containsKey(token)){
                expressoes.push(cidades.get(token));
            }
            if(direcao.equals(token) || palavraEncontrada == true ){
                palavraEncontrada = true;
                this.cidadeAtual = executar(expressoes);
            } 
            else {
                this.cidadeAtual = this.proximo.interpreter(rota);
            }
        }
        return this.cidadeAtual;*/
    }
}
