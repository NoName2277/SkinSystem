package me.noname.skinsystem.gui.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Functions {

    public static ItemStack clear;
    public static ItemStack quit;

    public static void ImportFunctions(){
        Clear();
        Quit();
    }

    private static void Clear(){
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cWyczyść");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§aKliknij aby usunąć skina!");
        lore.add("");
        meta.setLore(lore);
        item.setItemMeta(meta);
        clear = item;
    }
    private static void Quit(){
        ItemStack item = new ItemStack(Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cWyjdz");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§aKliknij aby wyjść!");
        lore.add("");
        meta.setLore(lore);
        item.setItemMeta(meta);
        quit = item;
    }
}
