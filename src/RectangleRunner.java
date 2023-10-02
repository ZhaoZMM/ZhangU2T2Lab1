public class RectangleRunner {
    public static void main(String [] args){
        Rectangle plot1 = new Rectangle(150, 200);
        plot1.setWidth(75);
        Rectangle plot2 = new Rectangle(125);
        plot2.setWidth(75);
        plot2.setLength(75);
        Rectangle plot3 = new Rectangle();
        plot3.setWidth(75);
        int totalArea = (24375-plot2.calculateArea()-plot3.calculateArea())/75;
        plot1.setLength(totalArea);
        System.out.println("The area of plot 1 is: "+plot1.calculateArea());
        System.out.println("The area of plot 2 is: "+plot2.calculateArea());
        System.out.println("The area of plot 3 is: "+plot3.calculateArea());
    }
}
