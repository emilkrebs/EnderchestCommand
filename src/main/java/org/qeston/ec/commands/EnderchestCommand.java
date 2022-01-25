package org.qeston.ec.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderchestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if(sender.isOp() && args.length == 1){
                Player objective = Bukkit.getPlayerExact(args[0]);

                if(objective != null) {
                    objective.openInventory(objective.getEnderChest());
                } else {
                    sender.sendMessage("§cTarget was not found");
                }
            }
            Player player = (Player) sender;
            player.openInventory(player.getEnderChest());
        }
        return false;
    }
}
