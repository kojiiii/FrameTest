package lib;

public class Calculation_lib {
	private int m,n;

	public Calculation_lib(int m, int n) {
		super();
		this.m = m;
		this.n = n; //sourceからのgenerate...fieldでコンストラクター作る。（this）
	}
	
	public int getPlus() {
		return this.m + this.n;  //publicにより、mainからもこの関数にアクセス可能。
		//足し算をする関数をここで作ったということ。
	}
	public int getMinus() {
		return this.m - this.n;
		
	}
	public int getTime() {
		return this.m * this.n;
		
	}
	public int getDivide() {
		return this.m / this.n;
		
	}
	public int getMod() {
		return this.m % this.n;
		
	}

	
}
