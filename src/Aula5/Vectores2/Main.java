package Aula5.Vectores2;

//  1. Obter a primeira metade um vetor v, incluindo um parâmetro booleano para permitir se o elemento
//     do meio é para incluir (caso o comprimento do vetor seja ímpar). Se o comprimento for par, este
//     parâmetro não terá efeito. Exemplo firstHalf({b,a,s,w,q}, true)->{b,a,s}

//  2. Construir um vetor juntando outros dois vetores (parte esquerda e parte direita). Exemplo:
//     merge({1,2},{9,10})

//  3. Construir um vetor invertido com base noutro. Ou seja, o novo vetor será composto pelos
//     elementos do vetor dado pela ordem inversa. Exemplo: invert({t,q,a)}->{a,q,t}

//  4. Construir um vetor com base noutro, de modo o dobro do tamanha e cada elemento duplicado.
//     Exemplo: duplicateEveryElement({a,s,d})->{a,a,s,s,d,d}

//  5. Construir um vetor com base noutro, sendo a primeira metade uma cópia e a segunda metade os
//     mesmos elementos para ordem inversa. Exemplo: duplicateInverted({3,2,1})->(3,2,1,1,2,3)

//  6. Construir um vetor com base noutro, representado um cópia sem o elemento do meio (caso o
//     tamanho seja ímpar) Exemplo: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}

//  7. Construir um vetor com n números da sequência Fibonacci. Exemplo: fibonacciSequence(7)->
//     {0,1,1,2,3,5,8}

public class Main {
    public static void main(String[] args) {

    //  1
        System.out.println("#1");
        char[] charArray = {'b','a','s','w','q'};
        printCharArray(firstHalf(charArray, true));

    //  2
        System.out.println("");
        System.out.println("#2");
        int[] firstExample = {3,4};
        int[] secondExample = {5, 2};
        printArray(mergeArray(firstExample, secondExample));

    //  3
        System.out.println("");
        System.out.println("#3");
        printCharArray(reverseArray(charArray));

    //  4
        System.out.println("");
        System.out.println("#4");
        printCharArray(doubleArray(charArray));

    //  5
        System.out.println("");
        System.out.println("#5");
        int[] example = {2,3,1,5};
        printArray(mirrorArray(example));

    //  6
        System.out.println("");
        System.out.println("#6");
        int[] newExample = {2,3,1,5,7};
        printArray(theMiddle(newExample));

    //  7
        System.out.println("");
        System.out.println("#7");
        printArray(fibonacciSequence(30));
    }

    //  printArray
    //  char
    public static void printCharArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }
    //  int
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }

    //  1
    public static char[] firstHalf(char[] sample, boolean middle) {
        int half = sample.length / 2;
        if ((sample.length / 2 != 0) && middle) {
            half = half + 1;
        }
        char[] array = new char[half];
        for (int i = 0; i < half; i++) {
            array[i] = sample[i];
        }
        return array;
    }

    //  2
    public static int[] mergeArray(int[] firstArray, int[] secondArray) {
        int newLength = firstArray.length + secondArray.length;
        int[] array = new int[newLength];
        for (int i = 0; i < firstArray.length; i++) {
            array[i] = firstArray[i];
        }
        int j = 0;
        for (int i = firstArray.length; i < newLength; i++) {
            array[i] = secondArray[j];
            j++;
        }
        return array;
    }

    //  3
    public static char[] reverseArray(char[] sample) {
        char[] array = new char[sample.length];
        int countdown = sample.length - 1;
        for (int i = 0; i < sample.length; i++) {
            array[i] = sample[countdown];
            countdown--;
        }
        return array;
    }

    //  4
    public static char[] doubleArray(char[] sample) {
        int doubleLength = sample.length * 2;
        char[] array = new char[doubleLength];
        int counter = 0;
        for (int i = 0; i < doubleLength; i = i + 2) {
            array[i] = sample[counter];
            array[i + 1] = sample[counter];
            counter++;
        }
        return array;
    }

    //  5
    public static int[] mirrorArray(int[] sample) {
        int doubleLength = sample.length * 2;
        int[] array = new int[doubleLength];
        for (int i = 0; i < sample.length; i++) {
            array[i] = sample[i];
        }
        int reverse = sample.length - 1;
        for (int i = sample.length; i < doubleLength; i++) {
            array[i] = sample[reverse];
            reverse--;
        }
        return array;
    }

    //  6
    public static int[] theMiddle(int[] sample) {
        int newLength = sample.length - 1;
        int[] array = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i >= sample.length / 2) {
                array[i] = sample[i + 1];
            } else {
                array[i] = sample[i];
            }
        }
        return array;
    }

    //  7
    public static int[] fibonacciSequence(int n) {
        int[] array = new int[n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                array[i] = 0;
            } else {
                array[i] = x;
                x += array[i - 1];
            }
        }
        return array;
    }
}
