class Bill{
  
  
    public static void main(String[]airtel){
		//ClassName.methodName();
		
		Bill bill= new Bill();
		bill.billID=1;
		bill.billAmount=6969;
		bill.isFInalBill=true;
		bill.isLatestBill=true;
		bill.billIssueDate="02/03/2026";
		bill.billDueDate="03/04/2026";
		bill.isBillOverDue=false;
		bill.billInvoice="ABC123";
		
		System.out.println("The bill id is"+bill.billID);
		System.out.println("The bill Amount is"+bill.billAmount);
		System.out.println("The bill Issue Date is"+bill.billIssueDate);
		System.out.println("The bill Due Date is"+bill.billDueDate);
		System.out.println("The bill Invoice is"+bill.billInvoice);
		
		
	}

}