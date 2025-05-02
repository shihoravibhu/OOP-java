interface Playable {
    public void play(); 
}

class Football implements Playable{
    
    public void play(){
        System.out.println("Play Football..");
    } 
}

class Volleyball implements Playable{

    public void play(){

        System.out.println("Play Volleyball..");
    }
    
}

class Basketball implements Playable{

    public void play(){

        System.out.println("Play Basketball..");
    }

}


public class Lab9c1 {
    public static void main(String[] args) {

        Playable obj1 = new Football();
        Playable obj2 = new Volleyball();
        Playable obj3 = new  Basketball();

        obj1.play();
        obj2.play();
        obj3.play();
        
    }
}
