package fr.zom.wersiara.items;

import fr.zom.wersiara.init.ModItems;
import net.minecraft.item.Item;

public class WersiaraItem extends Item {

    public WersiaraItem(String name) {
        setRegistryName(name).setUnlocalizedName(name);

        ModItems.INSTANCE.getItems().add(this);
    }
}
