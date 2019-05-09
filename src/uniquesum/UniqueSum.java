package uniquesum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UniqueSum {

    public static void main(String[] args) {
        try {
            int[] numbers = {2, 7, 11, 15};
            List<Integer> indices = new ArrayList<>();
            //insert expected sum
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the expected SUM");
            Integer sum = Integer.parseInt(br.readLine());

            //first loop to obtain the starting point
            for (int i = 0; i < numbers.length; i++) {

                //an iteration based on the starting point
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == sum) {
                        System.out.println("numbers at indices " + i + " and " + j);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(UniqueSum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
