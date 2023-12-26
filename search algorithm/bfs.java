package dpGraphs;

import java.util.*;

public class bfs {
	public static void main(String args[]) {
	Scanner o=new Scanner(System.in);
	System.out.print("enter number of nodes:");
	int n=o.nextInt();
	System.out.print("enter number of edges:");
	int m=o.nextInt();
	ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
	for(int i=0;i<=m;i++) {
		adj.add(new ArrayList<Integer>());
	}
	System.out.println("enter adjacent vertices:");
	for(int i=0;i<m;i++) {
		int u=o.nextInt();
		int v=o.nextInt();
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	bfs1(1,n,adj);
	o.close();
	}
	public static void bfs1(int start,int n,ArrayList<ArrayList<Integer>>adj) {
		boolean visit[]=new boolean[n+1];
		Queue<Integer>q=new LinkedList<>();
		q.add(start);
		visit[start]=true;
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			for(int i : adj.get(node)) {
				if(!visit[i]) {
					q.add(i);
					visit[i]=true;
				}
			}
		}
	}
}
