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
	Double line1 = Object.length(1,6,1,5);
	Double line2 = Object.length(2,4,2,3);
	{
	if(Double.compare(line1,line2) == 0)
		System.out.println("Both the lines are Equal");
	else if(Double.compare(line1,line2) < 0)
		System.out.println("line2 is greater than line 1");
	else
		System.out.println("line 1 is greater than line 2 ");
	}
	}
		
		
}