class Vehicle extends Ownership {

    String id;
    String issuedTo;
    String operational;

    public Vehicle() {

    }

    public Vehicle(String id, String issuedTo, String operational, String owner, String section) {
        this.id = id;
        this.issuedTo = issuedTo;
        this.operational = operational;

        setOwner(owner);
        setSection(section);

    }

    public String getId() {
        return id;

    }

    public String getIssuedTo() {
        return issuedTo;

    }

    public String getOperational() {
        return operational;

    }

    public void display(Vehicle vehicle) {
        System.out.println("Vehicle number: \t" + id + "\nIssued to: \t" + issuedTo + "\nIs it operational? If not, what maintenance needs to be done: \t" + operational + "\nWho owns it: \t" + getOwner() + "\nWhat section: \t" + getSection());
    }

    public String toString() {
        return "This is a military vehicle!";
    }
}

