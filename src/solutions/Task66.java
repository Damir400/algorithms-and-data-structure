package solutions;

public class Task66 {
    public int[] plusOne(int[] digits) {
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==9){
                number++;
            }
        }
        if(number < digits.length){
            return plusOneInMas(digits);
        }
        int[] gainmas = new int[digits.length+1];
        if(number== digits.length){
            for (int i = 0; i < digits.length; i++) {
                gainmas[i+1]=digits[i];
            }
        }


        return plusOneInMas(gainmas);
    }
    public static int[] plusOneInMas(int[] mas){
        for (int i = mas.length-1; i >= 0; i--) {
            if(mas[i]==9){
                mas[i] = 0;
            } else if (mas[i]<9) {
                mas[i]= mas[i]+1;
                return mas;
            }
        }
        return mas;
    }

    public void test() {
        int[] digit = new int[]{8,9,8,9};
        for (int i : plusOne(digit)){
            System.out.println(i);
        }
    }
}
