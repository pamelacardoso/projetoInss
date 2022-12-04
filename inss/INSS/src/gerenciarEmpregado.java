import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class gerenciarEmpregado {

    static ArrayList<empregado> listaEmpregados = new ArrayList<>();
    static int i ;
    public static void adicionarEmpregado(empregado e)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o código do empregado: ");
        e.setCodigoEmpregado(entrada.nextInt());
        System.out.print("Digite o nome do empregado: ");
        e.setNomeEmpregado(entrada.next());
        System.out.print("Digite o setor do empregado: ");
        e.setSetor(entrada.next());
        System.out.print("Digite o salário do empregado: ");
        e.setSalarioBruto(entrada.nextDouble());
        parametrosINSS contrINSS = new parametrosINSS();
        e.setRecInss(contrINSS.calcularINSS(e.getSalarioBruto()));
        //System.out.println(e.getRecInss());
        listaEmpregados.add(e);
        System.out.println("Novo empregado cadastrado com sucesso!");
        System.out.println();
    }

    public static void removerEmpregado(empregado e)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do empregado que deseja remover: ");
        e.setNomeEmpregado(entrada.next());

        if (verificarExistencia(e)){
            listaEmpregados.remove(i);
            System.out.println("Item removido com sucesso!");
        }
        else {
            System.out.println("O nome digitado não costa na lista!");
        }
        System.out.println();
    }
     private static boolean verificarExistencia (empregado e){
        boolean estado = false;

        for (i = 0; i< listaEmpregados.size(); i++){
            if (Objects.equals(e.getNomeEmpregado(), listaEmpregados.get(i).getNomeEmpregado())){
                estado = true;
                break;
            }
            else{
                estado = false;

            }
        }
        return estado;
     }

     public static void listarEmpregados(){
         System.out.println("----------------------------------------------");
         System.out.print("Código"+ "\t");
         System.out.print("Nome"+ "\t");
         System.out.print("Setor"+ "\t");
         System.out.print("Salário"+ "\t");
         System.out.print("RecINSS"+ "\t");
         System.out.println();
         System.out.println("----------------------------------------------");
        for (int i = 0; i< listaEmpregados.size(); i++){

            System.out.print(listaEmpregados.get(i).getCodigoEmpregado() + "\t");
            System.out.print(listaEmpregados.get(i).getNomeEmpregado() + "\t");
            System.out.print(listaEmpregados.get(i).getSetor() + "\t");
            System.out.printf("R$ " + "%.2f"  + "\t",listaEmpregados.get(i).getSalarioBruto());
            System.out.printf("R$ " + "%.2f" + "\t",listaEmpregados.get(i).getRecInss());
            System.out.println();
         }
         System.out.println();
     }

}
