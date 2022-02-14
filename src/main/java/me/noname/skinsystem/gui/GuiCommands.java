package me.noname.skinsystem.gui;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("skins")){
            if(sender instanceof Player){
                player.openInventory(GuiCounstractor.gui);
            }else {
                player.sendMessage("Nie możesz tego zrobić!");
                return true;
            }
        }
        return false;
    }
}
