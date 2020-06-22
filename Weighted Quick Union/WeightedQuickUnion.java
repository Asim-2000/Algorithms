public class WeightedQuickUnion{
    private int[] id;
    private int[] size;

    public WeightedQuickUnion(int N){
        id=new int[N];
        for (int i=0;i<N;i++){
            id[i]=i;
        }
        size=new int[N];
        for (int j=0;j<N;j++){
            size[j]=1;
        }
    }

    private int root(int i){
        while(i!=id[i]){
            i=id[i];
        }
        return i;
    }
    //takes time proportional to p and q//
    public boolean Connected(int p, int q){
        return (root(p)==root(q));
    }
    //takes constant time, given roots//
    public void Union(int p, int q){
        int pid=id[p];
        int qid=id[q];
        if (pid==qid){return;}
        if (size[p]<size[q]){
            id[p]=qid;
            size[q]+=size[p];}
        else{
            id[q]=pid;
            size[p]+=size[q];
        }
        }
    }
