package JavaConceptOfDayPatten.Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            if(i>2)
            {
                for(int l=i;l>=1;l--)
                {
                    System.out.print(l + " ");
                }
            }
            System.out.println();
        }
    }
}
