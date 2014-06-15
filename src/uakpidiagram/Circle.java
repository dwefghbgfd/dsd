/***********************************************************************
 * Module:  Circle.java
 * Author:  panica
 * Purpose: Defines the Class Circle
 ***********************************************************************/

package uakpidiagram;

/** @pdOid 3fd70e7a-6755-48dd-bf3d-193da0ad28a9 */
public class Circle extends Point {
   /** @pdOid a0a22909-1101-4f6d-b87a-e8587d0d8229 */
   private int radius;
   
   /** @pdOid 09ac642b-3253-41aa-8fc5-035f8168294e */
   public int getRadius() {
      return radius;
   }

    @Override
    public double lenght() {
        return Math.PI * radius * 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double square() {
        return super.square(); //To change body of generated methods, choose Tools | Templates.
    }
   
   /** @param newRadius
    * @pdOid a62558b2-fbd4-468a-9ad1-784734660359 */
   public void setRadius(int newRadius) {
      radius = newRadius;
   }
   
   /** @pdOid a1dfc773-f378-4ea0-9c1c-79706f6c01f1 */
   public Circle() {
      // TODO: implement
   }
   
   /** @param x 
    * @param y 
    * @param radius
    * @pdOid a337937a-9600-44cb-9f59-c01afe79e3c8 */
   public Circle(int x, int y, int radius) {
      super(x,y);
      this.radius = radius;
   }
   
   /** @pdOid 28157d6b-0bf4-4973-bc78-4e01aa036d21 */
   public void draw() {
      System.out.println("I am Circle x="+x+" y="+y+" radius="+radius);
   }
   
   /** @pdOid 1b98ab1f-2d56-4cf1-8b46-8b4d64886a83 */
   public void clear() {
      System.out.println("Circle cleared");
   }

}