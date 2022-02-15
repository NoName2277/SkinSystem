package me.noname.skinsystem.gui;

import me.noname.skinsystem.gui.items.Functions;
import me.noname.skinsystem.gui.items.Skins;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class GuiCounstractor {
    public static Inventory Swordgui;
    public static Inventory MainGui;

    public static void createSwordGui(){
        Swordgui = Bukkit.createInventory(null, 18, "§b§lSwordSkins");
        Swordgui.setItem(4, Skins.catana);
        Swordgui.setItem(17, Functions.quit);
        Swordgui.setItem(16, Functions.clear);
    }
}
