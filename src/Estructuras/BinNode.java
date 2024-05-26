/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author PC
 */
public class BinNode <T>{
    T data;
    BinNode<T> left;
    BinNode<T> right;
    public BinNode(T data){
        this.data=data;
    }
    
    public BinNode(T data,BinNode<T> left,BinNode<T> right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
    
    
    public boolean lexicographicInsert(T data ){
        int value= ((Comparable<T>)this.data).compareTo(data);
        if(value==0){
            return false;
        }
        if (value < 0) { 
            if (this.right == null) {
                try{
                    this.right= new BinNode<>(data);
                }catch(Exception e ){
                    return false;
                }
            }else{
                return this.right.lexicographicInsert(data);
            }
        } else { 
            if (this.left == null) {
                try{
                    this.left= new BinNode<>(data);
                }catch(Exception e ){
                    return false;
                }
            }else{
                return this.left.lexicographicInsert(data);
            }
        }
        return false;
    }
    
    
    
}
