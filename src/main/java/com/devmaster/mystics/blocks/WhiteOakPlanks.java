package com.devmaster.mystics.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class WhiteOakPlanks extends Block {

    public WhiteOakPlanks() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0F, 3.0F)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .setRequiresTool());

    }


}