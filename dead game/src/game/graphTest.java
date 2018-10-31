package game;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class graphTest {
private static graph gra=new graph();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int[][] G=new int[gra.wild][gra.height];
		gra.UpdateGra(G);
		System.out.println("already!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	 @Ignore("Init() Not yet implemented") 
	@Test
	public void testInit() {
		fail("Not yet implemented");
	}
	 @Test
		public void testUpdateGra() {
		 int[][] G= {
					{1,1,0,0,0,0,0,0,0,0},
					{1,1,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0}
			};
		 gra.UpdateGra(G);
		 int[][] testnum=gra.Return();
		 assertEquals(G, testnum);
			//fail("Not yet implemented");
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testJudge() {
		int[][] G= {
				{1,1,0,0,0,0,0,0,0,0},
				{1,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		int[][] result= {
				{1,1,0,0,0,0,0,0,0,0},
				{1,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		gra.UpdateGra(G);
		for(int i=0;i<gra.wild;i++)
			for(int j=0;j<gra.height;j++)
				gra.Judge(i, j, G);
			assertEquals(result, G);

			//fail("Not yet implemented");
	}

	
	@Ignore("OutputGra() Not yet implemented") 
	@Test
	public void testOutputGra() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		gra.Init();
		int[][] G=new int[gra.wild][gra.height];
		gra.insert(G);
		assertEquals(gra.Return(), G);
		
		//fail("Not yet implemented");
	}

}
