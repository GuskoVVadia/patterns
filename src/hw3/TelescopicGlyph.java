/**
* Пример телескопического конструктора.
* Пример описан весьма грубо, но пример весьма интересен.
 */

package hw3;

import java.awt.*;

public class TelescopicGlyph {
    private int positionX;
    private int positionY;
    private int height;
    private int width;
    private Color colorGlyph;
    private String style;
    private boolean bold;

    public TelescopicGlyph() {
        this(0, 0);
    }

    public TelescopicGlyph(int positionX, int positionY) {
        this(positionX, positionY, 16, 8);
    }

    public TelescopicGlyph(int positionX, int positionY, int height, int width) {
        this(positionX, positionY, height, width, Color.BLACK);
    }

    public TelescopicGlyph(int positionX, int positionY, int height, int width, Color colorGlyph) {
        this(positionX, positionY, height, width, colorGlyph, "standard");
    }

    public TelescopicGlyph(int positionX, int positionY, int height, int width, Color colorGlyph, String style) {
        this(positionX, positionY, height, width, colorGlyph, style, false);
    }

    public TelescopicGlyph(int positionX, int positionY, int height, int width, Color colorGlyph, String style, boolean bold) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.colorGlyph = colorGlyph;
        this.style = style;
        this.bold = bold;
    }

    //more methods
}
