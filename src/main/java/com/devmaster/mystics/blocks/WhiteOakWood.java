package com.devmaster.mystics.blocks;

import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class WhiteOakWood extends RotatedPillarBlock {

    public WhiteOakWood() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0F, 2.0F)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .setRequiresTool());

    }


}