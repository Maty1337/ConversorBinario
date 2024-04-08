import java.util.Scanner;

public class ConversionBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número binario de 16 dígitos: ");
        String binario = scanner.nextLine();
        
        // Validar si el número ingresado es binario y tiene 16 dígitos
        if (binario.matches("[01]+") && binario.length() == 16) {
            // Convertir a decimal
            int decimal = Integer.parseInt(binario, 2);
            System.out.println("Decimal: " + decimal);
            
            // Convertir a octal
            String octal = Integer.toOctalString(decimal);
            System.out.println("Octal: " + octal);
            
            // Convertir a hexadecimal
            String hexadecimal = Integer.toHexString(decimal);
            System.out.println("Hexadecimal: " + hexadecimal);
        } else {
            System.out.println("El número ingresado no es binario o no tiene 16 dígitos.");
        }
        
        scanner.close();
    }
}
