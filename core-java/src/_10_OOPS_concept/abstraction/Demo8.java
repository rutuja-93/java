package _10_OOPS_concept.abstraction;

public class Demo8 {
    public static void main(String[] args) {
        interface MessageService {
            void sendMessage(String message);
        }
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message "+message);
            }
        }

        abstract class MessageServiceImpl2 implements MessageService {}
    }
}
