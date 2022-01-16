import java.util.Scanner;

public class SayilariSirala {
    public static void main(String[] args) {
        int x, y, z;
        Scanner data = new Scanner(System.in);

        System.out.print("1. Sayısını giriniz :");
        x = data.nextInt();

        System.out.print("2. Sayısını giriniz :");
        y = data.nextInt();

        System.out.print("3. Sayısını giriniz :");
        z = data.nextInt();

        boolean xy = x > y;
        boolean xz = x > z;
        boolean yz = y > z;
        boolean yx = y > x;
        boolean zx = z > x;
        if (xy&&xz){
            if (yz){
                System.out.println(x+">"+y+">"+z);
            }else{
                System.out.println(x+">"+z+">"+y);
            }
        }else if (yz&&yx){
            if (zx){
                System.out.println(y+">"+z+">"+x);
            }else{
                System.out.println(y+">"+x+">"+z);
            }
        }else {
            if (xy){
                System.out.println(z+">"+x+">"+y);
            }else {
                System.out.println(z+">"+y+">"+x);
            }
        }
    }
}
