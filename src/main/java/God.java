public class God {
    private long id;
    private String godName;
    private long influence;
    private GodType godType;

    public God(long id, String godName, long influence, GodType godType) {
        this.id = id;
        this.godName = godName;
        this.influence = influence;
        this.godType = godType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return (long) id;
    }

    public void setGodName(String godName) {
        this.godName = godName;
    }

    public String getGodName() {
        return (String) godName;
    }

    public void setInfluence(long influence) {
        this.influence = influence;
    }

    public long getInfluence() {
        return (long) influence;
    }

    public void setGodType(GodType godType) {
        this.godType = godType;
    }

    public GodType getGodType() {
        return (GodType) godType;
    }
}