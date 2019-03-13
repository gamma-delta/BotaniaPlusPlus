package gammadelta.botaniapp.common.misc;

import gammadelta.botaniapp.common.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockMod extends ItemBlock {
    public ItemBlockMod(Block block) {
        super(block);
    }

    @Nonnull
    @Override
    public String getUnlocalizedNameInefficiently(@Nonnull ItemStack par1ItemStack) {
        return getUnlocalizedNameInefficiently_(par1ItemStack).replaceAll("tile.", "tile." + ModNames.MODID + ":");
    }

    public String getUnlocalizedNameInefficiently_(ItemStack stack) {
        return super.getUnlocalizedNameInefficiently(stack);
    }
}
