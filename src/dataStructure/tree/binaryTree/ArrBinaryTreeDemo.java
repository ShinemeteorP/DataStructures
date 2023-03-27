package dataStructure.tree.binaryTree;

/**
 * @author 刘鑫
 * @version 1.0
 */
public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.postOrderShow(0);
    }

}
class ArrBinaryTree{
    private int[] val;

    public ArrBinaryTree(int[] val) {
        this.val = val;
    }
    public void preOrderShow(int n){
        if (val==null||val.length==0){
            System.out.println("树为空");
        }else {
            System.out.println(val[n]);
            if (2*n+1<val.length)
                preOrderShow(2*n+1);
            if (2*n+2<val.length){
                preOrderShow(2*n+2);
            }
        }
    }
    public void infixOrderShow(int n){
        if (val==null||val.length==0){
            System.out.println("树为空");
        }else {

            if (2*n+1<val.length)
                infixOrderShow(2*n+1);
            System.out.println(val[n]);
            if (2*n+2<val.length){
                infixOrderShow(2*n+2);
            }
        }
    }
    public void postOrderShow(int n){
        if (val==null||val.length==0){
            System.out.println("树为空");
        }else {

            if (2*n+1<val.length)
                postOrderShow(2*n+1);
            if (2*n+2<val.length){
                postOrderShow(2*n+2);
            }
            System.out.println(val[n]);
        }
    }

}
