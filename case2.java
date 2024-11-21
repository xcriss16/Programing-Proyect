    import java.lang.reflect.Array;
    import java.util.Scanner;

    public class case2 {
        // Funcion case 2
        public static void case2Switch() {
            System.out.println("Dime una frase:");
            Scanner scanner = new Scanner(System.in);
            String frase = scanner.nextLine();
            String par = "";
            String impar = "";
            String[] palabras = frase.split(" ");

            // Si la cantidad de palabras no es al menos 5 no entrara en este if
            if (palabras.length >= 5) {

                // Me va a ir reconociendo palabra por palabra
                for (int i = 0; i < palabras.length; i++) {

                    // Aqui me va a detectar si es par la posicion de la palabra
                    if (i % 2 == 0) {
                        par += palabras[i] + " ";

                    } else {
                        impar += palabras[i] + " ";

                    }

                }
                // Para cuando no sean al menos 5 palabras
            } else {
                System.out.println("Error esta frase no contiene al menos 5 palabras");
            }
            // Quitar espacios adicionales
            par = par.trim();
            impar = impar.trim();
            // Imprime las palabras pares y las impares
            System.out.println("Las palabras en posiciones pares son: " + par );
            System.out.println("Las palabras en posiciones impares son: " + impar);
            scanner.close();
        }

        public static void main(String[] args) {
            case2Switch();
            
        }
    }