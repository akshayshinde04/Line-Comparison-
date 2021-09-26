package lineproblem;

  public class Linecomparisonproblem {
	  double length (int x1,int x2,int y1, int y2)
		{
			double length;
			length=Math.sqrt((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
			return length;
		}
public static void main(String[] args) {
	Linecomparisonproblem Object = new Linecomparisonproblem();
	Double line1 = Object.length(7,9,5,6);
	Double line2 = Object.length(2,8,4,3);
	System.out.println("line1 and line2 are equal :" +line1.equals(line2));
	}
		
		
}