package linkedstuck2;

import java.util.EmptyStackException;

   public class  linkedStack <T>{
        int count;
        Node<T> top;
        linkedStack(){
            count=0;
            top=null;
        }
        //operations
        //size
        int size(){
            return count;
        }
        //isEmpty
        boolean isEmpty(){
            return count==0;//top=null;
        }
        //push
        void push(T element){
            //create new node to store new value that in new node
            Node<T> tempAddress=new Node<>(element);
            //connect new node to the top element or head
            tempAddress.setNext(top);
            //
            top=tempAddress;
            count++;
        }
        T pop(){
            //check if the stack is empty
            if (isEmpty()){
                System.out.println("empty stack!");
                return null;
            }
            //storing the top data element
            T removeElement=top.getElement();
            //This removes the previous top node and correctly updates top to be the next node.
            top=top.getNext();
            count--;
            return removeElement;
        }
        //peek
        T peek(){
            if (isEmpty()){
                System.out.println("empty stack!");
                return null;
            }
            return top.getElement();
        }
        void display(){
            if (isEmpty())
                System.out.println("empty stack!");

            else {
                Node<T> currentAddress = top;
                while (currentAddress != null) {
                    System.out.println(currentAddress.getElement());
                    currentAddress = currentAddress.getNext();
                }
            }

        }
        public void printStack()throws EmptyStackException {
            if (isEmpty())
                throw new EmptyStackException();
            Node<T> current=top;
            while (current !=null){
                System.out.println(current.getElement());
                current=current.getNext();
            }

        }
        //searchElement
        void searchElemnt(T data){
            boolean found=false;
            int count=0;
            if (isEmpty())
                System.out.println("the stack is empty!");
            else {
                Node<T> currentAddress=top;
                while (currentAddress !=null){
                    if (data.equals(currentAddress.getElement())){
                        found=true;
                        count++;
                    }
                    currentAddress=currentAddress.getNext();
                }
            }

        }



        public void removeMiddle() {

            if (isEmpty()) {
                System.out.println("The is empty");

                return;
            }
            if (count <= 2) {
                System.out.println("The stack is size is small");
                return;
            }
            Node<T> currentAddress = top;
            Node<T> secondNode  = currentAddress.getNext();

            Node<T> lastNode = top;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            currentAddress.setNext(lastNode);

        }public void deleteMiddle() {

            if (isEmpty()) {
                System.out.println("The is empty");

                return;
            }
            if (count <= 2) {
                System.out.println("The stack is size is small");
                return;
            }
            Node<T> currentAddress = top;
            Node<T> secondNode  = currentAddress.getNext();

            Node<T> lastNode = top;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            currentAddress.setNext(lastNode);

        }




        public static void main(String[] args) {
            linkedStack<String> names= new linkedStack<>();

            names.push("maryan");
            names.push("mohamed");
            names.push("elmi");
            names.push("sucdi");
            names.push("fardowsa");


            System.out.println("orginal");
            names.display();

            System.out.println("after removed");

            names.removeMiddle();
            names.display();



            //System.out.println(count);




        }

    }






