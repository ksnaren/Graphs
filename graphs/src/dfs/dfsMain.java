package dfs;

import java.util.ArrayList;

public class dfsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(2);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(4);
		temp.add(3);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(4);
		temp.add(6);
		temp.add(7);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(4);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(3);
		temp.add(1);
		temp.add(2);
		temp.add(5);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(4);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(2);
		temp.add(7);
		al.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(2);
		temp.add(6);
		al.add(temp);
		int[] visited = new int[al.size()];
		int[] parent = new int[al.size()];
		parent[0] = 0;
		for (int i = 0; i < al.size(); i++) {
			visited[i] = 0;
		}

		parent = dfs(0, visited, al, parent);

		for (int j : parent)
			System.out.println(j);
	}

	public static int[] dfs(int startVertex, int[] visited, ArrayList<ArrayList<Integer>> al, int[] parent) {
		visited[startVertex] = 1;
		for (int adjacentVertices : al.get(startVertex)) {
			if (visited[adjacentVertices] == 0) {
				visited[adjacentVertices] = 1;
				dfs(adjacentVertices, visited, al, parent);
				parent[adjacentVertices] = startVertex;
			}
		}

		return parent;
	}

}
