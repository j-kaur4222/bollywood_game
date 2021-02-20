package game.jasleen;

import java.util.Scanner;
public class Main {
    public static void main(String  args[]) {
        String movie="kai po che";
        String mString="";
        int c=0;
        for(int x=0;x<movie.length();x++){
            if(!(movie.charAt(x)=='a'||movie.charAt(x)=='e'||movie.charAt(x)=='i'||movie.charAt(x)=='o'||movie.charAt(x)=='u'||movie.charAt(x)==' ')){
                mString +='_';
                c++;
            }
            else
                mString +=movie.charAt(x);
        }

        System.out.println(mString);

        Scanner s=new Scanner(System.in);
        int chances=9;
        char z;

        char a[]=movie.toCharArray();
        char b[]=mString.toCharArray();
        while(chances!=0&&c!=0)
        { int f=0;
            z=s.next().charAt(0);
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==z)
                {
                    b[i]=z;
                    c--;
                    f++;
                }
            }
            System.out.println(b);

            if(f==0)
            {
                chances--;
            }
        }
        if(c==0)
            System.out.println("win");
        else
            System.out.println("lose");

    }
}