package 문제풀이;

import java.io.*;
import java.time.Year;
import java.util.*;
public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new ArrayDeque<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
			q.add(Integer.parseInt(st.nextToken()));
		
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(0);//순서대로 검사가 가능한지 검사할때 null값이 나오는걸 방지
        
        int currNumber = 1;//현재 번호
        
        while (true) {
			//한명
        	if (stack.peek() == currNumber) {
				stack.pop();
				currNumber++;
				continue;
			}
        	//줄서는
        	if (!q.isEmpty()) {
				if (q.peek() == currNumber) {
					q.poll();
					currNumber++;
				}else {
					stack.push(q.poll());
				}
			}
        	if (q.isEmpty() && stack.peek() != currNumber) {
				break;
			}
		}
        if (currNumber == n+1) {
			System.out.println("Nice");
		}else {
			System.out.println("Sad");
		}
	}
}