import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits,
            char[] grade_obtained) {

        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = calculateSPI();
    }

    public double calculateSPI(){
        int total_Point = 0 ;
        int total_Creadit = 0 ;

        for (int i = 0; i < this.grade_obtained.length; i++) {
            total_Point += grade_point(this.grade_obtained[i]) * this.subject_credits[i] ;
            total_Creadit += this.subject_credits[i] ;            
        }

        return total_Creadit == 0 ? 0 : (double) total_Point/total_Creadit ;

    }
    public int grade_point(char grade){

        switch (grade) {
            case 'A': return 10 ;
            case 'B': return 8 ;
            case 'C': return 6 ;
            case 'D': return 4 ;
            case 'E': return 2 ;
            case 'F': return 0 ;  
        
            default: return 0 ;
               
        }

    }

    public void display(){
        System.out.println("\n-------------------------");
        System.out.println("Student ID : " + id_no);
        System.out.println("SPI       : " + spi);
        System.out.println("-------------------------");
    }

}

// class Graduate_Student extends Student {

// public Graduate_Student(int id_no, int no_of_subjects_registered, String[]
// subject_code, int[] subject_credits,char[] grade_obtained){
// super(id_no, no_of_subjects_registered, subject_code,
// subject_credits,grade_obtained);
// }
// }

public class Lab7a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Student : ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < s.length; i++) {
            
            System.out.println("Enter Student " + (i + 1) + " ID :");
            int id = sc.nextInt();

            System.out.println("Enter Total Number Of Subject : ");
            int total_subject = sc.nextInt();

            String[] subject_code = new String[total_subject];
            int[] subject_credits = new int[total_subject]; 
            char[] grade_obtained = new char[total_subject];

            for(int j=0 ; j<total_subject ; j++){

                System.out.println("Enter Subject Code "+(j+1)+" :");
                subject_code[j] = sc.next();

                System.out.println("Enter subject credit for "+subject_code[j] +" :");
                subject_credits[j] = sc.nextInt();

                System.out.println("Enter Grade Obtained (A/B/C/D/E/F): ");
                grade_obtained[j] = sc.next().toUpperCase().charAt(0);

            }

            s[i] = new Student(id, total_subject, subject_code, subject_credits, grade_obtained);

        }

        for(int i=0 ; i<s.length ; i++){
            s[i].display();
        }

        sc.close();

    }
}