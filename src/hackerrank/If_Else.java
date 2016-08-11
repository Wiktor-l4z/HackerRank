/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author l4z
 */
public class If_Else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (2 <= n && n <= 5) {
            ans = "Not Weird";
        } else if (6 <= n && n <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }

        System.out.println(ans);

    }

}
