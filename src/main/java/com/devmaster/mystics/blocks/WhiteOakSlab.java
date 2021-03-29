package com.devmaster.mystics.blocks;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class WhiteOakSlab extends SlabBlock {

    public WhiteOakSlab() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0F, 3.0F)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .setRequiresTool());

    }

}