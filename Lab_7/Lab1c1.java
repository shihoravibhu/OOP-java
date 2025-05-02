class Mypoint{
    double x ;
    double y ;

    public Mypoint(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public Mypoint(double x , double y){
        this.x = x ;
        this.y = y ;
    }

    public double distance(Mypoint temp){

        return Math.sqrt(Math.pow((this.x-temp.x), 2)+Math.pow(this.y-temp.y, 2));

    }


}

class ThreeDpoint extends Mypoint{
    double z ;

    public ThreeDpoint(){
        this.z=0;
    }

    public ThreeDpoint(double x,double y,double z){
        super(y,z);
        this.z=z;     

    }

    public double getz(){

        return this.z;

    }

    public double distance(ThreeDpoint temp){

        return Math.sqrt(Math.pow((this.x-temp.x), 2)+Math.pow(this.y-temp.y, 2)+Math.pow(this.z-temp.z, 2)) ;
    }


}
class Lab7c1{
    public static void main(String[] args) {

        ThreeDpoint d1 = new ThreeDpoint(0,0,0);
        ThreeDpoint d2 = new ThreeDpoint(10,30,25.5);

        System.out.println(d1.distance(d2));
        

    }
}