public class Slot {

    private SlotType slotType;

    public Slot(SlotType slotType) {
        this.slotType = slotType;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public int getPositionValueFromEnum(){
        return this.slotType.getPosition();
    }

    public int getRowValueFromEnum(){
        return this.slotType.getRow();
    }

    public int getColumnValueFromEnum(){
        return this.slotType.getColumn();
    }
}
