interface Transport {

    public void deliver();
}

abstract class Animal {

}

class Tiger extends Animal {

}

class Camel extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver Method Call (Camel)");
    }
}

class Deer extends Animal {

}

class Donkey extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver Method Call (Donkey)");

    }
}

public class Lab8a3 {
    public static void main(String[] args) {

        Animal obj1[] = new Animal[4]; // Usually Abstarct Class No Object No bane (Animal obj = new Animal) But Apnne
                                       // Object No array Banavi Sakiyee And Tema Tena Concrete (j Abstract Class No Hoi) SubClass j Mukvana

        obj1[0] = new Tiger();
        obj1[1] = new Camel();
        obj1[2] = new Deer();
        obj1[3] = new Donkey();

        for (int i = 0; i < 4; i++) {

            if (obj1[i] instanceof Transport) {

               ((Transport)obj1[i]).deliver();

            }
        }

    }
}
