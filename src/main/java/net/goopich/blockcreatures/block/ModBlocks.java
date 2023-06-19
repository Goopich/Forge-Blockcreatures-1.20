package net.goopich.blockcreatures.block;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.block.custom.Pot;
import net.goopich.blockcreatures.block.custom.Statue;
import net.goopich.blockcreatures.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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
    public static final RegistryObject<Block> FUNGAL_PULP = registerBlock("fungal_pulp",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2).sound(SoundType.HONEY_BLOCK)));
    public static final RegistryObject<Block> SAWDUST_BLOCK = registerBlock("sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> DARK_SAWDUST_BLOCK = registerBlock("dark_sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> TROPICAL_SAWDUST_BLOCK = registerBlock("tropical_sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> FUNGAL_SAWDUST_BLOCK = registerBlock("fungal_sawdust_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> TANGLED_ROSE_BUSH_BLOCK = registerBlock("tangled_rose_bush_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT)
                    .strength(0.5f).noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> TANGLED_ROSE_BUSH = registerBlock("tangled_rose_bush",
            () -> new AzaleaBlock(BlockBehaviour.Properties.of(Material.PLANT)
                    .strength(0.5f).noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> REDPOT = registerBlock("redpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ORANGEPOT = registerBlock("orangepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> YELLOWPOT = registerBlock("yellowpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIMEPOT = registerBlock("limepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREENPOT = registerBlock("greenpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> CYANPOT = registerBlock("cyanpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LIGHTBLUEPOT = registerBlock("lightbluepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUEPOT = registerBlock("bluepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PURPLEPOT = registerBlock("purplepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MAGENTAPOT = registerBlock("magentapot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PINKPOT = registerBlock("pinkpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BROWNPOT = registerBlock("brownpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> WHITEPOT = registerBlock("whitepot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHTGREYPOT = registerBlock("lightgreypot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREYPOT = registerBlock("greypot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLACKPOT = registerBlock("blackpot",
            () -> new Pot(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(2).noOcclusion().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> SANDSTONESTATUE = registerBlock("sandstone_statue",
            () -> new Statue(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2).noOcclusion().sound(SoundType.STONE).explosionResistance(1200)));
    public static final RegistryObject<Block> REDSANDSTONESTATUE = registerBlock("red_sandstone_statue",
            () -> new Statue(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2).noOcclusion().sound(SoundType.STONE).explosionResistance(1200)));




    public static final RegistryObject<Block> GOLD_POPPY = registerBlock("gold_poppy",
            () -> new FlowerBlock(MobEffects.NIGHT_VISION, 5,
                    BlockBehaviour.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> POTTED_GOLD_POPPY = BLOCKS.register("potted_gold_poppy",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GOLD_POPPY,
                    BlockBehaviour.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS)));

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