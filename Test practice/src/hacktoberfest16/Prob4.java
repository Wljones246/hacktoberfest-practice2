/**
 * 
 */
package hacktoberfest16;

/**
 * @author williamjones
 *
 */
public class Prob4 {

	/**
	 * 
	 */
	int size;

	public Prob4(int s) {

		size = s;

	}
	
	public int getSize(){
		return size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Prob4 myProb4 = new Prob4(5);
		
		System.out.println("My problem size: ");
		System.out.println(myProb4);

	}

}
