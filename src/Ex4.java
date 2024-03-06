//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            float v1 = sc.nextFloat();
            float v2 = sc.nextFloat();

            if(v2 != 0){
                float resultado = v1 / v2;
                System.out.println(resultado);
            }else{
                System.out.println("divisão impossível");
            }
        }
        sc.close();
    }
}
