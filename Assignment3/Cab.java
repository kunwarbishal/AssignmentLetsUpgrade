import java.util.Scanner;

public class Cab {
    int fare;
    int d;

     public Cab() {
        fare = 30;
    }

    public Cab(int amt) {
        fare = amt;
    }

    void showFare() {
        System.out.println("Total Fare is:"+fare);
    }
}
   class RideCab{
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the  cab distance from the user:");
           int d2 = scan.nextInt();
           if (d2 > 5) {
               Cab obj = new Cab(30 + 10 * (d2 - 5));
               System.out.println("enter the distance travled: ");
               obj.d = scan.nextInt();
               obj.fare = obj.fare + (10 * obj.d);
               obj.showFare();
           }
           else {
               Cab obj = new Cab();
               System.out.println("enter the distance travelled: ");
               obj.d = scan.nextInt();
               obj.fare = obj.fare + (10 * obj.d);
               obj.showFare();
           
           }
           
       }
    
    } 

