package lib;

public class Calculation_lib {
	private int m,n;

	public Calculation_lib(int m, int n) {
		super();
		this.m = m;
		this.n = n; //source�����generate...field�ŃR���X�g���N�^�[���B�ithis�j
	}
	
	public int getPlus() {
		return this.m + this.n;  //public�ɂ��Amain��������̊֐��ɃA�N�Z�X�\�B
		//�����Z������֐��������ō�����Ƃ������ƁB
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
