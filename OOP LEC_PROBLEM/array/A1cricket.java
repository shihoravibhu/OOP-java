import java.util.Scanner;

public class A1cricket{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String teamName[] = new String[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter " + (i + 1) + " team name :");
            teamName[i] = sc.next();

        }
        int noOfOvers;

        System.out.println("Enter no. of overs :");
        noOfOvers = sc.nextInt();

        int[][][] scorecard = new int[2][noOfOvers][];

        for (int i = 0; i < scorecard.length; i++) { // for innig

            for (int j = 0; j < scorecard[i].length; j++) { // for overs

                System.out.println("Enter total played balls in " + (j + 1) + "th over :");
                int temp = sc.nextInt();

                scorecard[i][j] = new int[temp];

                for (int k = 0; k < temp; k++) { // for balls

                    System.out.println("Enter " + (i + 1) + "th innig " + (j + 1) + "th over " + (k + 1) + "th ball run:");
                    scorecard[i][j][k] = sc.nextInt();
                }
            }
        }       

        for (int i = 0; i < scorecard.length; i++) {
            
            int wide = 0;
            int noBall = 0;
            int wicket = 0;
            int totalRuns = 0;

            for (int j = 0; j < scorecard[i].length; j++) { 

                for (int k = 0; k < scorecard[i][j].length; k++) {

                   if(scorecard[i][j][k]==-62){
                    wide++;                   
                    totalRuns++;
                   }
                   else if(scorecard[i][j][k]==-61){
                    noBall++;                   
                    totalRuns++;
                   }
                   else if(scorecard[i][j][k]==-51){
                    wicket++;
                   }
                   else{
                    totalRuns+=scorecard[i][j][k];
                   }

                }
                
                System.out.println("Total no of Runs and wicket by "+teamName[i]+"="+totalRuns+"/"+wicket +" wide = "+wide+" noball ="+noBall);
            }       

        }
        sc.close();
    }

}