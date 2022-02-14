package me.noname.skinsystem.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiEvents implements Listener {

    @EventHandler
    public void inventoryClick(InventoryClickEvent event){
        if(!event.getInventory().equals(GuiCounstractor.gui))
            return;
        if(event.getCurrentItem() == null) return;
        if(event.getCurrentItem().getItemMeta() == null) return;
        if(event.getCurrentItem().getItemMeta().getDisplayName() == null) return;
        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        if(event.getSlot() == 4){
            if(player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_SWORD)){
                meta.setCustomModelData(1);
                meta.setDisplayName("§aKatana");
                item.setItemMeta(meta);
                player.sendMessage("§aPomyślnie ustawiono skina!");
            }else{
                player.sendMessage("§cNie masz odpowiedniego itemu w ręce!");
            }
        }else if(event.getSlot() == 17){
                player.closeInventory();
                player.sendMessage("§aZamknięto Gui" +
                        "!");
            }else if(event.getSlot() == 16){
                if(meta.hasCustomModelData()){
                    meta.setCustomModelData(null);
                    player.sendMessage("§aPomyślnie usunięto skina!");
                    player.closeInventory();
            }else{
                player.sendMessage("§cNie można usunąć skina poniewasz nie masz go w ręce!");
            }
        }
    }
}
