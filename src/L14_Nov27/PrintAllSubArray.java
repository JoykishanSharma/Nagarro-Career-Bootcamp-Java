package L14_Nov27;

public class PrintAllSubArray {
    public static void main(String[] args) {

        int[] intArray = {10, 20, 30, 40};

        findSubArray1(intArray);
    }

    private static void findSubArray1(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += intArray[k];
                }
                System.out.println(sum);
            }
        }
    }

    private static void findSubArray2(int[] intArray) {

    }
}
