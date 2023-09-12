package org.string;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "AABCDBE";
        findFirstNonRepeatedCharacter(str);
    }

    private static void findFirstNonRepeatedCharacter(String str) {
        char []arr = str.toCharArray();
        for (int i=0;i<arr.length;i++){
            boolean unique = true;
            for (int j=0;j<arr.length;j++){
                if (i!=j && arr[i]==arr[j]){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
