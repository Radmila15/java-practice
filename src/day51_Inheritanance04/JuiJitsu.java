package day51_Inheritanance04;

public class JuiJitsu extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("JuiJitsu");
		return minutes * 12;
	}

}
