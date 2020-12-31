package fr.zom.wersiara.init;

import com.google.common.collect.Lists;
import fr.zom.wersiara.items.WersiaraItem;
import fr.zom.wersiara.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

//@Mod.EventBusSubscriber(modid = )
public class ModItems {

    public static final ModItems INSTANCE = new ModItems();

    public static Item crystal;

    public List<Item> items;

    public void init() {

        items = Lists.newArrayList();
        crystal = new WersiaraItem("crystal");

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e) {
        for(Item item : items) {
           registerModel(item);
        }
    }

    private void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    public List<Item> getItems() {
        return items;
    }
}
