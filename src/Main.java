import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "House of the Gipsies.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                LocalTime enteredTime = LocalTime.parse(inputTime, formatter);

                if (enteredTime.isBefore(LocalTime.now())) {
                    System.out.println("The time must be in the future. Please try again.");
                }
                else {
                    alarmTime = enteredTime;
                    System.out.println("Alarm set for " + alarmTime);
                }
            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid Format. Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
