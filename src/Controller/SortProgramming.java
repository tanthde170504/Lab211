
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SortProgramming extends Menu<String> {

    static String[] mc = {"Sort", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }

    @Override
    public void executed(int n) {
            switch (n) {
                case 1:
                    System.out.println("Unsorted array: ");
                    library.display(array);
                    sort();
                    break;
                case 2:
                    System.out.println("Exit programming");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        
    }

    public void sort() {
        final String[] mcSort = {"Buddle Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void executed(int n) {
                
                switch (n) {
                    case 1:
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Exit sort");
                        break;
                        
                }
            }

        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
