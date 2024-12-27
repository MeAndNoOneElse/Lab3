import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
// создали и заполнили массив z
        int[] z = new int[8];
        for (int i = 0; i < 8; i++) {
            z[i] = 4 + 2 * i;
        }
// создаём и заполняем массив x
        double[] x = new double[20];
        for (int i = 0; i < 20; i++) {
            x[i] = ((double)(Math.random()*28)-15);
        }
//создаём и заполняем z1
        double[][] z1 = new double[8][20];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 20; j++) {
                if (z[i] == 10) {
                    z1[i][j] = pow((0.25 + sin((x[j] - 0.5) / x[j])),
                            sin(pow(0.25 * x[j], x[j])));
                } else if (z[i] == 4 || z[i] == 6 || z[i] == 14 || z[i] ==
                        18) {
                    z1[i][j] = sin(2.0/pow(x[j], 2));
                } else {
                    z1[i][j] = pow(E, pow(pow(E, pow(2.0/3*(x[j]-1),x[j])),
                            pow(4/(x[j]*(2.0/3-x[j])-3), 2)));
                }
            }
        }
//Выводим
        System.out.print("[");
        for (int i = 0; i < 8; i++){
            System.out.print("[");
            for (int j = 0; j < 20; j++){
                System.out.printf("%8.3f\t", z1[i][j]);
            }
            if (i != 7) {
                System.out.println("],");
            } else {
                System.out.print("]]");
            }
        }
    }
}