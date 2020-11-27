/*
 * NAMA : ADAM FIRDAUS DARMAWAN
 * NIM : 10119078
 * KELAS : IF-2
 * DESKRIPSI : QUIZ PBO
 */
package quiz.if2.pkg10119078.adamfirdausdarmawan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class QUIZIF210119078ADAMFIRDAUSDARMAWAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ServicePrice s = new ServicePrice();
        Customer c = new Customer();
        System.out.println("===Program Kasir Rock n Roll Haircut===");

        
        System.out.println("Customer name : ");
        c.setName(scanner.nextLine());
        System.out.println("Customer email : ");
        c.setEmail(scanner.nextLine());
        
        s.displayService();
        System.out.print("Choose(1/2/3) : ");
        s.getPrice(scanner.nextInt());
        
    }
    
}
