package program;


import entities.StudentRegistration;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRegistration[] vect = new StudentRegistration[10];

        System.out.print("Digite a quantidade de alunos que vão alugar quartos: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Quarto #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new StudentRegistration(name, email);
        }
        sc.close();
    }
}
