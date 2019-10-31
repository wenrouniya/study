package com.study.EightSort;
//堆排序
public class tree {
    public static void main(String[] args) {
        int [] tree={2,8,5,3,9,6};
        heapSort(tree,6);
        for (int i=0;i<tree.length;i++){
            System.out.println(tree[i]+" ");
        }

    }
    //交换函数
  public  static  void swap(int[] tree,int i,int j){
        int temp=tree[i];
        tree[i]=tree[j];
        tree[j]=temp;
    }
    //将节点调整为大根堆
    public  static   void heapify(int []tree,int n,int i){
        if (i>n){
            return ;
        }
        int max=i;
        int c1=i*2+1;//左节点
        int c2=i*2+2;//右节点
        //将左右根三个节点中最大的值赋给根节点
        if (c1<n&&tree[c1]>tree[max]){
            max=c1;
        }
        if (c2<n&&tree[c2]>tree[max]){
            max=c2;
        }
        if(max!=i){
            swap(tree,max,i);
            heapify(tree,n,max);
        }
    }
    public  static  void create_heap(int [] tree,int n){
        //从下到上调整大根堆
        int parent=(n-1)/2;//最后一个节点的根节点  最头的根节点位0
        //堆每个几点都要进行调整
        for (  int  i=parent;i>=0;i--){
            heapify(tree,n,i);
        }
    }
    //每次将根节点和最后一个节点做交换 去掉最后一个节点 再将剩余的堆调整为大根堆
    public  static  void heapSort(int [] tree,int n){
        create_heap(tree,n);
        //n-1为最后一个根节点
        for (int i=n-1;i>=0;i--) {
            swap(tree, 0, i);
            heapify(tree, i, 0);
        }
    }
}
