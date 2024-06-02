import java.sql.SQLOutput;
import java.util.Scanner;

//斐波那契数列logn算法
/*
public class E {
    static int[][] matrixMultiply(int [][]a,int [][]b){
        int [][] result=new int [2][2];
        result[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        result[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        result[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        result[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
        return result;
    }

    static int[][]matrixPower(int[][] matrix,int n){
        if(n==1){return matrix;}
        else if (n%2==0){
            int [] []temp=matrixPower(matrix,n/2);
            return matrixMultiply(temp,temp);
        }
        else{
            int [][]temp=matrixPower(matrix,(n-1)/2);
            return matrixMultiply(temp,matrixMultiply(temp,temp));

        }
    }

    static int fibonacci(int n){
        if(n<=0)
        {
            return 0;
        }
        else{
            int [][] baseMatrix={{1,1},{1,0}};
            int [][] resultMatrix=matrixPower(baseMatrix,n-1);
            return resultMatrix[0][0];
        }
    }


    public static void main(String args[]) {
     Scanner reader=new Scanner(System.in);
     int n=reader.nextInt();
     int m=fibonacci(n);
        System.out.printf("斐波那契数列第%d项是%d",n,m);
    }
}
*/

/*

//斐波那契数列时间复杂度为n算法,程序bug若一开始输入不是正整数，那程序会直接退出
public class E{
    static int fibonacci(int n){
        int temp=0; int first=1,end=1;
        if(n==1||n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                temp=first+end;
                first=end;
                end=temp;
            }
            return temp;
        }
        }
    public static void main(String[] args){
        System.out.println("请输入斐波那契数列项数");
        Scanner reader=new Scanner(System.in);
            while (reader.hasNextInt()) {
                int a = reader.nextInt();
                if (a >= 1) {
                    System.out.printf("斐波那契数列第%d项的结果为", a);
                    System.out.println(fibonacci(a));
                } else {
                    System.out.println("请输入正整数");
                }
            }


    }

}
*/

public class E{
    public static void main(String[] args) {
        String tom="student";
        System.out.println(tom.indexOf("en"));

    }
}