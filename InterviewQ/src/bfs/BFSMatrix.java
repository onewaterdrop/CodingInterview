package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.Point;

public class BFSMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int[][] arr = { { 0, 0, 0 }, { 0, 0, 1 }, { 1, 0, 1 } };

	Set<Point> settledNodes = new HashSet<Point>();
	Set<Point> unSettledNodes = new HashSet<Point>();
	Map<Point, Integer> distance = new HashMap<Point, Integer>();
	Map<Point, Point> predecessors = new HashMap<Point, Point>();
	Boolean[][] visited = new Boolean[arr[0].length][arr.length];	
	int[][] dis = new int[arr[0].length][arr.length];
	
	
	int getClosestDistance(int[][] arr) {
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				dis[i][j] = Integer.MAX_VALUE;
				if(arr[i][j]==0)unSettledNodes.add(new Point(i,j));
			}
		}
		
		dis[0][0]=0;
		
		
		
		return 1;

	}
	
	int shortestDistance(Point s,Point t){
		if(s.equals(t))return 0;
		if(arr[t.x][t.y]==1)return Integer.MAX_VALUE;
		if(s.x+1==t.x&&s.y==t.y){return 1;}
		if(s.y+1==t.y&&s.x==t.x){return 1;}		
		
		int min = Integer.MAX_VALUE;
		for(Point m : getNeighbour(s)){
			if(unSettledNodes.contains(m)){
				int d = 1+shortestDistance(m,t);
				min = Math.min(d, min);
			}
		}
		return min;
	}
	
	private List<Point> getNeighbour(Point s) {
		List<Point> unvisited = new ArrayList<>();
		if(arr[s.x+1][s.y]==0)unvisited.add(new Point(s.x+1,s.y));
		if(arr[s.x][s.y+1]==0)unvisited.add(new Point(s.x,s.y+1));
		if(arr[s.x-1][s.y]==0)unvisited.add(new Point(s.x-1,s.y));
		if(arr[s.x][s.y-1]==0)unvisited.add(new Point(s.x,s.y-1));
		return unvisited;
	}

//	public void execute(Point source) {
//
//		distance.put(source, 0);
//		unSettledNodes.add(source);
//		while (unSettledNodes.size() > 0) {
////			Point node = getMinimum(unSettledNodes);
//			settledNodes.add(node);
//			unSettledNodes.remove(node);
////			findMinimalDistances(node);
//		}
//	}





	private Point getMinimum(Set<Point> Pointes) {
		Point minimum = null;
		for (Point Point : Pointes) {
			if (minimum == null) {
				minimum = Point;
			} else {
				if (getShortestDistance(Point) < getShortestDistance(minimum)) {
					minimum = Point;
				}
			}
		}
		return minimum;
	}

	private boolean isSettled(Point Point) {
		return settledNodes.contains(Point);
	}

	private int getShortestDistance(Point destination) {
		Integer d = distance.get(destination);
		if (d == null) {
			return Integer.MAX_VALUE;
		} else {
			return d;
		}
	}

}
