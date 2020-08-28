package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class PlasticGarbage extends Garbage {
        private static List<PlasticGarbage> plasticContent = new ArrayList<>();
        public boolean cleaned;

        public static List<PlasticGarbage> getPlasticContent() {
                return plasticContent;
        }

        public PlasticGarbage(String name, boolean cleaned) {
                super(name);
                this.cleaned = cleaned;
        }

        public void clean(){
                cleaned=true;
        }
        public boolean isCleaned(){
                return this.cleaned;
        }

        @Override
        public boolean dispose(){
                if (this.isCleaned()){
                        plasticContent.add(this);
                }
                return cleaned;
        }

}
