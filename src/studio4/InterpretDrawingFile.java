package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {

    public static void main(String[] args) throws FileNotFoundException {
        // Open file chooser starting in resources folder
        JFileChooser chooser = new JFileChooser("resources");
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        Scanner in = new Scanner(f); // Scanner attached to chosen file

        while (in.hasNext()) {
            // common values
            String shapeType = in.next();
            int r = in.nextInt();
            int g = in.nextInt();
            int b = in.nextInt();
            boolean isFilled = in.nextBoolean();

            StdDraw.setPenColor(new Color(r, g, b));

            if (shapeType.equals("Rectangle")) {
                double x = in.nextDouble();
                double y = in.nextDouble();
                double halfW = in.nextDouble();
                double halfH = in.nextDouble();

                if (isFilled) {
                    StdDraw.filledRectangle(x, y, halfW, halfH);
                } else {
                    StdDraw.rectangle(x, y, halfW, halfH);
                }

            } else if (shapeType.equals("Ellipse")) {
                double x = in.nextDouble();
                double y = in.nextDouble();
                double halfW = in.nextDouble();
                double halfH = in.nextDouble();

                if (isFilled) {
                    StdDraw.filledEllipse(x, y, halfW, halfH);
                } else {
                    StdDraw.ellipse(x, y, halfW, halfH);
                }

            } else if (shapeType.equals("Triangle")) {
                double x1 = in.nextDouble();
                double y1 = in.nextDouble();
                double x2 = in.nextDouble();
                double y2 = in.nextDouble();
                double x3 = in.nextDouble();
                double y3 = in.nextDouble();

                double[] xs = {x1, x2, x3};
                double[] ys = {y1, y2, y3};

                if (isFilled) {
                    StdDraw.filledPolygon(xs, ys);
                } else {
                    StdDraw.polygon(xs, ys);
                }
            }
        }

        in.close();
    }
}