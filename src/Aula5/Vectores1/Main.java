package Aula5.Vectores1;

//  1. Construir um vetor de números naturais até um dado número n. Exemplo: naturals(5)->{1,2,3,4,5}

//  2. Construir um vetor de dígitos aleatórios (números de 0 a 9), dado o comprimento. Exemplo:
//     randomDigits(5)->{8,2,9,1,2}

//  3. Construir um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu
//     preenchimento automático com os números 101 a 150, ou seja na posição número 0 fica 101, na
//     posição número 1 fica 102 e por aí adiante.

//  4. Copiar (replicar) um vetor de inteiros, tendo o novo vetor o mesmo tamanho do argumento.
//     Exemplo: copy({1,2,3},6)->{1,2,3,0,0,0} copy({1,2,3,4,5,6},3)->{1,2,3}

//  5. Verificar se existe um determinado número num vetor. Exemplo: exists(5,{1,3,4,5})->true
//     exists(1,{2,3})->false

//  6. Contar o número de ocorrências de um determinado caractere. Exemplo: count(a,{a,b,c,a})->2

//  7. Construir um sub-vetor de outro vetor, dados os índices do primeiro elemento e último a incluir.
//     Exemplo subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}

public class Main {

    public static void main(String[] args) {

    //  1
        System.out.println("#1");
        printVector(naturalNumbers(5));

    //  2
        System.out.println("");
        System.out.println("#2");
        printVector(randomNumbers(5));

    //  3
        System.out.println("");
        System.out.println("#3");
        printVector(rangeStart(101));

    //  4a
        int[] sampleArray = {1, 5, 8, 2, 2};
        System.out.println("");
        System.out.println("#4a");
        printVector(copyArray(sampleArray, 3));

    //  4b
        System.out.println("");
        System.out.println("#4b");
        printVector(copyArray(sampleArray, 8));

    //  5
        System.out.println("");
        System.out.println("#5");
        System.out.println(hasNumber(sampleArray,2));

    //  6
        char[] sampleChar = {'a', 'b', 'c', 'a'};
        System.out.println("");
        System.out.println("#6");
        System.out.println(count(sampleChar, 'a'));

    //  7
        System.out.println("");
        System.out.println("#7");
        printCharVector(subArray(sampleChar,1,2));
    }

    //  printVector
    //  int
    public static void printVector(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }
    //  char
    public static void printCharVector(char[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }

    //  1
    public static int[] naturalNumbers(int n) {
        int[] array = new int[n];
        int numbers = 1;
        for (int i = 0; i < n; i++) {
            array[i] = numbers;
            numbers++;
        }
        return array;
    }

    //  2
    public static int[] randomNumbers(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*10);
        }
        return array;
    }

    //  3
    public static int[] rangeStart(int n) {
        int[] array = new int[50];
        int numbers = n;
        for (int i = 0; i < 50; i++) {
            array[i] = numbers;
            numbers++;
        }
        return array;
    }

    //  4
    public static int[] copyArray(int[] sample, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i >= sample.length) {
                break;
            }
            array[i] = sample[i];
        }
        return array;
    }

    //  5
    public static boolean hasNumber(int[] sample, int n) {
        for (int number: sample) {
            if (number == n) {
                return true;
            }
        }
        return false;
    }

    //  6
    public static int count(char[] sample, char n) {
        int count = 0;
        for (char character: sample) {
            if (character == n) {
                count++;
            }
        }
        return count;
    }

    //  7
    public static char[] subArray(char[] sample, int first, int last) {
        int max = last - first + 1;
        char[] array = new char[max];
        for (int i = 0; i < max; i++) {
            array[i] = sample[first];
            first++;
        }
        return array;
    }
}
