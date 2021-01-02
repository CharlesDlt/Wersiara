package fr.zom.wersiara.proxy;

import fr.zom.wersiara.old.ModBlocks;
import fr.zom.wersiara.old.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {

        super.preInit();

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
