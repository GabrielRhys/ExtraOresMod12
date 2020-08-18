package com.gabrielrhys.testmod.util;

import com.gabrielrhys.testmod.ExtraOres;
import com.gabrielrhys.testmod.blocks.*;
import com.gabrielrhys.testmod.items.ItemBase;
import com.gabrielrhys.testmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraOres.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraOres.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 3, -2.4f, new Item.Properties().group(ExtraOres.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(ExtraOres.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 5f, -3.1f, new Item.Properties().group(ExtraOres.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0.5f, -3.0f, new Item.Properties().group(ExtraOres.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, -1, -2.8f, new Item.Properties().group(ExtraOres.TAB)));


    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE_BLOCK = BLOCKS.register("sapphire_ore", SapphireOre::new);
    public static final RegistryObject<Block> CHERRY_LEAVES_BLOCK = BLOCKS.register("cherry_leaves", CherryLeaves::new);


    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () -> new BlockItemBase(SAPPHIRE_ORE_BLOCK.get()));
    public static final RegistryObject<Item> CHERRY_LEAVES_ITEM = ITEMS.register("cherry_leaves", () -> new BlockItemBase(CHERRY_LEAVES_BLOCK.get()));


}
