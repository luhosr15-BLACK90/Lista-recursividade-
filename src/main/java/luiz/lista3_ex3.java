//Ler 8 números inteiros e mostrar só os que são primos. Primo é maior
//que 1 e só divide por 1 e por ele mesmo.

package luiz;

public class lista3_ex3 {
    static boolean ehPrimo(int numero){
        if(numero<=0){
            return false;
    }
        for(int i=2;i<numero;i++){
            if(numero%i == 0){
            return false;
            }
    }
    return true;
}
    static void exibirPrimos(int[]numeros){
        IO.println("Numeros Primos");
        for(int i=0;i<numeros.length;i++){
            if(ehPrimo(numeros[i])){
                IO.println(numeros[i])  ;
            }
        }

    }
    public static void main(String[]args){
        int[]numeros = new int[]{89,6,3,4,5,7,5,250};
        exibirPrimos(numeros);
    }

}
