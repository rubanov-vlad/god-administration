public class Discussion {
    private long id;
    private Opinion opinion;
    private long godId;
    private long desireId;
    public Discussion (long id, Opinion opinion, long godId, long desireId) {
        this.id = id;
        this.opinion = opinion;
        this.godId = godId;
        this.desireId = desireId;
    }
}
