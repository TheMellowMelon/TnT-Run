package init;

import com.TheMellowMelon.keykraft.MainClass;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModArmor extends ItemArmor 
{

	public ModArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) 
	{
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(this.armorType == 2) 
		{
			return "kk:textures/models/armor/textureName_2.png";
		}
		return "kk:textures/models/armor/textureName_1.png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (itemStack.getItem() == MainClass.jade_helmet) {
	        effectPlayer(player, Potion.regeneration, 0);
	    }
	    if (itemStack.getItem() == MainClass.jade_chestplate) {
	        effectPlayer(player, Potion.damageBoost, 0);
	    }
	    if (itemStack.getItem() == MainClass.jade_leggings) {
	        effectPlayer(player, Potion.moveSpeed, 2);
	    }
	    if (itemStack.getItem() == MainClass.jade_boots) {
	        effectPlayer(player, Potion.jump, 2);
	    }
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) 
	{
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true));
}
}