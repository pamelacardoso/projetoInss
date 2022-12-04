//import java.lang.Math;
public class parametrosINSS
{
    double[] FAIXA = { 0.075, 0.09, 0.12, 0.14 };
    double[] LIMITEFAIXA = { 1100, 2203.48, 3300.22, 6433.57 };

    public double calcularINSS(double salario)
    {
        double recolhimento;
        if (salario <= LIMITEFAIXA[0])
        {
            recolhimento = FAIXA[0]*salario;
        }
        else if (salario > LIMITEFAIXA[0] && salario <= LIMITEFAIXA[1])
        {
            recolhimento = LIMITEFAIXA[0]*FAIXA[0] + (salario-LIMITEFAIXA[0])*FAIXA[1];
        }
        else if (salario > LIMITEFAIXA[1] && salario <= LIMITEFAIXA[2])
        {
            recolhimento = LIMITEFAIXA[0]*FAIXA[0]+(LIMITEFAIXA[1]-LIMITEFAIXA[0])*FAIXA[1] +
                    +(salario-LIMITEFAIXA[1])*FAIXA[2];
        }

        else if (salario > LIMITEFAIXA[2] && salario <= LIMITEFAIXA[3])
        {
            recolhimento = LIMITEFAIXA[0]*FAIXA[0]+(LIMITEFAIXA[1]-LIMITEFAIXA[0])*FAIXA[1] +
                    +(LIMITEFAIXA[2]-LIMITEFAIXA[1])*FAIXA[2] + (salario-LIMITEFAIXA[2])*FAIXA[3];
        }
        else
        {
            recolhimento = LIMITEFAIXA[0]*FAIXA[0]+(LIMITEFAIXA[1]-LIMITEFAIXA[0])*FAIXA[1] +
                    +(LIMITEFAIXA[2]-LIMITEFAIXA[1])*FAIXA[2] + (LIMITEFAIXA[3]-LIMITEFAIXA[2])*FAIXA[3];
        }

        return recolhimento;
    }

}

