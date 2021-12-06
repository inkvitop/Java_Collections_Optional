import firstOptTask.FirstOptTask;
import fourthOptTask.FourthOptTask;
import secondOptTask.SecondOptTask;

public class Runner {
    public static void main(String[] args) {
        // first task
        FirstOptTask firstOptTask = new FirstOptTask();
        firstOptTask.readTextFile();
        firstOptTask.revertArrayList();
        firstOptTask.writeTextFile();

        // second task
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        SecondOptTask secondOptTask = new SecondOptTask();
        System.out.println("Please, enter integer.");
        secondOptTask.newInput();
        secondOptTask.addInputIntegersToStack();
        secondOptTask.printReversedStack();

        // fourth task
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        FourthOptTask fourthOptTask = new FourthOptTask();
        fourthOptTask.readTextFile();
        fourthOptTask.printSortedPoetry();
    }
}
