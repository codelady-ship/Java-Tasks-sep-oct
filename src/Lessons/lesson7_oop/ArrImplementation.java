package lesson7_oop;

public class ArrImplementation {

    private Object arg;

    //arrayda implementasiya etmek olr
    //int...arg -var args
    public void printArray(int []arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public int[] addOneToEach(int[] arr, int addCount) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + addCount;
        }
        return arr;
    }

    public void loopElemnt(int... arg){
        for (int element : arg) {
            System.out.println(element);
        }
    }
}