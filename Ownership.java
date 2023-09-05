
class Ownership {

    private String owner;
    private String section;


    public Ownership() {

    }

    public Ownership(String owner, String section) {
        this.owner = owner;
        this.section = section;
        //this.vehicles = vehicles;
    }

    public String getOwner() {
        return owner;

    }

    public void setOwner(String owner) {
        this.owner = owner;

    }

    public String getSection() {
        return section;

    }

    public void setSection(String section) {
        this.section = section;
    }

    public void display(Vehicle property) {
        System.out.println("Who it belongs to: \t" + owner + "\nWhat section: " + section);
    }
}