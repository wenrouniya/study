package com.study.OrderTree;

/**
 * 中序遍历递归调用
 * 思想：一直循环调用midOrder方法 传入左子树 直到左子树为空 返回 void
 * 输出左子树的值
 * 再调用midOrder方法 传入右子树 直到右子树为空 返回void
 * 此时会返回上一个结点  及左子树的根节点输出根节点的值
 * 套路：调用函数传递左子树
 *         输出
 *         调用传递右子树
 */
public class midOrder {
    /**
     * 被static修饰的内部类可以直接当作外部类来使用
     * 没有被static修饰的类必须通过new一个外部类打点调用内部类
     */
    static class treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode(int val){
            this.val=val;
        }
    }
    //利用数组创建二叉树
    public static void createTree(){
        treeNode[] nodes=new treeNode[10];
        //赋值
        for (int i=0;i<10;i++){
            nodes[i]=new treeNode(i+1);
        }
        //创建左右子树
        for (int i=0;i<10;i++){
            if (i * 2 + 1 < 10) {
                nodes[i].left=nodes[i*2+1];
            }
            if (i*2+2<10){
                nodes[i].right=nodes[i*2+2];
            }
        }
        midOrder(nodes[0]);
    }
    public  static void midOrder(treeNode biTree){
        if (biTree==null){
            return;
        }else{
            midOrder(biTree.left);
            System.out.println(biTree.val);
            midOrder(biTree.right);
        }
    }

    public static void main(String[] args) {
        createTree();
    }
}
