package fr.zom.wersiara.items;

import fr.zom.wersiara.WersiaraMain;
import fr.zom.wersiara.init.ItemInit;
import fr.zom.wersiara.proxy.ClientProxy;
import fr.zom.wersiara.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase (String name){

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.Items.add(this);

    }
    public void registerModels(){

        WersiaraMain.proxy.registerItemRenderer(this, 0 "inventory");

    }

}
