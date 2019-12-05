package subodh.com.springlibrary.model;

public class RecyclerModel {

    String name;
    String nickName;
    String image;


    public RecyclerModel(String name, String nickName, String image) {
        this.name = name;
        this.nickName = nickName;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
