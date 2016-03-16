package phone;

public class CellPhone extends Phone {

	private boolean portable; // 이동성 존재
	private String move;

	public CellPhone() {
		setPortable(true);
	}

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		if (portable) {
			// this.portable = portable;
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			// this.portable = portable;
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		//setPortable(true);
		return super.getCall() + "동시에 " + this.getMove();
	}

}
