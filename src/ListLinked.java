import java.lang.reflect.Array;
import java.util.Arrays;

class ListLinked {
    Node tail = null;
    Node head = null;
    Node current = null;
    public void push (Object data){
        //empty
        if (tail==null){
            this.tail = new Node(null, null,data);
            this.head = tail;
        }
        //not empty -> add to tail
        else {
            Node nodeToAdd = new Node (tail,null,data);
            tail.following = nodeToAdd;
            this.tail = nodeToAdd;
        }
        System.out.println("data added: " + tail.data);
    }

    public void bestellungFür (Object data){
        //empty
        if (tail==null){
            this.tail = new Node(null, null,data);
            this.head = tail;
        }
        //not empty -> add to tail
        else {
            Node nodeToAdd = new Node (tail,null,data);
            tail.following = nodeToAdd;
            this.tail = nodeToAdd;
        }
        if(tail.previous != null){
            System.out.println(tail.previous.data + " übergibt " + tail.data + " das Getränk");
        }
        else {
            System.out.println("der Barkeeper übergibt " + tail.data + " das Getränk");
        }

    }

    public void pop(){
        if (tail==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(tail.data + " will be removed.");
            tail = tail.previous;
            tail.following =null;

        }
    }

    public void top(){
        System.out.println("tail: "+tail.data);
    }

    public void stackSize (ListLinked list){
        Node tempNode = list.tail;
        int counter = 0;
        while (tempNode != null)
        {
            tempNode = tempNode.previous;
            counter += 1;

        }
        System.out.println("Stacksize is: "+counter);
    }

    public void isEmpty(ListLinked list){

        if (list.tail == null) {
            if(list.head == null) {
                System.out.println("is empty!");
            }
        }else {
            System.out.println("is NOT empty");
        }
    }

    public void reverseString(String input){
        Integer length = null;
        length = input.length();
        String reverse = "";

        String[] splitStr = input.split("");

        for (int i =0; i< length; i++){
            push(splitStr[length-1-i]);
            reverse = reverse + splitStr[length-1-i];
            //System.out.println(splitStr[i]);
        }
        System.out.println(input);
        System.out.println(reverse);
    }

    public void listContent (){
        Node tempNode = null;
        tempNode = head;
        while (tempNode.following != null){
            System.out.println(tempNode.data);
            tempNode=tempNode.following;
        }
        // last print for Tail
        System.out.println(tempNode.data);
    }

    public static void isPalindrome (String input){
        Integer length = null;
        length = input.length();
        String reverse = "";

        String[] splitStr = input.split("");

        for (int i =0; i< length; i++){
            //push(splitStr[length-1-i]);
            reverse = reverse + splitStr[length-1-i];
            //System.out.println(splitStr[i]);
        }
        if ((input.toLowerCase().equals(reverse.toLowerCase()))) {
            System.out.println("is palindrome!");
        }
        else {
            System.out.println("no palindrome!");
        }
    }
}
