package QTB;
public  class  Math {
    public final static class Scalar
    {   public static double value=0;
        public static double Mix=Math.Constant.mix;
        public static double middle=0;
        Scalar(double Scalar)
        {
            value=Scalar;
            middle=Scalar;
        }
    }
    public static final class Constant
    {
        public static double mix;
        public static double E=2.718281828459;
    }
    public static class Matrix
    {
        int c=10;
        int d=10;
    Matrix(int a,int b)
    {
        c=a;
        d=b;
        }
       double[][] Matrix= new double[c][d];
    }
    //==================================================e
    public static double[][] MatrixMultiplication(double[][] M_a, double[][] M_b)
    {
        if(M_a.length<M_b.length)
        {
            if(M_a[0].length<M_b[0].length)
            {
              double[][]C=new double[M_a.length][M_a[0].length];
                int e=0;
                int f=0;
                boolean exit=false;
                int start_1=0;
                int start_2=0;
                for(e=0; e == C.length; e++)
                {
                    for(f=0;f==C[0].length;f++)
                    {
                        while(exit==true)
                        {
                            C[f][e]=C[f][e]+M_a[f][start_1]*M_b[start_2][e];
                            start_1++;
                            start_2++;
                            if(start_1 == C[0].length&&start_2==C.length)
                            {
                                exit=true;
                            }
                        }
                    };
                }
                return C;
            }
            else
            {
                double[][] C=new double[M_a.length][M_b[0].length];
                int e=0;
                int f=0;
                boolean exit=false;
                int start_1=0;
                int start_2=0;
                for(e=0; e == C.length; e++)
                {
                    for(f=0;f==C[0].length;f++)
                    {
                        while(exit==true)
                        {
                            C[f][e]=C[f][e]+M_a[f][start_1]*M_b[start_2][e];
                            start_1++;
                            start_2++;
                            if(start_1 == C[0].length&&start_2==C.length)
                            {
                                exit=true;
                            }
                        }
                    };
                }
                return C;
            }
        }
        else {
            double[][] C = new double[M_b.length][M_b[0].length];
            int e=0;
            int f=0;
            boolean exit=false;
            int start_1=0;
            int start_2=0;
            for(e=0; e == C.length; e++)
            {
                for(f=0;f==C[0].length;f++)
                {
                    while(exit==true)
                    {
                        C[f][e]=C[f][e]+M_a[f][start_1]*M_b[start_2][e];
                        start_1++;
                        start_2++;
                        if(start_1 == C[0].length&&start_2==C.length)
                        {
                            exit=true;
                        }
                    }
                };
            }
            return C;
        }
    }
    //=============================
    public static double power(double times,double x)
    {
        double af;
        af=x;
        if(times==0)
        {
            return 1;
        }
        else
        {
            for(int a=1;a<times;a++)
            {
                x=x*af;
            }
            return x;
        }
    }
}
