package dev.bedless.joinmessages.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import dev.bedless.joinmessages.JoinMessages;
import dev.bedless.joinmessages.config.CString;
import dev.bedless.joinmessages.config.ConfigurationType;
import org.bukkit.command.CommandSender;

@CommandAlias("joinmessage")
@CommandPermission("joinmessage.command.joinmessage")
public class JoinMessageCommand extends BaseCommand {

    @HelpCommand
    @CommandPermission("joinmessage.command.joinmessage")
    public void onHelpCommand(CommandSender commandSender) {
        commandSender.sendMessage("§e§l------------------§r" + JoinMessages.getMessages().getPrefix().toStringT() + "§e§l------------------");
        commandSender.sendMessage("§6/joinmessage reload §f- §eReloads the Plugin");
    }

    @Subcommand("reload")
    @CommandPermission("joinmessage.command.joinmessage.reload")
    @Syntax("§f - §eReloads the Plugin")
    public void onReload(CommandSender commandSender) {
        commandSender.sendMessage(JoinMessages.getMessages().getReloaded()
                .replaceIgnoreCase(CString.Placeholder.PREFIX, JoinMessages.getMessages().getPrefix().toStringT())
                .toStringT()
        );
        JoinMessages.getInstance().reloadConfiguration(ConfigurationType.ALL);
    }

}
