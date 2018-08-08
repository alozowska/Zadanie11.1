import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba = scanner.nextInt();
        ArrayList<Integer> liczby = new ArrayList<>();
        while (liczba > 0) {
            liczby.add(liczba);
            System.out.println("podaj liczbę");
            liczba = scanner.nextInt();
        }
        for (int i = liczby.size() - 1; i >= 0; i--) {    //odwrotna kolejnosc
            System.out.println(liczby.get(i));
        }
        int suma = 0;
        for (int i = 0; i < liczby.size(); i++) {
            System.out.print(liczby.get(i));
            if (i+1<liczby.size()){
                System.out.print("+");
            }
            suma = suma + liczby.get(i);
        }
        System.out.println( "=" + suma);
        int najwiekszaLiczba=znajdzNajwieksza(liczby);
        System.out.println("największa wprowadzona liczba: "+najwiekszaLiczba);
        int najmniejszaLiczba=znajdzNajmniejsza(liczby);
        System.out.println("najmniejsza wprowadzona liczba: "+najmniejszaLiczba);
    }
    private static int znajdzNajwieksza(ArrayList<Integer> liczby){
       int  max=liczby.get(0);
        for (int i = 1; i < liczby.size(); i++) {
            if (liczby.get(i)>max){
                max=liczby.get(i);
            }
        }
        return max;
    }
    private static int znajdzNajmniejsza(ArrayList<Integer> liczby){
        int  min=liczby.get(0);
        for (int i = 1; i < liczby.size(); i++) {
            if (liczby.get(i)<min){
                min=liczby.get(i);
            }
        }
        return min;
    }
}

