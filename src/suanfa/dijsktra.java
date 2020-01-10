package suanfa;

/**
 * Created by jxy on 2019/10/30.
 */
public class dijsktra {
    public static void main(String[] args) {
        int MAX=1000000;
        int [][]weight={{0,3,2000,7,MAX},{3,0,4,2,MAX},{MAX,4,0,5,4},{7,2,5,0,6},{MAX,MAX,4,6,0}};
        int[] dijsktra = Dijsktra(weight, 0);
        System.out.println(dijsktra);
    }

    /**
     * 接受一个有向图的权重矩阵 从00开始
     * @param weight
     * @param start
     * @return
     */
    public static int [] Dijsktra(int[][] weight,int start){
        int length=weight.length;
        //存放start到各个点的最短距离
        int [] shortPath = new int[length];
        shortPath[0] = 0;//start到他本身的距离最短为0
        String path[] = new String[length];//存放从start点到各点的最短路径的字符串表示
        for(int i=0;i<length;i++){
            path[i] = start+"->"+i;
        }
        int visited[] = new int[length];//标记当前该顶点的最短路径是否已经求出，1表示已经求出
        visited[0] = 1;//start点的最短距离已经求出
        for(int count = 1;count<length;count++){
            int k=-1;
            int dmin = Integer.MAX_VALUE;
            for(int i=0;i<length;i++){
                if(visited[i]==0 && weight[start][i]<dmin){
                    dmin = weight[start][i];
                    k=i;
                }
            }
            //选出一个距离start最近的未标记的顶点     将新选出的顶点标记为以求出最短路径，且到start的最短路径为dmin。
            shortPath[k] = dmin;
            visited[k] = 1;
            //以k为中间点，修正从start到未访问各点的距离
            for(int i=0;i<length;i++){
                if(visited[i]==0 && weight[start][k]+weight[k][i]<weight[start][i]){
                    weight[start][i] = weight[start][k]+weight[k][i];
                    path[i] = path[k]+"->"+i;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]+"="+shortPath[i]);
        }
        return shortPath;
    }
}
