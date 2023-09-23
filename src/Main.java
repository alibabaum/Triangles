import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = inScanner.nextInt();
        while (size <= 0 || size >= 50){
            System.out.println("Please enter a number between 1-50. Enter size:");
            size = inScanner.nextInt();
        }
        System.out.println("Enter fill:");
        char charFill = inScanner.next().charAt(0);
        int height = size;

        makeTriangle(height,size,charFill);

        System.out.println("Wanna make another triangle? (y/n)");
        String moreTriangles = inScanner.next();

        while (moreTriangles.equals("y")){
            System.out.println("Enter size:");
            size = inScanner.nextInt();
            while (size <= 0 || size >= 50){
                System.out.println("Please enter a number between 1-50. Enter size:");
                size = inScanner.nextInt();
            }
            System.out.println("Enter fill:");
            charFill = inScanner.next().charAt(0);
            height = size;
            makeTriangle(height,size,charFill);
            System.out.println("Wanna make another triangle? (y/n)");
            moreTriangles = inScanner.next();
        } if (moreTriangles.equals("n")) {
            System.out.println("K. Bye.");
        }
    }
    public static void makeTriangle(int height, int size, char charFill){
    for (int rows = 0; rows < height; rows++) {
        //inner loop always executes first. I chose not to have anything here so the line break would execute after the charQuanitity loops execute
        for (int indent = 1; indent < size; indent++)
        {
            System.out.print(" ");
        }
        for (int charQuantity = 1; charQuantity <= rows; charQuantity++)
        {
            System.out.print(charFill + " ");
        }
        System.out.print(charFill);
        System.out.println(" ");
        size = size - 1;
    }
}

}