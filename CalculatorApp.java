import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la calculatrice !");
        
        // Demander les deux nombres
        System.out.print("Entrez le premier nombre: ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double num2 = scanner.nextDouble();

        // Demander l'opération à effectuer
        System.out.println("Choisissez une opération: ");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Entrez votre choix (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result = 0;
        boolean validOperation = true;

        // Exécution de l'opération choisie
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Opération non valide.");
                validOperation = false;
        }

        // Afficher le résultat si l'opération est valide
        if (validOperation) {
            System.out.println("Le résultat de l'opération est : " + result);
        }

        scanner.close();
    }
}
