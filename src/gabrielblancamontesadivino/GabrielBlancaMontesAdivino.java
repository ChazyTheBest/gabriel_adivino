/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielblancamontesadivino;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chazy
 */
public class GabrielBlancaMontesAdivino
{
    public static void main(String[] args)
    {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int n = 0,
            cont = 0,
            x = rn.nextInt(41) + 10; // Random.nextInt(max - min + 1) + min

        //System.out.println(x);

        while (n != x)
        {
            System.out.print("Introduce el valor de X (entre 10 y 50): ");
            n = sc.nextInt();

            System.out.println(n > x ? "Te pasaste Amigo"
                            : (n < x ? "Casi cerca..."
                                     : "Excelente!!! Has acertado. No. de intentos: " + cont));

            cont++;
        }

        sc.close();
    }
}
