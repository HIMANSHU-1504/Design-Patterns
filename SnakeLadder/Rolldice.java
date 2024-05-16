package SnakeLadder;
import java.util.Random;

public class Rolldice{
    
    public static int dice(){
        Random rand = new Random();
        
        return rand.nextInt(6);
    }
}