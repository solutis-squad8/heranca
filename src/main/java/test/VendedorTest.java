package main.java.test;

import main.java.subclasses.Vendedor;

public class VendedorTest {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Elio", "Quadra 90 Rua 18", "21984562398", 3, 2295.0, 9.0, 20000.0, 1.0);
        double salario = vendedor.calcularSalario();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Código do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário: R$" + String.format("%.2f", salario));

    }
}
