class Rectangle{
    public int l ;
    public int b ;

    Rectangle(int l , int b){
        this.l = l ;
        this.b = b ;
        System.out.println("Costructure from Rectangle");
    }
    
    public double Area(){
        
        return this.l * this.b ;
    }
    
} 
class Cuboid extends Rectangle{
    public int h ;
    
    Cuboid(int l , int b ,int h){
        super(l,b);
        this.h = h;
        System.out.println("Costructure from Cuboid");
    }

    public double cube(){

        return this.l * this.b * this.h;
    }
}
public class O8_Inheritance2 {
    public static void main(String[] args) {

        Cuboid c1 = new Cuboid( 1, 2 , 3);

        System.out.println(c1.cube());
        
    }
}
