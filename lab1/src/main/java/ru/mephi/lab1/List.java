package ru.mephi.lab1;

public class List {
    private Object[] values;
    private int size;

    private static final int container_size = 8;


    List(){
        this.values = new Object[container_size];
        this.size = container_size;
    }

    List(int size){
        this.size = size;
        this.values = new Object[size];
    }

    List(Object... values){
        this.values = new Object[values.length];
        System.arraycopy(values, 0, this.values, 0, values.length);
        this.size = values.length;
    }

    public Object get (int index){
        if (index<this.size && index>-1) return this.values[index];
        else {
            System.out.println("Index is out of range");
            return null;
        }
    }

    public void add(Object value){
        Object[] result = new Object[this.size+1];
        System.arraycopy(this.values, 0, result, 0, this.size);
        result[result.length-1] = value;
        this.values = result;
        this.size = result.length;
    }

    public Object remove(int index){
        if (index<this.size && index>-1) {
            Object removed = this.values[index];
            Object[] result = new Object[this.size - 1];
            System.arraycopy(this.values, 0, result, 0, index);
            System.arraycopy(this.values, index + 1, result, index, this.size - index - 1);
            this.values = result;
            this.size = result.length;
            return removed;
        }
        else{
            System.out.println("Index is out of range");
            return null;
        }
    }

    public void add(Object value, int index){
        if (index<this.size && index>-1) {
            Object[] result = new Object[this.size + 1];
            System.arraycopy(this.values, 0, result, 0, index);
            result[index] = value;
            System.arraycopy(this.values, index, result, index + 1, this.size - index);
            this.values = result;
        }
        else System.out.println("Index is out of range");
    }

    public int indexOf(Object value){
        for (int i = 0; i <  this.values.length; i++) {
            if (this.values[i] == value)
                return i;
        }
        System.out.println("No such element in the List");
        return -1;
    }

    public boolean contains(Object value){
        for (Object o : this.values) {
            if (o == value)
                return true;
        }
        return false;
    }

    public Object set(Object value, int index){
        if (index<this.size  && index>-1) {
            Object[] result = new Object[this.size];
            Object rewrited = this.values[index];
            System.arraycopy(this.values, 0, result, 0, index);
            result[index] = value;
            System.arraycopy(this.values, index + 1, result, index + 1, this.size - index - 1);
            this.values = result;
            return rewrited;
        }
        else{
            System.out.println("Index is out of range");
            return null;
        }
    }

    public int size(){return (this.size);}

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void print(){
        for (int i = 0; i <  this.size; i++) {
            if (i!=this.size-1) System.out.print(this.values[i] + ", ");
            else System.out.println(this.values[i]);
        }
    }

    public static void main(String[] args){
        Object[] num = new Object[]{2, 4, 5, 7};
        List list = new List(num);
        System.out.println(list.isEmpty());
        list.print();
        System.out.println(list.size());
        list.add(6);
        list.print();
        list.add(34,10);
        list.print();
        System.out.println(list.set(12,10));
        list.print();
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(4));
        System.out.println(list.remove(0));
        list.print();

        System.out.println(list.get(8));
        List list1 = new List();
        System.out.println(list1.isEmpty());
    }

}
