/**
 * ¿Í»§¶Ë´úÂë
 */

import java.rmi.RemoteException;

public class RoomMonitor {
	RemoteRoom room;
	
	public RoomMonitor(RemoteRoom room) {
		this.room = room;
	}
	
	public void report() throws RemoteException {  
        System.out.println("Room location: " + room.reportLocation());  
        System.out.println("Room count: " + room.reportCount());  
    }  
}
