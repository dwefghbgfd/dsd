/**
 * *********************************************************************
 * Module: Box.java Author: panica Purpose: Defines the Class Box
 **********************************************************************
 */
package uakpidiagram;

/**
 * @pdOid 7ff4e82a-22f6-4db3-ab08-687534b22735
 */
public class Box extends Point {

    /**
     * @pdOid 6f9988fc-b42e-4624-84d1-fced865a43cc
     */
    String text;
    private int width;
    /**
     * @pdOid fe67d4d9-a48f-4f05-a8b9-087b611c01b0
     */
    private int height;

    @Override
    public void setY(int newY) {
        super.setY(Math.abs(newY)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX(int newX) {
        super.setX(Math.abs(newX)); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @pdOid 769dc82a-63f1-49e3-becf-7750a93f73b4
     */
    public int getWidth() {
        //lolololfdsfsdfsdfsdfs
        return width;
    }

    /**
     * @param newWidth
     * @pdOid 1c41e772-cb69-476f-9ba0-3e2b96576306
     */
    public void setWidth(int newWidth) {
        width = newWidth;
    }

    /**
     * @pdOid 9fa7f298-f5af-4ca5-9e46-23e36adc18c5
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param newHeight
     * @pdOid f0877ae0-a857-4159-b0e2-966683394c10
     */
    public void setHeight(int newHeight) {
        height = newHeight;
    }

    /**
     * @pdOid 35af05d7-b1f8-4fef-b900-d7b2496b12fd
     */
    public Box() {
        // TODO: implement
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @pdOid 8a054035-01e9-418e-9cd9-638adc5a3c7d
     */
    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double lenght() {
        return 2 * (width + height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double square() {
        return super.square(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point copy() {
        return new Box(x, y, width, height); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @pdOid 9c797838-1cb5-4fc8-8730-f79675f92edc
     */
    public void draw() {
        System.out.println("I am Box x = " + x + " y = " + y + " w " + width + " h= " + height);
    }

    /**
     * @pdOid 3aad02d1-5980-4fd6-9b45-e9b308408028
     */
    public void clear() {
        System.out.println("Box cleared");
    }

}
