package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색 {

    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] bool;
    static List<Integer> visit = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드 수
        int m = Integer.parseInt(st.nextToken()); // 간선 수
        int startNumber = Integer.parseInt(st.nextToken()); // 시작 노드

        bool = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        // 간선 정보 입력받기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        // 각 노드의 연결 리스트를 오름차순으로 정렬
        for (int i = 0; i <= n; i++) {
            Collections.sort(list.get(i));
        }

        // BFS 실행
        bfs(startNumber);

        // 방문한 노드 출력
        if(!visit.isEmpty())
			for (int node : visit) {
				System.out.print(node + " ");
			}
		for (int i = 1; i <= n; i++) {
			if (!visit.contains(i)) {
				System.out.println("\n방문하지 못한 노드: " + i);
			}
		}
	}

    private static void bfs(int startNumber) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNumber);
        bool[startNumber] = true;

        // BFS 탐색
        while (!q.isEmpty()) {
            int node = q.poll();
            visit.add(node);

            // 현재 노드와 연결된 노드 탐색
            for (int nextNode : list.get(node)) {
                if (!bool[nextNode]) {
                    q.offer(nextNode);
                    bool[nextNode] = true;
                }
            }
        }
    }
}
