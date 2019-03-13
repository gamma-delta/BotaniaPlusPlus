package gammadelta.botaniapp.common.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import vazkii.botania.api.lexicon.ILexiconable;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.arl.block.BlockMod;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lexicon.LexiconData;

import javax.annotation.Nonnull;
import java.util.Random;

public class BlockTest extends BlockMod implements IBotaniappBlock, ILexiconable {

    public BlockTest() {
        super("test_block", Material.CLOTH);
        setHardness(1.5f);
        setSoundType(SoundType.CLOTH);
        setCreativeTab(CreativeTabs.DECORATIONS);
    }

    @Nonnull @Override
    public Item getItemDropped(IBlockState state, @Nonnull Random rand, int fortune) {
        Minecraft.getMinecraft().player.sendChatMessage("Hello! You broke me. Random: " + rand.nextInt());
        return ModItems.elementiumAxe; //Why not?
    }

    @Override
    public LexiconEntry getEntry(World world, BlockPos pos, EntityPlayer player, ItemStack lexicon) {
        return LexiconData.dirtRod; //Also why not?
    }
}
