package features;

import cstad.Products;

import java.util.List;
import java.util.Scanner;

public class SetRow {
    public static int setRow(List<Products> products, int rowsPerPage) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter number of rows you want to display : ");
            int numberOfRows = Integer.parseInt(input.nextLine());
            if (numberOfRows >0 && numberOfRows <= products.size()){
                return numberOfRows;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rowsPerPage;
    }
}
