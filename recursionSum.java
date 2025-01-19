import javax.swing.JOptionPane;

public class recursionSum {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter a Number " + (i + 1) + ": ", "Input", JOptionPane.PLAIN_MESSAGE);

            try {
              numbers[i] = Integer.parseInt(input);  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        int sum = calculateSum(numbers, 0);

        JOptionPane.showMessageDialog(null, "The sum of the numbers is: " + sum, "Sum", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int calculateSum(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + calculateSum(numbers, index + 1);
    }
}