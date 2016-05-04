
import java.io.* ;
import java.util.* ;

class Node{

	int data ;
	Node left = null,right = null ;

	Node(int val){
		this.data = val ;
	}

	int getVal(){
		return this.data ;
	}
}

class DiagonalTree{

	public static void main(String args[])throws IOException{

		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.right.right = new Node(4);
		node.right.right.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right.left = new Node(7);
		HashMap <Integer ,ArrayList<Integer>> map = new HashMap<>();
		diagonalUtil(node,0,map);
		ArrayList<Integer> list ;
	
		for(Map.Entry<Integer,ArrayList<Integer>> m : map.entrySet()){
			list = m.getValue();
			int length = list.size() ;
			for(int i =0;i<length;i++){
				System.out.print(list.get(i)+"\t");
			}
			System.out.print("\n");
		}
	
	}

	public static void diagonalUtil(Node root,int depth,HashMap<Integer,ArrayList<Integer>> map){
		if(root == null) return ;

		ArrayList<Integer> list = map.get(depth);
		if(list == null){
			list = new ArrayList<Integer>();
			list.add(root.data);
			map.put(depth,list);
		}else{
			list.add(root.data);
			map.put(depth,list);
		}

		diagonalUtil(root.left,depth+1,map);
		diagonalUtil(root.right,depth,map);
		
		
	}

}
