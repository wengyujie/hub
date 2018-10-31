package game;

import java.awt.Color;

import java.awt.GridLayout;

import java.util.Random;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class gui extends JFrame { 
	JPanel[][] jp=new JPanel[graph.wild][graph.height];
public gui() { 
		for(int i=0;i<graph.wild;i++)
			for(int j=0;j<graph.height;j++)
				jp[i][j]=new JPanel();
		int[][] G=new int[graph.wild][graph.height];
		graph g=new graph();
		g.Init();
		g.insert(G);
		while(true) {
			try {    

				Thread.sleep(1000);  

				 } catch (InterruptedException e) {   

				 e.printStackTrace(); 

				  }  
			for(int i=0;i<graph.wild;i++)
				for(int j=0;j<graph.height;j++)
				{	
					
					if(G[i][j]==1)
						jp[i][j].setBackground(Color.black);
					if(G[i][j]==0)
						jp[i][j].setBackground(Color.white);
					this.add(jp[i][j]);
				}
			this.setLayout(new GridLayout(graph.wild, graph.height)); 
			/*for(int i=0;i<graph.wild;i++)
				for(int j=0;j<graph.height;j++)
					this.add(jp[i][j]);*/
			 this.setSize(400, 400);   

			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

			  this.setVisible(true);  
			for(int i=0;i<graph.wild;i++)
				for(int j=0;j<graph.height;j++)
					g.Judge(i,j,G);	
			g.UpdateGra(G);
					
		}
	}


public static void main(String[] args) {  

new gui(); 

     }

}
