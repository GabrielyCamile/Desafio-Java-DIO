import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o Nome");
        String NomeCliente = scanner.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "+ agencia + ", conta " + numero + " e seu saldo é " + saldo + " e já está disponível para saque.");

        scanner.close();
        
        


    }
}

