/***********************************************************************
 * Module:  Line.java
 * Author:  panica
 * Purpose: Defines the Class Line
 ***********************************************************************/

package uakpidiagram;

/** @pdOid 8565787f-3ed3-4d20-b065-b1aa34b87ead */
public class Line extends Point {
   /** @pdOid 7db1cd01-3c47-44e5-a150-65db891e3329 */
   private int dx;

    @Override
    public double lenght() {
        return super.lenght(); //To change body of generated methods, choose Tools | Templates.
    }
   /** @pdOid 850c64e2-ed5a-4e0e-811f-1fc31d35bdd5 */
   private int dy;
   
   /** @pdOid 3d8276be-0ab9-49f6-a7e9-c6451452a273 */
   public int getDy() {
      return dy;
   }
   
   /** @param newDy
    * @pdOid 3600dc08-b321-4557-98c0-341c773dcf5e */
   public void setDy(int newDy) {
      dy = newDy;
   }
   
   /** @pdOid 75f6c7b4-1097-49ee-aaee-5467e765f241 */
   public int getDx() {
      return dx;
   }
   
   /** @param newDx
    * @pdOid fec735ee-3cf5-45a0-9a6e-b8178636857f */
   public void setDx(int newDx) {
      dx = newDx;
   }
   
   /** @pdOid c596857a-cd90-4c62-b358-8183ddc921cc */
   public Line() {
      // TODO: implement
   }
   
   /** @param x 
    * @param y 
    * @param dx 
    * @param dy
    * @pdOid e5f6232e-bf88-49a6-a1fc-54ab8bb832ed */
   public Line(int x, int y, int dx, int dy) {
      // TODO: implement
   }
   
   /** @pdOid 8481e1b1-1f61-4724-9a33-d4c9aa144615 */
   public void draw() {
      System.out.println("I am Line ("+ x + " , " + y + " , " + x + dx + " , " + y + dy +" ) ");
   }
   
   /** @pdOid f26ee315-705f-4ba7-89dd-f7e19b0b8b0e */
   public void clear() {
      System.out.println("Line cleared");
   }

}