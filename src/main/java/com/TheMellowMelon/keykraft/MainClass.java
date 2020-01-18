package com.TheMellowMelon.keykraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import init.ModArmor;
import init.ModItems;
import init.ModRecipes;
import init.ModSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "kk", name = "Key Kraft", version = "1.0")

public class MainClass 
{
	@Mod.Instance ("kk")
	public static MainClass instance;
	
	public static final ItemArmor.ArmorMaterial  modArmorMaterial = EnumHelper.addArmorMaterial("modArmorMaterial", 5000, new int[] {3, 8, 7, 2}, 34);
	
	public static Item jade_helmet;
	public static Item jade_chestplate;
	public static Item jade_leggings;
	public static Item jade_boots;
	public static Item xcalibur;
	
	public static final Item.ToolMaterial modToolMaterial = EnumHelper.addToolMaterial("modToolMaterial", 3, 5000, 10.0F, 6.0F, 30);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ModItems.init();
		ModRecipes.init();
		jade_helmet = new ModArmor(modArmorMaterial, 0, 0).setUnlocalizedName("jade_helmet").setTextureName("kk:jade_helmet");
		jade_chestplate = new ModArmor(modArmorMaterial, 0, 1).setUnlocalizedName("jade_chestplate").setTextureName("kk:jade_chestplate");
		jade_leggings = new ModArmor(modArmorMaterial, 0, 2).setUnlocalizedName("jade_leggings").setTextureName("kk:jade_leggings");
		jade_boots = new ModArmor(modArmorMaterial, 0, 3).setUnlocalizedName("jade_boots").setTextureName("kk:jade_boots");
		xcalibur = new ModSword(modToolMaterial).setUnlocalizedName("xcalibur").setTextureName("kk:xcalibur");
		
		GameRegistry.registerItem(jade_helmet, jade_helmet.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(jade_chestplate, jade_chestplate.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(jade_leggings, jade_leggings.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(jade_boots, jade_boots.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(xcalibur, xcalibur.getUnlocalizedName().substring(5)); 
	}
	 
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {}
	 
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
