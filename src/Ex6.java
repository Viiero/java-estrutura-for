//Ler um número inteiro N e calcular todos os seus divisores

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> divisores = new ArrayList<>();

        int N = sc.nextInt();
        divisores.add(N);

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                divisores.add(i);
                System.out.println(i);
            }
        }
        sc.close();
    }
}
