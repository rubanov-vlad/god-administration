import java.util.Objects;

public class Discussion {
    private Long id;
    private Opinion opinion;
    private Long godId;
    private Long desireId;

    public Discussion(long id, Opinion opinion, long godId, long desireId) {
        this.id = id;
        this.opinion = opinion;
        this.godId = godId;
        this.desireId = desireId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() { return id; }

    public void setOpinion(Opinion opinion) { this.opinion = opinion; }

    public Opinion getOpinion() {
        return opinion;
    }

    public void setGodId(long godId) {
        this.godId = godId;
    }

    public long getGodId() {
        return godId;
    }

    public void setDesireId(long desireId) {
        this.desireId = desireId;
    }

    public long getDesireId() {
        return desireId;
    }



    public String toString() {
        return "Discussion{" +
                "id=" + id +
                ", opinion=" + opinion +
                ", godId=" + godId +
                ", desireId=" + desireId +
                '}';
    }

    public boolean equals(Object ob) {
        if (ob == this) {
            return true;
        }

        if (ob == null || ob.getClass() != getClass()) {
            return false;
        }

        Discussion discussion = (Discussion) ob;

        return Objects.equals(this.id, discussion.id) &&
               Objects.equals(this.opinion, discussion.opinion) &&
               Objects.equals(this.godId, discussion.godId) &&
               Objects.equals(this.desireId, discussion.desireId);

    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        result = (int) (31 * result + id);
        return result;
    }

}
