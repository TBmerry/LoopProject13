import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("İstediğiniz Sayıya Kadar Olan Asallar İçin Bir Limit Giriniz  : ");
        a = input.nextInt();

        int counter = 0;
        for (int i = 2; i<= a; i++){
            int control = 0;
            for (int b = 2; b<i; b++){
                if (i%b == 0){
                    control = 1;
                    break;
                }
            }
            if (control == 0){
                System.out.println(i + " , ");
                counter++;
            }
        }
    }
}