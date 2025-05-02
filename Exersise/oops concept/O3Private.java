class Employe {

    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class O3Private {

    public static void main(String[] args) {

        Employe e1 = new Employe();

        e1.setName("v");
        e1.setId(99);

        System.out.println(e1.getName());
        System.out.println(e1.getId());

        // e1.id = 99 ; throw a Error because orivate variable jo tenu name and id set
        // karvu hoi to te directliy aa rite nai karva dye tena mate getter setter
        // method no use karvo
        // e1.name = v ;
    }

}