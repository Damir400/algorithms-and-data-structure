public class Main1 {
    public static int romanToInt(String s) {
        int number = 0;
        String[] consts = new String[15];
        consts[0] = "M";
        consts[1] = "CM";
        consts[2] = "D";
        consts[3] = "CD";
        consts[4] = "C";
        consts[5] = "XC";
        consts[6] = "L";
        consts[7] = "XL";
        consts[8] = "X";
        consts[9] = "IX";
        consts[10] = "V";
        consts[11] = "IV";
        consts[12] = "III";
        consts[13] = "II";
        consts[14] = "I";


        int[] const1 = new int[15];
        const1[0] = 1000;
        const1[1] = 900;
        const1[2] = 500;
        const1[3] = 400;
        const1[4] = 100;
        const1[5] = 90;
        const1[6] = 50;
        const1[7] = 40;
        const1[8] = 10;
        const1[9] = 9;
        const1[10] = 5;
        const1[11] = 4;
        const1[12] = 3;
        const1[13] = 2;
        const1[14] = 1;

        for (int i = 0; i < consts.length; i++) {
            while (s.startsWith(consts[i])) {
                String qwe = s.substring(0, consts[i].length());
                number +=const1[i];
                s = s.substring(consts[i].length(),s.length());
            }

        }
        return number;
    }
    public static void main(String[] args) {

        String s = "MCMXCIII";
        System.out.println(romanToInt(s));
    }
}

