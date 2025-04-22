/**
 * Definition of the Rectangle Class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */
class Rectangle{
    static double length;
    static double width;

    /**
     * Default Constructor of Rectangle
     */
    public Rectangle(){
        length = 4;
        width = 8;
    }

    /**
     * Constructor of Rectangle where length is given
     * @param _length The length of the Rectangle
     */
    public Rectangle(double _length){
        length = _length;
        width = 8;
    }

    /**
     * Constructorof rectangle where length and width are given
     * @param _length The length of the Rectangle
     * @param _width The width of the Rectangle
     */
     public Rectangle(double _length, double _width){
        length = _length;
        width = _width;
    }

    /**
     * Gets the length of the Rectangle
     * @return The length of the Rectangle
     */
    static double getLength(){return length;}

    /**
     * Gets the width of the Rectangle
     * @return The width of the Rectangle
     */
    static double getWidth(){return width;}
}