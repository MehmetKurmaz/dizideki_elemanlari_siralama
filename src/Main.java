import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int listElemani = 0,index=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz :");
        int boyut=scanner.nextInt();
        int[]list=new int[boyut];
        System.out.println("Dizinin Elemanlarini Giriniz :");
        for (int i=0;i<list.length;i++){
            System.out.print(i+". Elemani :");
            list[i]=scanner.nextInt();
        }
        Arrays.sort(list);

        System.out.print("Sirali Dizi :" + Arrays.toString(list) + " ");




    }
}