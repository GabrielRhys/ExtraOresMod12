package com.gabrielrhys.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CherryLeaves extends Block {
    public CherryLeaves() {
        super(Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2f, 0.2f)
                .sound(SoundType.WET_GRASS)
                .harvestLevel(0)
                .harvestTool(ToolType.HOE));
    }
}
