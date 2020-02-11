import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientLauncher {
	public static void main (String []args) {
		int serverPort = 10789; //������ local port
		String serverIP = "127.0.0.1"; //server�� IP �ּ�
		Socket server = null; //server socket
		try {
			server = new Socket(serverIP, serverPort); //server socket�� ����
			if (server != null) { //����Ǹ� ���� ���� ���.
				System.out.println(server.toString());
				}
			server.close(); //���� ����.
			} catch (UnknownHostException e) { //������ ���� ��� �� catch
				e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
					} finally { //���� �� ���� ����� ������ ����.
						if (server != null) {
							try {
								server.close();
								} catch (IOException e) {
									e.printStackTrace();
									}
						}
					}
	}
}