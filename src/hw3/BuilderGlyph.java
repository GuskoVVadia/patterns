/**
 * Как один из вариантов паттерна Builder.
 * Пример использования приведён в методе psvm
 * Объект без методов и взят исключительно для примера.
 */

package hw3;

import java.awt.*;

public class BuilderGlyph {
    private int positionX;
    private int positionY;
    private int height;
    private int width;
    private Color colorGlyph;
    private String style;
    private boolean bold;

    public static class Builder {
        //обязательные параметры
        private int positionX;
        private int positionY;

        //необзятельные
        private int height = 16;
        private int width = 8;
        private Color colorGlyph = Color.BLACK;
        private String style = "standard";
        private boolean bold = true;

        public Builder(int positionX, int positionY) {
            this.positionX = positionX;
            this.positionY = positionY;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setColorGlyph(Color colorGlyph) {
            this.colorGlyph = colorGlyph;
            return this;
        }

        public Builder setStyle(String style) {
            this.style = style;
            return this;
        }

        public Builder setBold(boolean bold) {
            this.bold = bold;
            return this;
        }

        public BuilderGlyph build() {
            return new BuilderGlyph(this);
        }   
    }

    private BuilderGlyph(Builder builder){
        this.positionX = builder.positionX;
        this.positionY = builder.positionY;
        this.height = builder.height;
        this.width = builder.width;
        this.colorGlyph = builder.colorGlyph;
        this.style = builder.style;
        this.bold = builder.bold;
    }

    private BuilderGlyph() {
    }

    //other methods ...

    public static void main(String[] args) {
        BuilderGlyph builderGlyph = new BuilderGlyph.Builder(45, 12).setColorGlyph(Color.GREEN)
                .setStyle("italic").setHeight(25).build();
    }
}
