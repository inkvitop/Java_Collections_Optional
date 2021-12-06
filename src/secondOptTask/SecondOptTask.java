package secondOptTask;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class SecondOptTask {
    String[] inputArray;
    Stack<Integer> stack = new Stack<>();

    public void newInput() {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        inputArray = inputString.split("");
    }

    public void addInputIntegersToStack() {
        for (int i = 0; i < inputArray.length; i++) {
            stack.add(Integer.parseInt(inputArray[i]));
        }
    }

    public void printReversedStack() {
        Collections.reverse(stack);
        StringBuilder reversedInteger = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            reversedInteger.append(String.valueOf(stack.get(i)));
        }
        System.out.println(reversedInteger);
        System.out.println("The second task is completed. The number has been inverted.");
    }
}
