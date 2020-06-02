import algs4.StdOut;
import algs4.WeightedQuickUnionUF;

public class Percolation{
    private boolean [][] grid;
    private int grid_size;
    private int virtual_top=0;
    private int virtual_bottom;
    private int open_sites;
    private WeightedQuickUnionUF uf;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int N){
        if (n<=0){throw new IllegalArgumentException("N must be > 0");}
        grid_size=n;
        grid = new boolean [grid_size][grid_size];
        uf=new WeightedQuickUnion(N*N+2)
        virtual_bottom=(N*N)+1;
        open_sites=0;    
}

    // Test: open site (row, col) if it is not open already
    public void open(int row, int col) {
        grid[i-1][j-1]=true;

        if (i==1){
            uf.union(encoded_index(row,col),virtual_top);
        }

        if (i==grid_size){
            uf.union(encoded_index(row,col),virtual_botom);
        }

        if ()


}
    //This medthod encodes the column and row(00,01,02....grid_size grid_size) in the matrix to a simple number from 1 to grid_size//
    private int encoded_index(int row, int col){
        return (grid_size*(i-1))+j
    } 



}