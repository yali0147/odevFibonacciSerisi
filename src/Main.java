import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Fibonacci Serisi Bulma Aracı");
        System.out.print("Hesaplanmasının istediğiniz eleman sayısını giriniz :  ");
        int eleman =inp.nextInt();
        int onceki=0,sonraki=1;
        for (int i =0;i<=eleman;i++){
            System.out.println(onceki+" ");
            int total=onceki+sonraki;
            onceki=sonraki;
            sonraki=total;
        }
    }
}