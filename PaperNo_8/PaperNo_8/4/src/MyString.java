/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class MyString implements IString {

      public boolean checkPalindrome(String str) {

            char kyTu;
            for (int i = 0; i < str.length(); i++) {
                  kyTu = str.charAt(str.length() - i - 1);
                  if (str.charAt(i) == kyTu) {
                        return true;
                  }
            }
            return false;
      }
       public boolean checkPalindrome1(String str) {

            char kyTu;
            for (int i = 1; i < (str.length() - 1)/2; i++) {
                  kyTu = str.charAt(str.length() - i-1 );
                  if (str.charAt(i) == kyTu) {
                        return true;
                  }
            }
            return false;
      }

      @Override
      public int f1(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                  if (checkPalindrome(str) == true && Character.isDigit(str.charAt(i))) {
                        count++;
                  }
            }
            if (count >= 3) {
                  return count;
            }
            return 0;
      }

      @Override
      public String f2(String str) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
      public static void main(String[] args) {
            MyString mt = new MyString();
            //mt.f1("c121c");
//            if(mt.f1("c121c")==0){
//                  System.out.println("");
//            }else System.out.println(mt.f1("c121c"));
            System.out.println(mt.checkPalindrome("c121c"));
            System.out.println(mt.checkPalindrome1("c1212c"));
            
      }

}
