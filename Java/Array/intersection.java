import java.util.*;

class intersection
{
  /*  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3, 4, 5};
    int[] arr2 = new int[]{3, 2, 5, 9, 11};
    getIntersection(arr1, arr2);
}

public static Object[] getIntersection(int[] arr1, int[] arr2) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
            }
        }
    }
    return list.toArray();
}
    */

    public static void main(String[] args) {
    int [] arr1 = {1,2,2,2,2,2,2,3,6,6,6,6,6,6,};
    int [] arr2 = {7,5,3,6,6,2,2,3,6,6,6,6,6,6,6,6,};

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    ArrayList result = new ArrayList<>();
    int i =0 ;
    int j =0;
    while(i< arr1.length && j<arr2.length){
    if (arr1[i]>arr2[j]){
        j++;

    }else if (arr1[i]<arr2[j]){
        i++;

    }else {
        result.add(arr1[i]);
        i++;
        j++;
    }
    }
    System.out.println(result);
    }
}