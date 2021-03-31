package com.devmaster.mystics.blocks;


import com.devmaster.mystics.Mystics;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class WhiteOakPlanksItem extends BlockItem {

    public WhiteOakPlanksItem(Block block) {
        super(block, new Properties().group(Mystics.ORIGINALS));
    }
}
