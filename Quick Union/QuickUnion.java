public class QuickUnion{
    public int[] id;

    public QuickUnion(int N){
        id=new int[N];
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

public static void main(String[] args){
    QuickUnion U =new QuickUnion(10);
    U.Union(5,6);
    U.Union(7,8);
    System.out.println(U.Connected(5,6));
}
}