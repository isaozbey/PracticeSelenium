package com.Ozbey.utilities;

import org.testng.annotations.Test;

public class shortest {

    @Test
    public void test1(){
       String [] strs = new String[]{"flower","flow","flight"};

        longestCommonPrefix(strs);
    }



    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        if (min==0) {
            return "";
        }

        for (int i=0; i<strs.length;i++) {

            if (strs[i].length()<min) {
                min=strs[i].length();
            }

        }
        String result="";
       int x=0;
        for (int k=0; k<min;k++) {

            if ((strs[x].charAt(k)==strs[x+1].charAt(k)) && strs[x].charAt(k)==strs[x+2].charAt(k)) {
              result+=""+strs[k].charAt(k);
            }

        }


        return result;

    }
}
