import java.lang.Math;
interface Square{
    boolean isSquare(int x);
 }
public class Runner{
  interface printQuotient{
      void printQuotientOfNums(float n1 ,float n2);
  }
  public static void main(String[] args){
        Square theSquare = (int x) -> {
									return (Math.pow((int)Math.sqrt(x),2) == x);
								};
        System.out.println(theSquare.isSquare(9));
        printQuotient divide = (float num1, float num2) -> System.out.printf("Quotient is: %.3f\n", num1/num2);
        divide.printQuotientOfNums(3.0f, 2.0f);
    }
}//Hey there Mr.Schiff! I learned that 1, it takes 13 attempts to get this right, 2, how to use a lambda funtion (which is so much better in python btw), and finally, how to use the Sout.printf() to format for a decimal
//I learned about lamba expressions and how they work for a java program. I also learned a lot about the GitKraken program and its utilities. I learned about created branches, working on it individually, and later on merging them.