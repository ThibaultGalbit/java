import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import entities.*;
import map.*;
import enums.*;
import errors.UserInput;

public class App {
    public static void main(String[] args) {

        Player p1 = new Player();
        Map map = new Map(p1);

        Scanner scanner = new Scanner(System.in);
        String user_input;
        boolean game_state = true;


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            

            while (game_state) {

                System.out.println("What is your action ?");
                user_input = new String(br.readLine());
    
                while (!UserInput.checkErrors(user_input)) {
                    System.out.println("What is your action ?");
                    user_input = new String(br.readLine());
                }

                map.getPlayer().move(user_input);
    
                if(user_input.equals("exit")) {
                    game_state = false;
                }
    
                map.drawMap();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}