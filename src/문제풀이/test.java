package 문제풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		Deque<Integer> q = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while (n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));
				//맨뒤에 요소를 추가
				break;
			case "pop":
				//가장 앞에 요소를 삭제하고 원소가 없으면 null을 던짐
				 Integer i = q.poll();
				 if (i == null) {
					sb.append(-1).append('\n');
				}else {
					sb.append(i).append("\n");
				}
				break;
			case "size":
				sb.append(q.size()).append("\n");
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			case "front":
				//peak은 큐에 꺼낼 요소가 없으면 null을 반환
				Integer ii = q.peek();
				if (ii == null) {
					sb.append(-1).append("\n");
				}else {
					sb.append(ii).append("\n");
				}
				break;
			case "back":
				Integer it = q.peekLast();
				if (it == null) {
					sb.append(-1).append("\n");
				}else {
					sb.append(it).append("\n");
				}
				//peeklast는 큐에 꺼낼 요소가 없을때 null을 반환
				break;
			default:
				break;
			}
			
			
		}
		System.out.println(sb);
	}
}
