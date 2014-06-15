/**
 * *********************************************************************
 * Module: Point.java Author: panica Purpose: Defines the Class Point
 **********************************************************************
 */
package uakpidiagram;

/**
 * @pdOid 65559813-f379-4d69-816e-8d0b5053a451
 */
public class Point {

    /**
     * @pdOid f5c7bc4e-61f5-4002-a1bf-97e3f48d82d0
     */
    protected int x = 0;
    /**
     * @pdOid 502f51a6-749c-4f77-bd48-94dbfaf1ced0
     */
    protected int y = 0;
    
    private static int count = 0;
    protected int id = count++;

    public static void setNull(Point[] points){    
        for(int i = 0; i < points.length; i++){
            points[i].x = points[i].y;
        }
    }
    
    /**
     * @pdOid ba8a722f-963a-4504-ac31-909a9378e71d
     */
    public int getX() {
        return x;
    }

    /**
     * @param newX
     * @pdOid cf1da99f-eb5e-4eff-8f6e-f734e8ca69a6
     */
    public void setX(int newX) {
        x = newX;
    }

    /**
     * @pdOid 107fc35f-34b8-4c6c-b1e1-6297786352b3
     */
    public int getY() {
        return y;
    }

    /**
     * @param newY
     * @pdOid bf84fbff-9192-48c9-a8d1-530a52d1a2f5
     */
    public void setY(int newY) {
        y = newY;
    }

    /**
     * @pdOid 8cd0bd63-38ab-4117-bd2f-f91b2fa6318f
     */
    public Point() {
        // TODO: implement
    }

    /**
     * @param x
     * @param y
     * @pdOid e8c23da0-e73f-4995-a6f1-9ac53d130da3
     */
    public Point(int x, int y) {
        setX(x);
        setY(y);
//      this.x=x;
//      this.y=y;
    }

    /**
     * @pdOid 83770b41-a0ef-4295-9b4d-37da4f4f3805
     */
    public void draw() {
        System.out.println("I am Point " + x + " " + y);
    }

    /**
     * @pdOid 2865f5a9-6da6-4c6d-8d0b-c5353ee6428d
     */
    public void clear() {
        System.out.println("Point cleared");
    }

    public double square() {
        return 0;
    }

    public double lenght() {
        return 0;
    }

    public final void printGeneral() {
        System.out.println(this.getClass().getName() + " square = " + square()
                + " lenght" + lenght() + " id =" + id);
    }
    
    public Point copy(){
        return new Point(this.x, this.y);
    }
}
