package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort_1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String n = br.readLine();
		br.close();
		
		// 배열 만들기
		int[] arr = new int[n.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = n.charAt(i) - '0';
		}
		
		// 선택 정렬하기
		for(int i=0; i<arr.length; i++) {
			int max = i;
			
			// i 인덱스부터 최댓값과 인덱스 구하기
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			
			// swap
			int tmp = arr[i];
			arr[i] = arr[max];
			arr[max] = tmp;	
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
	}
}
