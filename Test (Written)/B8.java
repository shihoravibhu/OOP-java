class Rise{
    double weight ;

    Rise(){
        weight = 10 ;
    }

    Rise(double weight){
        this.weight = weight ;
    }

    public void addKg(double weightKg){

        this.weight+=weightKg;

        System.out.println("weight : "+(this.weight));
        
    }
    public void  addGram(int weightGram){
        
        this.weight+=weightGram/1000.0;
        
        System.out.println("weight : "+(this.weight));
        
        
    }
}
public class B8 {
    public static void main(String[] args) {
        
        Rise r1  = new Rise(15);
        
        r1.addGram(1500);
    }
}
