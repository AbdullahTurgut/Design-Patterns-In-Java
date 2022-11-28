public class MailService {
    //method for sending a email
    public void sendEmail(){
        connect(1);
        authenticate();
        //Send Email
        disconnect();
    }
    private void connect(int timeout){
        System.out.println("Connected!");
    }
    private void disconnect(){
        System.out.println("Disconnected!");
    }
    private void authenticate(){
        System.out.println("Authenticate");
    }
}
