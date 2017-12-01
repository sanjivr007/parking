package parking;
public class Slot {
	
	 public int slotNo;

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + slotNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slot other = (Slot) obj;
		if (slotNo != other.slotNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Slot [slotNo=" + slotNo + "]";
	}
	
	

}
