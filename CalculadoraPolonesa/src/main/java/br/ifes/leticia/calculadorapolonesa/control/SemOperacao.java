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
public class SemOperacao extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SemOperacao(String aviso){
        super(aviso);
    }
}
