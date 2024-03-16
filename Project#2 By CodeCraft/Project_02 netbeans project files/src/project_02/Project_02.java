package project_02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Project_02 {
    private static MyDataCollections mdc;
    /*
    HashSet
    TreeSet
    LinkedHashSet
    ArrayList
    LinkedList
    ArrayDeque
    PriorityQueue
    HashMap
    TreeMap
    LinkdHashMap
    
    
    add
    contains
    remove
    clear
    data -> 0-100 000
    time -> ns
    average of  100
    */
    private static long[][] time=new long[10][4];
    private static String[] names={"HashSet","TreeSet","LinkedHashSet","ArrayList","LinkedList","ArrayDeque","PriorityQueue","HashMap","TreeMap","LinkdHashMap"};
    public static void main(String[] args) {
        long start,end,duration_add=0,duration_contain=0,duration_remove=0,duration_clear=0;
        MyDataCollections[] collection={new MyHashSet(),new MyTreeSet(),new MyLinkedHashSet(),new MyArrayList(),new MyLinkedList(),new MyArrayDeque(),new MyPriorityQueue(),new MyHashMap(),new MyTreeMap(),new MyLinkedHashMap()};
        for(int i=0;i<10;i++){
            for(int j=0;j<100;j++){
            start=System.nanoTime();
            collection[i].add();
            end=System.nanoTime();
            duration_add+=end-start;
            
            start=System.nanoTime();
            collection[i].contains();
            end=System.nanoTime();
            duration_contain+=end-start;
            
            start=System.nanoTime();
            collection[i].remove();
            end=System.nanoTime();
            duration_remove+=end-start;
            
            start=System.nanoTime();
            collection[i].clear();
            end=System.nanoTime();
            duration_clear+=end-start;
            }  
            time[i][0]=duration_add/100;
            time[i][1]=duration_contain/100;
            time[i][2]=duration_remove/100;
            time[i][3]=duration_clear/100;
            
        }   
        printTime();
    }
    
    public static void printTime(){
        System.out.print("Type\t\tAdd\t\t\tContains\tRemove\t\tClear\t\t\n");
        for(int i=0;i<10;i++){
            if(i==0 || i==1 ||i==7||i==8){
                System.out.print(names[i]+"\t\t");
            }else{
                System.out.print(names[i]+"\t");
            }
            for(int j=0;j<4;j++){
                System.out.print(time[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    
    public static abstract class MyDataCollections{
        public abstract void add();
        public abstract void contains();
        public abstract void remove();
        public abstract void clear();
    }
    
    public static class MyHashSet extends MyDataCollections{
        private Set<Integer> my_hash_set;
        private int removing_ele;
        public MyHashSet(){
            my_hash_set=new HashSet();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_hash_set.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_hash_set.contains(-1);
        }
        public void remove(){
            my_hash_set.remove(removing_ele);
        }
        public void clear(){
            my_hash_set.clear();
        }
    }
    
    public static class MyTreeSet extends MyDataCollections{
        private Set<Integer> my_tree_set;
        private int removing_ele;
        public MyTreeSet(){
            my_tree_set=new TreeSet();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_tree_set.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_tree_set.contains(-1);
        }
        public void remove(){
            my_tree_set.remove(removing_ele);
        }
        public void clear(){
            my_tree_set.clear();
        }
    }
    
    public static class MyLinkedHashSet extends MyDataCollections{
        private Set<Integer> my_linked_hash_set;
        private int removing_ele;
        public MyLinkedHashSet(){
            my_linked_hash_set=new LinkedHashSet();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_linked_hash_set.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_linked_hash_set.contains(-1);
        }
        public void remove(){
            my_linked_hash_set.remove(removing_ele);
        }
        public void clear(){
            my_linked_hash_set.clear();
        }
    }
       
    public static class MyArrayList extends MyDataCollections{
        private List<Integer> my_array_list;
        private int removing_ele;
        public MyArrayList(){
            my_array_list=new ArrayList();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_array_list.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_array_list.contains(-1);
        }
        public void remove(){
            my_array_list.remove(50000);
        }
        public void clear(){
            my_array_list.clear();
        }
    }
    
    public static class MyLinkedList extends MyDataCollections{
        private List<Integer> my_linked_list;
        private int removing_ele;
        public MyLinkedList(){
            my_linked_list=new LinkedList();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_linked_list.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_linked_list.contains(-1);
        }
        public void remove(){
            my_linked_list.remove(50000);
        }
        public void clear(){
            my_linked_list.clear();
        }
    }
   
    public static class MyArrayDeque extends MyDataCollections{
        private Queue<Integer> my_array_deque;
        private int removing_ele;
        public MyArrayDeque(){
            my_array_deque=new ArrayDeque();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_array_deque.add(value);
                if(i==500){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_array_deque.contains(-1);            
        }
        public void remove(){
            my_array_deque.remove(removing_ele);
        }
        public void clear(){
            my_array_deque.clear();
        }
    }
    
    public static class MyPriorityQueue extends MyDataCollections{
        private Queue<Integer> my_priority_queue;
        private int removing_ele;
        public MyPriorityQueue(){
            my_priority_queue=new PriorityQueue();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_priority_queue.add(value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_priority_queue.contains(-1);           
        }
        public void remove(){
            my_priority_queue.remove(removing_ele);
        }
        public void clear(){
            my_priority_queue.clear();
        }
    }
     
    public static class MyHashMap extends MyDataCollections{
        private Map<Integer,Integer> my_hash_map;
        private int removing_ele;
        public MyHashMap(){
            my_hash_map=new HashMap();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_hash_map.put(i,value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_hash_map.containsValue(-1);
        }
        public void remove(){
            my_hash_map.remove(50000);
        }
        public void clear(){
            my_hash_map.clear();
        }
    }
    
    public static class MyTreeMap extends MyDataCollections{
        private Map<Integer,Integer> my_tree_map;
        private int removing_ele;
        public MyTreeMap(){
            my_tree_map=new TreeMap();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_tree_map.put(i,value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_tree_map.containsValue(-1);
        }
        public void remove(){
            my_tree_map.remove(50000);
        }
        public void clear(){
            my_tree_map.clear();
        }
    }
    
    public static class MyLinkedHashMap extends MyDataCollections{
        private Map<Integer,Integer> my_linked_hash_map;
        private int removing_ele;
        public MyLinkedHashMap(){
            my_linked_hash_map=new LinkedHashMap();
        }
        public void add(){
            for(int i=0;i<100000;i++){
                Random ran=new Random();
                int value=Math.abs(ran.nextInt()%100000);
                my_linked_hash_map.put(i,value);
                if(i==50000){
                    removing_ele=value;
                }
            }
        }
        public void contains(){
            //check for worst case
            my_linked_hash_map.containsValue(-1);
        }
        public void remove(){
            my_linked_hash_map.remove(50000);
        }
        public void clear(){
            my_linked_hash_map.clear();
        }
    }
    
    
}
