package folderOne.Tries;

public class TrieTest {
	public static void main(String[]args) {
		Trie test1 = new Trie();
		test1.insertWord("car");
		test1.insertWord("cz");
		test1.insertWord("cart");
		test1.insertWord("card");
		test1.insertWord("chip");
		test1.insertWord("trie");
		test1.insertWord("try");
//		test1.isPrefixValid("cz");
//		test1.isWordValid("cx");
//		 test1.traverse(test1.root, "");
		test1.printAll();
		
	}
}


 