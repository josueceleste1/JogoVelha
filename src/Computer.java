/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
import java.util.Random;

public class Computer extends Player{
    
    public Computer(int player){
        super(player);
        System.out.println("Player 'Computer' created");
    }
    
    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, player);
    
    }
    
    @Override
    public void Try(Board board){
        Random random = new Random();
        
        do{
            attempt[0] = random.nextInt(3);
            attempt[1] = random.nextInt(3);
        }while( !checkTry(attempt, board) ); 
    }
}