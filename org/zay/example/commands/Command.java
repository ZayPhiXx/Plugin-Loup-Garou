/*    */ package org.zay.example.commands;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Command
/*    */   implements CommandExecutor {
/*    */   public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String msg, String[] args) {
/* 11 */     if (sender instanceof Player) {
/* 12 */       Player player = (Player)sender;
/* 13 */       if (cmd.getName().equalsIgnoreCase("test")) {
/* 14 */         sender.sendMessage("done");
/* 15 */         return true;
/*    */       } 
/*    */       
/* 18 */       if (cmd.getName().equalsIgnoreCase("alert")) {
/* 19 */         if (args.length == 0) {
/* 20 */           player.sendMessage("La commande est : /alert <message>");
/*    */         }
/* 22 */         if (args.length >= 1) {
/* 23 */           StringBuilder bc = new StringBuilder();
/* 24 */           for (String part : args) {
/* 25 */             bc.append(part + " ");
/*    */           }
/*    */           
/* 28 */           Bukkit.broadcastMessage("[" + player.getName() + "] " + bc.toString());
/*    */         } 
/* 30 */         return true;
/*    */       } 
/*    */     } 
/* 33 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\commands\Command.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */