package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by vadim_vil on 03.07.2017.
 */
public class BinPoisk {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[5];
        int i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (i=0; i<5; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            arr[i] = a;
        }
        String s1 = reader.readLine();
        int elt = Integer.parseInt(s1);

        int a = SearchUtils.Search (arr, elt);
       System.out.print(a);
    }
}