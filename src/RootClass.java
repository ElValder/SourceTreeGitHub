import java.util.Random;

public class RootClass {
    public static void main(String[]args){
        Random s = new Random();
        int N = 5, sumA = 0, sumB = 0;
        int A[] = new int[N];
        int B[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt(6);
            System.out.print(A[i] + " ");
            sumA = sumA + A[i];
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt(6);
            System.out.print(A[i] + " ");
            sumB = sumB + A[i];
        }
        System.out.println();
        float a = (float) sumA / N;
        float b = (float) sumB / N;
        if (a > b) {
            System.out.println("Среднее арифметическое первого массива больше и равняется " + a);
        }
        if (a < b) {
            System.out.println("Среднее арифметическое второго массива больше и равняется " + b);
        }
        if (a == b) {
            System.out.println("Среднее арифметическое массивов равное и равняется " + a);
        }
    }
    }
}

