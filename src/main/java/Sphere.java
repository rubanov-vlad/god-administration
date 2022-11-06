public class Sphere {
    private long id;
    private String sphereName;

    public Sphere(long id, String sphereName) {
        this.id = id;
        this.sphereName = sphereName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return (long) id;
    }

    public void setSphereName(String sphereName) {
        this.sphereName = sphereName;
    }

    public String getSphereName() {
        return (String) sphereName;
    }
}
