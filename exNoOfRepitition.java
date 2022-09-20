public class exNoOfRepitition {
    static int noOfRepitition(int[] array1) {
        int count = 1;
        for (int i= 1; i < array1.length; i++) {
            if (array1[0] == array1[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 3, 4, 3, 5, 3};
        int rep = noOfRepitition(array);
        System.out.println("No of times " + array[0] + " repeated is " + rep);
    }
}
