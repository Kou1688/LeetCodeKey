package com.LeetCodePractice.pro201_250.pro208;

public class Trie {
    private Trie[] children;    //指向子结点的数组
    private boolean flag;   //判断该结点是否为字符串结尾

    //初始化前缀树
    public Trie() {
        this.children = new Trie[26];   //因为字母有且仅有26个字母，所以指针数组给26长度即可
        this.flag = false;  //新结点默认不是结尾字符
    }

    /**
     * 向前缀树中插入字符串word
     *
     * @param word 需要插入的字符串
     */
    public void insert(String word) {
        Trie node = this; //根结点为空
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int chArrNum = ch - 'a';    //获取该字符对应的值
            if (node.children[chArrNum] == null) { //如果子结点不存在
                node.children[chArrNum] = new Trie(); //在children数组指定位置创建一个新子结点
            }
            node = node.children[chArrNum]; //如果子结点存在，node移动到子结点上
        }
        node.flag = true; //给字符串末尾结点打上结束标记
    }

    /**
     * 在前缀树中搜索字符串word
     *
     * @param word 需要搜索的字符串
     * @return 找到true否则false
     */
    public boolean search(String word) {
        if (searchPrefix(word) == null) {
            return false;
        }
        return searchPrefix(word).flag == true;
    }

    /**
     * 搜索树中是否有prefix前缀
     *
     * @param prefix 需要搜索的前缀
     * @return 找到true否则false
     */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this; //从根节点开始
        //遍历字符串prefix
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int chArrNum = ch - 'a';
            if (node.children[chArrNum] == null) {
                return null;    //查找失败
            }
            node = node.children[chArrNum];
        }
        return node;    //查找成功，返回字符串末尾子结点
    }
}
