package Chapter7;

public class TestColorGrid {

	public static void main(String[] args) {
		//ColorGrid cg=new ColorGrid();
		ColorGrid cg=new ColorGrid("yyyrrrgggbbbyyyrrrgggbbbyyyrrrgggbbb",6,6);
//		cg.display();
		//cg.printGrid();
		cg.paintRegion(0, 0, "b","y");
		cg.display();
		//cg.printGrid();
		//ColorGrid cg=new ColorGrid();
//		cg.printGrid();		

	}

}
