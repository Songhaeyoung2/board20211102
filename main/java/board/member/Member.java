
package board.member;

// �߻�Ŭ����
public abstract class Member {
	
	protected String loginId;
	protected String loginPw;
	protected String nickname;	
	
	// �߻�޼���
	// 1. ���� ���� �޼��尡 ����.
	// 2. �ݵ�� �������ҰŶ�� ������ �ؼ� ����аǵ� �׷��� ���� ���� �ִ�.
	// 3. �����Ǹ� ���ϸ� �ȵǰ��ϰ�Ͱ�
	public abstract void welcome();

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}




}