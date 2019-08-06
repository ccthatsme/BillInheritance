package co.grandcircus;

public class TippableBill extends Bill {

	private double tip;

	public TippableBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TippableBill(double subtotal, double taxRate) {
		super(subtotal, taxRate);
		// TODO Auto-generated constructor stub
	}

	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
	}

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		this.tip = tip;
	}

	@Override
	public double calcTotal() {
		return super.calcTotal() + getTip();
	}

}
