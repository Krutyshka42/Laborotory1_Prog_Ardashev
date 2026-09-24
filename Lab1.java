public class Lab1 {
    public static void main(String[] args) {

        int[] b = new int[8];
        int ind = 0;
        for (int i = 16; i >= 2; i -= 2) {
            b[ind] = i;
            ind++;
        }


        float[] x = new float[15];
        for (int i = 0; i < 15; i++) {
            x[i] = (float) (Math.random() * 22.0 - 11.0);
        }


        double[][] b1 = new double[8][15];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 15; j++) {
                b1[i][j] = matrixElement(b[i], x[j]);
            }
        }

        printMatrix(b1);


    }

    public static double matrixElement(int bi, float xj) {
        if (bi == 2)
        {
            return Math.cos(Math.sin(Math.cos(xj)));
        }
        else if (bi ==4 || bi==10 || bi==12 || bi ==16)
        {
            return Math.cos(Math.atan(Math.sin(xj)));
        }
        else
        {
            double first_part = (0.25/Math.pow(2*Math.exp(Math.cbrt(xj)),2));
            double second_part = Math.pow((0.5 + xj)/xj,xj);
            double third_part = Math.atan(Math.sin(Math.pow(Math.cos(xj)+1,second_part)));

            return Math.pow(first_part,third_part);
        }
    }
    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length;j++)
            {
                System.out.printf("%10.3f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}