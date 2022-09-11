package solutions;

public class Task58 {
    public int lengthOfLastWord(String s) {
        String[] mas = s.split(" ");
        return mas[mas.length-1].length();
    }

    public void test() {
        String s = " qweqwe qwdq q qwfqwf wfqwf ";
        System.out.println(lengthOfLastWord(s));
    }
}
