//author trisha


class question9{
    static int factorial(int num){
      int num2=1;
      for(int i=1;i<=num;i++){      //Method for Factorial Logic
          num2*=i;
      }
      return num2;
  }
  public static void main(String[]args){        //Main method
      int number=6;
      int fact=factorial(number);
      System.out.println("The Factorial of "+number+"is:"+fact);
  }
}