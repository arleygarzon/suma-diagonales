
package diagonales;

import java.util.Scanner;

public class clase {
    int[][] matriz=new int[100][100] ;
    int suma1,suma2,tamaño;
    Scanner scanner=new Scanner(System.in);
    public clase(){
   valores();
   sumas();
    }
    public void valores(){
        System.out.println("Ingrese el tamaño de la matriz: ");
        tamaño=scanner.nextInt();
        System.out.println("ingrese los valores:");
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                matriz[i][j]=scanner.nextInt();
            }
        }
    }
    public void sumas(){
        int resta;
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
           if(i==j){
               suma1+=matriz[i][j];
             }
           if(i==tamaño+1-j){
               suma2+=matriz[i][j];
             }
            }
        }
        ver();
        resta=Math.abs(suma1-suma2);
        System.out.println("Suma 1:"+suma1);
        System.out.println("Suma 2:"+suma2);
        System.out.println("Resta de las diagonales:"+resta);
    }
    public void ver(){
    String ver="";
    System.out.println("La matriz es:");
    for(short i=1;i<=tamaño;i++){
        for(short j=1;j<=tamaño;j++){
             ver+=matriz[i][j] + " ";
            }
        System.out.println(ver);
        ver="";
        }   
    } 
}
