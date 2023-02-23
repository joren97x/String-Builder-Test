import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // StringBuilder hello = new StringBuilder("Hello");
        // System.out.println(hello);

        // hello.append(" World!");
        // System.out.println(hello);

        // hello.reverse();
        // System.out.println(hello);

        // hello.reverse();
        // System.out.println(hello);

        // hello.delete(6, 12);
        // System.out.println(hello);

        // hello.insert(6, "Joren!");
        // System.out.println(hello);

        // hello.insert(6, "world and ");
        // System.out.println(hello);

        // hello.replace(6, 22, "World!");
        // System.out.println(hello);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(reverseInt(x));

        sc.close();

    }

    public static int reverseInt(int x) {

        int rev;
        //convert x to string
        String stringX = Integer.toString(x);

        //convert (stringX) to String Builder
        StringBuilder strNum = new StringBuilder(stringX);

        //reverse (strNum)
        strNum.reverse();

        //convert String Builder (strNum) to String (strNum2)
        String strNum2 = strNum.toString();

        //convert String (strNum2) to Integer (rev)
        
        try {
            rev = Integer.parseInt(strNum2);
            return rev;
        }
        catch(Exception e) {
            return 0;
        }
    }

}
