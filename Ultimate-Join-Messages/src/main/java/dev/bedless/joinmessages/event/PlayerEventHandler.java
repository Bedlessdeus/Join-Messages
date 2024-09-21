package dev.bedless.joinmessages.event;

import dev.bedless.joinmessages.JoinMessages;
import dev.bedless.joinmessages.config.CString;
import dev.bedless.joinmessages.config.Messages;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEventHandler implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Messages messages = JoinMessages.getMessages();
        if(messages.isJoinDefaulted()) return;
        if(messages.isJoinDisabled()) {
            event.setJoinMessage(null);
        } else {
            CString message = messages.getJoinMessage()
                    .replaceIgnoreCase(CString.Placeholder.PREFIX, messages.getPrefix())
                    .replaceIgnoreCase(CString.Placeholder.PLAYER, event.getPlayer().getName());
            if(JoinMessages.getInstance().isPapi()) {
                message.replacePAPI(event.getPlayer());
            }
            event.setJoinMessage(message.toStringT());
        }
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        Messages messages = JoinMessages.getMessages();
        if(messages.isQuitDefaulted()) return;
        if(messages.isQuitDisabled()) {
            event.setQuitMessage(null);
        } else {
            CString message = messages.getQuitMessage()
                    .replaceIgnoreCase(CString.Placeholder.PREFIX, messages.getPrefix())
                    .replaceIgnoreCase(CString.Placeholder.PLAYER, event.getPlayer().getName());
            if(JoinMessages.getInstance().isPapi()) {
                message.replacePAPI(event.getPlayer());
            }
            event.setQuitMessage(message.toStringT());
        }
    }

}
