package com.devmaster.mystics.blocks;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class WhiteOakDoor extends DoorBlock {

    public WhiteOakDoor() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(3.0F, 3.0F)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .setRequiresTool());

    }

}