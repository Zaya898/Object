package BankApplication;

public class HariltsahDans extends Dans {
	public HariltsahDans(int dugaar, float uldegdel) {
		super(dugaar, uldegdel);
	}
		public boolean zarlagaGarah(int dun) {
         if (dun <= getDansniiUldegdel()) {
              setDansniiUldegdel(getDansniiUldegdel() - dun);
                return true;
            } else {
                return false;
         }
    }
}
