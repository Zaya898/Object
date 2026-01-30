package BankApplication;

public class Dans {
	public int dansniiDugaar;
	private float dansniiUldegdel;
    public void orlogoNemekh(int dun) {
	    this.dansniiUldegdel += dun;
    }
    public Dans(int dugaar, float uldegdel) {
        this.dansniiDugaar = dugaar;
        this.dansniiUldegdel = uldegdel;
    }
  
    public float getDansniiUldegdel() {
        return dansniiUldegdel;
    }

    public void setDansniiUldegdel(float uldegdel) {
        this.dansniiUldegdel = uldegdel;
    }       
    public void haruulah() {
        System.out.println("Dansnii dugaar: " + dansniiDugaar + ", Uldegdel: " + dansniiUldegdel);
    }
    public void orlogoNemekh(float dun) {
        this.dansniiUldegdel += dun;
        System.out.println(dun + " orlogo hiilee");
    }
}
