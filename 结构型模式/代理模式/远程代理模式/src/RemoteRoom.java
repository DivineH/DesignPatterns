/**
 * 服务端代码
 * 远程接口
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteRoom extends Remote{
	public String reportLocation() throws RemoteException;
    public int reportCount() throws RemoteException;
}
