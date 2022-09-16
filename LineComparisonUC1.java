import java.util.Scanner;

public class LineComparisonUC1
{
    public static void main(String arg[])

    {

        int x1,x2,y1,y2,x3,x4,y3,y4;

        double lenghtOfLine1;
        double lenghtOfLine2;

        Scanner sc=new Scanner(System.in);

        System.out.print(" enter x1 point :");

        x1=sc.nextInt();

        System.out.print(" enter y1 point :");

        y1=sc.nextInt();

        System.out.print(" enter x2point :");

        x2=sc.nextInt();

        System.out.print(" enter y2 point : ");

        y2=sc.nextInt();

        System.out.print(" enter x3 point : ");

        x3=sc.nextInt();

        System.out.print(" enter x4 point : ");

        x4=sc.nextInt();

        System.out.print(" enter y3 point : ");

        y3=sc.nextInt();

        System.out.print(" enter y4 point : ");

        y4=sc.nextInt();

        lenghtOfLine1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println(" lenght Between " + "("+x1+","+y1+")," + " ("+x2+","+y2+")===> " + lenghtOfLine1);

        lenghtOfLine2=Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));

        System.out.println(" lenght Between " + "("+x1+","+y1+")," + " ("+x2+","+y2+")===> " + lenghtOfLine2);

    }
}
