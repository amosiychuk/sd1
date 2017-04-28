//author: Alexander Mosiychuk
//course: CMPT 220 
//assignment: lab 7 
//due date: April 27, 2017 
public class Prob1010 {
  public static void main(String[] args) {
    Queue queue = new Queue();
    
    for (int i = 1; i <= 20; i++){
      queue.enqueue(i);
    }
    
    while (queue.empty() == false) {
      System.out.print(queue.dequeue() + " ");
    }
  }
}

class Queue {
  private int[] elements;
  private int size;
  
  //constructor with a capacity of 8
  public Queue() {
    elements = new int[8];
  }
  
  public void enqueue(int v) {
    //double array capacity if needed
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = v;
  }

  // return first element from queue */
  public int dequeue() {
    int v = elements[0];
    
    // Shift all elements left
    for (int i = 0; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }
    
    size--;
    
    return v;
  }
  
  // Evaluate if queue is empty
  public boolean empty() {
    return size == 0;
  }

  //return the queue size
  public int getSize() {
    return size;
  }
}