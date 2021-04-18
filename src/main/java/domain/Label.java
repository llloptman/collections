package domain;

public class Label {
    private int id;

    private String name;

    public Label(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Label() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
