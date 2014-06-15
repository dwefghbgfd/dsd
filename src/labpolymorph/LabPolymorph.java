/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpolymorph;

import uakpidiagram.Box;
import uakpidiagram.Circle;
import uakpidiagram.Line;
import uakpidiagram.Point;

/**
 *
 * @author panica
 */
public class LabPolymorph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point points[] = new Point[]{new Point(), new Box(-100, -200, 2, 1), new Circle(4, 5, 23), new Line()};
        double totalSquare = 0;
        for (Point p : points) {
            p.printGeneral();
        }
        System.out.println(totalSquare);
        System.out.println("------------------------------");
        Point p = points[1].copy();
        p.printGeneral();
        Box b = (Box) new Box().copy();
        System.out.println("----------------------------");
    }

}
