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
public class TicTacToeTest {
    
    public TicTacToeTest() {
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
     * Test of startPlayers method, of class TicTacToe.
     */
    @Test
    public void testStartPlayers() {
        System.out.println("startPlayers");
        TicTacToe instance = new TicTacToe();
        instance.startPlayers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of choosePlayer method, of class TicTacToe.
     */
    @Test
    public void testChoosePlayer() {
        System.out.println("choosePlayer");
        TicTacToe instance = new TicTacToe();
        int expResult = 0;
        int result = instance.choosePlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Play method, of class TicTacToe.
     */
    @Test
    public void testPlay() {
        System.out.println("Play");
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.Play();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of who method, of class TicTacToe.
     */
    @Test
    public void testWho() {
        System.out.println("who");
        TicTacToe instance = new TicTacToe();
        int expResult = 0;
        int result = instance.who();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of won method, of class TicTacToe.
     */
    @Test
    public void testWon() {
        System.out.println("won");
        TicTacToe instance = new TicTacToe();
        int expResult = 0;
        int result = instance.won();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TicTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicTacToe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
