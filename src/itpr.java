import java.util.Scanner;

public class itpr {
    public static void main(String[] args) {
        String[] names = new String[3];
        String[] surnames = new String[3];
        int[] ages = new int[3];

        makeArr(names);
        makeArr(surnames);
        makeArr(ages);
        printArr(names);
        printArr(surnames);
        printArr(ages);

        int result = summa(6, 8);
        printArr(result);
        int result_2 = summa(6, 8,4);
        printArr(result_2);

    }
    public static String [] makeArr(String[] arr)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("put" + i + "element");
            arr[i]= in.nextLine();
        }
        return arr;
    }

    public static int [] makeArr(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("put" + i + "element");
            arr[i]= in.nextInt();
        }
        return arr;
    }

    public static int summa(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int summa(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }

    public static void printArr(String[] arr) {
        for (String anArr : arr)
            System.out.println("Name" + anArr);


    }

    public static void printArr(int[] arr) {
        for (Integer anArr : arr)
            System.out.println("Name" + anArr);

    }

    public static void printArr(int word) {
        System.out.println(word);
    }

}
