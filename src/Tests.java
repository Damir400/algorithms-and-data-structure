import solutions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Tests {

public static void merge3(int[] nums1, int m, int[] nums2, int n) {
    int count = 0;
    int j = m-1;

    if(n==0){
        return;
    }
    if(m==0){
        for (int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }
        return;
    }
    for (int i = nums2.length-1; i>=0  ; i--) {
        if(nums1[j]<=nums2[i]){
            nums1[nums1.length-1-count] = nums2[i];
            count++;
            continue;
        }
        while (j>=0 && nums1[j]>nums2[i]){
            nums1[nums1.length-1-count] = nums1[j];
            count++;
            j--;
        }

        while(j==-1 && count<= nums1.length-1){
            nums1[nums1.length-1-count] = nums2[i];
            count++;
            i--;
        }
        if (j>=0 && nums1[j]<nums2[i]) {
            nums1[nums1.length - 1 - count] = nums2[i];
            count++;
            continue;
        }
        if(count<nums1.length-1 && nums1[j]==nums2[i]){
            nums1[nums1.length-1-count]= nums1[j];
            nums1[nums1.length-1-count -1]=nums2[i];
            count++;
            continue;
        }
    }
}
    public static void main(String[] args) {
//        new Task13().test();
//        new Task1().test();
//        new Task9().test();
//        new Task14().test();
//        new Task20().test();
//        new Task26().test();
//        new Task27().test();
//        new Task35().test();
//        new Task58().test();
//        new Task66().test();
//        new Task67().test();
//        new Task69().test();
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{1,2,3};
        int n = 3;
//        merge2(nums1,nums2);
        merge3(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}

