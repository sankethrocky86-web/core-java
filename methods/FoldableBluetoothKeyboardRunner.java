class FoldableBluetoothKeyboardRunner{
public static void main(String[] args){
	double ref=FoldableBluetoothKeyboard.openOrClose();
	FoldableBluetoothKeyboard1.openOrClose();
	System.out.println("The status of bluetooth is:" +ref);
}
}