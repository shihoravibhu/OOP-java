abstract class Vegetable {
    
    String vegetableColor;

    public Vegetable(){
        
    }

    abstract public String toString();
    
    
}

class Potato extends Vegetable{

    public Potato(){
        super.vegetableColor = "Yellow" ;
    }
    

    public String toString(){
        
        return "Vegetable Name : Potato " + "Vegetable Color : "  + super.vegetableColor ;
    }
}

class Bringal extends Vegetable{

    public Bringal(){
        super.vegetableColor = "Violet";
    }    

    public String toString(){
        
        return "Vegetable Name : Bringle " + "Vegetable Color : "  + super.vegetableColor ;
    }
    
} 

class Tomato extends Vegetable{

    public Tomato(){
        super.vegetableColor = "Red" ;
    }
    
    public String toString(){
        
        return "Vegetable Name : Tomato " + "Vegetable Color : "  + super.vegetableColor ;
    }
    
}

    

public class Lab8a1{
    public static void main(String[] args) {

        // Vegetable v = new Vegetable() ;       Abstarct Class No Object No Bane
            
    
        
        Vegetable v1 = new Potato();
        Vegetable v2 = new Bringal();
        Vegetable v3 = new Tomato();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}