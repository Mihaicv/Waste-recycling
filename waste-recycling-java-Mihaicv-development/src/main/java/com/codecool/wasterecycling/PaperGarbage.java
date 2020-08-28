package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class PaperGarbage extends Garbage {
        private static List<PaperGarbage> paperContent = new ArrayList<>();
        public boolean isSqueezed;

        public static List<PaperGarbage> getPaperContent() {
                return paperContent;
        }

        public PaperGarbage(Object name, boolean isSqueezed) {
                super(name);
                this.isSqueezed = isSqueezed;
        }

        public void Squeezed() {
                isSqueezed = true;
        }

        public boolean isSqueezed() {
                return this.isSqueezed;
        }

        @Override
        public boolean dispose() {
                if (this.isSqueezed()) {
                        paperContent.add(this);
                }
                return isSqueezed;
        }
}
