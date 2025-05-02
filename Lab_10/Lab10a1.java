import java.util.Scanner;
public class Lab10a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
        System.out.println("Enter Total Number Of Student : ");
        int n = sc.nextInt();

        int[] marks = new int[5];

        int total = 0 ;



            for (int i = 0; i < n; i++) {

                System.out.println("Enter Marks");
                marks[i]=sc.nextInt();
                total+=marks[i];
                
            }

            double avg = total/n;

            System.out.println("Avg : "+avg);
            
            
        } catch (ArithmeticException e) {

            System.out.println("Please Enter Valid Input. (Student Cannot be Zero...)");
            
        }
        
        catch (ArrayIndexOutOfBoundsException a){
            
            System.out.println("Array Out Of Bound..");
            
            
        }
        
        // catch (InputMismatchException e){
        //     System.out.println("Enter Valid Input..");


        // }

        catch(Exception e ){
            e.printStackTrace();
        }

        System.out.println("byy");

        sc.close();

        
        
    }
}