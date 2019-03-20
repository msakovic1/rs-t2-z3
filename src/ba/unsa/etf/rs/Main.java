package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        System.out.println("unesite rijec: ");
        String text = ulaz.nextLine();
        text = text.toUpperCase();
        System.out.println(text);
    }
}
