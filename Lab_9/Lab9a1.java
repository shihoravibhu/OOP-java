interface EventListener{

    void performEvent() ;

}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed(); 
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();

} 

interface KeyListener extends EventListener{

    void keyPressed();
    void keyReleased();

}

class EventDemo implements MouseListener,KeyListener{

    @Override
    public void performEvent() {

        System.out.println("PerformEvent..");
        
    }
    
    @Override
    public void keyPressed() {
        System.out.println("KeyPressed..");
        
    }
    
    @Override
    public void keyReleased() {
        System.out.println("KeyReleased..");
        
    }
    
    @Override
    public void mouseClicked() {
        System.out.println("MouseClikced..");
        
    }
    
    @Override
    public void mousePressed() {
        System.out.println("MousePressed..");
        
    }
    
    @Override
    public void mouseReleased() {
        System.out.println("MouseReleased..");
        
    }
    
    @Override
    public void mouseMoved() {
        System.out.println("MouseMoved..");
        
    }
    
    @Override
    public void mouseDragged() {
        System.out.println("MouseDragged..");
        
    }

   

}

public class Lab9a1 {
    public static void main(String[] args) {

        EventDemo obj = new EventDemo();

        obj.performEvent();
        obj.keyPressed();
        obj.keyReleased();
        obj.mouseClicked();
        obj.mousePressed();
        obj.mouseReleased();
        obj.mouseMoved();
        obj.mouseDragged();


        
    }
}