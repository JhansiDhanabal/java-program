package dpGraphs;

import java.util.ArrayList;
import java.util.Scanner;

public class dfs {

	public static void main(String[] args) {
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
		boolean visit[]=new boolean[n+1];
		dfs1(1,visit,adj);
		o.close();
		}
	public static void dfs1(int start,boolean visit[],ArrayList<ArrayList<Integer>>adj) {
		System.out.print(start+" ");
		visit[start]=true;
		for(int d:adj.get(start)) {
			if(!visit[d]) {
				dfs1(d,visit,adj);
			}
		}
	}
}
