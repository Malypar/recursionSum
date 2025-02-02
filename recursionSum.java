import javax.swing.JOptionPane;

public class recursionSum {
    public static void main(String[] args) {
        // Store 5 integers in an array
        int[] numbers = new int[5];

        // Collect 5 integers from the user
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null,
                    "Enter a Number " + (i + 1) + ":",
                    "Input",
                    JOptionPane.PLAIN_MESSAGE);

            // See if the user checked the cancel button or closed the dialog
            if (input == null) {
                JOptionPane.showMessageDialog(null,
                        "No input provided. Exiting the program.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            try {
                // Try to parse the input as an integer
                numbers[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // Error message if the input is not an integer
                JOptionPane.showMessageDialog(null,
                        "Invalid Input. Please enter an integer.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        // Recursively calculate the sum of the numbers
        int sum = calculateSum(numbers, 0);

        // Display the sum to the user
        JOptionPane.showMessageDialog(null,
                "The sum of the numbers is: " + sum,
                "Sum",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static int calculateSum(int[] numbers, int index) {
        // if the index is equal to the length of the array, return 0
        if (index == numbers.length) {
            return 0;
        }

        // add the current number to the sum of the rest of the numbers
        return numbers[index] + calculateSum(numbers, index + 1);
    }
}
