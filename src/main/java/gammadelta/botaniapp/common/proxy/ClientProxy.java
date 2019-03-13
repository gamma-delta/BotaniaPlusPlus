package gammadelta.botaniapp.common.proxy;

import gammadelta.botaniapp.common.lib.BlockNames;
import gammadelta.botaniapp.common.lib.ModNames;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.botania.api.BotaniaAPIClient;

public class ClientProxy implements IProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        this.registerModels();
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    private void registerModels() {
        registerModel(BlockNames.F_SPECTROLUS_CONCRETE);
    }

    private void registerModel(String name) {
        BotaniaAPIClient.registerSubtileModel(name,
                new ModelResourceLocation(new ResourceLocation(ModNames.MODID, name), "normal"),
                new ModelResourceLocation(new ResourceLocation(ModNames.MODID, name), "inventory"));
    }
}
