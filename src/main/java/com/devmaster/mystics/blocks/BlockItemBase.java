package com.devmaster.mystics.blocks;


import com.devmaster.mystics.Mystics;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(Mystics.ORIGINALS));
    }
}
