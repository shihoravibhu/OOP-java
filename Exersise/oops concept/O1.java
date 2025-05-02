class Pen { // define class
    String color;
    String type;

    public void write() {
        System.out.println("writing somthing");
    }

    public void pencolor() {
        System.out.println(this.color); // pen1 and pen2 call mkare che tevu bataave chee
    }

}

public class O1 {

    public static void main(String[] args) {

        Pen pen1 = new Pen();

        pen1.color = "blue";
        pen1.type = "simple";

        Pen pen2 = new Pen();

        pen2.color = "black";
        pen2.type = "gel";

        pen1.pencolor();
        pen2.pencolor();

    }
}
