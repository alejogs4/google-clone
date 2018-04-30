package datastructures;
/**
 *
 * @author Alejandro Garcia Serna,Miguel Angel Velez
 * @param <T>
 */
public class BinaryTree< T extends Comparable< T > > {
    
    Node< T > root;
    
    private class Node< E extends Comparable< E > > {
        
        E item;
        Node< E > left;
        Node< E > right;
        
        public Node(E item,Node left,Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
        
        
        
    }
    
    /**
     * Agrega un item al arbol binario
     * @param item
     * @return BinaryTree< T >
     */
    public BinaryTree< T > insert(T item) {
        Node< T > newNode = new Node<>(item,null,null);
        if(isEmpty()) root = newNode;
        else {
            Node< T > currentNode = root;
            while(true) {
                if(isGreatherThan(currentNode, item)) {
                    if(currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        break;
                    }
                    currentNode = currentNode.getRight();
                }
                else if(isLessThan(currentNode, item)) {
                    if(currentNode.getLeft() == null){
                        currentNode.setLeft(newNode);
                        break;
                    }
                    currentNode = currentNode.getLeft();
                }
                else {
                    if(currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        break; 
                    }
                    currentNode = currentNode.getLeft();
                }
            }
        }
        return this;
    }
    
    /**
     * Verifica si el item del nodo actual es mayor que el item pasado por parametro para saber en que direccion dirigir el arbol
     * @param curreNode
     * @param item
     * @return 
     */
    private boolean isGreatherThan(Node curreNode,T item) { return curreNode.getItem().compareTo(item) == 1; }
    
    /**
     * Verifica si el item del nodo actual es menor que el item pasado por parametro para saber en que direccion dirigir el arbol
     * @param curreNode
     * @param item
     * @return 
     */
    private boolean isLessThan(Node curreNode,T item) { return curreNode.getItem().compareTo(item) == -1; }
    
    /**
     * Verifica si el arbol esta vacio
     * @return 
     */
    private boolean isEmpty() { return root == null; }
    
}
