/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedcm
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        if (!joke.isEmpty()) {
            this.jokes.add(joke);
        }
    }
    
    public String drawJoke() {
        String returnJoke = "";
        if (!this.jokes.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(this.jokes.size());
            returnJoke = this.jokes.get(index);
        } else {
            returnJoke = "Jokes are in short supply.";
        }
        return returnJoke;
    }
    
    public void printJokes() {
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }
    
}
