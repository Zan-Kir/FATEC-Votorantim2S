/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pessoas.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TestePessoa {
    @Test
    public void testeArvoreGenealogica() {
        
        /* Pessoa deverá retornar sua arvore genealogica materna */
        Pessoa maria = new Pessoa("Maria");
        Pessoa isabela = new Pessoa("Isabela", maria);
        Pessoa bia = new Pessoa("Bia", isabela);
        assertEquals("Maria -> Isabela -> Bia", bia.arvoreGenealogica());
    }
    
}
