package demo.classes;

/**
 * Created by ian on 5/12/2016.
 */
public class JAgent
{
    public static class JMessage
    {
        private final String sender;
        private final String body;

        /**
         * The contents of a message (essentially a struct).
         * @param sender  the id of the sender
         * @param body  the message body
         */
        public JMessage(String sender, String body)
        {
            this.sender = sender;
            this.body = body;
        }

        /**
         * @return  the name of the sender
         */
        public String getSender()
        {
            return sender;
        }

        /**
         * @return  the body of the message
         */
        public String getBody()
        {
            return body;
        }
    }

    private final String agentId;

    /**
     * An agent that sends and receives messages.
     * @param agentId  the id of the agent
     */
    public JAgent(String agentId)
    {
        this.agentId = agentId;
    }

    /**
     * Sends a message to the specified agent
     * @param agent  the agent to send the message to.
     */
    public void sendMessage(JAgent agent)
    {
        final JMessage message = new JMessage(agentId,
                                              "Hello!");
        agent.receiveMessage(message);
    }

    /**
     * Receives a message from another agent and prints it out.
     * @param message  the message info
     */
    public void receiveMessage(JMessage message)
    {
        System.out.println("Message Received");
        System.out.println("  From: " + message.getSender());
        System.out.println("  Message:");
        System.out. println("    " + message.getBody());
    }

    /**
     * Main function
     */
    public static void main(String[] args)
    {
        final Agent agent1 = new Agent("Agent 1");
        final Agent agent2 = new Agent("Agent 2");

        agent1.sendMessage(agent2);
    }
}
