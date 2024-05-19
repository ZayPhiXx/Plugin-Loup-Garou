/*     */ package org.zay.example;
/*     */ 
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.inventory.InventoryAction;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerJoinEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MonPluginListeners
/*     */   implements Listener
/*     */ {
/*  25 */   public int[] i = new int[] { 1, 1, 1 };
/*  26 */   public float speed = 2.0F;
/*     */   
/*  28 */   public int c = 1;
/*  29 */   public int[] d = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
/*  30 */   public Material[] mat = new Material[] { Material.APPLE, Material.WHITE_BED, Material.ROTTEN_FLESH, Material.BLACK_DYE, Material.HONEY_BOTTLE, Material.WHITE_DYE, Material.GLOWSTONE_DUST, Material.DIAMOND_SWORD, Material.TNT, Material.FIRE_CHARGE, Material.RED_DYE, Material.BONE, Material.SPRUCE_SAPLING, Material.SUGAR, Material.BOW, Material.PUFFERFISH, Material.TRIPWIRE_HOOK, Material.FIREWORK_STAR, Material.COMPASS, Material.DIAMOND_CHESTPLATE, Material.ARROW, Material.ENDER_CHEST, Material.COOKIE, Material.FLINT_AND_STEEL, Material.OAK_BOAT, Material.REDSTONE, Material.ENCHANTED_GOLDEN_APPLE, Material.BREWING_STAND, Material.BEETROOT_SOUP };
/*     */   @EventHandler
/*     */   public void onjoin(PlayerJoinEvent event) {
/*  33 */     Player player = event.getPlayer();
/*  34 */     player.setGameMode(GameMode.ADVENTURE);
/*  35 */     player.setWalkSpeed(0.3F);
/*  36 */     player.chat("/tools");
/*  37 */     player.updateInventory();
/*  38 */     player.chat("/difficulty peaceful");
/*  39 */     player.sendMessage("on");
/*     */   }
/*     */   @EventHandler
/*     */   public void oninteract(PlayerInteractEvent event) {
/*  43 */     Player player = event.getPlayer();
/*  44 */     Action action = event.getAction();
/*  45 */     ItemStack it = event.getItem();
/*  46 */     player.updateInventory();
/*  47 */     if (it == null)
/*  48 */       return;  if (it.getType() == Material.DIAMOND_AXE && 
/*  49 */       action == Action.RIGHT_CLICK_AIR) {
/*  50 */       player.sendMessage("click");
/*     */     }
/*     */ 
/*     */     
/*  54 */     if (it.getType() == Material.COMPASS && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equalsIgnoreCase("Lg Settings")) {
/*  55 */       Inventory i = Bukkit.createInventory(null, 36, "§8Menu");
/*  56 */       i.setItem(11, getItem(Material.PAPER, "liste des roles", 1));
/*  57 */       i.setItem(15, getItem(Material.SMOOTH_STONE_SLAB, "Add Spawn Point", 1));
/*  58 */       player.openInventory(i);
/*     */     } 
/*  60 */     if (it.getType() == Material.BOOK && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equalsIgnoreCase("Lancer la Partie")) {
/*  61 */       player.chat("/lg start " + player.getDisplayName());
/*  62 */       player.getInventory().setItem(8, getItem(Material.IRON_NUGGET, "Arrêter la Partie", 1));
/*     */     } 
/*     */     
/*  65 */     if (it.getType() == Material.IRON_NUGGET && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equalsIgnoreCase("Arrêter la Partie")) {
/*  66 */       player.chat("/lg end " + player.getDisplayName());
/*  67 */       player.chat("/tools");
/*     */     } 
/*     */ 
/*     */     
/*  71 */     if (it.getType() == Material.PLAYER_HEAD && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equalsIgnoreCase("Roles")) {
/*  72 */       Inventory in = Bukkit.createInventory(null, 54, "§8Roles");
/*  73 */       in.setItem(0, getItem(this.mat[0], "§2Villageois", this.d[0]));
/*  74 */       in.setItem(1, getItem(this.mat[1], "§2Petite Fille", this.c));
/*  75 */       in.setItem(2, getItem(this.mat[2], "§cLoups Garous", this.d[1]));
/*  76 */       in.setItem(3, getItem(this.mat[3], "§2Corbeau", this.c));
/*  77 */       in.setItem(4, getItem(this.mat[4], "§2Montreur D'Ours", this.c));
/*  78 */       in.setItem(5, getItem(this.mat[5], "§cLoup Garou Blanc", this.c));
/*  79 */       in.setItem(6, getItem(this.mat[6], "§2Voyante", this.c));
/*  80 */       in.setItem(7, getItem(this.mat[7], "§1Assassin", this.c));
/*  81 */       in.setItem(8, getItem(this.mat[8], "§2Dictateur", this.c));
/*  82 */       in.setItem(9, getItem(this.mat[9], "§cLoup Garou Noir", this.c));
/*  83 */       in.setItem(10, getItem(this.mat[10], "§2Chaperon Rouge", this.c));
/*  84 */       in.setItem(11, getItem(this.mat[11], "§2Faucheur", this.c));
/*  85 */       in.setItem(12, getItem(this.mat[12], "§2Enfant Sauvage", this.c));
/*  86 */       in.setItem(13, getItem(this.mat[13], "§2Cupidon", this.c));
/*  87 */       in.setItem(14, getItem(this.mat[14], "§2Chasseur", this.d[2]));
/*  88 */       in.setItem(15, getItem(this.mat[15], "§5Bouffon", this.c));
/*  89 */       in.setItem(16, getItem(this.mat[16], "§2Detective", this.c));
/*  90 */       in.setItem(17, getItem(this.mat[17], "§cGrand Méchant Loup", this.c));
/*  91 */       in.setItem(18, getItem(this.mat[18], "§5Survivant", this.c));
/*  92 */       in.setItem(19, getItem(this.mat[19], "§2Garde", this.c));
/*  93 */       in.setItem(20, getItem(this.mat[20], "§5Ange", this.c));
/*  94 */       in.setItem(21, getItem(this.mat[21], "§2Medium", this.c));
/*  95 */       in.setItem(22, getItem(this.mat[22], "§2Chienloup", this.c));
/*  96 */       in.setItem(23, getItem(this.mat[23], "§6Pyromane", this.c));
/*  97 */       in.setItem(24, getItem(this.mat[24], "§2Pirate", this.c));
/*  98 */       in.setItem(25, getItem(this.mat[25], "§1Vampire", this.c));
/*  99 */       in.setItem(26, getItem(this.mat[26], "§2Prêtre", this.c));
/* 100 */       in.setItem(27, getItem(this.mat[27], "§2Sorcière", this.c));
/* 101 */       in.setItem(28, getItem(this.mat[28], "§2Chasseur de Vampire", this.c));
/* 102 */       in.setItem(40, getItem(Material.GOLD_NUGGET, "Valider les Roles", 1));
/* 103 */       in.setItem(53, getItem(Material.ANVIL, "Reset Les Roles", 1));
/* 104 */       player.openInventory(in);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onclick(InventoryClickEvent event) {
/* 110 */     Inventory inv = event.getInventory();
/* 111 */     Player player = (Player)event.getWhoClicked();
/* 112 */     InventoryAction ac = event.getAction();
/* 113 */     ItemStack current = event.getCurrentItem();
/* 114 */     Location lg = new Location(player.getWorld(), 167.361D, 71.0D, -172.497D, 86.2F, 8.4F);
/* 115 */     if (current == null)
/* 116 */       return;  if (current.getType() == Material.PAPER) {
/* 117 */       player.closeInventory();
/* 118 */       player.chat("/lg roles list");
/*     */     } 
/* 120 */     if (current.getType() == Material.APPLE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Villageois")) {
/* 121 */       player.chat("/lg roles set Villageois 1");
/* 122 */       inv.setItem(0, getItem(Material.DRAGON_EGG, "§2Villageois", 1));
/* 123 */       this.mat[0] = Material.DRAGON_EGG;
/* 124 */       player.openInventory(inv);
/*     */     } 
/*     */     
/* 127 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Villageois")) {
/* 128 */       this.i[0] = this.i[0] + 1;
/* 129 */       this.d[0] = this.i[0];
/* 130 */       inv.setItem(0, getItem(Material.DRAGON_EGG, "§2Villageois", this.i[0]));
/* 131 */       player.chat("/lg roles set Villageois " + this.i[0]);
/* 132 */       this.mat[0] = Material.DRAGON_EGG;
/* 133 */       player.openInventory(inv);
/*     */     } 
/*     */     
/* 136 */     if (current.getType() == Material.WHITE_BED && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Petite Fille")) {
/* 137 */       player.chat("/lg roles set PetiteFille 1");
/* 138 */       inv.setItem(1, getItem(Material.DRAGON_EGG, "§2Petite Fille", 1));
/* 139 */       this.mat[1] = Material.DRAGON_EGG;
/* 140 */       player.openInventory(inv);
/*     */     } 
/* 142 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Petite Fille")) {
/* 143 */       inv.setItem(1, getItem(Material.DRAGON_EGG, "§2Petite Fille", 1));
/* 144 */       this.mat[1] = Material.DRAGON_EGG;
/* 145 */       player.openInventory(inv);
/*     */     } 
/* 147 */     if (current.getType() == Material.ROTTEN_FLESH && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoups Garous")) {
/* 148 */       player.chat("/lg roles set LoupGarou 1");
/* 149 */       inv.setItem(2, getItem(Material.DRAGON_EGG, "§cLoups Garous", 1));
/* 150 */       this.mat[2] = Material.DRAGON_EGG;
/* 151 */       player.openInventory(inv);
/*     */     } 
/* 153 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoups Garous")) {
/* 154 */       this.i[1] = this.i[1] + 1;
/* 155 */       this.d[1] = this.i[1];
/* 156 */       inv.setItem(2, getItem(Material.DRAGON_EGG, "§cLoups Garous", this.i[1]));
/* 157 */       player.chat("/lg roles set LoupGarou " + this.i[1]);
/* 158 */       this.mat[2] = Material.DRAGON_EGG;
/* 159 */       player.openInventory(inv);
/*     */     } 
/* 161 */     if (current.getType() == Material.BLACK_DYE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Corbeau")) {
/* 162 */       player.chat("/lg roles set Corbeau 1");
/* 163 */       inv.setItem(3, getItem(Material.DRAGON_EGG, "§2Corbeau", 1));
/* 164 */       this.mat[3] = Material.DRAGON_EGG;
/* 165 */       player.openInventory(inv);
/*     */     } 
/* 167 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Corbeau")) {
/* 168 */       inv.setItem(3, getItem(Material.DRAGON_EGG, "§2Corbeau", 1));
/* 169 */       this.mat[3] = Material.DRAGON_EGG;
/* 170 */       player.openInventory(inv);
/*     */     } 
/* 172 */     if (current.getType() == Material.HONEY_BOTTLE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Montreur D'Ours")) {
/* 173 */       player.chat("/lg roles set MontreurDOurs 1");
/* 174 */       inv.setItem(4, getItem(Material.DRAGON_EGG, "§2Montreur D'Ours", 1));
/* 175 */       this.mat[4] = Material.DRAGON_EGG;
/* 176 */       player.openInventory(inv);
/*     */     } 
/* 178 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Montreur D'Ours")) {
/* 179 */       inv.setItem(4, getItem(Material.DRAGON_EGG, "§2Montreur D'Ours", 1));
/* 180 */       this.mat[4] = Material.DRAGON_EGG;
/* 181 */       player.openInventory(inv);
/*     */     } 
/* 183 */     if (current.getType() == Material.WHITE_DYE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Blanc")) {
/* 184 */       player.chat("/lg roles set LoupGarouBlanc 1");
/* 185 */       inv.setItem(5, getItem(Material.DRAGON_EGG, "§cLoup Garou Blanc", 1));
/* 186 */       this.mat[5] = Material.DRAGON_EGG;
/* 187 */       player.openInventory(inv);
/*     */     } 
/* 189 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Blanc")) {
/* 190 */       inv.setItem(5, getItem(Material.DRAGON_EGG, "§cLoup Garou Blanc", 1));
/* 191 */       this.mat[5] = Material.DRAGON_EGG;
/* 192 */       player.openInventory(inv);
/*     */     } 
/* 194 */     if (current.getType() == Material.GLOWSTONE_DUST && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Voyante")) {
/* 195 */       player.chat("/lg roles set Voyante 1");
/* 196 */       inv.setItem(6, getItem(Material.DRAGON_EGG, "§2Voyante", 1));
/* 197 */       this.mat[6] = Material.DRAGON_EGG;
/* 198 */       player.openInventory(inv);
/*     */     } 
/* 200 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Voyante")) {
/* 201 */       inv.setItem(6, getItem(Material.DRAGON_EGG, "§2Voyante", 1));
/* 202 */       this.mat[6] = Material.DRAGON_EGG;
/* 203 */       player.openInventory(inv);
/*     */     } 
/* 205 */     if (current.getType() == Material.DIAMOND_SWORD && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Assassin")) {
/* 206 */       player.chat("/lg roles set Assassin 1");
/* 207 */       inv.setItem(7, getItem(Material.DRAGON_EGG, "§1Assassin", 1));
/* 208 */       this.mat[7] = Material.DRAGON_EGG;
/* 209 */       player.openInventory(inv);
/*     */     } 
/* 211 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Assassin")) {
/* 212 */       inv.setItem(7, getItem(Material.DRAGON_EGG, "§1Assassin", 1));
/* 213 */       this.mat[7] = Material.DRAGON_EGG;
/* 214 */       player.openInventory(inv);
/*     */     } 
/* 216 */     if (current.getType() == Material.TNT && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Dictateur")) {
/* 217 */       player.chat("/lg roles set Dictateur 1");
/* 218 */       inv.setItem(8, getItem(Material.DRAGON_EGG, "§2Dictateur", 1));
/* 219 */       this.mat[8] = Material.DRAGON_EGG;
/* 220 */       player.openInventory(inv);
/*     */     } 
/* 222 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Dictateur")) {
/* 223 */       inv.setItem(8, getItem(Material.DRAGON_EGG, "§2Dictateur", 1));
/* 224 */       this.mat[8] = Material.DRAGON_EGG;
/* 225 */       player.openInventory(inv);
/*     */     } 
/* 227 */     if (current.getType() == Material.FIRE_CHARGE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Noir")) {
/* 228 */       player.chat("/lg roles set LoupGarouNoir 1");
/* 229 */       inv.setItem(9, getItem(Material.DRAGON_EGG, "§cLoup Garou Noir", 1));
/* 230 */       this.mat[9] = Material.DRAGON_EGG;
/* 231 */       player.openInventory(inv);
/*     */     } 
/* 233 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Noir")) {
/* 234 */       inv.setItem(9, getItem(Material.DRAGON_EGG, "§cLoup Garou Noir", 1));
/* 235 */       this.mat[9] = Material.DRAGON_EGG;
/* 236 */       player.openInventory(inv);
/*     */     } 
/* 238 */     if (current.getType() == Material.RED_DYE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2ChaperonRouge")) {
/* 239 */       player.chat("/lg roles set ChaperonRouge 1");
/* 240 */       inv.setItem(10, getItem(Material.DRAGON_EGG, "§2ChaperonRouge", 1));
/* 241 */       this.mat[10] = Material.DRAGON_EGG;
/* 242 */       player.openInventory(inv);
/*     */     } 
/* 244 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2ChaperonRouge")) {
/* 245 */       inv.setItem(10, getItem(Material.DRAGON_EGG, "§2ChaperonRouge", 1));
/* 246 */       this.mat[10] = Material.DRAGON_EGG;
/* 247 */       player.openInventory(inv);
/*     */     } 
/* 249 */     if (current.getType() == Material.BONE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Faucheur")) {
/* 250 */       player.chat("/lg roles set Faucheur 1");
/* 251 */       inv.setItem(11, getItem(Material.DRAGON_EGG, "§2Faucheur", 1));
/* 252 */       this.mat[11] = Material.DRAGON_EGG;
/* 253 */       player.openInventory(inv);
/*     */     } 
/* 255 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Faucheur")) {
/* 256 */       inv.setItem(11, getItem(Material.DRAGON_EGG, "§2Faucheur", 1));
/* 257 */       this.mat[11] = Material.DRAGON_EGG;
/* 258 */       player.openInventory(inv);
/*     */     } 
/* 260 */     if (current.getType() == Material.SPRUCE_SAPLING && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Enfant Sauvage")) {
/* 261 */       player.chat("/lg roles set EnfantSauvage 1");
/* 262 */       inv.setItem(12, getItem(Material.DRAGON_EGG, "§2Enfant Sauvage", 1));
/* 263 */       this.mat[12] = Material.DRAGON_EGG;
/* 264 */       player.openInventory(inv);
/*     */     } 
/* 266 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Enfant Sauvage")) {
/* 267 */       inv.setItem(12, getItem(Material.DRAGON_EGG, "§2Enfant Sauvage", 1));
/* 268 */       this.mat[12] = Material.DRAGON_EGG;
/* 269 */       player.openInventory(inv);
/*     */     } 
/* 271 */     if (current.getType() == Material.SUGAR && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Cupidon")) {
/* 272 */       player.chat("/lg roles set Cupidon 1");
/* 273 */       inv.setItem(13, getItem(Material.DRAGON_EGG, "§2Cupidon", 1));
/* 274 */       this.mat[13] = Material.DRAGON_EGG;
/* 275 */       player.openInventory(inv);
/*     */     } 
/* 277 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Cupidon")) {
/* 278 */       inv.setItem(13, getItem(Material.DRAGON_EGG, "§2Cupidon", 1));
/* 279 */       this.mat[13] = Material.DRAGON_EGG;
/* 280 */       player.openInventory(inv);
/*     */     } 
/* 282 */     if (current.getType() == Material.BOW && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur")) {
/* 283 */       player.chat("/lg roles set Chasseur 1");
/* 284 */       inv.setItem(14, getItem(Material.DRAGON_EGG, "§2Chasseur", 1));
/* 285 */       this.mat[14] = Material.DRAGON_EGG;
/* 286 */       player.openInventory(inv);
/*     */     } 
/* 288 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur")) {
/* 289 */       this.i[2] = this.i[2] + 1;
/* 290 */       this.d[2] = this.i[2];
/* 291 */       inv.setItem(14, getItem(Material.DRAGON_EGG, "§2Chasseur", this.i[2]));
/* 292 */       player.chat("/lg roles set Chasseur " + this.i[2]);
/* 293 */       this.mat[14] = Material.DRAGON_EGG;
/* 294 */       player.openInventory(inv);
/*     */     } 
/* 296 */     if (current.getType() == Material.PUFFERFISH && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Bouffon")) {
/* 297 */       player.chat("/lg roles set Bouffon 1");
/* 298 */       inv.setItem(15, getItem(Material.DRAGON_EGG, "§5Bouffon", 1));
/* 299 */       this.mat[15] = Material.DRAGON_EGG;
/* 300 */       player.openInventory(inv);
/*     */     } 
/* 302 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Bouffon")) {
/* 303 */       inv.setItem(15, getItem(Material.DRAGON_EGG, "§5Bouffon", 1));
/* 304 */       this.mat[15] = Material.DRAGON_EGG;
/* 305 */       player.openInventory(inv);
/*     */     } 
/* 307 */     if (current.getType() == Material.TRIPWIRE_HOOK && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Detective")) {
/* 308 */       player.chat("/lg roles set Detective 1");
/* 309 */       inv.setItem(16, getItem(Material.DRAGON_EGG, "§2Detective", 1));
/* 310 */       this.mat[16] = Material.DRAGON_EGG;
/* 311 */       player.openInventory(inv);
/*     */     } 
/*     */     
/* 314 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Detective")) {
/* 315 */       inv.setItem(16, getItem(Material.DRAGON_EGG, "§2Detective", 1));
/* 316 */       this.mat[16] = Material.DRAGON_EGG;
/* 317 */       player.openInventory(inv);
/*     */     } 
/* 319 */     if (current.getType() == Material.FIREWORK_STAR && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cGrand Méchant Loup")) {
/* 320 */       player.chat("/lg roles set GrandMechantLoup 1");
/* 321 */       inv.setItem(17, getItem(Material.DRAGON_EGG, "§cGrand Méchant Loup", 1));
/* 322 */       this.mat[17] = Material.DRAGON_EGG;
/* 323 */       player.openInventory(inv);
/*     */     } 
/* 325 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cGrand Méchant Loup")) {
/* 326 */       inv.setItem(17, getItem(Material.DRAGON_EGG, "§cGrand Méchant Loup", 1));
/* 327 */       this.mat[17] = Material.DRAGON_EGG;
/* 328 */       player.openInventory(inv);
/*     */     } 
/* 330 */     if (current.getType() == Material.COMPASS && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Survivant")) {
/* 331 */       player.chat("/lg roles set Survivant 1");
/* 332 */       inv.setItem(18, getItem(Material.DRAGON_EGG, "§5Survivant", 1));
/* 333 */       this.mat[18] = Material.DRAGON_EGG;
/* 334 */       player.openInventory(inv);
/*     */     } 
/* 336 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Survivant")) {
/* 337 */       inv.setItem(18, getItem(Material.DRAGON_EGG, "§5Survivant", 1));
/* 338 */       this.mat[18] = Material.DRAGON_EGG;
/* 339 */       player.openInventory(inv);
/*     */     } 
/* 341 */     if (current.getType() == Material.DIAMOND_CHESTPLATE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Garde")) {
/* 342 */       player.chat("/lg roles set Garde 1");
/* 343 */       inv.setItem(19, getItem(Material.DRAGON_EGG, "§2Garde", 1));
/* 344 */       this.mat[19] = Material.DRAGON_EGG;
/* 345 */       player.openInventory(inv);
/*     */     } 
/* 347 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Garde")) {
/* 348 */       inv.setItem(19, getItem(Material.DRAGON_EGG, "§2Garde", 1));
/* 349 */       this.mat[19] = Material.DRAGON_EGG;
/* 350 */       player.openInventory(inv);
/*     */     } 
/* 352 */     if (current.getType() == Material.ARROW && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Ange")) {
/* 353 */       player.chat("/lg roles set Ange 1");
/* 354 */       inv.setItem(20, getItem(Material.DRAGON_EGG, "§5Ange", 1));
/* 355 */       this.mat[20] = Material.DRAGON_EGG;
/* 356 */       player.openInventory(inv);
/*     */     } 
/* 358 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Ange")) {
/* 359 */       inv.setItem(20, getItem(Material.DRAGON_EGG, "§5Ange", 1));
/* 360 */       this.mat[20] = Material.DRAGON_EGG;
/* 361 */       player.openInventory(inv);
/*     */     } 
/* 363 */     if (current.getType() == Material.ENDER_CHEST && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Medium")) {
/* 364 */       player.chat("/lg roles set Medium 1");
/* 365 */       inv.setItem(21, getItem(Material.DRAGON_EGG, "§2Medium", 1));
/* 366 */       this.mat[21] = Material.DRAGON_EGG;
/* 367 */       player.openInventory(inv);
/*     */     } 
/* 369 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Medium")) {
/* 370 */       inv.setItem(21, getItem(Material.DRAGON_EGG, "§2Medium", 1));
/* 371 */       this.mat[21] = Material.DRAGON_EGG;
/* 372 */       player.openInventory(inv);
/*     */     } 
/* 374 */     if (current.getType() == Material.COOKIE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chienloup")) {
/* 375 */       player.chat("/lg roles set ChienLoup 1");
/* 376 */       inv.setItem(22, getItem(Material.DRAGON_EGG, "§2Chienloup", 1));
/* 377 */       this.mat[22] = Material.DRAGON_EGG;
/* 378 */       player.openInventory(inv);
/*     */     } 
/* 380 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chienloup")) {
/* 381 */       inv.setItem(22, getItem(Material.DRAGON_EGG, "§2Chienloup", 1));
/* 382 */       this.mat[22] = Material.DRAGON_EGG;
/* 383 */       player.openInventory(inv);
/*     */     } 
/* 385 */     if (current.getType() == Material.FLINT_AND_STEEL && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§6Pyromane")) {
/* 386 */       player.chat("/lg roles set Pyromane 1");
/* 387 */       inv.setItem(23, getItem(Material.DRAGON_EGG, "§6Pyromane", 1));
/* 388 */       this.mat[23] = Material.DRAGON_EGG;
/* 389 */       player.openInventory(inv);
/*     */     } 
/* 391 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§6Pyromane")) {
/* 392 */       inv.setItem(23, getItem(Material.DRAGON_EGG, "§6Pyromane", 1));
/* 393 */       this.mat[23] = Material.DRAGON_EGG;
/* 394 */       player.openInventory(inv);
/*     */     } 
/* 396 */     if (current.getType() == Material.OAK_BOAT && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Pirate")) {
/* 397 */       player.chat("/lg roles set Pirate 1");
/* 398 */       inv.setItem(24, getItem(Material.DRAGON_EGG, "§2Pirate", 1));
/* 399 */       this.mat[24] = Material.DRAGON_EGG;
/* 400 */       player.openInventory(inv);
/*     */     } 
/* 402 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Pirate")) {
/* 403 */       inv.setItem(24, getItem(Material.DRAGON_EGG, "§2Pirate", 1));
/* 404 */       this.mat[24] = Material.DRAGON_EGG;
/* 405 */       player.openInventory(inv);
/*     */     } 
/* 407 */     if (current.getType() == Material.REDSTONE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Vampire")) {
/* 408 */       player.chat("/lg roles set Vampire 1");
/* 409 */       inv.setItem(25, getItem(Material.DRAGON_EGG, "§1Vampire", 1));
/* 410 */       this.mat[25] = Material.DRAGON_EGG;
/* 411 */       player.openInventory(inv);
/*     */     } 
/* 413 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Vampire")) {
/* 414 */       inv.setItem(25, getItem(Material.DRAGON_EGG, "§1Vampire", 1));
/* 415 */       this.mat[25] = Material.DRAGON_EGG;
/* 416 */       player.openInventory(inv);
/*     */     } 
/* 418 */     if (current.getType() == Material.ENCHANTED_GOLDEN_APPLE && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Prêtre")) {
/* 419 */       player.chat("/lg roles set Pretre 1");
/* 420 */       inv.setItem(26, getItem(Material.DRAGON_EGG, "§2Prêtre", 1));
/* 421 */       this.mat[26] = Material.DRAGON_EGG;
/* 422 */       player.openInventory(inv);
/*     */     } 
/* 424 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Prêtre")) {
/* 425 */       inv.setItem(26, getItem(Material.DRAGON_EGG, "§2Prêtre", 1));
/* 426 */       this.mat[26] = Material.DRAGON_EGG;
/* 427 */       player.openInventory(inv);
/*     */     } 
/* 429 */     if (current.getType() == Material.BREWING_STAND && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Sorcière")) {
/* 430 */       player.chat("/lg roles set Sorciere 1");
/* 431 */       inv.setItem(27, getItem(Material.DRAGON_EGG, "§2Sorcière", 1));
/* 432 */       this.mat[27] = Material.DRAGON_EGG;
/* 433 */       player.openInventory(inv);
/*     */     } 
/* 435 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Sorcière")) {
/* 436 */       inv.setItem(27, getItem(Material.DRAGON_EGG, "§2Sorcière", 1));
/* 437 */       this.mat[27] = Material.DRAGON_EGG;
/* 438 */       player.openInventory(inv);
/*     */     } 
/* 440 */     if (current.getType() == Material.BEETROOT_SOUP && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur de Vampire")) {
/* 441 */       player.chat("/lg roles set ChasseurDeVampire 1");
/* 442 */       inv.setItem(28, getItem(Material.DRAGON_EGG, "§2Chasseur de Vampire", 1));
/* 443 */       this.mat[28] = Material.DRAGON_EGG;
/* 444 */       player.openInventory(inv);
/*     */     } 
/* 446 */     if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur de Vampire")) {
/* 447 */       inv.setItem(28, getItem(Material.DRAGON_EGG, "§2Chasseur de Vampire", 1));
/* 448 */       this.mat[28] = Material.DRAGON_EGG;
/* 449 */       player.openInventory(inv);
/*     */     } 
/* 451 */     if (current.getType() == Material.GOLD_NUGGET) {
/* 452 */       ItemStack game = new ItemStack(Material.BOOK);
/* 453 */       ItemMeta gameM = game.getItemMeta();
/* 454 */       gameM.setDisplayName("Lancer la Partie");
/* 455 */       game.setItemMeta(gameM);
/* 456 */       player.chat("/lg joinAll");
/* 457 */       player.openInventory(inv);
/* 458 */       player.closeInventory();
/* 459 */       player.getInventory().setItem(8, game);
/*     */     } 
/* 461 */     if (current.getType() == Material.SMOOTH_STONE_SLAB) {
/* 462 */       player.chat("/lg addSpawn");
/* 463 */       player.closeInventory();
/*     */     } 
/* 465 */     if (current.getType() == Material.ANVIL) {
/* 466 */       Material[] m = { Material.APPLE, Material.WHITE_BED, Material.ROTTEN_FLESH, Material.BLACK_DYE, Material.HONEY_BOTTLE, Material.WHITE_DYE, Material.GLOWSTONE_DUST, Material.DIAMOND_SWORD, Material.TNT, Material.FIRE_CHARGE, Material.RED_DYE, Material.BONE, Material.SPRUCE_SAPLING, Material.SUGAR, Material.BOW, Material.PUFFERFISH, Material.TRIPWIRE_HOOK, Material.FIREWORK_STAR, Material.COMPASS, Material.DIAMOND_CHESTPLATE, Material.ARROW, Material.ENDER_CHEST, Material.COOKIE, Material.FLINT_AND_STEEL, Material.OAK_BOAT, Material.REDSTONE, Material.ENCHANTED_GOLDEN_APPLE, Material.BREWING_STAND, Material.BEETROOT_SOUP };
/* 467 */       for (int i = 0; i <= 28; i++) {
/* 468 */         this.mat[i] = m[i];
/*     */       }
/* 470 */       player.chat("/reset");
/* 471 */       player.closeInventory();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 477 */     if (ac == InventoryAction.PICKUP_HALF) {
/* 478 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Villageois")) {
/* 479 */         inv.setItem(0, getItem(Material.APPLE, "§2Villageois", 1));
/* 480 */         player.chat("/lg roles set Villageois 0");
/* 481 */         this.mat[0] = Material.APPLE;
/* 482 */         this.d[0] = 1;
/* 483 */         this.i[0] = 1;
/* 484 */         player.openInventory(inv);
/*     */       } 
/* 486 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Petite Fille")) {
/* 487 */         inv.setItem(1, getItem(Material.WHITE_BED, "§2Petite Fille", 1));
/* 488 */         player.chat("/lg roles set PetiteFille 0");
/* 489 */         this.mat[1] = Material.WHITE_BED;
/* 490 */         player.openInventory(inv);
/*     */       } 
/* 492 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoups Garous")) {
/* 493 */         inv.setItem(2, getItem(Material.ROTTEN_FLESH, "§cLoups Garous", 1));
/* 494 */         player.chat("/lg roles set LoupGarou 0");
/* 495 */         this.mat[2] = Material.ROTTEN_FLESH;
/* 496 */         this.d[1] = 1;
/* 497 */         this.i[1] = 1;
/* 498 */         player.openInventory(inv);
/*     */       } 
/* 500 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Corbeau")) {
/* 501 */         inv.setItem(3, getItem(Material.BLACK_DYE, "§2Corbeau", 1));
/* 502 */         player.chat("/lg roles set Corbeau 0");
/* 503 */         this.mat[3] = Material.BLACK_DYE;
/* 504 */         player.openInventory(inv);
/*     */       } 
/* 506 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Montreur D'Ours")) {
/* 507 */         inv.setItem(4, getItem(Material.HONEY_BOTTLE, "§2Montreur D'Ours", 1));
/* 508 */         player.chat("/lg roles set MontreurDOurs 0");
/* 509 */         this.mat[4] = Material.HONEY_BOTTLE;
/* 510 */         player.openInventory(inv);
/*     */       } 
/* 512 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Blanc")) {
/* 513 */         inv.setItem(5, getItem(Material.WHITE_DYE, "§cLoup Garou Blanc", 1));
/* 514 */         player.chat("/lg roles set LoupGarouBlanc 0");
/* 515 */         this.mat[5] = Material.WHITE_DYE;
/* 516 */         player.openInventory(inv);
/*     */       } 
/* 518 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Voyante")) {
/* 519 */         inv.setItem(6, getItem(Material.GLOWSTONE_DUST, "§2Voyante", 1));
/* 520 */         player.chat("/lg roles set Voyante 0");
/* 521 */         this.mat[6] = Material.GLOWSTONE_DUST;
/* 522 */         player.openInventory(inv);
/*     */       } 
/* 524 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Assassin")) {
/* 525 */         inv.setItem(7, getItem(Material.DIAMOND_SWORD, "§1Assassin", 1));
/* 526 */         player.chat("/lg roles set Assassin 0");
/* 527 */         this.mat[7] = Material.DIAMOND_SWORD;
/* 528 */         player.openInventory(inv);
/*     */       } 
/* 530 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Dictateur")) {
/* 531 */         inv.setItem(8, getItem(Material.TNT, "§2Dictateur", 1));
/* 532 */         player.chat("/lg roles set Dictateur 0");
/* 533 */         this.mat[8] = Material.TNT;
/* 534 */         player.openInventory(inv);
/*     */       } 
/* 536 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup Garou Noir")) {
/* 537 */         inv.setItem(9, getItem(Material.FIRE_CHARGE, "§cLoup Garou Noir", 1));
/* 538 */         player.chat("/lg roles set LoupGarouNoir 0");
/* 539 */         this.mat[9] = Material.FIRE_CHARGE;
/* 540 */         player.openInventory(inv);
/*     */       } 
/* 542 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2ChaperonRouge")) {
/* 543 */         inv.setItem(10, getItem(Material.RED_DYE, "§2ChaperonRouge", 1));
/* 544 */         player.chat("/lg roles set ChaperonRouge 0");
/* 545 */         this.mat[10] = Material.RED_DYE;
/* 546 */         player.openInventory(inv);
/*     */       } 
/* 548 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Faucheur")) {
/* 549 */         inv.setItem(11, getItem(Material.BONE, "§2Faucheur", 1));
/* 550 */         player.chat("/lg roles set Faucheur 0");
/* 551 */         this.mat[11] = Material.BONE;
/* 552 */         player.openInventory(inv);
/*     */       } 
/* 554 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Enfant Sauvage")) {
/* 555 */         inv.setItem(12, getItem(Material.SPRUCE_SAPLING, "§2Enfant Sauvage", 1));
/* 556 */         player.chat("/lg roles set EnfantSauvage 0");
/* 557 */         this.mat[12] = Material.SPRUCE_SAPLING;
/* 558 */         player.openInventory(inv);
/*     */       } 
/* 560 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Cupidon")) {
/* 561 */         inv.setItem(13, getItem(Material.SUGAR, "§2Cupidon", 1));
/* 562 */         player.chat("/lg roles set Cupidon 0");
/* 563 */         this.mat[13] = Material.SUGAR;
/* 564 */         player.openInventory(inv);
/*     */       } 
/* 566 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur")) {
/* 567 */         inv.setItem(14, getItem(Material.BOW, "§2Chasseur", 1));
/* 568 */         player.chat("/lg roles set Chasseur 0");
/* 569 */         this.mat[14] = Material.BOW;
/* 570 */         this.d[2] = 1;
/* 571 */         this.i[2] = 1;
/* 572 */         player.openInventory(inv);
/*     */       } 
/* 574 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Bouffon")) {
/* 575 */         inv.setItem(15, getItem(Material.PUFFERFISH, "§5Bouffon", 1));
/* 576 */         player.chat("/lg roles set Bouffon 0");
/* 577 */         this.mat[15] = Material.PUFFERFISH;
/* 578 */         player.openInventory(inv);
/*     */       } 
/* 580 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Detective")) {
/* 581 */         inv.setItem(16, getItem(Material.TRIPWIRE_HOOK, "§2Detective", 1));
/* 582 */         player.chat("/lg roles set Detective 0");
/* 583 */         this.mat[16] = Material.TRIPWIRE_HOOK;
/* 584 */         player.openInventory(inv);
/*     */       } 
/* 586 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§cGrand Méchant Loup")) {
/* 587 */         inv.setItem(17, getItem(Material.FIREWORK_STAR, "§cGrand Méchant Loup", 1));
/* 588 */         player.chat("/lg roles set GrandMechantLoup 0");
/* 589 */         this.mat[17] = Material.FIREWORK_STAR;
/* 590 */         player.openInventory(inv);
/*     */       } 
/* 592 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Survivant")) {
/* 593 */         inv.setItem(18, getItem(Material.COMPASS, "§5Survivant", 1));
/* 594 */         player.chat("/lg roles set Survivant 0");
/* 595 */         this.mat[18] = Material.COMPASS;
/* 596 */         player.openInventory(inv);
/*     */       } 
/* 598 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Garde")) {
/* 599 */         inv.setItem(19, getItem(Material.DIAMOND_CHESTPLATE, "§2Garde", 1));
/* 600 */         player.chat("/lg roles set Garde 0");
/* 601 */         this.mat[19] = Material.DIAMOND_CHESTPLATE;
/* 602 */         player.openInventory(inv);
/*     */       } 
/* 604 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§5Ange")) {
/* 605 */         inv.setItem(20, getItem(Material.ARROW, "§5Ange", 1));
/* 606 */         player.chat("/lg roles set Ange 0");
/* 607 */         this.mat[20] = Material.ARROW;
/* 608 */         player.openInventory(inv);
/*     */       } 
/* 610 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Medium")) {
/* 611 */         inv.setItem(21, getItem(Material.ENDER_CHEST, "§2Medium", 1));
/* 612 */         player.chat("/lg roles set Medium 0");
/* 613 */         this.mat[21] = Material.ENDER_CHEST;
/* 614 */         player.openInventory(inv);
/*     */       } 
/* 616 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chienloup")) {
/* 617 */         inv.setItem(22, getItem(Material.COOKIE, "§2Chienloup", 1));
/* 618 */         player.chat("/lg roles set ChienLoup 0");
/* 619 */         this.mat[22] = Material.COOKIE;
/* 620 */         player.openInventory(inv);
/*     */       } 
/* 622 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§6Pyromane")) {
/* 623 */         inv.setItem(23, getItem(Material.FLINT_AND_STEEL, "§6Pyromane", 1));
/* 624 */         player.chat("/lg roles set Pyromane 0");
/* 625 */         this.mat[23] = Material.FLINT_AND_STEEL;
/* 626 */         player.openInventory(inv);
/*     */       } 
/* 628 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Pirate")) {
/* 629 */         inv.setItem(24, getItem(Material.OAK_BOAT, "§2Pirate", 1));
/* 630 */         player.chat("/lg roles set Pirate 0");
/* 631 */         this.mat[24] = Material.OAK_BOAT;
/* 632 */         player.openInventory(inv);
/*     */       } 
/* 634 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§1Vampire")) {
/* 635 */         inv.setItem(25, getItem(Material.REDSTONE, "§1Vampire", 1));
/* 636 */         player.chat("/lg roles set Vampire 0");
/* 637 */         this.mat[25] = Material.REDSTONE;
/* 638 */         player.openInventory(inv);
/*     */       } 
/* 640 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Prêtre")) {
/* 641 */         inv.setItem(26, getItem(Material.ENCHANTED_GOLDEN_APPLE, "§2Prêtre", 1));
/* 642 */         player.chat("/lg roles set Pretre 0");
/* 643 */         this.mat[26] = Material.ENCHANTED_GOLDEN_APPLE;
/* 644 */         player.openInventory(inv);
/*     */       } 
/* 646 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Sorcière")) {
/* 647 */         inv.setItem(27, getItem(Material.BREWING_STAND, "§2Sorcière", 1));
/* 648 */         player.chat("/lg roles set Sorciere 0");
/* 649 */         this.mat[27] = Material.BREWING_STAND;
/* 650 */         player.openInventory(inv);
/*     */       } 
/* 652 */       if (current.getType() == Material.DRAGON_EGG && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§2Chasseur de Vampire")) {
/* 653 */         inv.setItem(28, getItem(Material.BEETROOT_SOUP, "§2Chasseur de Vampire", 1));
/* 654 */         player.chat("/lg roles set ChasseurDeVampire 0");
/* 655 */         this.mat[28] = Material.BEETROOT_SOUP;
/* 656 */         player.openInventory(inv);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack getItem(Material material, String name, int amount) {
/* 664 */     ItemStack it = new ItemStack(material);
/* 665 */     ItemMeta itM = it.getItemMeta();
/* 666 */     itM.setDisplayName(name);
/* 667 */     it.setItemMeta(itM);
/* 668 */     it.setAmount(amount);
/* 669 */     return it;
/*     */   }
/*     */ }


/* Location:              C:\Users\zayph\Downloads\plugin-0.0.1.jar!\org\zay\example\MonPluginListeners.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */