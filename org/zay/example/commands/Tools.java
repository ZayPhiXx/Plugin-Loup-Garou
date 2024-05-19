/*    */ package org.zay.example.commands;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tools
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String msglabel, String[] args) {
/* 20 */     if (sender instanceof Player) {
/* 21 */       Player player = (Player)sender;
/* 22 */       player.sendMessage("§aOutils du loup garou récupérés");
/* 23 */       player.getInventory().clear();
/* 24 */       player.getInventory().setItem(0, getItem(Material.COMPASS, "Lg Settings"));
/* 25 */       player.getInventory().setItem(8, getItem(Material.PLAYER_HEAD, "Roles"));
/* 26 */       player.updateInventory();
/*    */     } 
/*    */     
/* 29 */     return false;
/*    */   }
/*    */   
/*    */   public ItemStack getItem(Material material, String name) {
/* 33 */     ItemStack it = new ItemStack(material);
/* 34 */     ItemMeta itM = it.getItemMeta();
/* 35 */     itM.setDisplayName(name);
/* 36 */     it.setItemMeta(itM);
/* 37 */     return it;
/*    */   }
/*    */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\commands\Tools.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */