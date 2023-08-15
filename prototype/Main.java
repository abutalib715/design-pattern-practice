class Main {
    public static void main(String[] args) {
        System.out.println("Creating Object....");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("12.34.56.78");

        try {
            networkConnection.loadVeryImportantData();
            System.out.println(networkConnection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We want new connection object
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            networkConnection2.getDomains().remove(0);
            System.out.println(networkConnection2);
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection2.clone();
            System.out.println(networkConnection);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}