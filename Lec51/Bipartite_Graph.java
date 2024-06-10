package Lec51;

import java.util.*;

public class Bipartite_Graph {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();

			for (int i = 0; i < graph.length; i++) {// vtx
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					BipartitePair rp = q.poll();
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {
							return false;
						} else {
							continue;
						}
					}
					visited.put(rp.vtx, rp.dis);
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							BipartitePair bp = new BipartitePair(nbrs, rp.dis + 1);
							q.add(bp);
						}
					}

				}

			}
			return true;

		}

		class BipartitePair {
			int vtx;
			int dis;

			public BipartitePair(int vtx, int dis) {
				// TODO Auto-generated constructor stub
				this.vtx = vtx;
				this.dis = dis;
			}
		}
	}

}
