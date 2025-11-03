package JavaConceptOfDayPatten.Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int i,j, k;
        int num=5;
        for(i = 1; i<=5; i++)
        {
            for(j = 1; j<=i; j++)
            {
                    System.out.print(" ");
            }
            for(k = 1; k<=num ; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            --num;
        }
        for(i = 1; i<=5; i++)
        {
            for(j = 5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }
    }
