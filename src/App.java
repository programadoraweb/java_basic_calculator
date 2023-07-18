public class App {
    public static void main(String[] args) throws Exception {
      
        int num1; 
        int num2;
        char operacao;
        double resultado; 

        Operaccoes esteCalculo = new Operaccoes();

        System.out.println("Introduzir o primeiro numero inteiro: ");
        num1 = esteCalculo.obterNumero();

         System.out.println("Introduzir o segundo numero inteiro: ");
        num2 = esteCalculo.obterNumero();

 System.out.println("Introduzir a operacao a ser realizada: ");
        operacao = esteCalculo.obterCaractere();


        if (num2 == 0 && operacao == '/'){
            System.out.println("Divisao por Zero ");
            
        } else {
            resultado = esteCalculo.calcularResultado(num1, num2, operacao);
            System.out.println("Resultado: " + resultado);
            
        }


    }
}
