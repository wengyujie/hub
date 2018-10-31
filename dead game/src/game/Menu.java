package game;

import java.util.Random;

public class Menu {
	public static void main(String[] args){
		boolean ending = false;
		int[][] G=new int[graph.wild][graph.height];
		graph g=new graph();
		g.Init();
		g.OutputGra();
		while(ending==false) {
			//System.out.print("\n\n\n\n\n\n\n\n\n\n");
			for(int i=0;i<g.wild;i++) {
				for(int j=0;j<g.height;j++) {
					g.Judge(i,j,G);							
				}				
			}
			g.UpdateGra(G);
			g.OutputGra();
		}
	
}
}