package com.example.demo.stream;

public class Box <T>{
    
        private HashMap<String, T>map;
        
        public Box(){
            map = new HashMap<String, T>();
        }
        public void clear(){this.map.clear();}
        public boolean containsKey(Object key){
            return map.containsKey(key);
        }
        public T get(String Key){
            return map.get(key);
        }
        public boolean isEmpty(){
            return map.isEmpty();
        }
        public T remove(String key){
            return map.remove(key);
        }
        public T replace(String key, Object value){
            return map.replace(key, value);
        }
    
    }
}
