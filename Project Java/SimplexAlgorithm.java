import java.util.Scanner;

public class SimplexAlgorithm{
    public static void main(String args[]){

        System.out.println("Hola");
        //Variables de la matriz
        int filas = 0, columnas = 0, contador =  1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el número de restricciones que quieres");
        filas = entrada.nextInt();

        filas=filas+1;
        System.out.println("Escribe la cantidad de variables que tienes");
        columnas = entrada.nextInt();
        columnas=columnas+filas;
        
        int numeros [][] = new int [filas][columnas];

        for(int j = 0; j < filas; j++){
            for(int i = 0; i < columnas; i++){
                if(i <= filas){
                    System.out.println("Ingrese las variable x: " + i + 1);
                }else if(i > filas && i < columnas - 1){
                    System.out.println("Ingrese las variable S: " + i + 1);
                }else{
                    System.out.println("Ingrese el valor de solucion: " + i + 1);
                }   
            }
            System.out.println("");
        }
        System.out.println("Prueba");
    }
}
