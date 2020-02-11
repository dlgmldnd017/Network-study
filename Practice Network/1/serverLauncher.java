import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverLauncher {
	public static void main (String []args) {
		Socket client = null; //client �� ���� �Ǵ� ����
		ServerSocket server = null; //������ �޾Ƶ��̴� server socket.
		int port = 10789; //local port ��ȣ
		try {
			server = new ServerSocket(port); //server socket ����
			client = server.accept(); //client�κ����� ������ �޾Ƶ���.
			if (client != null) { //client�� ����� ���, ���� ���¸� ���.
				System.out.println(client.toString());
				}
			client.close(); //client socket�� ����.
			server.close(); //server socket�� ����.
			} catch (IOException e) { //���� �� ���ܰ� �߻��� catch
				e.printStackTrace();
				} finally { //���� �߻� �� socket�� ����.
					if (client != null) {
						try {
							client.close();
							} catch (IOException e) {
								e.printStackTrace();
								}
						}
					if (server != null) {
						try {
							server.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}
	}
}

