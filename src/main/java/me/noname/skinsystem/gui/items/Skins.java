package me.noname.skinsystem.gui.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Skins {
    public static ItemStack catana;

    public static void ImportSkins(){
        Catana();
    }

    private static void Catana(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aKatana");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§aKliknij aby ustawić skina!");
        lore.add("Żeby ustawić skina musisz mieć");
        lore.add("w ręce Netherytowy Miecz");
        lore.add("");
        meta.setCustomModelData(1);
        meta.setLore(lore);
        item.setItemMeta(meta);
        catana = item;
    }

}
