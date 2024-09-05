import java.io.Serializable;

public class Lotto implements Serializable {
	// ����ȭ�� ����� �ʵ�
	private static final long serialVersionUID = 2L;
	private final int su;
	private transient String color;	//����ȭ ����
	
	public Lotto(int su,String color) {
		this.su=su;
		this.color=color;
	}
	public void show() {
		System.out.println(color+"�� "+su);
	}
}
