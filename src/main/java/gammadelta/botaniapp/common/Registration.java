package gammadelta.botaniapp.common;

import gammadelta.botaniapp.common.block.BlockTest;
import gammadelta.botaniapp.common.flowers.generating.SpectrolusConcrete;
import gammadelta.botaniapp.common.lib.BlockNames;
import gammadelta.botaniapp.common.misc.ItemBlockMod;
import gammadelta.botaniapp.common.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import vazkii.botania.api.BotaniaAPI;

@Mod.EventBusSubscriber(modid = ModNames.MODID)
public final class Registration {

    public static final Block testBlock = new BlockTest();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        IForgeRegistry<Block> r = e.getRegistry();

        r.register(testBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
        IForgeRegistry<Item> r = e.getRegistry();

        //Register derivative items from blocks. stealing Botania's ItemBlockMod
        r.register(new ItemBlockMod(testBlock).setRegistryName(testBlock.getRegistryName()));

        BotaniaAPI.registerSubTile(BlockNames.F_SPECTROLUS_CONCRETE, SpectrolusConcrete.class); BotaniaAPI.addSubTileToCreativeMenu(BlockNames.F_SPECTROLUS_CONCRETE);
    }

}
