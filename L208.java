
// LEETCODE->208->IMPLEMENT TRIE(PREFIX TRIE):

import java.util.*;

public class L208 {
    // TrieNode structure to store child nodes and end-of-word flag.
    private class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26]; // Each node can have up to 26 children (for 'a' to 'z').
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public L208() {
        root = new TrieNode(); // Initialize root node.
    }

    // Method to insert a word into the Trie.
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true; // Mark the end of the word.
    }

    // Method to search for a word in the Trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord; // Check if the word is complete.
    }

    // Method to check if there is any word in the Trie that starts with the given
    // prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true; // Return true if the prefix is found.
    }

    public static void main(String[] args) {
        L208 obj = new L208();
        obj.insert("apple");
        System.out.println(obj.search("apple")); // Output: true
        System.out.println(obj.search("app")); // Output: false
        System.out.println(obj.startsWith("app")); // Output: true
        obj.insert("app");
        System.out.println(obj.search("app")); // Output: true
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(n*m)