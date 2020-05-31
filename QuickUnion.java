public class QuickUnion{
    private int[] id;

    public int[] QuickUnionQU(int N){
        for (int i=0;i<N;i++){
            id[i]=i;
        }
        return id;
    }
    private int root(int i){
        while(i!=id[i]){
            i=id[i];
        }
        return i;
    }

    public boolean Connected(int p, int q){
        return (root(p)==root(q));
    }

    public void Union(int p, int q){
        int i =root(p);
        int j =root(q);
        id[i]=j;
    }

public static void main(String[] args){
    QuickUnion U =new QuickUnion();
    U.QuickUnionQU(10);
    U.Union(5,6);
    U.Union(7,8);
    System.out.println(U.Connected(5,6));

}
}