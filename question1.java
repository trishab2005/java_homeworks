public class homeworks {

    // Author trisha
    public static void main(String[] args) {
        printNumbers();                       //Main method
    }

     static void printNumbers() {
        for (int i = 1; i <= 7; i++) {
            if (i == 3) {                      //Method for printing the numbers
                System.out.println("I am 3");
            } else if (i == 5) {
                System.out.println("I am 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
