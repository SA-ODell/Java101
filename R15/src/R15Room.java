// R15 Interface Assignment
// Author: Stephen O'Dell
// Date:   11/01/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

public class R15Room implements R15Interface {
	
	private int roomBeds;
	private boolean roomMonitor;
	
	@Override
	public void R15Init(int roomType) {
		if (roomType >= 0 && roomType <= 2) {
			if (roomType == 0) {
				roomBeds = 1;
				roomMonitor = true;
			}
			else if (roomType == 1) {
				roomBeds = 2;
				roomMonitor = true;
			}
			else {
				roomBeds = 1;
				roomMonitor = false;
			}
		}
	}
	@Override
	public boolean checkRoom(boolean needsMonitor, boolean needsSingle) {		
		if ((roomBeds == 1 && roomMonitor) && (needsSingle && needsMonitor)) return true;
		
		else if ((roomBeds == 1 && !roomMonitor) && (needsSingle && !needsMonitor)) return true;
		
		else if ((roomBeds == 2 && roomMonitor) && (!needsSingle && needsMonitor)) return true;
		
		else 
		return false;
	}
	@Override
	public int getRoomBeds() {
		// TODO Auto-generated method stub
		return roomBeds;
	}
	@Override
	public void setRoomBeds(int numBeds) {
		// TODO Auto-generated method stub
		this.roomBeds = numBeds;
	}
	@Override
	public boolean getRoomMonitor() {
		// TODO Auto-generated method stub
		return roomMonitor;
		//return false;
	}
	@Override
	public void setRoomMonitor(boolean hasMonitor) {
		// TODO Auto-generated method stub
		this.roomMonitor = hasMonitor;
	
	}
	
	
}


