package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) {

                Dustbin red = new Dustbin("red");

                Garbage salt = new PaperGarbage("salt",false);
                Garbage paper = new PaperGarbage("paper", true);
                Garbage paper2 = new PaperGarbage("paper", true);
                Garbage paper3 = new PaperGarbage("light", true);
                Garbage toy = new PaperGarbage("toy", false);

                Garbage plastic = new PlasticGarbage("plastic", false);
                Garbage headphones = new PlasticGarbage("headphones", true);
                Garbage bottle = new PlasticGarbage("headphones", true);
                Garbage water = new PlasticGarbage("water",true);

                red.throwOutGarbage(salt);
                red.throwOutGarbage(water);
                red.throwOutGarbage(paper);
                red.throwOutGarbage(paper2);
                red.throwOutGarbage(paper3);
                red.throwOutGarbage(toy);
                red.throwOutGarbage(plastic);
                red.throwOutGarbage(headphones);
                red.throwOutGarbage(bottle);

                System.out.println(red.toString());

        }
}
