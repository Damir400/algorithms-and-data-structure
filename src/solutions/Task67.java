package solutions;

import java.util.ArrayList;
import java.util.List;

public class Task67 {
    public String addBinary(String a, String b) {
        List<Integer> mas = new ArrayList<>();
        List<Integer> mas1 = new ArrayList<>();
        for (int i = a.length(); i > 0; i--) {
            mas.add(Integer.parseInt(a.substring(i - 1, i)));
        }
        for (int i = b.length(); i > 0; i--) {
            mas1.add(Integer.parseInt(b.substring(i - 1, i)));
        }
        if (mas.size() > mas1.size()) {
            int r = mas1.size();
            for (int i = 0; i < mas.size()-r; i++) {
                mas1.add(0);
            }
            return sumWorker(mas1, mas);
        }
        else if(mas.size() < mas1.size()){
            int r = mas.size();
            for (int i = 0; i < mas1.size()-r; i++) {
                mas.add(0);
            }
            return sumWorker(mas,mas1);
        }
        else {
            return sumWorker(mas,mas1);
        }
    }

    public String sumWorker(List<Integer> list1, List<Integer> list2) {
        int number = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list2.get(i) + list1.get(i) == 1 && number == 0) {
                list2.set(i, 1);
            } else if (list2.get(i) + list1.get(i) == 1 && number == 1) {
                list2.set(i, 0);
            } else if (list2.get(i) + list1.get(i) > 1 && number == 0) {
                list2.set(i, 0);
                number++;
            } else if (list2.get(i) + list1.get(i) > 1 && number == 1) {
                list2.set(i, 1);
            } else if (list2.get(i) + list1.get(i) == 0 && number == 1) {
                list2.set(i, 1);
                number--;
            }
        }
        if (number == 1) {
            list2.add(number);
        }
        StringBuilder result = new StringBuilder(list2.toString());
        String s = result.reverse().toString().replace("[","").replace("]","").replace(",","").replace(" ","");
        return s;
    }

    public void test() {
        String a = "11";
        String b = "111101";
        System.out.println(addBinary(a,b));
    }
}
