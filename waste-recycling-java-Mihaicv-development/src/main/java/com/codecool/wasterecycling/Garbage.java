package com.codecool.wasterecycling;

public abstract class Garbage {
        public String name;

        public Garbage(Object name) {
                this.name= name.toString();
        }
        public abstract boolean dispose();

}
