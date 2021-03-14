package PracticeJava;

import org.testng.annotations.Test;

import java.util.Arrays;

public class sortArrays {


    public static void main(String[] args) {
        int [] nums =new int[] {0,0,1,1,1,2,2,3,3,4};


        int index=1;

        for (int i = 0; i <nums.length-1 ; i++) {

            if (nums[i]!=nums[i+1]) {
                nums[index]=nums[i+1];
                index++;//0,
            }

        }

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("index = " + index);

    }

    @Test
    public void test(){
        String haystack="hello";
        String needle="ll";

        if (haystack.length()==0 && needle.length()==0) {
            System.out.println(0);
        }else if (haystack.length()==0 ) {
            System.out.println(-1);
        }else if ( needle.length()==0) {
            System.out.println(0);
        }else if (!haystack.contains(needle)) {
            System.out.println(-1);
        }else if (haystack.contains(needle)) {

            for (int i=0; i<(haystack.length()-needle.length());i++)  {

                if (haystack.substring(i,i+needle.length()).equals(needle)) {
                    System.out.println(i);
                }

            }

        }

    }

    @Test
    public void test1(){
       int [] nums=new int[] {1,3,5,6};
       int target=2;
        System.out.println(searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {

        for (int i=0 ;i<nums.length;i++) {
            if (nums[i]==target) {
                nums[i]=target;
                return i;
            }
        }
        for (int i=0 ;i<nums.length;i++) {
            if (nums[i]>target) {
                nums[i]=target;
                System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
                return i;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return 0;

    }



}
