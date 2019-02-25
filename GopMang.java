package SS2BT3;

public class GopMang {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr3[] = gopMang(arr1,arr2);
        for (int i = 0 ; i < arr3.length ; i ++) {
            System.out.print(arr3[i] +" ");
        }
    }
    static int[] gopMang(int mang1[] , int mang2[]) {
        int mang3[] = new int[mang1.length + mang2.length];
        for (int i = 0 ; i < mang1.length ; i++ ) {
            mang3[i] = mang1[i];
        }
        for (int i = 0 , j = mang1.length; i < mang2.length ; i++) {
            mang3[j] = mang2[i];
            j++;
        }
        return mang3;
    }
}
