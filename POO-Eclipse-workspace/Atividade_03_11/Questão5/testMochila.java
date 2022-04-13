package Questão5;

public class testMochila {

	public static void main(String[] args) {
		
		Mochilas moc = new Mochilas();
		
		moc.setMaterial1("Plastico");
		moc.setPesoMax1(80);
		moc.setTipo1(1);
		moc.setMaterial2("Algodão");
		moc.setPesoMax2(20);
		moc.setTipo2(2);
		moc.setMaterial3("Poliester");
		moc.setPesoMax3(10);
		moc.setTipo3(3);
		
		System.out.print("Mochila 1:\n");
		moc.getMaterial1();
		System.out.print("\nO peso máximo da mochila é:" + moc.getPesoMax1() + "kl\n");
		moc.getTipo1();
		System.out.print("\n\nMochila 2:\n");
		moc.getMaterial2();
		System.out.print("\nO peso máximo da mochila é:" + moc.getPesoMax2() + "kl\n");
		moc.getTipo2();
		System.out.print("\n\nMochila 3:\n");
		moc.getMaterial3();
		System.out.print("\nO peso máximo da mochila é:" + moc.getPesoMax3() + "kl\n");
		moc.getTipo3();
		
		if( moc.getPesoMax1() > moc.getPesoMax2()) {
			if(moc.getPesoMax1() > moc.getPesoMax3()) {
				System.out.print("\n\nA mochila que aguenta mais kilos é a mochila 1, suporta: " + moc.getPesoMax1() + "kl");
			}else {
				System.out.print("\n\nA mochila que aguenta mais kilos é a mochila 3, suporta: " + moc.getPesoMax3() + "kl");
			}
		}else {
			if(moc.getPesoMax2() > moc.getPesoMax3()) {
				System.out.print("\n\nA mochila que aguenta mais kilos é a mochila 2, suporta: " + moc.getPesoMax2() + "kl");
			}else {
				System.out.print("\n\nA mochila que aguenta mais kilos é a mochila 3, suporta: " + moc.getPesoMax3() + "kl");
			}
		}
	}

}
