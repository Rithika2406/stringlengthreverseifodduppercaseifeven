import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str=S.nextLine();
        String v=" ";
        System.out.println(str.length());
        if(str.length()%2!=0)
        {
            for(int i=0;i<str.length();i++)
            {
                char c=str.charAt(i);
                v=c+v;
                
            }
            System.out.println(v);
        }
        if(str.length()%2==0)
        {
            String upper=str.toUpperCase();
            System.out.println(upper);
        }
    }
}