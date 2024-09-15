public class Main {
	public static void main(String[] args) {
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

	System.out.printf( "Polygon 1 has \n", regularPolygon1.getPerimeter(), " as the Perimeter. And ",regularPolygon1.getArea() ,"as the Area");
    System.out.printf( "Polygon 2 has \n", regularPolygon2.getPerimeter(), " as the Perimeter. And ",regularPolygon2.getArea() ,"as the Area");
	System.out.printf( "Polygon 3 has \n", regularPolygon3.getPerimeter(), " as the Perimeter. And ",regularPolygon3.getArea() ,"as the Area");
    }
}