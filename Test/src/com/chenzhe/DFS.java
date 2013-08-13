package com.chenzhe;

import java.util.Stack;

public class DFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void dfsInrecur(char[][] board){
		if(board == null  || board.length == 0){
			return;
		}
		int[][] found  = new int[board.length][board[0].length];
		
		for(int i = 0;i<board.length;i++){
			found[0][i] = 1;
			found[board.length-1][i] = 1;
		}
		
		for(int i = 0;i<board[0].length;i++){
			found[i][0] = 1;
			found[i][board[0].length-1] = 1;
		}
		
		Stack stack = new Stack();
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board[0].length;j++){
				if(found[i][j] == 0){
					
				}
			}
		}
	}
}
