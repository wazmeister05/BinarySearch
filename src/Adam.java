public class Adam {

    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        int[] list = {1,2,3,4,5,6,7,8,9,10};

        long start = System.nanoTime();
        System.out.println("Value is at index: " + bs.binarySearch(list, 8));
        System.out.println("BinarySearch took " + (System.nanoTime() - start) + " ns");
    }

}
