package folderOne.Tries;

public class Trie{
	public Node root;
	public Trie() {
		this.root = new Node();
	}
	public void insertWord(String word) {
		Node currentNode = this.root;		
		for (int i =0; i < word.length(); i++) {
			Character currentLetter= word.charAt(i);			
			Node child = currentNode.children.get(currentLetter);
			if (child == null) {
				child = new Node();
				currentNode.children.put(currentLetter, child);
			}
			currentNode = child;
		}
		currentNode.isCompletedWord = true;
	}
//starts with partial match
	public boolean isPrefixValid(String str) {
		Node currentNode = this.root;		
		for (int i =0; i < str.length(); i++) {
			Character currentLetter= str.charAt(i);			
			System.out.println("Checking: "+currentLetter);
			Node child = currentNode.children.get(currentLetter);
			currentNode = child;				
			if (child==null) {
				System.out.println("false");
				return false;	
			}
		}
		System.out.println("true");
		return true;
	}
//	exact match
	public boolean isWordValid(String str) {
		Node currentNode = this.root;
		for (int i =0; i < str.length(); i++) {
			Character currentLetter= str.charAt(i);			
			System.out.println("Checking: "+currentLetter);
			Node child = currentNode.children.get(currentLetter);
			currentNode = child;				
			if (child==null) {
				System.out.println("false");
				return false;	
			}
		}
		System.out.println(currentNode.isCompletedWord);
		return currentNode.isCompletedWord;
	}

	public void traverse(Node node, String word) {
		for (Character c : node.children.keySet()){
			System.out.println(c);
			if(node.children.get(c).isCompletedWord){
				System.out.println("word end");
				}		
			traverse(node.children.get(c) , word= word+c);
			}
	}
	
	public void printAll() {
		String word = "";
		traverse(this.root, word);
	}
}
