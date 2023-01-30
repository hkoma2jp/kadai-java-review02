
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ) {
            String answer = "";
            if (i % 3 == 0) {
                answer = "Fizz";
            }
            if (i % 5 == 0) {
                answer = answer + "Buzz";
            }
            if (answer == "") {
                System.out.println(i);
            } else {
                System.out.println(answer);
            }
        }

    }

}
