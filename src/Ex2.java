//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int somaIn = 0, somaOut = 0;

        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                somaIn++;
            }else{
                somaOut++;
            }
        }
        System.out.println(somaIn + " in");
        System.out.println(somaOut + " out");
        sc.close();
    }
}
