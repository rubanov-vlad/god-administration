public class Decicion {
    private long id;
    private String desireStatus;
    private long desireId;

    public Decicion(long id, String desireStatus, long desireId) {
        this.id = id;
        this.desireStatus = desireStatus;
        this.desireId = desireId;
    }

    public void setId (long id) {
        this.id = id;
    }

    public long getId () {
        return (long) id;
    }

    public void setDesireStatus (String desireStatus) {
        this.desireStatus = desireStatus;
    }

    public String getDesireStatus () {
        return (String) desireStatus;
    }

    public void setDesireIdId (long desireId) {
        this.desireId = desireId;
    }

    public long getdesireID () {
        return (long) desireId;
    }

}
