/**
 * ����˴���
 * Զ��ʵ��
 */

import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class DefaultRemoteRoom extends UnicastRemoteObject implements RemoteRoom {
	private static final long serialVersionUID = 43546354L;
	private int count;
	private String location;
	
	public DefaultRemoteRoom(int count, String location) throws RemoteException {
		this.count = count;
        this.location = location;
	}
	
	@Override
	public String reportLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}
	
	@Override
	public int reportCount() throws RemoteException {
		// TODO Auto-generated method stub
		return count;
	}
	
	@Override  
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Remote location is: ");
		sb.append(location);
		sb.append("\n");
		sb.append("Curret count is: ");
		sb.append(count);
		return sb.toString();
    }
	
	public static void main(String[] args) {
		try {
			RemoteRoom service = new DefaultRemoteRoom(0, "Dining Room");
			//��Զ�̶���RMI Registry���ͻ���RMI Registry��ͨ��ע��������������
			Naming.rebind("RemoteRoom", service);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
