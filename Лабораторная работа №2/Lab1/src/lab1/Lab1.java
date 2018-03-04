
package lab1;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import static lab1.Point3d.srav;

public class Lab1 {

    
    public static void main(String[] args) 
   {
        
    Scanner in = new Scanner(System.in);
    Point3d IPoint = new Point3d();
    Point3d IIPoint = new Point3d(1,2,3);
    Point3d IIIPoint = new Point3d();
    System.out.println("Введите X");
    IIIPoint.setX(in.nextDouble());
    System.out.println("Введите Y");
    IIIPoint.setY(in.nextDouble());
    System.out.println("Введите Z");
    IIIPoint.setZ(in.nextDouble());
    if (srav(IPoint,IIPoint) || srav(IIPoint,IIIPoint) || srav(IPoint,IIIPoint))
            System.out.println("Ошибка в вычислении пощади");
        else
            computeArea(IPoint,IIPoint,IIIPoint);
            
   }

  
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double x = Point3d.distanceTo(a, b);
        double y = Point3d.distanceTo(b, c);
        double z = Point3d.distanceTo(a, c);
        double f = (x+y+z)/2;
        f = sqrt(f*(f-x)*(f-y)*(f-z));
        System.out.println("Площадь равна " + f);
        return f;
        }

    
}
