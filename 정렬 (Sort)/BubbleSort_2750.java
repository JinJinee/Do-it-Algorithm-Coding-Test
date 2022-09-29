package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort_2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				// 인접 요소와 비교, swap
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
