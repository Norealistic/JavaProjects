package ru.mephi.lab1;

public class Map {
    private List list_items;

    public Map(){
        this.list_items = null;
    }

    public Map(Map_node... items){
        this.list_items = new List(items);
    }

    public void put(Object key, Object value){
        Map_node current = new Map_node(key, value);
        this.list_items.add(current);
    }

    public boolean keyContains(Object key){
        for (int i=0; i<this.list_items.size(); i++) {
            Map_node current = ((Map_node) this.list_items.get(i));
            if (current.get_key() == key)
                return true;
        }
        return false;
    }

    public Object remove(Object key){
        for (int i=0; i<this.list_items.size(); i++) {
            Map_node current = ((Map_node) this.list_items.get(i));
            if (current.get_key() == key) {
                this.list_items.remove(i);
                return current;
            }
        }
        return null;
    }


    public Object get(Object key){
        for (int i=0; i<this.list_items.size(); i++) {
            Map_node current = ((Map_node) this.list_items.get(i));
            if (current.get_key() == key)
                return current;
        }
        return null;
    }

    public Object get(Object key, Object bydefault){
        Object current = get(key);
        if (current==null){
            put(key, bydefault);
            return bydefault;
        }
        else return current;
    }

    public List getKeys(){
        List keys = new List();
        for (int i=0; i<this.list_items.size(); i++) {
            Map_node current = ((Map_node) this.list_items.get(i));
            keys.add(current.get_key());
        }
        return keys;
    }


    public List getValues(){
        List values = new List();
        for (int i=0; i<this.list_items.size(); i++) {
            Map_node current = ((Map_node) this.list_items.get(i));
            values.add(current.get_value());
        }
        return values;
    }

    public List getEntries(){
        return this.list_items;
    }

    public int size(){
        return this.list_items.size();
    }

    public boolean isEmpty(){
        return this.list_items.isEmpty();
    }

}

