package main.java.test;

import main.java.subclasses.Operario;

public class OperarioTest {
    public static void main(String[] args) {
        Operario operario = new Operario("Cainan", "Quadra 11 Rua 4", "62985763745", 1, 1670.0, 9.0, 400.0, 2.0);
        double salario = operario.calcularSalario();
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Salário: R$" + String.format("%.2f", salario));
    }
}
