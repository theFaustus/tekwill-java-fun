package methods.building;

public class Computer {
    private String notes;

    public Computer() {
        this.notes = "n/a";
    }

    public Computer(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notesMemory) {
        this.notes = notesMemory;
    }
}
