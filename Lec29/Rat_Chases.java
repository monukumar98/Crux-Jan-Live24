package Lec29;

import java.util.Scanner;

public class Rat_Chases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {// row
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}

		}
		int[][] ans = new int[n][m];
		Maze_Path_2(maze, 0, 0, ans);
		if (c == 0) {
			System.out.println("NO PATH FOUND");
		}
	}

	static int c = 0;

	public static void Maze_Path_2(char[][] maze, int cr, int cc, int[][] ans) {

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			Display(ans);
//			maze[cr][cc] = 'O';// add ye hoga multiple path ke liye
//			ans[cr][cc] = 0;
			c++;
			return;
		}
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		for (int i = 0; i < dc.length; i++) {
			Maze_Path_2(maze, cr + dr[i], cc + dc[i], ans);
		}
		
//		Maze_Path_2(maze, cr - 1, cc, ans);// up
//		Maze_Path_2(maze, cr + 1, cc, ans);// down
//		Maze_Path_2(maze, cr, cc - 1, ans);// left
//		Maze_Path_2(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
