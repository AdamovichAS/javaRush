package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private  List<Horse> horses;

    public Hippodrome(List<Horse>list){
        horses = list;
    }

    public static Hippodrome game;

    public  List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void move(){
        for (Horse hors : horses) {
            hors.move();
        }
    }
    public void print(){
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println();
        }
    }
    public Horse getWinner(){
        double maxdistance = 0;
        Horse winner = null;
        for (Horse hors : getHorses()) {
            if(hors.getDistance() > maxdistance){
                maxdistance = hors.getDistance();
                winner = hors;
            }
        }
        return winner;
    }

    public void printWinner(){
        double maxdistance = 0;
        Horse winner = null;
        for (Horse hors : getHorses()) {
            if(hors.getDistance() > maxdistance){
                maxdistance = hors.getDistance();
                winner = hors;
            }
        }
        System.out.println("Winner is " +winner.getName()+"!");
    }

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("horse1",3,0));
        list.add(new Horse("horse2",3,0));
        list.add(new Horse("horse3",3,0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }
}
