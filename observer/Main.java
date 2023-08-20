import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

//        Subscriber nabil = new Subscriber("Nabil");
//
//        Subscriber nafisa = new Subscriber("Nafisa");
//
//        youtubeChannel.subscribe(nabil);
//        youtubeChannel.subscribe(nafisa);
//
//        youtubeChannel.newVideoUpload("Restrict Social Media");
//        youtubeChannel.newVideoUpload("Memorizing FB Profile");


        // CONSOLE BASED APP
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                System.out.println("Press 1 to upload a new Video");
                System.out.println("Press 2 to Subscribe to Channel");
                System.out.println("Press 3 to Unsubscribe to Channel");
                System.out.println("Press 4 to exit");

                int inp = Integer.parseInt(br.readLine());

                if (inp == 1) {
                    // New Video Upload
                    System.out.println("Enter Video Title: ");
                    String videoTitle = br.readLine();
                    youtubeChannel.newVideoUpload(videoTitle);
                } else if (inp == 2) {
                    // Subscribe to channel
                    System.out.println("Enter Subscriber Name: ");
                    String name = br.readLine();
                    Subscriber subscriber = new Subscriber(name);
                    youtubeChannel.subscribe(subscriber);
                }  else if (inp == 3) {
                    // Subscribe to channel
                    System.out.println("Enter Subscriber Index Number to Unsubscribe: ");
                    int index = Integer.parseInt(br.readLine());
                    youtubeChannel.unsubscribe(youtubeChannel.subscribers.remove(index));
                } else if (inp == 4) {
                    // Exit
                    System.out.println("Thank you for staying with us.");
                    break;
                } else {
                    // Wrong Input
                    System.out.println("Wrong Input! Please try again!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
