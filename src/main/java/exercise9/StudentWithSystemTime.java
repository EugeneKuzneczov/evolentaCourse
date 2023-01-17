package exercise9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentWithSystemTime implements Learner {
    private Learner learner;

    public StudentWithSystemTime(Learner learner) {
        this.learner = learner;
    }

    String systemTime = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss").format(LocalDateTime.now());

    @Override
    public void learn() {
        System.out.println(systemTime);
        learner.learn();
    }
}
