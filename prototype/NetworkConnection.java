import java.util.ArrayList;
import java.util.List;

class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very important data";
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.leetcode.com");
        Thread.sleep(5000);
        // It will take 5 minute
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData + " : " + this.domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // FOR SHALLOW CLONING/COPY
//        return super.clone();

        // FOR DEEP CLONING/COPY
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String d: this.getDomains()) {
            networkConnection.getDomains().add(d);
        }

        return networkConnection;
    }
}