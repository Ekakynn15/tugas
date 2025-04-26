import java.util.*;

public class CariElemenGanda {
    public static void main(String[] args) {
        // Contoh array 1D
        int[] array1D = {12, 5, 12, 1, 1, 7};
        // Contoh array 2D
        int[][] array2D = {
            {5, 7, 12, 8},
            {9, 10, 12, 11}
        };

        System.out.println("Output 1D:");
        cariElemenGanda1D(array1D);

        System.out.println("\nOutput 2D:");
        cariElemenGanda2D(array2D);
    }

    public static void cariElemenGanda1D(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        int count = 1;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen ganda " + count + ": " + entry.getKey());
                System.out.println("Lokasi: " + entry.getValue());
                count++;
            }
        }
    }

    public static void cariElemenGanda2D(int[][] arr) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.putIfAbsent(arr[i][j], new ArrayList<>());
                map.get(arr[i][j]).add("[" + i + "][" + j + "]");
            }
        }

        int count = 1;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen ganda " + count + ": " + entry.getKey());
                System.out.println("Lokasi: " + entry.getValue());
                count++;
            }
        }
    }
}