
public class ServerTest {
    public static void main(String args[]) throws Exception {
        SimpleServerSocket<SocketThread> server = new SimpleServerSocket<>(8000, SocketThread.class, 15);
        server.listen();
    }
}

/** User created class that extends SimpleRunnable.  This will execute on each socket connection.
 * Developer has access to the SimpleSocket protected class from SimpleRunnable and can use it's
 * abstracted methods.*/
class SocketThread extends SimpleRunnable{

    @Override
    public void run(){
    	String Name = simpleSocket.readString();
    	String nNumber = simpleSocket.readString();
    	String Question = simpleSocket.readString();//println recieve from ... student// others
    	System.out.println(Name);
    	System.out.println(nNumber);
    	System.out.println(Question);
        simpleSocket.writeString("Hello Client!");//send to the other
    }

}