package folderOne.Tries;
import java.util.HashMap;

public class Node {
	public HashMap<Character,Node> children;
	public boolean isCompletedWord;
	
	public Node() {
		this.children = new HashMap<Character,Node>();
		this.isCompletedWord = false;
	}
}
