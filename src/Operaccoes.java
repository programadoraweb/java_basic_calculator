import java.util.Scanner;

public class Operaccoes {

    public double calcularResultado(double num1, double num2, char operacao){
        double resultado;

        switch (operacao) {
            case '+':
            resultado = num1 + num2;
                break;
            case '-':
            resultado = num1 - num2;
                break;
        case '*':
            resultado = num1 * num2;
                break;
        case '/':
        if (num2 !=0 ) {
            
            resultado = num1 / num2;
        } else {
            System.out.println("Nao podemos dividir por 0 !!!");
            resultado = -999999;
        }
                break;
            default:
            resultado= -99999;
                break;
        }

        return resultado;
    }
    
    
    //Obter numero entrado pelo usuario
    public static int obterNumero(){
    Scanner objetoEntrada =  new Scanner(System.in);
    int valor = objetoEntrada.nextInt();
    return valor; 
    }

    // obter caractere especial entrado pelo usuario 
public static char obterCaractere(){
    Scanner objetoEntrada2 =  new Scanner(System.in);
    char caractere;
    String linha = objetoEntrada2.nextLine().toLowerCase();
    caractere = linha.charAt(0);
    return caractere;
}


    
}
