package gammadelta.botaniapp.common;

import gammadelta.botaniapp.common.block.BlockTest;
import gammadelta.botaniapp.common.flowers.generating.SpectrolusConcrete;
import gammadelta.botaniapp.common.lib.BlockNames;
import gammadelta.botaniapp.common.lib.ModNames;
import gammadelta.botaniapp.common.misc.LexiconPages;
import gammadelta.botaniapp.common.proxy.IProxy;
import gammadelta.botaniapp.common.recipe.ApothecaryRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import vazkii.botania.api.BotaniaAPI;

@Mod(modid = ModNames.MODID, name = ModNames.NAME, version = ModNames.VERSION, dependencies = ModNames.DEPENDENCIES)
public class BotaniaPlusPlus {

    @SidedProxy(clientSide = ModNames.CLIENT_PROXY, serverSide = ModNames.SERVER_PROXY)
    public static IProxy proxy;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ApothecaryRecipes.init();
        LexiconPages.init();

        proxy.init(event);
        logger.info("{} initialized!", ModNames.NAME);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}