package member;

public interface MemberService {
	public void join(MemberBean member);
	public String login(String id, String password);
	public void detail(String id);
	public void update();
	public void remove(String id);
}
