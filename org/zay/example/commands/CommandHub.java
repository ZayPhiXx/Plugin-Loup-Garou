/*    */ package org.zay.example.commands;
/*    */ 
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommandHub
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String msglabel, String[] args) {
/* 20 */     if (sender instanceof Player) {
/* 21 */       Player player = (Player)sender;
/* 22 */       player.setGameMode(GameMode.ADVENTURE);
/* 23 */       Location hub = new Location(player.getWorld(), 268.076D, 70.0D, -203.053D, -166.2F, 3.4F);
/* 24 */       player.sendMessage("vous etes au spawn");
/* 25 */       player.chat("/tools");
/* 26 */       player.teleport(hub);
/* 27 */       player.updateInventory();
/*    */     } 
/*    */ 
/*    */     
/* 31 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\commands\CommandHub.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */