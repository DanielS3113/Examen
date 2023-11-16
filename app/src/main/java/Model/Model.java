package Model;

public class Model {
    private String name;
    private String img;
    private String level;

    public Model(String name, String img, String level) {
        this.name = name;
        this.img = img;
        this.level = level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public void setName(String name) {
        this.name = name;
    }
}
