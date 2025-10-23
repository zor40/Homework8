import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("Task 1");
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = new double[]{1.57, 7.654, 9.986};
        byte[] thirdArray = new byte[]{5};
        System.out.println("Task 2");
        for (int i = 0; i < firstArray.length; i++) {
            if (i > 0) {
            }
        }
        System.out.println(Arrays.toString(firstArray));

        for (int i = 0; i < secondArray.length; i++) {
            if (i > 0) {
            }
        }
        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < thirdArray.length; i++) {
            if (i > 0) {
            }
        }
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("Task 3");
        int[] oneArray = new int[]{3, 2, 1};
        double[] twoArray = new double[]{9.986, 7.654, 1.57};
        byte[] threeArray = new byte[]{5};
        for (int i = 0; i < oneArray.length; i++) {
            if (i > oneArray.length - 1) {
            }
        }
        System.out.println(Arrays.toString(oneArray));

        for (int i = 0; i < twoArray.length; i++) {
            if (i > twoArray.length - 1) {
            }
        }
        System.out.println(Arrays.toString(twoArray));

        for (int i = 0; i < threeArray.length; i++) {
            if (i > threeArray.length - 1) {
            }
        }
        System.out.println(Arrays.toString(threeArray));

        System.out.println("Task 4");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
            arr[i] += 1;
        }
    }
            System.out.println(Arrays.toString(arr));





















    }
}