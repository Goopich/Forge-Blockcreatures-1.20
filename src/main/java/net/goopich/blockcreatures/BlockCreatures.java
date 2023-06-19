package net.goopich.blockcreatures;

import com.mojang.logging.LogUtils;
import net.goopich.blockcreatures.block.ModBlocks;
import net.goopich.blockcreatures.entity.ModEntityTypes;
import net.goopich.blockcreatures.entity.client.GrassBlockRenderer;
import net.goopich.blockcreatures.entity.client.MudBlockRenderer;
import net.goopich.blockcreatures.entity.client.StoneBlockRenderer;
import net.goopich.blockcreatures.item.ModCreativeModeTabs;
import net.goopich.blockcreatures.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BlockCreatures.MOD_ID)
public class BlockCreatures {
    public static final String MOD_ID = "blockcreatures";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockCreatures() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntityTypes.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLD_POPPY.getId(), ModBlocks.POTTED_GOLD_POPPY);


        });
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.BLOCKCREATURES) {
            event.accept(ModItems.SEED_BALL);
            event.accept(ModItems.ROASTED_SUNFLOWER_SEEDS);
            event.accept(ModItems.ROASTED_PUMPKIN_SEEDS);
            event.accept(ModItems.APPLE_PIE);
            event.accept(ModItems.SAWDUST);
            event.accept(ModItems.DARK_SAWDUST);
            event.accept(ModItems.TROPICAL_SAWDUST);
            event.accept(ModItems.FUNGAL_SAWDUST);
            event.accept(ModBlocks.SAWDUST_BLOCK);
            event.accept(ModBlocks.WOOD_PULP);
            event.accept(ModBlocks.DARK_SAWDUST_BLOCK);
            event.accept(ModBlocks.DARK_WOOD_PULP);
            event.accept(ModBlocks.TROPICAL_SAWDUST_BLOCK);
            event.accept(ModBlocks.TROPICAL_WOOD_PULP);
            event.accept(ModBlocks.FUNGAL_SAWDUST_BLOCK);
            event.accept(ModBlocks.FUNGAL_PULP);
            event.accept(ModItems.STICKYSUBSTANCE);
            event.accept(ModBlocks.TANGLED_ROSE_BUSH_BLOCK);
            event.accept(ModBlocks.TANGLED_ROSE_BUSH);
            event.accept(ModBlocks.GOLD_POPPY);
            event.accept(ModBlocks.REDPOT);
            event.accept(ModBlocks.ORANGEPOT);
            event.accept(ModBlocks.YELLOWPOT);
            event.accept(ModBlocks.LIMEPOT);
            event.accept(ModBlocks.GREENPOT);
            event.accept(ModBlocks.CYANPOT);
            event.accept(ModBlocks.LIGHTBLUEPOT);
            event.accept(ModBlocks.BLUEPOT);
            event.accept(ModBlocks.PURPLEPOT);
            event.accept(ModBlocks.MAGENTAPOT);
            event.accept(ModBlocks.PINKPOT);
            event.accept(ModBlocks.BROWNPOT);
            event.accept(ModBlocks.WHITEPOT);
            event.accept(ModBlocks.LIGHTGREYPOT);
            event.accept(ModBlocks.GREYPOT);
            event.accept(ModBlocks.BLACKPOT);
            event.accept(ModItems.SHELLITE);
            event.accept(ModItems.CETANITE);
            event.accept(ModItems.CAPRINITE);
            event.accept(ModBlocks.SANDSTONESTATUE);
            event.accept(ModBlocks.REDSANDSTONESTATUE);
            event.accept(ModItems.STONE_BLOCK_SPAWN_EGG);
            event.accept(ModItems.GRASS_BLOCK_SPAWN_EGG);
            event.accept(ModItems.MUD_BLOCK_SPAWN_EGG);
        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            EntityRenderers.register(ModEntityTypes.STONE_BLOCK.get(), StoneBlockRenderer::new);
            EntityRenderers.register(ModEntityTypes.GRASS_BLOCK.get(), GrassBlockRenderer::new);
            EntityRenderers.register(ModEntityTypes.MUD_BLOCK.get(), MudBlockRenderer::new);
        }
    }
}
