/*    */ package org.zay.example;
/*    */ 
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ import org.zay.example.commands.Command;
/*    */ import org.zay.example.commands.CommandHub;
/*    */ import org.zay.example.commands.Reset;
/*    */ import org.zay.example.commands.Tools;
/*    */ 
/*    */ public class Main extends JavaPlugin {
/*    */   public void onEnable() {
/* 13 */     System.out.println("plugin enable");
/* 14 */     getCommand("test").setExecutor((CommandExecutor)new Command());
/* 15 */     getCommand("alert").setExecutor((CommandExecutor)new Command());
/* 16 */     getCommand("hub").setExecutor((CommandExecutor)new CommandHub());
/* 17 */     getCommand("tools").setExecutor((CommandExecutor)new Tools());
/* 18 */     getCommand("reset").setExecutor((CommandExecutor)new Reset());
/* 19 */     getServer().getPluginManager().registerEvents(new MonPluginListeners(), (Plugin)this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDisable() {
/* 24 */     System.out.println("plugin disable");
/*    */   }
/*    */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\Main.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */