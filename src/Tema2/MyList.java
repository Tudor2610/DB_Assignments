package Tema2;

public class MyList<T> {
    T []myList;
    private int m;

    public MyList(int dimension) {
        myList = (T[]) new Object[dimension];
        m = 0;
    }

    public void add(T element){
        if(m == myList.length)
            System.out.println("The list is full!");
        else
            myList[m++] = element;
    }

    public void print(){
        for (T t : myList) {
            if (t != null)
                System.out.println(t);
        }
    }

    public boolean lookup(T element){
        for (T t : myList) {
            if (t == element)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.print();
        System.out.println(myList.lookup(7));
        System.out.println(myList.lookup(8));
    }
}
