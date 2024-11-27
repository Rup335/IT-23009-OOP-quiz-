import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] questions = {
            "1. What is the capital of Bangladesh? (A. Dhaka, B. Bogura, C. Tangail, D. Rangpur)",
            "2. What is 2 + 2? (A. 3, B. 4, C. 5, D. 6)",
            "3. What is 11%2? (A. 1, B. 2, C. 3, D. 4 )",
            "4. What is 22-9? (A. 14, B. 10, C. 11, D. 13)",
            "5. Which is an odd number? (A. 9, B. 6, C. 4, D. 2)"
        };

        char[] correctAnswers = {'A', 'B', 'A', 'D', 'A'};
        double score = 0;

        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            if (answer == correctAnswers[i]) {
                score ++;
            } else {
                score --;
            }
        }

        System.out.printf("Your final score: %.2f\n", score);
        scanner.close();
    }
}