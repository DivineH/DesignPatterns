/**
 * ����˴���
 * Զ�̽ӿ�
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteRoom extends Remote{
	public String reportLocation() throws RemoteException;
    public int reportCount() throws RemoteException;
}
