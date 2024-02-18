/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_matrices;

/**
 *
 * @author aiman
 */
public class Marco {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length;j++){
               if(i==0 || i==4){
                   matriz[i][j]=1;
               }else if (j==0 || j==4){
                   matriz[i][j]=1;
               }else{
                   matriz[i][j]=0;
               }
            }
        }
        
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println("");
    }
            
}
