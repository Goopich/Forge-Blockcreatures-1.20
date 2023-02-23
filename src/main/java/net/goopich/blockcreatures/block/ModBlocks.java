package net.goopich.blockcreatures.block;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BlockCreatures.MOD_ID);

    public static final RegistryObject<Block> WOOD_PULP = registerBlock("wood_pulp",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.HONEY_BLOCK)));
    public static final RegistryObject<Block> DARK_WOOD_PULP = registerBlock("dark_wood_pulp",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.HONEY_BLOCK)));
    public static final RegistryObject<Block> TROPICAL_WOOD_PULP = registerBlock("tropical_wood_pulp",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.HONEY_BLOCK)));
    public static final RegistryObject<Block> SAWDUST_BLOCK = registerBlock("sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> DARK_SAWDUST_BLOCK = registerBlock("dark_sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> TROPICAL_SAWDUST_BLOCK = registerBlock("tropical_sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> TANGLED_ROSE_BUSH_BLOCK = registerBlock("tangled_rose_bush_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT)
                    .strength(0.5f).noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> TANGLED_ROSE_BUSH = registerBlock("tangled_rose_bush",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT)
                    .strength(0.5f).noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> BLUEPOT = registerBlock("bluepot",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        }
}