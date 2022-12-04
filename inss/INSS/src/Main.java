import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        do {
            empregado e = new empregado();
            System.out.println("O que deseja fazer?");
            System.out.println("1 - adicionar");
            System.out.println("2 - remover");
            System.out.println("3 - ver lista");
            System.out.println("4 - sair");
            System.out.println();
            menu = entrada.nextInt();
            if (menu == 1) {
                gerenciarEmpregado.adicionarEmpregado(e);
            } else if (menu == 2) {
                gerenciarEmpregado.removerEmpregado(e);

            } else if (menu == 3) {
                gerenciarEmpregado.listarEmpregados();
            }
            //System.out.println();
        } while (menu != 4);

    }
}