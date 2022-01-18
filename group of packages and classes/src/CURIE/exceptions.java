package CURIE;

public class exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ATM bobATM=new ATM();
		try {
			bobATM.withDrawMoney(3000);
		}catch(MaxWithDrawLimitException e) {
			//1. Catch the exception
			//2. Print
			//3. Action
			System.out.println(e);
			System.out.println("Let me now give a lesser value...");
		}
		catch(NoFundsException ne) {
			System.out.println(ne);
			System.out.println("my balance needs to topedup");
		}
		catch(Exception ee) {
			System.out.println(ee);
			System.out.println("unknown exception");
		}

	}

}
class ATM{
	public void withDrawMoney(int amt)throws Exception {
		int available=1000;
		if(amt>=2000) {
			throw new MaxWithDrawLimitException();
		}
		if(available <=amt) {
			throw new NoFundsException();
		}
	}
}
class MaxWithDrawLimitException extends Exception{
	
}
class NoFundsException extends Exception{
	
}