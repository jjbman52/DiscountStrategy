package discountstrategy;

import java.util.Scanner;

public class ConsoleInput implements InputStrategy {
    
    @Override
    public final String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if(input == null || input.isEmpty() || input.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            return input;
        }
    }
}
