import java.util.Scanner;

public class Teste05 {
    public static void main(String[] args) {

        System.out.println("Digite a String: ");
        Scanner scan = new Scanner(System.in);
        String stringOriginal = scan.nextLine();
        //String stringOriginal = "ABCDEFGHIJKLMNOPQRSTUVXZ";
        int cont2 = stringOriginal.length();
        String novaString = "";
        while(cont2 != 0){
            cont2--;
            char r = stringOriginal.charAt(cont2);
            novaString += r;
        }
        System.out.println(novaString);

    }
}
