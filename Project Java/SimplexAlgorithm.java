import java.util.Scanner;

public class SimplexAlgorithm{
    public static void main(String args[]){

        //Method Scanner 
        Scanner entry = new Scanner(System.in);

        //Variables of the matrix
        int rows = 0, columns = 0, acumulator = 0;

        //Declare the matrix
        int restrictions [][] = new int [rows][columns];

        //Ask a question of how many rows and colums need
        System.out.println("How many rows you want? ");
        rows = entry.nextInt();

        System.out.println("How many columns you want? ");
        columns = entry.nextInt();

        //Matrix filling begins
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                restrictions[j][i] = acumulator;
                acumulator++;
                System.out.println("[" + restrictions[j][i] + "]");
            }
            System.out.println("");
        }
    }
}