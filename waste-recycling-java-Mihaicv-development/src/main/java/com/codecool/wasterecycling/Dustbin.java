package com.codecool.wasterecycling;

import java.util.*;

public class Dustbin {

        private String color;
        List<Garbage> houseGarbageContent = new ArrayList<>();

        public Dustbin(String color) {
                this.color = color;
        }
        public String getColor() {
                return color;
        }
        public void throwOutGarbage(Garbage garbage) {
                if(!garbage.dispose()){
                        houseGarbageContent.add(garbage);
                }
        }
        public void getPlasticCount() {
                Map<String, Integer> countPlastic = new HashMap<>();
                for (PlasticGarbage p : PlasticGarbage.getPlasticContent()) {
                        if (countPlastic.containsKey(p.name)) {
                                countPlastic.put(p.name, countPlastic.get(p.name) + 1);
                        } else {
                                countPlastic.put(p.name, 1);
                        }
                }
        }

        public void getPaperCount() {
                Map<String, Integer> countPaper = new HashMap<>();
                for (PaperGarbage p : PaperGarbage.getPaperContent()) {
                        if (countPaper.containsKey(p.name)) {
                                countPaper.put(p.name, countPaper.get(p.name) + 1);
                        } else {
                                countPaper.put(p.name, 1);
                        }
                }
        }
        public void getHouseWasteCount() {
                Map<String, Integer> countHouse = new HashMap<>();
                for (Garbage p : houseGarbageContent) {
                        if (countHouse.containsKey(p.name)) {
                                countHouse.put(p.name, countHouse.get(p.name) + 1);
                        } else {
                                countHouse.put(p.name, 1);
                        }
                }
        }

        @Override
        public String toString() {
                List<String> house = new ArrayList<>();
                List<String> paper = new ArrayList<>();
                List<String> plastic = new ArrayList<>();

                StringBuilder stringHouse = new StringBuilder("Green Dustbin! House waste content: " + houseGarbageContent.size() + " item(s)" + "\n");
                StringBuilder stringPaper = new StringBuilder("Paper content: " + PaperGarbage.getPaperContent().size() + " item(s)" + "\n");
                StringBuilder stringPlastic = new StringBuilder("Plastic content: " + PlasticGarbage.getPlasticContent().size() + " item(s)" + "\n");

                for (Garbage g : houseGarbageContent) {
                        house.add(g.name);
                }
                for (int i = 0; i < house.size(); i++) {
                        stringHouse.append(house.get(i)).append(" no ").append(i + 1).append(",");
                }
                for (PaperGarbage p : PaperGarbage.getPaperContent()) {
                        paper.add(p.name);
                }
                for (int i = 0; i < paper.size(); i++) {
                        stringPaper.append(paper.get(i)).append(" no ").append(i + 1).append(",");
                }
                for (PlasticGarbage p : PlasticGarbage.getPlasticContent()) {
                        plastic.add(p.name);
                }
                for (int i = 0; i < plastic.size(); i++) {
                        stringPlastic.append(plastic.get(i)).append(" no ").append(i + 1).append(",");
                }
                return stringHouse.toString() + "\n" + stringPaper.toString() + "\n" + stringPlastic.toString();
        }
}


