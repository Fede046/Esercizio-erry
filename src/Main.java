import java.util.Random;

public class Main {
    public static void main(String[]args){
   int[][] m= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=Dispari();
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        int tot=0;

        for(int j=0;j<3;j++){
            int temp=1;
            for(int i=0;i<3;i++){
                temp*=m[i][j];
            }
            System.out.println(temp);
            tot+=temp;
        }
        System.out.println(tot);




    }


    public static int Dispari(){
        Random random = new Random();
        int t= 2;
        while(t%2==0){
            t= random.nextInt(10);
        }
        return t;

    }


}










