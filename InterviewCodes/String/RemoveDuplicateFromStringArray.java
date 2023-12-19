package InterviewCodes.String;

import java.util.ArrayList;

public class RemoveDuplicateFromStringArray {
    public static void main(String[] args) {
        String arr[]={"bat","cat","null","cheat","null"};
        ArrayList<String> list=new ArrayList();
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
//        System.out.println(list);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i].equals(arr[j])){
                    list.remove(arr[i]);
                }
            }
        }
        System.out.println(list);

//        remove specific element from array using arraylist
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=="null"){
                list.remove(arr[i]);
            }
        }
        System.out.println(list);
    }
}
