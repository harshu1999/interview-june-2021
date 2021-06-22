package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    {
        int  m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
      

    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
       return " ";
    }
}
