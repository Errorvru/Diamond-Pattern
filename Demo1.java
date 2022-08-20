/*
 * public class Demo1 { public static void main(String[] args){ int no = 10;
 * System.out.println("no = "+no);
 * 
 * //float div =(float) 5/2; //System.out.println("div = "+div); float div
 * =(float) 5%2;
 * 
 * System.out.println("div = "+div);
 * 
 * int x = no++;//first it will assign and then will inc
 * System.out.println("x = "+x); int y = ++no;//inc. first and the assign
 * System.out.println("y = "+y); System.out.println("0.0/0.0="+(0.0/0.0));
 * System.out.println("10/0.0 = "+(10/0.0));
 * System.out.println("-10/0.0 = "+(-10/0.0));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * } }
 */


public class Demo1
{
public static void main(String[] args)
{
int n, i, j, space = 1;
n = 5;
space = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
space = 1;
for (j = 1; j<= n - 1; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space++;
for (i = 1; i<= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
