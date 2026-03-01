import java.net.*;
import java.util.*;
class N1{
    public static void main(String args [])throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("ENETR THE DOMAIN NAME :- ");
        String c=s.nextLine();

        InetAddress a=InetAddress.getByName(c);
        System.out.println("IP ADDRESS IS :- "+a);
        System.out.println("---------------------------------------------------\n");

        InetAddress [] b=InetAddress.getAllByName("google.com");
        for(InetAddress t:b){
            System.out.println(t);
        }
        System.out.println("---------------------------------------------------\n");

        
        a=InetAddress.getLocalHost();
        System.out.println(a);
        System.out.println("---------------------------------------------------\n");
    }
}