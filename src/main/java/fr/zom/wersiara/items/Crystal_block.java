package fr.zom.wersiara.items;

import fr.zom.wersiara.old.WersiaraBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Crystal_block extends WersiaraBlock {

    public static final AxisAlignedBB Crystal_Block_AxisBB = new AxisAlignedBB(0, 0, 0, 0, 0, 0);

    public Crystal_block(String name, Material materialIn, float hardness, float resistance, int harvestLevel, String harvestType, boolean isFull) {
        super(name, materialIn, hardness, resistance, harvestLevel, harvestType, isFull);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return Crystal_Block_AxisBB;
    }
}