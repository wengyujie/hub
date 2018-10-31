package game;
import java.util.*;

public class graph {
	public static final int height=10;
	public static final int wild=10;
	public static final int number=40;
	private int[][] gra=new int[wild][height];//'1'代表存活，'2'代表死亡
	public int[][] Return() {
		return gra;
	}
	public void Init() {
		Random ran0 = new Random(height*wild);
		int n,r,c;
		for(int i = 0;i <number; i++) {
			n = ran0.nextInt(height*wild);
			r = n / height;
			c = n % height;
			gra[r][c] = 1;
		}
		/*for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(gra[j][i]);				
			}	
			System.out.println();
		}*/
	}

	
	public void Judge(int i,int j,int[][] G) {
		int num=0;
		if((i-1)>=0&&(j-1)>=0&&(i-1)<wild&&(j-1)<height&&(gra[i-1][j-1]==1)) {
			num++;
		}
		if((i)>=0&&(j-1)>=0&&(i)<wild&&(j-1)<height&&(gra[i][j-1]==1)) {
			num++;
		}
		if((i+1)>=0&&(j-1)>=0&&(i+1)<wild&&(j-1)<height&&(gra[i+1][j-1]==1)) {
			num++;
		}
		if((i-1)>=0&&(j)>=0&&(i-1)<wild&&(j)<height&&(gra[i-1][j]==1)) {
			num++;
		}
		if((i+1)>=0&&(j)>=0&&(i+1)<wild&&(j)<height&&(gra[i+1][j]==1)) {
			num++;
		}
		if((i-1)>=0&&(j+1)>=0&&(i-1)<wild&&(j+1)<height&&(gra[i-1][j+1]==1)) {
			num++;
		}
		if((i)>=0&&(j+1)>=0&&(i)<wild&&(j+1)<height&&(gra[i][j+1]==1)) {
			num++;
		}
		if((i+1)>=0&&(j+1)>=0&&(i+1)<wild&&(j+1)<height&&(gra[i+1][j+1]==1)) {
			num++;
		}
		if(num>=4) {
			G[i][j]=0;
		}
		if(num==3) {
			G[i][j]=1;
		}
		if(num<3) {
		    G[i][j]=gra[i][j];
		}
	}
	public void UpdateGra(int[][] g) {
		for(int i=0;i<wild;i++)
			for(int j=0;j<height;j++)
				gra[i][j]=g[i][j];
	}
	public void OutputGra() {
		for(int i=0;i<wild;i++) {
			for(int j=0;j<height;j++) {
				System.out.print(gra[i][j]);				
			}	
			System.out.println();
		}
		
	}
	public void insert(int[][] g) {
		for(int i=0;i<wild;i++)
			for(int j=0;j<height;j++)
				g[i][j]=gra[i][j];
	}

}
