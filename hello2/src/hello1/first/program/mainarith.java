package hello1.first.program;

public class mainarith {
		public static void main(String args[]) {
		arith operation=new arith();
		arith operation2=new arith(40,50);
		System.out.println(
				operation.addoperand()+"\n"+
				operation.suboperand()+"\n"+
				operation.muloperand()+"\n"+
				operation.divoperand()+"\n"+
				operation.modoperand());
		System.out.println(
				operation2.addoperand()+"\n"+
				operation2.suboperand()+"\n"+
				operation2.muloperand()+"\n"+
				operation2.divoperand()+"\n"+
				operation2.modoperand());
			
		}
}
