
import java.util.*;


/******* class definitions that are used in the exercies*******/
class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
	}

}
class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}
class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
 }
class TreeNode {
      int val;
      TreeNode left, right;
      TreeNode(int x) { val = x; }
 }
/////////////////////////////Utility Functions/////////////////////////  

//package utils;
public class Input {
	//member functions to generate input.
	public ArrayList<Integer> generateRandomArrayList() {
		Random rand = new Random();
		int maxSize = 10000;
		int size = rand.nextInt(maxSize+1);
		ArrayList<Integer> ret = new ArrayList<Integer>();//returning arraylist of integer.
		for (int i = 0; i < size; i++) {
			ret.add(rand.nextInt());
		}
		return ret;
	}
	//member functions to generate input.
	public int[] generateRandomArray() {
		Random rand = new Random();
		int maxSize = 100;
		int limit = 100;
		int size = rand.nextInt(maxSize+1);
		int[] ret = new int[size];//returning array of integer.
		for (int i = 0; i < size; i++) {
			ret[i] = -limit + 2* rand.nextInt(limit);
		}
		return ret;
	}
	//member functions to generate input.
	public int[] generateRandomArray(int limit) {
		Random rand = new Random();
		int maxSize = limit;
		int size = rand.nextInt(maxSize+1);
		int[] ret = new int[size];//returning array of integer.
		for (int i = 0; i < size; i++) {
			ret[i] = -limit + 2* rand.nextInt(limit);
		}
		return ret;
	}
	public void printArray(int[] input) {
		for(int i = 0; i < input.length; i++) {
			if ( i > 0 ) System.out.print(",");
			System.out.print(input[i]);
		}
		System.out.println();
	}
	public int generateRandomInt() {
		int limit = 100;
		Random rand = new Random(100);
		return rand.nextInt();
	}
	//member funcitons to generate input
	public ListNode generateRandomListNode() {
		Random rand = new Random();
		//int maxSize = 10000;
		//small test set for manual verification
		int maxSize = 10;
		int size = rand.nextInt(maxSize + 1);
		ListNode head = new ListNode(rand.nextInt(maxSize+1));
		ListNode iter = head;
		for (int i = 0; i < size; i++) {
			iter.next = new ListNode (rand.nextInt(maxSize + 1));
			iter = iter.next;
		}
		return head;
	}
	//member funcitons to generate input
	public Interval[] generateRandomIntervals() {
		int limit = 10000;
		Random rand = new Random();
		int size = rand.nextInt(limit)+1;
		Interval[] ret = new Interval[size];
		System.out.println("created interval of size" + size);
		for ( int i = 0; i < size; i++) {
			int start = rand.nextInt(limit+1);
			ret[i] = new Interval(start, start + rand.nextInt(limit+1));
		}
		return ret;

	}
	static public void printListNode(ListNode head) {
		ListNode iter = head;
		while (null != iter) {
			if(iter != head) System.out.print("->");
			System.out.print(iter.val);
			iter = iter.next;
		}
		System.out.println();

	}
	public String generateRandomString() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	public String[] generateRandomStringArray() {
		int limit = 10000;
		String operators = "+-*/";
		String[] ret =  new String[limit];
		for (int i = 0; i < limit; i++) {
			Random rand = new Random();
			int seed = -limit + 2*rand.nextInt(limit);
			if (seed >= 0 && seed < 4) {
				ret[i] = operators.substring(seed,seed);
			} else {
				ret[i] = Integer.toString(seed);
			}
		}
		return ret;
	}
	public char [][] generateBinaryMatrix(int limit) {
		Random rand = new Random();
		char [][]ret = new char[rand.nextInt(limit)][rand.nextInt(limit)];
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				ret[i][j] = (char)(rand.nextInt() % 2);
			}
		}
		return ret;
	}
	public int [][] generateRandomMatrix(int limit) {
		Random rand = new Random();
		int [][]ret = new int[rand.nextInt(limit)][rand.nextInt(limit)];
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				ret[i][j] = (rand.nextInt() % limit);
			}
		}
		return ret;
	}
	public int [][] generateRandomMatrix(int limit, int mod) {
		Random rand = new Random();
		int [][]ret = new int[rand.nextInt(limit)][rand.nextInt(limit)];
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				ret[i][j] = Math.abs(rand.nextInt() % mod);
			}
		}
		return ret;
	}
	public void printMatrix(char[][] input) {
		System.out.println("##########################");
		for (int i = 0;i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.printf("%d ",(int)input[i][j]);
			}
			System.out.println();
		}
		System.out.println("##########################");
	}
	public void printMatrix(int[][] input) {
		System.out.println("##########################");
		for (int i = 0;i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.printf("%d ",input[i][j]);
			}
			System.out.println();
		}
		System.out.println("##########################");
	}
}