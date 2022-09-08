package solutions;

public class Task20 {
    public boolean checking(String s) {
        char[] symbols = new char[6];
        symbols[0] = '(';
        symbols[1] = ')';
        symbols[2] = '[';
        symbols[3] = ']';
        symbols[4] = '{';
        symbols[5] = '}';

        if(s.length()%2!=0){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= symbols.length; j=j+2) {
                if(i+1>=s.length()){
                    return false;
                }
                if(s.charAt(i)==symbols[j-1]  && s.charAt(i+1)==symbols[j]){
                    s = s.substring(0,i) + s.substring(i+2,s.length());
                    if(checking(s)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void test() {
        String s = "{(())[]}";
        System.out.println(checking(s));
    }
}
