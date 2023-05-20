package dio.exceptions;

import javax.swing.*;

//Fazer a divisão de dois valores inteiros
public class UncheckedException {
    public static void main(String[] args){

    boolean loop = true;
    do{
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        try{////bloco onde colocamos a lógica onde pode ocorrer a exception
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            loop = false;//encerra o loop para inserir dados

        } catch (NumberFormatException e) {
            //throw new RuntimeException(e); // exibe para mim o stack trace
            e.printStackTrace();//Prints Stack Trace
            JOptionPane.showInputDialog(null, "Entrada inválida, digite um número inteiro!" + e.getMessage());//mensagem do porquê do erro.
        } catch (ArithmeticException e){
            //throw new RuntimeException(e); // exibe para mim o stack trace
            e.printStackTrace();//Prints the Stack Trace
            JOptionPane.showInputDialog(null, "Entrada inválida, digite um número diferente de zero!");//relato sem mensagem
        }
        finally {
            System.out.println("Chegou no finally!");
        }

    }while(loop);

        System.out.println("O código continua");
    }

    public static int dividir (int a, int b) {return a / b;}
}
