package Lec52;
import java.util.*;

public class Cycle_In_Graph {
	HashMap<Integer, List<Integer>> map;

	public Cycle_In_Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {// v==9 0 to 8
			map.put(i, new ArrayList<>());
		}
	}

	public void AddEdge(int v1, int v2) {
		map.get(v1).add(v2);

	}

	public int[] Indegree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1)) {
				in[v2]++;// in[v2]= in[v2]+1;
			}
		}
		return in;
	}

	public boolean IsCycle() {
		int[] in = Indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c=0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c!=map.size();
	}

	public static void main(String[] args) {
		Cycle_In_Graph t = new Cycle_In_Graph(9);
		t.AddEdge(0, 2);
		t.AddEdge(0, 1);
		t.AddEdge(0, 4);
		t.AddEdge(1, 2);
		t.AddEdge(2, 1);// cycle
		t.AddEdge(4, 2);
		t.AddEdge(4, 3);
		t.AddEdge(4, 5);
		t.AddEdge(8, 4);
		t.AddEdge(3, 5);
		t.AddEdge(5, 6);
		t.AddEdge(6, 7);
		System.out.println(t.IsCycle());// cycle hai to return true otherwise false krega
	}
}


