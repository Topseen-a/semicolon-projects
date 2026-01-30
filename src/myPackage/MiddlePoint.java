package myPackage;

public class MiddlePoint{
        public static void main(String[]args){

        System.out.printf("%-9s   %-9s  %s%n", "a", "b", "Middle Point");        
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;

        double middlePointX = (x2 - x1) / 2.0;
        double middlePointY = (y2 -y1) / 2.0;

        System.out.printf("(%d , %d)    (%d , %d)   (%.1f , %.1f)%n", x1 , y1,     x2 , y2,    middlePointX , middlePointY);

        x1 = 1;
        y1 = 4;
        x2 = 4;
        y2 = 2;

        double middlePointX2 = (x2 - x1) / 2.0;
        double middlePointY2 = (y2 -y1) / 2.0;

        System.out.printf("(%d , %d)    (%d , %d)   (%.1f , %.1f)%n", x1 , y1,     x2 , y2,    middlePointX2 , middlePointY2);

        x1 = 2;
        y1 = 7;
        x2 = 6;
        y2 = 3;

        double middlePointX3 = (x2 - x1) / 2.0;
        double middlePointY3 = (y2 -y1) / 2.0;

        System.out.printf("(%d , %d)    (%d , %d)   (%.1f , %.1f)%n", x1 , y1,     x2 , y2,    middlePointX3 , middlePointY3);
        
        x1 = 3;
        y1 = 9;
        x2 = 10;
        y2 = 5;

        double middlePointX4 = (x2 - x1) / 2.0;
        double middlePointY4 = (y2 -y1) / 2.0;

        System.out.printf("(%d , %d)    (%d , %d)   (%.1f , %.1f)%n", x1 , y1,     x2 , y2,    middlePointX4 , middlePointY4);

        x1 = 4;
        y1 = 11;
        x2 = 12;
        y2 = 7;

        double middlePointX5 = (x2 - x1) / 2.0;
        double middlePointY5 = (y2 -y1) / 2.0;

        System.out.printf("(%d , %d)    (%d , %d)   (%.1f , %.1f)%n", x1 , y1,     x2 , y2,    middlePointX5 , middlePointY5);
        }      
    }
