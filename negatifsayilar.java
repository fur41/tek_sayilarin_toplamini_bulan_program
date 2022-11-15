import java.util.Scanner;


    public class negatifsayilar {

       public static void main(String[] args) {
        int a , total=0;
       
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\n\t\t\t\t\t4'ün katı ve çift sayıların toplamını bulan program\n");

    do {
           System.out.print("\nSayı giriniz :");

                a=scan.nextInt();

           if (a%4==0){total+=a;}
           
           

            else break;{}
               
}               while (a>0);


        System.out.println("\nToplam :"+total+"\n");
      
        
      
        }
}
