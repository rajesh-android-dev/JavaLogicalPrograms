package zoho_problems;

import java.util.Scanner;

public class ZoNextGreatestElement {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int[] arr = new int[x];
            for(int j = 0; j < x; j++){
                arr[j] = sc.nextInt();
            }
            generateGreaterElmt(arr);
        }
    }
    public static void generateGreaterElmt(int[] arr){
        int[] dupArr = new int[arr.length];
        for(int i = 0;i < dupArr.length;i++){
            dupArr[i] = Integer.MIN_VALUE;
        }
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(arr[j]>val){
                    if(dupArr[i] == Integer.MIN_VALUE)
                        dupArr[i] = arr[j];
                    else
                        dupArr[i] = Math.min(dupArr[i],arr[j]);
                }
            }
        }
        String[] resultArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            int m = dupArr[i];
            if(m == Integer.MIN_VALUE) resultArr[i] = "_";
            else resultArr[i] = String.valueOf(m);
        }
        for(String c : resultArr)
            System.out.print(c+" ");
        System.out.println("");

    }

}
