
public class ClassOne {
	
	
	public void haveyouMasteredGit(boolean status) {
		if(status==true) {
			System.out.println("Yes i have mastered");
		}
		else  {
			System.out.println("No its still in progress");
		}
	}
public static void main(String[] args) {
	System.out.println("I almost learned teh flow of github");
	ClassOne obj = new ClassOne();
	obj.haveyouMasteredGit(false);
}
}
