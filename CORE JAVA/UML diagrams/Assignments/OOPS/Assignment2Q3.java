package oops_prpgrams;
import java.util.ArrayList;
public class Assignment2Q3 {
	public int totalCashInBank(ArrayList<Integer> cash){
		int availbal=0;
		for(int i:cash) {
			availbal += 1;
		}
		return availbal;
	}
	public int getCash()
	{
		return 0;
	}
	public static void main(String[] args) {
		Assignment2Q3 assignment2Q3 = new Assignment2Q3();
		CurrAccnt c1 = new CurrAccnt();
		int curbal = c1.getCash();
		SaveAccnt s1 = new SaveAccnt();
		int savbal = s1.getCash();
		ArrayList<Integer> cash = new ArrayList<>();
        cash.add(curbal);
        cash.add(savbal);
        System.out.println(assignment2Q3.totalCashInBank(cash));
	}
}
class SaveAccnt extends Assignment2Q3 {
	 int totalDeposits = 10000;
	 int fixedDepositAmount = 5000;
	 public int getCash() {
		 return totalDeposits+fixedDepositAmount;
	 } 
}
class CurrAccnt extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    public int getCash() {
		 return totalDeposits+creditLimit;
	 } 
}