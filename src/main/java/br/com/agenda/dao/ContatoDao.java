/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.entidade.Contato;
import javax.ejb.Stateless;

/**
 * Dao Contato que disponibiliza recursos para gerencia os dados de contato
 * 
 * @author Tayron Miranda <dev@tayron.com.br>
 */
@Stateless
public class ContatoDao extends DaoAbstrato<Contato> {

    /**
     * Construtor da classe
     */
    public ContatoDao() {
        super(Contato.class);
    }
    
}
