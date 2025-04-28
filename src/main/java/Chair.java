/**
 * Definition of the Chair class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */
class Chair{
    int legs;
    String material;

    /**
     * Default constructor of Chair
     */
    public Chair(){
        legs = 4;
        material = "wood";
    }

    /**
     * Constructor of Chair where the number of legs is given
     * @param _legs The number of legs on the chair
     */
    public Chair(int _legs){
        legs = _legs;
        material = "wood";
    }

    /**
     * Constructor of Chair where both the number of legs and material is given
     * @param _legs The number of legs on the chair
     * @param _material The material the chair is made of
     */
    public Chair(int _legs, String _material){
        legs = _legs;
        material = _material;
    }

    /**
     * Gets the number of legs on the Chair
     * @return The number of legs on the Chair
     */
    public int getLegs(){return legs;}

    /**
     * Gets the material the Chair is made of
     * @return The material the Chair is made of
     */
    public String getMaterial(){return material;}
}
