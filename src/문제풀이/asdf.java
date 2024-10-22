package 문제풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class asdf {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append('<');
		
		while (q.size() > 1) {
			for (int i = 0; i < k-1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(",");
		}
		
		/*
		 * 이거인가?
그니까 k값이 필요한데 돌려야하니까 저 반복문으로 k가 앞이 될때까지 돌려놓고 
반복문을 나오면 어차피 p.poll로 사라지고 sb에 담는거지*/
		
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
	

}
