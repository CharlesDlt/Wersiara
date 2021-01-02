package fr.zom.wersiara.old;

import fr.zom.wersiara.old.ModItems;
import net.minecraft.item.Item;

public class WersiaraItem extends Item {

    public WersiaraItem(String name) {
        setRegistryName(name).setUnlocalizedName(name);

        ModItems.INSTANCE.getItems().add(this);
    }
}
