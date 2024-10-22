package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class 깊이우선탐색 {

	static List<List<Integer>> list = new ArrayList<>();
	static boolean[] bool;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int startNumber = Integer.parseInt(st.nextToken());
		
		
		bool = new boolean[n+1];
		
		//초기화해주기
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		
		
		for (int i = 0; i < m; i++) {
			st =new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list.get(u).add(v);
			list.get(v).add(u);
			//안에 값담기
		}
		
		//리스트 안 리스트들을 오름차순으로 정렬
		for (int i = 0; i <= n; i++) {
			Collections.sort(list.get(i));
		}
		dfs(startNumber);
		
		for (int i = 1; i <= n; i++) {
			if (bool[i]) {
				System.out.println(i +" ");
			}else {
				System.out.println("0");
			}
		}
	}
	static StringBuilder sb = new StringBuilder();
	private static void dfs(int st) {
		bool[st] = true;//현재 st노드의 true방문했다고 표시
		for (int nextnode : list.get(st)) {//가
			if (bool[nextnode] == false) {
				dfs(nextnode);//방문하지 않은 노드의 대해서 dfs를 호출
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
