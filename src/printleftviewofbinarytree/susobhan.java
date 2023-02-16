package printleftviewofbinarytree;
class node{
	int key ;
	node left;
	node right;
	node(int key){
		this.key=key;
		left= null;
		right=null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root=new node(10);
    	root.left=new node(20);
    	root.right=new node(30);
    	root.right.left=new node(40);
    	root.right.right=new node(50);
    	printLeftView(root);
		
	}
	static int maxlevel =0;
	     public static void printleft(node root,int lavel) { //initially maxlavel =0  && lavel =1;  here in the the first case it will print root then  maxlevel = lael
	
		if(root==null) {
			return;
		}
		     if(root!=null) {
			if(maxlevel<lavel) {
				System.out.print(root.key+" ");
			}
			maxlevel=lavel;
			
			// now call the printleft
			//so now lavel will be increse by 1
			printleft(root.left,lavel+1);
			printleft(root.right,lavel+1);
		   }
	}
	
	 public static void printLeftView(node root){
		 printleft(root,1);
	    }

}
