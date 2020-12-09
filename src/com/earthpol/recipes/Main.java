package com.earthpol.recipes;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main instance;
	public static Logger log = Bukkit.getLogger();
	
	public void onEnable() {
		log.info("====== EPMC RECIPE ======");
		log.info("= EarthPol Recipe Plugin");
		log.info("= Version: " + this.getDescription().getVersion());
		log.info("= Authors: " + this.getDescription().getAuthors());
		log.info("= Website: " + this.getDescription().getWebsite());
		log.info("= Support: https://discord.gg/DvtZzztAfF");
		log.info("=========================");
		log.info("= Loading Custom Recipes");
		recipes();
		log.info("= Loaded Custom Recipes");
		log.info("= Registering Crafting Listener");
		getServer().getPluginManager().registerEvents(new CraftingNerfs(), this);
		log.info("=========================");
	}
	
	@SuppressWarnings("deprecation")
	public void recipes() {
		
		// Custom Bell Recipe
		final ShapedRecipe bell = new ShapedRecipe(new NamespacedKey(this, "custom_bell"), new ItemStack(Material.BELL, 1));
		bell.shape("SSS", " G ", "GNG");
		bell.setIngredient('S', Material.STICK);
		bell.setIngredient('G', Material.GOLD_INGOT);
		bell.setIngredient('N', Material.GOLD_NUGGET);
		Bukkit.addRecipe(bell);
		
		// Custom Web Recipe
		final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "custom_web"), new ItemStack(Material.COBWEB, 5));
		web.shape("S S", " S ", "S S");
		web.setIngredient('S', Material.STRING);
		Bukkit.addRecipe(web);
		
		//Custom Quartz Item Recipe
		final ShapelessRecipe quartz = new ShapelessRecipe(new NamespacedKey(this, "custom_nether_quartz"), new ItemStack(Material.QUARTZ, 4));
		quartz.addIngredient(1, Material.QUARTZ_BLOCK);
		Bukkit.addRecipe(quartz);
		
		//Custom Packed Ice
		final ShapedRecipe packedIce = new ShapedRecipe(new NamespacedKey(this, "custom_packedice"), new ItemStack(Material.PACKED_ICE, 4));
        packedIce.shape("III", "III", "III");
        packedIce.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedIce);
		
        //Custom Blue Ice
        final ShapedRecipe blueice = new ShapedRecipe(new NamespacedKey(this, "custom_blueice"), new ItemStack(Material.BLUE_ICE, 4));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);
		
        //Custom Slimeball
        final ShapelessRecipe slimeball = new ShapelessRecipe(new NamespacedKey(this, "custom_slimeball"), new ItemStack(Material.SLIME_BALL, 1));
        slimeball.addIngredient(1, Material.GREEN_DYE);
        slimeball.addIngredient(1, Material.SNOWBALL);
        Bukkit.addRecipe(slimeball);
        
        //Custom Prismarine Shard
        final ShapelessRecipe prismarineshard = new ShapelessRecipe(new NamespacedKey(this, "custom_prismarineshard"), new ItemStack(Material.PRISMARINE_SHARD, 3));
        prismarineshard.addIngredient(1, Material.SAND);
        prismarineshard.addIngredient(1, Material.DIRT);
        prismarineshard.addIngredient(1, Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);
        
        //Custom Prismarine Crystals
        final ShapelessRecipe prismarinecrystals = new ShapelessRecipe(new NamespacedKey(this, "custom_prismarinecrystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 3));
        prismarinecrystals.addIngredient(1, Material.PRISMARINE_SHARD);
        prismarinecrystals.addIngredient(1, Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarinecrystals);
        
        //Custom Lily Pad - Acacia Leaves
        final ShapedRecipe lilypad = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad1"), new ItemStack(Material.LILY_PAD, 3));
        lilypad.shape("   ", "   ", "LLL");
        lilypad.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(lilypad);
        
        //Custom Lily Pad - Birch Leaves
        final ShapedRecipe lilypad2 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad2"), new ItemStack(Material.LILY_PAD, 3));
        lilypad2.shape("   ", "   ", "LLL");
        lilypad2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(lilypad2);

        //Custom Lily Pad - Dark Oak Leaves
        final ShapedRecipe lilypad3 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad3"), new ItemStack(Material.LILY_PAD, 3));
        lilypad3.shape("   ", "   ", "LLL");
        lilypad3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(lilypad3);
        
        //Custom Lily Pad - Jungle Leaves
        final ShapedRecipe lilypad4 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad4"), new ItemStack(Material.LILY_PAD, 3));
        lilypad4.shape("   ", "   ", "LLL");
        lilypad4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(lilypad4);
        
        //Custom Lily Pad - Oak Leaves
        final ShapedRecipe lilypad5 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad5"), new ItemStack(Material.LILY_PAD, 3));
        lilypad5.shape("   ", "   ", "LLL");
        lilypad5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(lilypad5);
        
        //Custom Lily Pad - Spruce Leaves
        final ShapedRecipe lilypad6 = new ShapedRecipe(new NamespacedKey(this, "custom_lilypad6"), new ItemStack(Material.LILY_PAD, 3));
        lilypad6.shape("   ", "   ", "LLL");
        lilypad6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(lilypad6);
        
        //Custom Glowstone Dust
        final ShapedRecipe glowstoneDust = new ShapedRecipe(new NamespacedKey(this, "custom_glowstoneDust"), new ItemStack(Material.GLOWSTONE_DUST, 8));
        glowstoneDust.shape("RRR", "RBR", "RRR");
        glowstoneDust.setIngredient('R', Material.REDSTONE);
        glowstoneDust.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(glowstoneDust);
        
        //Custom Heart of Sea
        final ShapedRecipe HeartOfSea = new ShapedRecipe(new NamespacedKey(this, "custom_HeartOfSea"), new ItemStack(Material.HEART_OF_THE_SEA, 1));
        HeartOfSea.shape("DPQ", "PSP", "QPD");
        HeartOfSea.setIngredient('D', Material.DIAMOND_BLOCK);
        HeartOfSea.setIngredient('Q', Material.QUARTZ_BLOCK);
        HeartOfSea.setIngredient('P', Material.PRISMARINE);
        HeartOfSea.setIngredient('S', Material.SLIME_BALL);
        Bukkit.addRecipe(HeartOfSea);
        
        //Custom Nether War
        final ShapedRecipe netherWart = new ShapedRecipe(new NamespacedKey(this, "custom_netherWart"), new ItemStack(Material.NETHER_WART, 8));
        netherWart.shape("RRR", "RBR", "RRR");
        netherWart.setIngredient('R', Material.REDSTONE_BLOCK);
        netherWart.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(netherWart);
        
        //Custom String
        final ShapelessRecipe string = new ShapelessRecipe(new NamespacedKey(this, "custom_string"), new ItemStack(Material.STRING, 4));
        string.addIngredient(1, Material.WHITE_WOOL);
        Bukkit.addRecipe(string);
        
        //Custom Soulsand
        final ShapedRecipe soulsand = new ShapedRecipe(new NamespacedKey(this, "custom_soulsand"), new ItemStack(Material.SOUL_SAND, 12));
        soulsand.shape("RBR","BPB","RBR");
        soulsand.setIngredient('R', Material.ROTTEN_FLESH);
        soulsand.setIngredient('B', Material.BONE);
        soulsand.setIngredient('P', Material.BLAZE_POWDER);
        Bukkit.addRecipe(soulsand);
        
        //Custom Black Dye
        final ShapelessRecipe blackdye1 = new ShapelessRecipe(new NamespacedKey(this, "custom_blackdye_1"), new ItemStack(Material.BLACK_DYE, 1));
        string.addIngredient(1, Material.COAL);
        Bukkit.addRecipe(blackdye1);
        
        //Custom Black Dye #2
        final ShapelessRecipe blackdye2 = new ShapelessRecipe(new NamespacedKey(this, "custom_blackdye_2"), new ItemStack(Material.BLACK_DYE, 1));
        string.addIngredient(1, Material.CHARCOAL);
        Bukkit.addRecipe(blackdye2);
        
        //Custom Blaze Rods
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.BLAZE_ROD, 1), Material.IRON_BARS));
        this.getServer().addRecipe(new BlastingRecipe(new NamespacedKey(this,"custom_blazerods"), new ItemStack(Material.BLAZE_ROD, 1), Material.IRON_BARS, 0, 60));
	}
	
	public void onDisable() {
		log.info("====== EPMC RECIPE ======");
		log.info("= EarthPol Recipe Plugin");
		log.info("= Disabling plugin...");
		log.info("= Thank you for using EP-Recipe");
		log.info("= Support: https://discord.gg/DvtZzztAfF");
		log.info("=========================");
	}

}
