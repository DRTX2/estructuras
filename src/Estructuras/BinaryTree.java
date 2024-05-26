/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author PC
 */
public class BinaryTree <T>{
    private BinNode<T> root;
    public BinaryTree(){
        this.root=null;
    }
    public boolean insert(T data) {
        if (data == null) {
            return false;
        }
        if (this.root == null) {
            this.root = new BinNode<>(data);
            return true;
        } else {
            return this.root.lexicographicInsert(data);
        }
    }
    
    
    
}
