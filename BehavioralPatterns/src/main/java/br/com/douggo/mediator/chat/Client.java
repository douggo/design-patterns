package br.com.douggo.mediator.chat;

import br.com.douggo.mediator.chat.mediator.Mediator;
import br.com.douggo.mediator.chat.model.EnglishUser;
import br.com.douggo.mediator.chat.model.PortugueseUser;
import br.com.douggo.mediator.chat.model.User;

public class Client {

    public static void main(String[] args) {
        Mediator chatRoom = null;

        User alan = new EnglishUser("Alan", chatRoom);
        User jose = new PortugueseUser("José", chatRoom);
        User sue = new EnglishUser("Sue", chatRoom);
        User maria = new PortugueseUser("Maria", chatRoom);

        chatRoom.addUser(alan);
        chatRoom.addUser(sue);
        chatRoom.addUser(maria);

        alan.sendMessage("Hello");
        maria.sendMessage("Oi");

        chatRoom.removeUser(sue);

        alan.sendMessage("Everything's alright?", maria);
        maria.sendMessage("Estou bem, obrigado", alan);

        chatRoom.addUser(jose);
        jose.sendMessage("Oi");

        chatRoom.removeUser(maria);
    }

}
