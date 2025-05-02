import java.util.*;

class A {
    int[] element = { 3, 5, 1, 4, 2 };

    public void sortArray() {

        Arrays.sort(element);

        for (int i : element) {
            System.out.print("Sorted Array : " + i + " ");
        }
        System.out.println();

    }

    public void searchElement(int temp) {
        boolean found = false ;

        for (int i : element) {
            if(temp == i){
                System.out.println("Element is Found.");
                found = true ;
                break ;
            }
        }
        if(!found){
            
            System.out.println("Element is'nt Found.");
        }
    }

    public void sumArray(){

        int sum = 0 ;
        
        for (int i : element) {
            
            sum+=i;
            
        }
        System.out.println("sum : "+sum);
    }
    
    public void avgArray(){
        int sum = 0 ;
        double avg = 0 ;
        
        
        for (int i : element) {
            
            sum+=i;          
            
        }

        avg = (double)sum/5.0 ;

        System.out.println("avg : "+avg);

    }
}

public class Extra4 {
    public static void main(String[] args) {

        A array1 = new A();

        array1.sortArray();
        array1.searchElement(1);
        array1.sumArray();
        array1.avgArray();
    }
}
