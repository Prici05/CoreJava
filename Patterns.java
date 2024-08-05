public class pyramidTriangle {

public static void main(String[] args) {
// TODO Auto-generated method stub
//nested loops works -
int k=1;
for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
{
//System.out.println( "outer loop started");
for(int j=1;j<=4-i;j++) // inner loop
{
System.out.print( k);
System.out.print("\t");
k++;
}
//System.out.println( "");
}
}

}

output

  1 2 3 4
  5 6 7
  8 9
  10

  
// Example on reverse pyramid Triangle
public class reversePyramidTriangle {

public static void main(String[] args) {
// TODO Auto-generated method stub
//int k=1;
for(int i=1;i<5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
System.out.print("\t");
//k++;
}
System.out.println("");

}
}
}

output

  1
  2 3
  4 5 6
 7 8 9 10


  class ReversePyramidTriangle {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<i;j++)
           {
               System.out.print(j*3 +"\t");
           }
            System.out.println("");
       }
       }
    }

output

  3
  3 6
  3 6 9
  3 6 9 12



