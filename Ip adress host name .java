import java.net.*;
public class Demo{
   public static void main(String[]args);
   try{
   InetAddress my_address=InetAddress.getLocalHost();
   System.out.println("The IP address is:"my_address.getHostAddress()):
   System.out.println("The host name is:"my_address.getHostAddress()):
   }
   catch(UnknownHostException e){
   System.out.println("Couldn't find the local address.");
   }
   }
    }
