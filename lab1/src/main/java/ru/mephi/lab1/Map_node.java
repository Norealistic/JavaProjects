package ru.mephi.lab1;

public class Map_node {
    private Object key;
    private Object value;

    public Map_node(){
        this.key = null;
        this.value = null;
    }

    public Map_node(Object key, Object value){
        this.key = key;
        this.value = value;
    }

    public Object get_key(){
        return this.key;
    }

    public Object get_value(){
        return this.value;
    }



    public Object set_value(Object key, Object value){ //returns the changed object
        Object current = null;
        if (this.key == key){
            current = this.value;
            this.value = value;
        }
        return current;
    }

    public Object set_key(Object key, Object value){
        Object current = null;
        if (this.value == value){
            current = this.key;
            this.key = key;
        }
        return current;
    }

}
