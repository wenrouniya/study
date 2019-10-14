package com.study.Offer;

public class CreateLInklist {
    static class linkNode {
        private int data;
        private linkNode next;
        public  linkNode( int data) {
            this.data = data;
        }
    }

    public  static linkNode createLink(int [] a ){
        linkNode node=new linkNode(a[0]);
        // tianjia xinjiedian
         node.next= createNode(a,1);
            return node;
    }



    public  static linkNode createNode(int [] a, int index){
        if(index>a.length-1){
            return null;
        }
        linkNode newNode= new linkNode(a[index]);
        newNode.next=createNode(a,index+1);
        return newNode;

    }
    //dayi  lianbiao
    public static void printLink(linkNode node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;

        }
    }


    public static void main(String[] args) {
        int [] a={1,5,2,8};
       linkNode node= createLink(a);
        printLink(node);

    }
}
