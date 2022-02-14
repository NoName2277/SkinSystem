package me.noname.skinsystem.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GuiCounstractor {
    public static Inventory gui;


    public static void createInventory(){
        gui = Bukkit.createInventory(null, 18, "§b§lSkins");

        ItemStack clear = new ItemStack(Material.PAPER);
        ItemMeta clearMeta = clear.getItemMeta();
        List<String> lore1 = new ArrayList<>();
        lore1.add("§aKliknij aby wyczyść szkin");
        clearMeta.setLore(lore1);
        clear.setItemMeta(clearMeta);
        clearMeta.setDisplayName("§bWyczyść");
        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName("§aKatana");
        List<String> lore = new ArrayList<>();
        lore.add("§aKliknij mnie aby ustawić ten skin!");
        lore.add("§cAby ustawić ten skin musisz trzymać");
        lore.add(" w rence Netherytowy Miecz!");

        swordMeta.setLore(lore);
        swordMeta.setCustomModelData(1);
        sword.setItemMeta(swordMeta);
        gui.setItem(4, sword);
        ItemStack quit = new ItemStack(Material.RED_BANNER);
        ItemMeta quitMeta = quit.getItemMeta();
        quitMeta.setDisplayName("§bWyjdz");
        quit.setItemMeta(quitMeta);
        gui.setItem(17, quit);
    }
}
