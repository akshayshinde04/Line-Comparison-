package lineproblem;

      public class Linecomparisonproblem {
		double length (int x1,int x2,int y1,int y2)
		{
	       double length;
	       length =Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)); 
		return length;
		}  
		public static void main(String[] args) {	
     Linecomparisonproblem Object = new Linecomparisonproblem();
     double distance = Object.length(1,2,3,4);
	System.out.println("Length between two point is :" +distance);
  }
}
