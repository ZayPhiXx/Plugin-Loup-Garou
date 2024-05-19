/*    */ package org.zay.example.commands;
/*    */ 
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Reset
/*    */   implements CommandExecutor {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String name, String[] args) {
/* 11 */     Player player = (Player)sender;
/* 12 */     String[] roles = { "PetiteFille", "LoupGarou", "Corbeau", "MontreurDOurs", "LoupGarouBlanc", "Voyante", "Assassin", "Dictateur", "LoupGarouNoir", "ChaperonRouge", "Faucheur", "EnfantSauvage", "Cupidon", "Chasseur", "Bouffon", "Detective", "GrandMechantLoup", "Survivant", "Garde", "Villageois", "Ange", "Medium", "ChienLoup", "Pyromane", "Pirate", "ChasseurDeVampire", "Vampire", "Pretre", "Sorciere" };
/* 13 */     for (int i = 0; i <= 28; i++) {
/* 14 */       player.chat("/lg roles set " + roles[i] + " 0");
/*    */     }
/* 16 */     player.sendMessage("§aRoles Reset");
/*    */     
/* 18 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\commands\Reset.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */