package solutions;

public class Task14 {
    public static String longestCommonPrefix(String[] strs) {
        int q = 1;
        int lengthWord = 1000;
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            if(lengthWord>strs[i].length()){
                lengthWord = strs[i].length();
            }
        }
        for (int i = 0; i < lengthWord; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[0].substring(i,q).equals(strs[j].substring(i,q))){
                }
                else {
                    return res;
                }
            }
            res = strs[0].substring(0,q);
            q++;
        }
        return res;
    }
    public void test() {
        String[] data = new String[3];
        data[0] = "flower";
        data[1] = "flow";
        data[2] = "flight";
        System.out.println(longestCommonPrefix(data));
    }


}
