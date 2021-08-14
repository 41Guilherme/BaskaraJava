import java.util.Scanner;


public class Baskara {
    
    public static void main(String[] args){


        System.out.println("Digite a, b , c:");

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int A = a.nextInt();
        int B = b.nextInt();
        int C = c.nextInt();
        float d = delta(A,B,C);

        if (d > 0) {
            var x1 = (-B + Math.sqrt(d)/2*A);
            var x2 = (-B + Math.sqrt(d)/2*A);
            System.out.println("DUAS RAIZES: " + x1 + " " + x2);
        } else if (d == 0 ){
            var x1 = -B /2*A;
            System.out.println("UMA RAIZ: " + x1);
        } else {
            System.out.println("NÃO TEM RAIZ ");
        }
     
        a.close();
        b.close();
        c.close();
    }

    public static float delta(Integer a, Integer b, Integer c){
        var delta = b*b - 4 * a* c;

        return (float) delta;
    }
}
