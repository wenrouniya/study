package com.study.EightSort;

public class dui {
    public static void main(String[] args) {
        int[] array = {0, 60, 10, 80, 40, 90, 50};
        heapSort(array, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");
        }

    }

    public static void heapSort(int array[], int n) {
        int i;
        for (i = n / 2; i > 0; i--) {
            //i为中间值，n为数组长度 i为最后一个堆的根节点
            HeapAdjust(array, i, n);//从下向上，从右向左调整
        }
        for (i = n; i > 1; i--) {
            swap(array, 1, i);
            HeapAdjust(array, 1, i - 1);//从上到下，从左向右调整
        }
    }

    public static void HeapAdjust(int array[], int s, int n) {
        int i, temp;
        //传过来的数组下标对应的值 暂时作为根节点
        temp = array[s];
        //i为对应节点的左子树 s为根节点所在位置
        for (i = 2 * s; i <= n; i *= 2) {
            //左子树如果存在 且左子树小于右子树 i++
            if (i < n && array[i] < array[i + 1]) {
                //将右子树作为下一个待调整的节点 出了这层判断 array【i】为字数中最大的节点
                i++;
            }
            //如果根节点的值大于子树的值 跳出循环  不用进行调整
            if (temp >= array[i]) {
                break;
            }
            //如果子树有节点的值大于根节点
            //将子树的值赋值给根节点
            array[s] = array[i];
            //调整过去的点再次作为新的根节点 对它下面的子树进行调整
            s = i;
        }
        //让根节点的值等于最初根节点的值
        array[s] = temp;
    }

    public static void swap(int array[], int i, int j) {
        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
