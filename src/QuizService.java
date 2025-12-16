import java.util.List;
import java.util.Scanner;

public class QuizService {
    private int score = 0;

    public void startQuiz(List<Question> questions) {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestion());
            String[] options = q.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();

            if (userAnswer == q.getAnswer()) {
                score++;
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.size());
    }
}
