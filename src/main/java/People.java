public class People {
    String name;
    String address;
    String ybkh;
    String qydm;
    String sfzh;
    String phone;

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }

    String webAdress;
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ybkh='" + ybkh + '\'' +
                ", qydm='" + qydm + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", phone='" + phone + '\'' +
                ", webAdress='" + webAdress + '\'' +
                '}';
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYbkh() {
        return ybkh;
    }

    public void setYbkh(String ybkh) {
        this.ybkh = ybkh;
    }

    public String getQydm() {
        return qydm;
    }

    public void setQydm(String qydm) {
        this.qydm = qydm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }
}
