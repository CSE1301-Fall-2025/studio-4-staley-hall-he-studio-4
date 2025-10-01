package studio4;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Flag {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(900, 600);
        StdDraw.setXscale(0, 1.5);
        StdDraw.setYscale(0, 1);

        Color washuRed   = new Color(186, 12, 47);
        Color washuGreen = new Color(0, 97, 63);
        Color white      = new Color(255, 255, 255);

        StdDraw.setPenColor(washuRed);
        StdDraw.filledRectangle(0.75, 0.833, 0.75, 0.167);
        StdDraw.setPenColor(white);
        StdDraw.filledRectangle(0.75, 0.5, 0.75, 0.167);
        StdDraw.setPenColor(washuGreen);
        StdDraw.filledRectangle(0.75, 0.167, 0.75, 0.167);

        StdDraw.setPenColor(Color.BLACK);
        StdDraw.line(0, 0.667, 1.5, 0.667);
        StdDraw.line(0, 0.333, 1.5, 0.333);

        StdDraw.setPenRadius(0.005);
        StdDraw.rectangle(0.75, 0.5, 0.75, 0.5);
        StdDraw.setPenRadius();

        drawBear(0.75, 0.5, 0.6, washuGreen, white);
    }

    public static void drawBear(double cx, double cy, double scale, Color bearColor, Color accent) {
        StdDraw.setPenColor(bearColor);
        StdDraw.filledEllipse(cx, cy, 0.35*scale, 0.18*scale);
        StdDraw.filledCircle(cx + 0.38*scale, cy + 0.05*scale, 0.12*scale);
        StdDraw.filledCircle(cx + 0.32*scale, cy + 0.16*scale, 0.04*scale);
        StdDraw.filledCircle(cx + 0.44*scale, cy + 0.14*scale, 0.04*scale);
        StdDraw.filledRectangle(cx - 0.25*scale, cy - 0.18*scale, 0.05*scale, 0.12*scale);
        StdDraw.filledRectangle(cx - 0.05*scale, cy - 0.18*scale, 0.05*scale, 0.12*scale);
        StdDraw.filledRectangle(cx + 0.15*scale, cy - 0.18*scale, 0.05*scale, 0.12*scale);
        StdDraw.filledRectangle(cx + 0.35*scale, cy - 0.18*scale, 0.05*scale, 0.12*scale);
        StdDraw.filledCircle(cx - 0.38*scale, cy + 0.05*scale, 0.05*scale);
        StdDraw.setPenColor(accent);
        StdDraw.filledEllipse(cx + 0.45*scale, cy + 0.02*scale, 0.05*scale, 0.03*scale);
        StdDraw.setPenColor(bearColor);
        StdDraw.filledCircle(cx + 0.49*scale, cy + 0.02*scale, 0.015*scale);
        StdDraw.setPenColor(accent);
        StdDraw.filledCircle(cx + 0.42*scale, cy + 0.07*scale, 0.012*scale);
    }
}