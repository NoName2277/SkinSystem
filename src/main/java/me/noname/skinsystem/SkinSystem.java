package me.noname.skinsystem;

import me.noname.skinsystem.gui.GuiCommands;
import me.noname.skinsystem.gui.GuiCounstractor;
import me.noname.skinsystem.gui.guievents.SkinGuiEvents;
import me.noname.skinsystem.gui.items.Functions;
import me.noname.skinsystem.gui.items.Skins;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkinSystem extends JavaPlugin{

    @Override
    public void onEnable() {
        Skins.ImportSkins();
        Functions.ImportFunctions();
        GuiCounstractor.createSwordGui();
        getCommand("skins").setExecutor(new GuiCommands());
        getServer().getPluginManager().registerEvents(new SkinGuiEvents(), this);
    }
}