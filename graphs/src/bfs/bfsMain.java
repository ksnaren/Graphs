package bfs;

import java.util.*;

public class bfsMain {

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
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0] = 1;
		while (!q.isEmpty()) {
			int node = q.poll();
			for (int adjacentNodes : al.get(node)) {
				if (visited[adjacentNodes] == 0) {
					q.add(adjacentNodes);
					visited[adjacentNodes] = 1;
					parent[adjacentNodes] = node;
				}
			}

		}

		for (int j : parent)
			System.out.println(j);

	}
}
