public class QuickFind{
    private int [] id;

    public QuickFind(int N){
        id = new int[N];
        for (int i=0;i<N;i++){
            id[i]=i;
        }
    }

    public boolean Connected(int p, int q){
        return (id[p]==id[q]);
    }

    public void Union(int p, int q){
        int pid=id[p];
        int qid=id[q];
        for (int i=0; i<id.length;i++){
            if (id[i]==pid){
                id[i]=qid;
            }
        }
    }
    public static void main(String[] args){
        QuickFind F =new QuickFind(10);
        F.Union(5,6);
        F.Union(7,8);
        System.out.println(F.Connected(5,6));
    }


}