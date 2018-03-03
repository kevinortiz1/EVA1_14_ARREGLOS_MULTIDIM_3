/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][][][] aiArregloMulti = new int[2][3][4][5];
        for (int i = 0; i < aiArregloMulti.length; i++) {//llenado de arreglos de forma aleatoria 
            for (int j = 0; j < aiArregloMulti[i].length; j++) {
                for (int k = 0; k < aiArregloMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArregloMulti[i][j][k].length; l++) {
                        aiArregloMulti[i][j][k][l] = (int)(Math.random()*100);
                    }
                }
            }
        }
        for (int i = 0; i < aiArregloMulti.length; i++) {//imprimimos los valores
            for (int j = 0; j < aiArregloMulti[i].length; j++) {
                for (int k = 0; k < aiArregloMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArregloMulti[i][j][k].length; l++) {
                        System.out.println(aiArregloMulti[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
