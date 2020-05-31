public class QuickUnion{
    private int[] id;

    public void QuickUnionQU(int N){
        for (int i=0;i<N;i++){
            id[i]=i;
        }
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

}