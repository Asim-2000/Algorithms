import algs4.StdOut;
import algs4.WeightedQuickUnionUF;

public class Percolation{
    private boolean [][] grid;
    private int grid_size;
    private int grid_squared;
    private int virtual_top;
    private int virtual_bottom;
    private int open_sites;
    private WeightedQuickUnionUF wqfGrid;
    private WeightedQuickUnionUF wqfFull;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if (n<=0){throw new IllegalArgumentException("N must be > 0");}
        grid_size=n;
        grid_squared=n*n;
        grid = new boolean [grid_size][grid_size];
        wqfGrid = new WeightedQuickUnionUF(grid_squared + 2); //including virtual top and bottom//
        wqfFull = new WeightedQuickUnionUF(grid_squared + 1); //including virtual top//
        virtual_bottom=grid_squared + 1;
        virtual_top=grid_squared;
        open_sites=0;    
}

    // Test: open site (row, col) if it is not open already
    public void open(int row, int col) {
        


    }


}