package unitTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    // tam giác thường
    Triangle triangle= new Triangle(new Point(0,1), new Point(0,3), new Point(5,6));
    //tam giác cân
    Triangle isoscelesTriangle= new Triangle(new Point(0,3), new Point(0,3), new Point(0,6));
    // Tam giác vuông
    Triangle rightTriangle = new Triangle(new Point(0,4), new Point(0,5), new Point(0,6));
    // Tam giác vuông cân
    Triangle  rightAngleTriangle= new Triangle(new Point(0,0), new Point(0,3), new Point(3,0));
    // Tam giác đều
    Triangle equilateralTriangle= new Triangle(new Point(0,3), new Point(0,3), new Point(3,0));
    // Không phải tam giác (2 cạnh)
    Triangle noTriangle2= new Triangle(new Point(0,0), new Point(1,5), new Point(0,7));
    //Không phải tam giác (1 cạnh)
    Triangle noTriangle1= new Triangle(new Point(0,0), new Point(0,0), new Point(5,6));

    @Test
    @DisplayName("Calculate Perimeter triangle") // chu vi tam giác thường
    void CalculatePerimetertriangle(){
        double actual=Triangle.calPerimeterTri(triangle);
        double expect=14.902019706710776;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter isosceles Triangle") // chu vi tam giác cân
    void CalculatePerimeterIsoscelesTriangle(){
        double actual=Triangle.calPerimeterTri(isoscelesTriangle);
        double expect=14.902019706710776;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter rightAngle Triangle") // chu vi tam giác vuông cân
    void CalculatePerimeterRightAngleTriangle(){
        double actual=Triangle.calPerimeterTri(rightAngleTriangle);
        double expect=10.242640687119284;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter right Triangle") // chu vi tam giác vuông
    void CalculatePerimeterRightTriangle(){
        double actual=Triangle.calPerimeterTri(rightTriangle);
        double expect=4;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter equilateral Triangle") // chu vi tam giác đều
    void CalculatePerimeterEquilateralTriangle(){
        double actual=Triangle.calPerimeterTri(equilateralTriangle);
        double expect=16.641201570751953;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter no Triangle2") // Khong phải tam giác (2 cạnh)
    void CalculatePerimeternoTriangle2(){
        double actual=Triangle.calPerimeterTri(noTriangle2);
        double expect=-1d;
        Assertions.assertEquals(expect, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter no Triangle1") // Khong phải tam giác (2 cạnh)
    void CalculatePerimeternoTriangle1(){
        double actual=Triangle.calPerimeterTri(noTriangle1);
        double expect=-1d;
        Assertions.assertEquals(expect, actual);
    }


}
