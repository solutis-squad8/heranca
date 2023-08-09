package src.main.java.test;

import src.main.java.subclasses.Administrador;

public class AdministradorTest {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Michele", "QR 431", "61957853478", 2, 3409.0, 9.0, 150.0);
        double salario = administrador.calcularSalario();
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Salário: R$" + String.format("%.2f", salario));
    }
}
