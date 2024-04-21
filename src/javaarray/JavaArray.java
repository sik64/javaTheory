package javaarray;

import java.lang.reflect.Array;
import java.util.Arrays;
public class JavaArray {
    static void printArr(int[] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.print("\n");
    }
    static void printArr(String[] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    static void prind2dArr(int[][] arr2d){
        for( int[] arr1d:arr2d){
            for(int element:arr1d){
                System.out.printf("%d ",element);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        int[] arr = {1,2,3,4,5};
        int[] newarr;
        newarr = new int[10]; // 메모리크기가 지정된 배열의 경우 인스턴스여야 한다.
        int[] brandnewarr = new int[20];

        String[] strarr ={"aaa","bbb","ccc"};
        printArr(strarr);
        printArr(arr);

        // 무명 배열의 사용
        printArr(new int[] {7,6,5,4,3,2});

        // for each 루프
        for(int num:arr){
            System.out.println(num);
        }
        // 배열의 복사
        int[] arrbefore = new int[] {3,4,5,6}; // 정석 초기화
        //int[] arrbefore = {3,4,5,6}; // 허용 초기화
        int[] arrcopyed = arrbefore;
        printArr(arrcopyed);
        arrbefore = new int[] {1,2};
        printArr(arrcopyed);

        int[] arrcopyed2 = Arrays.copyOf(arrbefore,arrbefore.length);
        printArr(arrcopyed2);
        if (strarr[0].equals("aaa")){
            System.out.println("Equals");
        }
        int[] arr3 = new int[] {1,4,6,5,3,2};

        Arrays.sort(arr3); // void
        printArr(arr3);

        int[][] arr2d = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        prind2dArr(arr2d);

        int[] arr4 = new int[5];
        arr4 =new int[] {0};
        printArr(arr4);
        arr4 = new int[] {0,1,2,3,4,5};
        printArr(arr4);

        String str = "helloString";
        String str2 = new String("HelloString2");
        System.out.println(str);
        System.out.println(str2);

        String nums = "123";
        int realnum = Integer.parseInt(nums);
        System.out.println(realnum+1);

    }
}
