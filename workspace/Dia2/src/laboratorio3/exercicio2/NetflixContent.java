package laboratorio3.exercicio2;

public class NetflixContent {

    private String name;
    private NetflixContentType contentType;

    public NetflixContent(String name, NetflixContentType contentType) {
        this.name = name;
        this.contentType = contentType;
    }

    public String getName() {
        return name;
    }

    public NetflixContentType getContentType() {
        return contentType;
    }

    @Override
    public String toString() {
        return "NetflixContent{" +
                "name='" + name + '\'' +
                ", contentType=" + contentType +
                '}';
    }
}
