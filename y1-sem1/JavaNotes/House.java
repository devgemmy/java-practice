
public class House {
    private String type;
    private int price;
    private String location;

    public House(String t, int p, String loc) {
        type = t;
        price = p;
        location = loc;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String getLocation() {
        return location;
    }

    public void setLocatione(String loc) {
        location = loc;
    }
}
