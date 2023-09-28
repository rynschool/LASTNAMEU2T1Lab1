public class RectangleRunner {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(150,200);
        Rectangle rect2 = new Rectangle(125);
        Rectangle rect3 = new Rectangle();

        rect1.setWidth(75);
        rect2.setWidth(75);
        rect2.setLength(75);
        rect3.setWidth(75);

        int areaRect1 = rect1.getLength() * rect1.getWidth();
        int areaRect2 = rect2.getLength() * rect2.getWidth();
        int areaRect3 = rect3.getLength() * rect3.getWidth();

        System.out.println("Plot 1 length: " + rect1.getLength());
        System.out.println("Plot 1 width: " + rect1.getWidth());
        System.out.println("Plot 1 area: " + areaRect1);
        System.out.println(" ");
        System.out.println("Plot 2 length: " + rect2.getLength());
        System.out.println("Plot 2 width: " + rect2.getWidth());
        System.out.println("Plot 2 area: " + areaRect2);
        System.out.println(" ");
        System.out.println("Plot 3 length: " + rect3.getLength());
        System.out.println("Plot 3 width: " + rect3.getWidth());
        System.out.println("Plot 3 area: " + areaRect3);
        System.out.println(" ");
        System.out.println("These three plots require " + (areaRect1 + areaRect2 + areaRect3) + " square feet of seed");
    }
}
