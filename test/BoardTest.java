/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josue
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of fullBoard method, of class Board.
     */
    @Test
    public void testFullBoard() {
        System.out.println("fullBoard");
        Board b = new Board();
       
        int cont=0, x=8, whois=1;
        
        
         for(int i=0; i<3; i++){
             for(int j=0; j<3;j++){
                 if(b.Board[i][j] == 0){
                     cont++;
                     whois++;
                 }
             }
         }
         System.out.println("tamanho de cont = "+cont);
        
        if(cont == x && who(whois) == 0){
            fail("vai dar empate!");
        }
       
    }
    
    public int who(int who){        
        if(who%2==1)
            return 1;
        else 
            return 0;
    }
}   
