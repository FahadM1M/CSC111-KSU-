package PhaseTwo;

/*
 * CSC 111 Phase 2 Project 
 * Students' names:
 * 1. Fahad Almutairi. {case 2}
 * 2. Faris Alhuthayli. {case 1}
 * 3. Mohamed K. {structure}
 *  WE GOT A FULL MARK ദ്ദി( ˘̀ ֊ ˘́).
 */

public class ParkingSlot {

	private int slotId;
	private boolean available;

	public ParkingSlot() {
		slotId = 0;
		available = true;
	}

	public ParkingSlot(int slotId, boolean available) {
		this.slotId = slotId;
		this.available = available;
	}

	// to reserve the slot.
	public void reserve() {
		available = false;
	}

	// to give the availability of the slot.
	public boolean isAvailable() {
		if (this.available == true)
			return true;
		else
			return false;
	}

	// shows if the slot taken or not.
	public void display() {
		if (available == true) {
			System.out.println(String.format("Slot ID: " + slotId + " | Status: Available"));
		} else {
			System.out.println(String.format("Slot ID: " + slotId + " | Status: Occupied"));
		}

	}

	// getter for slot value.
	public int getSlotId() {
		return slotId;
	}

	// setter for slot value.
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	// assign the availability of the slot.
	public void setAvailable(boolean available) {
		this.available = available;
	}

}
