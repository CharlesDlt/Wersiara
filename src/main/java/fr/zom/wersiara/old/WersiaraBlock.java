package fr.zom.wersiara.old;

import fr.zom.wersiara.old.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WersiaraBlock extends Block {

    public WersiaraBlock(Material materialIn) {
        super(materialIn);
    }

    public WersiaraBlock(String name, Material materialIn) {
        super(materialIn);
        setRegistryName(name).setUnlocalizedName(name);

        ModBlocks.INSTANCE.getBlocks().add(this);
    }

    public WersiaraBlock(String name, Material materialIn, float hardness, float resistance) {
        this(name, materialIn);

        setHardness(hardness);
        setResistance(resistance);
    }

    public WersiaraBlock(String name, Material materialIn, float hardness, float resistance, int harvestLevel, String harvestType, boolean isFull) {

        this(name, materialIn, hardness, resistance);
        setHarvestLevel(harvestType, harvestLevel);
        // pour les level
        // 0 -> pioche en bois
        // 1 -> pierre
        // 2 -> fer
        // 3 -> diams

        //type = pioche, hache, etc ...

    }

}
