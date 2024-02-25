/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo02.linked.list.stack;

import java.util.LinkedList;

/**
 *
 * @author NC
 */
public class MyLLStack<E> {

    private LinkedList<E> list = null;

    public <E> MyLLStack() {
        list = new LinkedList(); // cap bo nho du chua MAXN phan tu
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E push(E item) {
        list.addFirst(item);
        return item;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    public E topE1() {
        if(isEmpty()) return null;
        return list.peek();
    }

    
    static class Student{
        String id;
        String name;
        int mark;

        public Student(String id, String name, int mark) {
            this.id = id;
            this.name = name;
            this.mark = mark;
        }

        @Override
        public String toString() {
            return id+", "+name+", "+mark;
        }
         
        
    }
    
    public static void main(String[] args) {
        //stack of integers
        MyLLStack<Integer> stk = new MyLLStack();
        stk.push(5);
        stk.push(10);
        stk.push(15);
        System.out.print(stk.pop()+", ");//15
        stk.push(20);
        stk.push(25);
        System.out.print(stk.pop()+", ");//25
        System.out.println(stk.pop()+", ");//20
        
        //stack of students
        MyLLStack<Student> stk2 = new MyLLStack();
        stk2.push(new Student("SE01","Joseline",7));
        stk2.push(new Student("SE05","Karen",2));
        stk2.push(new Student("SE04","Smith",4));
        while(!stk2.isEmpty())
            System.out.println(stk2.pop());
    }
    
}
