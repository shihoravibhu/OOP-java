class Cube{
    int height ;
    int width ;
    int depth ;

    public void setter(int height , int width , int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    

    public void volume(Cube temp){

        System.out.println("Cube1 Volume "+this.height*this.width*this.depth);
        System.out.println("Cube2 Volume "+temp.height*temp.width*temp.depth);


        // return ((double) (height*width*depth)  + (double) (height2*width2*depth2));
    }
}
public class Extra2 {
    public static void main(String[] args) {
        
        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.setter(1,1, 10);
        c2.setter(1,10, 10);

        c1.volume(c2);



    }
    
}
