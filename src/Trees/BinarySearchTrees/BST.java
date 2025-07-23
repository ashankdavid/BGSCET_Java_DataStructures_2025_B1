package Trees.BinarySearchTrees;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    BST(){
        root = null;
    }

    private Node insertRec(Node root, int key){
        if(root==null){
            Node n = new Node(key);
            return n;
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root==null){
            return false;
        }
        if(key == root.key){
            return true;
        }
        if(key < root.key){
            return searchRec(root.left, key);
        }else{
            return searchRec(root.right, key);
        }
    }

    boolean search(int key){
        return searchRec(root, key);
    }

    private Node findSuccessor(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

    private Node removeRec(Node root, int key){
        if(root==null){
            return root;
        }
        if(key < root.key){
            root.left = removeRec(root.left, key);
        }else if(key > root.key){
            root.right = removeRec(root.right, key);
        }else{
            // You found the node to be deleted
            // Case 1: Node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            // case 2: Node with more than 1 child
            Node successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);
        }
        return root;
    }

    void remove(int key){
        root = removeRec(root, key);
    }

    void InDfs(Node root){
        if(root==null){
            return ;
        }
        InDfs(root.left);
        System.out.print(root.key + " ");
        InDfs(root.right);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(70);
        bst.insert(10);
        bst.insert(60);
        bst.insert(170);
        bst.insert(130);
        bst.insert(190);
        bst.insert(110);
        bst.insert(150);

        bst.InDfs(bst.root);

        int key = 1150;
        System.out.println(bst.search(key));

        bst.remove(100);
        bst.InDfs(bst.root);
    }
}