import java.time.LocalDate;

public class Desires {
    private long id;
    private String desireContent;
    private LocalDate createdAtUtc;
    private long userId;
    private desireStatus desirestatus;
    private long sphereId;

    public Desires(long id, String desireContent, LocalDate createdAtUtc, long userId, desireStatus desirestatus, long sphereId) {
        this.id = id;
        this.desireContent = desireContent;
        this.createdAtUtc = createdAtUtc;
        this.userId = userId;
        this.desirestatus = desirestatus;
        this.sphereId = sphereId;
    }

}
