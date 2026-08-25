package bai1;

public class Manufacturer {
    private String id;
    private String address;
    private String email;

    public Manufacturer(String id,String address, String email) {
        this.id = id;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "ID : " + id + "Dia chi : " + address + "Emnail : " + email;

    }
}
