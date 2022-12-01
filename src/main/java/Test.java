import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something: ");
        String userInput = sc.nextLine();

        System.out.println("you entered: "+userInput);

        if (StringUtils.isNumeric(userInput)){
            System.out.println(userInput+" is a number");
        }else {
            System.out.println(userInput+" is not a number");
        }

        System.out.println("flipped case "+ StringUtils.swapCase(userInput));
        System.out.println("reversed "+ StringUtils.reverse(userInput));

    }
}
