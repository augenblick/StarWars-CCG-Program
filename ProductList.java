import java.lang.IndexOutOfBoundsException;

public class ProductList{

    private int size;
    private Node firstNode;
    private Node lastNode;

    public ProductList(){
        this.size = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public void add(Product element){
        if (size == 0){
            this.firstNode = new Node(element);
            this.lastNode = this.firstNode;

        }

        else{
            Node newNode = new Node(element);
            newNode.setPreviousNode(this.lastNode);
            this.lastNode.setNextNode(newNode);
            this.lastNode = newNode;
        }

        this.size++ ;
    }

    public Product get(int index)throws IndexOutOfBoundsException{

        if (index < this.size){

            if (index == 0){
                return this.firstNode.getElement();
            }
            else{
                Node currentNode = this.firstNode;
                for (int i = 0; i < index; i++){
                    currentNode = currentNode.getNextNode();
                }
                return currentNode.getElement();
            }
        }

        else {
            throw new IndexOutOfBoundsException();
        }
    }


    public String toString(){

        String printString = "";

        for (int i = 0; i < this.size; i++){
            printString += get(i).toString() + "\n";
        }

        return printString;
    }


    private class Node{

        private Product element;
        private Node previousNode;
        private Node nextNode;

        public Node(Product element){
            this.element = element;
            this.previousNode = null;
            this.nextNode = null;

        }

        public void setPreviousNode(Node previous){
            this.previousNode = previous;
        }

        public void setNextNode(Node next){
            this.nextNode = next;
        }

        public Node getPreviousNode(){
            return this.previousNode;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public Product getElement(){
            return this.element;
        }

        public String toString(){

            return this.element.toString();
        }

    }


}// end class ProductList
