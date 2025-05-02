class Computer{
    String brand;
    double speed;

    public Computer(String brand,double speed){
        this.brand=brand;
        this.speed=speed;
    }
    public Computer(){
        this.brand="M4";
        this.speed=6.7;
    }
    class Processor{
    public void displayDetail(){
        System.out.println(brand);
        System.out.println(speed);
    }
        
    }
}
public class A6 {
    public static void main(String[] args) {

        Computer c1 = new Computer();        
        Computer.Processor p1 = c1.new Processor();

        p1.displayDetail();

    }
}
