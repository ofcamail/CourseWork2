import enums.Type;
import exceptions.*;
import services.*;
import task.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DailyTask firstTask = new DailyTask(
                "firstTask",
                Type.WORK,
                "плрвырдрпдв",
                LocalDateTime.of(2023,1,1,1,0)
        );
        OneTimeTask secondTask = new OneTimeTask(
                "secondTask",
                Type.PERSONAL,
                "frhtrhsdhf",
                LocalDateTime.of(2023,1,1,1,0)
        );
        MonthlyTask thirdTask = new MonthlyTask(
                "thirdTask",
                Type.PERSONAL,
                "fkfkhgfkhf",
                LocalDateTime.of(2023,1,1,1,0)
        );

        TaskService taskService = new TaskService();
        taskService.add(firstTask);
        taskService.add(secondTask);
        taskService.add(thirdTask);

        try {
            System.out.println(taskService.remove(3));
        } catch (TaskNotFoundExceptions e) {
            System.out.println("Errrrrrrrror");
        }

        System.out.println(taskService.getAllByDate(LocalDate.of(2023, 1, 1)));
    }
}