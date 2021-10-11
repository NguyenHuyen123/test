package unitTest;


import java.awt.*;

public class Triangle {
    private Point d1, d2, d3;

    public Triangle(Point d1, Point d2, Point d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public Triangle() {
    }

    public static double calPerimeterTri(Triangle tg) {
        if ((tg.d1.get_x() == tg.d2.get_x()) && (tg.d1.get_y() == tg.d2.get_y())
                || (tg.d1.get_x() == tg.d3.get_x()) && (tg.d1.get_y() == tg.d3.get_y())
                || (tg.d2.get_x() == tg.d3.get_x()) && (tg.d2.get_y() == tg.d3.get_y())) {
            return -1;
        } else {
            double a = tg.d1.distance(tg.d2);
            double b = tg.d1.distance(tg.d3);
            double c = tg.d2.distance(tg.d3);
            return a + b + c;
        }
    }

    public static double calArea(Triangle tg) {
        if ((tg.d1.get_x() == tg.d2.get_x()) && (tg.d1.get_y() == tg.d2.get_y())
                || (tg.d1.get_x() == tg.d3.get_x()) && (tg.d1.get_y() == tg.d3.get_y())
                || (tg.d2.get_x() == tg.d3.get_x()) && (tg.d2.get_y() == tg.d3.get_y())) {
            return -1;
        } else {
            double p = calPerimeterTri(tg) / 2;
            double area = Math.sqrt(p * (p - tg.d1.distance(tg.d2)) * (p - tg.d1.distance(tg.d3)) * (p - tg.d2.distance(tg.d3)));
            return area;
        }
    }





}
