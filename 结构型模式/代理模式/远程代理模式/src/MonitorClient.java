/**
 * ¿Í»§¶Ë´úÂë
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MonitorClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		String[] locations = { "rmi://127.0.0.1/RemoteRoom" };
		RoomMonitor[] monitor = new RoomMonitor[locations.length];
		
		for (int i = 0; i < locations.length; i++) {
		    RemoteRoom reporter = (RemoteRoom) Naming.lookup(locations[i]);
		    monitor[i] = new RoomMonitor(reporter);
		}
		
		for (int i = 0; i < monitor.length; i++) {
		    monitor[i].report();
		}
	}

}
