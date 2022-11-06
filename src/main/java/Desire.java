import java.time.LocalDate;

public class Desire {
    private long id;
    private String desireContent;
    private LocalDate createdAtUtc;
    private long userId;
    private desireStatus desirestatus;
    private long sphereId;

    public Desire(long id, String desireContent, LocalDate createdAtUtc, long userId, desireStatus desirestatus, long sphereId) {
        this.id = id;
        this.desireContent = desireContent;
        this.createdAtUtc = createdAtUtc;
        this.userId = userId;
        this.desirestatus = desirestatus;
        this.sphereId = sphereId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return (long) id;
    }

    public void setDesireContent(String desireContent) {
        this.desireContent = desireContent;
    }

    public String getDesireContent() {
        return (String) desireContent;
    }

    public void setCreatedAtUtc(LocalDate createdAtUtc) {
        this.createdAtUtc = createdAtUtc;
    }

    public LocalDate getCreatedAtUtc() {
        return (LocalDate) createdAtUtc;
    }

    public void setUserId(long userid) {
        this.userId = userid;
    }

    public long getUserId() {
        return (long) userId;
    }

    public void setDesireStatus (desireStatus desirestatus) {
        this.desirestatus = desirestatus;
    }

    public desireStatus getDesireStatus() {
        return (desireStatus) desirestatus;
    }

    public void setSphereId(long sphereId) {
        this.sphereId = sphereId;
    }

    public long getSphereId() {
        return (long) sphereId;
    }
}
