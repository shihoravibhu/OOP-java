import java.util.*;

class Student1{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student1(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits,
    String[] grade_obtained) {

        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;    
        this.spi = calculateSPI();    
    }

    public void display(){

        System.out.println("Id No. : "+ this.id_no);
        System.out.println();

        for (int i = 0; i < this.no_of_subjects_registered; i++) {
            System.out.println("Subject Code : "+this.subject_code[i] +"\nSubject Credit : "+this.subject_credits[i]+"\nGrade Obtained : "+this.grade_obtained[i]);
            System.out.println();
        }
        System.out.println("SPI : "+this.spi);
        System.out.println("****************************");

    }
    public double calculateSPI(){
        int total_Creadits = 0 ;
        int total_Points = 0 ;

        for (int i = 0; i<no_of_subjects_registered; i++) {
            total_Creadits += this.subject_credits[i];
            total_Points += this.subject_credits[i]*switchCase(grade_obtained[i]);


        }

        return (double)total_Points/total_Creadits ;



    }

    public int switchCase(String grade){

        switch (grade) {
            case "A++": return 10 ;
            case "A+": return 9 ;
            case "A": return 8 ;
            case "B": return 7 ;
            case "C": return 6 ;
            case "F": return 5 ;
            case "G": return 4 ;
            case "H": return 2 ;
            case "I": return 0 ;                
            default: return 0;               
        
        }

    }


}

public class Lab7a1_q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Students : ");
        int n = sc.nextInt();

        Student1[] stu = new Student1[n] ;
        
        for(int i=0 ; i<n ; i++){
            
            System.out.println("Enter Number Of Subject Registerted For Student "+(i+1));
            int no_of_subjects_registered = sc.nextInt();       

            System.out.println("Enter Id Number : ");
            int id_no = sc.nextInt();

            String[] subject_code = new String[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            String[] grade_obtained = new String[no_of_subjects_registered];

            for(int j=0 ; j<no_of_subjects_registered ; j++){

                System.out.println("Enter Subject Credit , Subject Code  And Grade Obtained for Student "+(i+1)+"\nAnd Subject No"+(j+1));

                subject_credits[j]=sc.nextInt();
                subject_code[j]=sc.next();
                grade_obtained[j]=sc.next().toUpperCase();
                
            }

            stu[i]=new Student1(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
 

        }

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Detail Of Student "+(i+1));
            
            stu[i].display();
        }

        sc.close();
        
        
        
    }
}
