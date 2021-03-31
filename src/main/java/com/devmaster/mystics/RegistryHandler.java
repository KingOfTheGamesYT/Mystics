package com.devmaster.mystics;

import com.devmaster.mystics.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mystics.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mystics.MOD_ID);



    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Blocks
    public static final RegistryObject<Block> WHITE_OAK_WOOD = BLOCKS.register("white_oak_wood", WhiteOakWood::new);
    public static final RegistryObject<Block> WHITE_OAK_LOG = BLOCKS.register("white_oak_log", WhiteOakWood::new);
    public static final RegistryObject<Block> WHITE_OAK_WOOD_FENCE = BLOCKS.register("white_oak_wood_fence", WhiteOakFence::new);
    public static final RegistryObject<Block> WHITE_OAK_WOOD_SLAB = BLOCKS.register("white_oak_wood_slab", WhiteOakSlab::new);
    public static final RegistryObject<Block> WHITE_OAK_WOOD_DOOR = BLOCKS.register("white_oak_wood_door", WhiteOakDoor::new);
    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_LOG = BLOCKS.register("stripped_white_oak_log", WhiteOakWood::new);
    public static final RegistryObject<Block> WHITE_OAK_PLANKS = BLOCKS.register("white_oak_planks", WhiteOakPlanks::new);

    //Block Items
    public static final RegistryObject<Item> WHITE_OAK_WOOD_ITEM = ITEMS.register("white_oak_wood", () -> new BlockItemBase(WHITE_OAK_WOOD.get()));
    public static final RegistryObject<Item> WHITE_OAK_LOG_ITEM = ITEMS.register("white_oak_log", () -> new BlockItemBase(WHITE_OAK_LOG.get()));
    public static final RegistryObject<Item> WHITE_OAK_WOOD_FENCE_ITEM = ITEMS.register("white_oak_wood_fence", () -> new BlockItemBase(WHITE_OAK_WOOD_FENCE.get()));
    public static final RegistryObject<Item> WHITE_OAK_WOOD_SLAB_ITEM = ITEMS.register("white_oak_wood_slab", () -> new BlockItemBase(WHITE_OAK_WOOD_SLAB.get()));
    public static final RegistryObject<Item> WHITE_OAK_WOOD_SLAB_DOOR = ITEMS.register("white_oak_wood_door", () -> new BlockItemBase(WHITE_OAK_WOOD_DOOR.get()));
    public static final RegistryObject<Item> STRIPPED_WHITE_OAK_LOG_ITEM = ITEMS.register("stripped_white_oak_log",() -> new BlockItemBase(STRIPPED_WHITE_OAK_LOG.get()));
    public static final RegistryObject<Item> WHITE_OAK_WOOD_PLANKS = ITEMS.register("white_oak_planks", () -> new WhiteOakPlanksItem(WHITE_OAK_PLANKS.get()));

}
