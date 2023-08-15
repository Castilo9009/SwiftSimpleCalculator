package demo.classes

/**
 * Created by ian on 5/12/2016.
 */

/**
 * The contents of a message (essentially a struct).
 * @param sender  the id of the sender
 * @param body  the message body
 */
data class Message(val sender: String, val body: String)

/**
 * An agent that sends and receives messages.
 * @param agentId  the id of the agent
 */
class Agent(val agentId: String)
{
    /**
     * Sends a message to the specified agent
     * @param agent  the agent to send the message to.
     */
    fun sendMessage(agent: Agent)
    {
        val message = Message(sender = agentId,
                              body = "Hello!")
        agent.receiveMessage(message)
    }

    /**
     * Receives a message from another agent and prints it out.
     * @param message  the message info
     */
    fun receiveMessage(message: Message)
    {
        println("Message Received")
        println("  From: ${message.sender}")
        println("  Message:")
        println("    ${message.body}")
    }
}

/**
 * Main function
 */
fun main(args: Array<String>)
{
    val agent1 = Agent("Agent 1")
    val agent2 = Agent("Agent 2")

    agent1.sendMessage(agent2)
}