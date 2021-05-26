package com.leetcodepractice.pro201to250.pro208;

public class test {
    public static void main(String[] args){
        Trie trie=new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));  // 返回 True
        System.out.println(trie.search("app"));    // 返回 False
        System.out.println(trie.startsWith("app")); // 返回 True
        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 True

    }
}
