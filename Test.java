import java.util.*;
import java.io.*;

class Test{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                int s = a + (j*b) + ((j+1)*b)+((j+2)*b);
                System.out.print(s+" ");
            }
        }
        
        in.close();
    }
}