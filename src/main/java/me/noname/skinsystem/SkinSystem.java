package me.noname.skinsystem;

import me.noname.skinsystem.gui.GuiCommands;
import me.noname.skinsystem.gui.GuiCounstractor;
import me.noname.skinsystem.gui.GuiEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkinSystem extends JavaPlugin{

    @Override
    public void onEnable() {
        GuiCounstractor.createInventory();
        getCommand("skins").setExecutor(new GuiCommands());
        getServer().getPluginManager().registerEvents(new GuiEvents(), this);
    }
}