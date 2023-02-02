import java.util.Arrays;
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length!=(m+n))
            return;
        for (int i=0; i<n; i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);


    }

    public static void main(String args[]){

        int firstArray[] = new int[6];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        int secondArray[] = new int[3];
        secondArray[0]=2;
        secondArray[1]=5;
        secondArray[2]=6;

        int m1 = 3;
        int n1 = 3;

        int firstArray2[] = new int[1];
        firstArray2[0] = 1;

        int secondArray2[] = new int[1];

        int m2 = 1;
        int n2 = 0;

        int firstArray3[] = new int[1];


        int secondArray3[] = new int[1];
        secondArray3[0] = 1;

        int m3 = 0;
        int n3 = 1;





        System.out.print("The first array is: ");
        for(int i = 0; i< firstArray.length; i++){
            System.out.print(firstArray[i]+",");
        }

        System.out.println();

        System.out.print("The second array is: ");
        for(int i = 0; i< secondArray.length; i++){
            System.out.print(secondArray[i]+",");
        }

        System.out.println();
        System.out.println("The m and n values are "+m1+","+n1);

        merge(firstArray,m1,secondArray,n1);

        System.out.print("The array after merging: ");

        for(int i = 0; i< firstArray.length; i++){
            System.out.print(firstArray[i]+",");
        }

        System.out.println();
        System.out.println();




        System.out.print("The first array is: ");
        for(int i = 0; i< firstArray2.length; i++){
            System.out.print(firstArray2[i]+",");
        }

        System.out.println();

        System.out.print("The second array is: ");
        for(int i = 0; i< secondArray2.length; i++){
            System.out.print(secondArray2[i]+",");
        }

        System.out.println();
        System.out.println("The m and n values are "+m2+","+n2);

        merge(firstArray2,m2,secondArray2,n2);

        System.out.print("The array after merging: ");

        for(int i = 0; i< firstArray2.length; i++){
            System.out.print(firstArray2[i]+",");
        }

        System.out.println();
        System.out.println();

        System.out.print("The first array is: ");
        for(int i = 0; i< firstArray3.length; i++){
            System.out.print(firstArray3[i]+",");
        }

        System.out.println();

        System.out.print("The second array is: ");
        for(int i = 0; i< secondArray3.length; i++){
            System.out.print(secondArray3[i]+",");
        }

        System.out.println();
        System.out.println("The m and n values are "+m3+","+n3);

        merge(firstArray3,m3,secondArray3,n3);

        System.out.print("The array after merging: ");

        for(int i = 0; i< firstArray3.length; i++){
            System.out.print(firstArray3[i]+",");
        }
















    }
}
