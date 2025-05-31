
class Javap {

    public static void main(String[] args) {
        int[] arr = {32, 87, 13, 89, 125, 73, 20, 48, 65, 27};
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                continue;
            }
            countEven++;
        }
        System.out.println("No : of even numbers are = " + countEven);

        {
            int testScore = 74;
            char grade = 0;
            if (testScore >= 90) {
                grade = 'A'; 
            }else if (testScore >= 75) {
                grade = 'B'; 
            }else if (testScore >= 60) {
                grade = 'c'; 
            }else if (testScore >= 50) {
                grade = 'D';
            }
            System.out.println("Grade = " + grade);
        }
    }
}
