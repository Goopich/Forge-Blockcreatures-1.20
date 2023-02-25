package net.goopich.blockcreatures;

import com.mojang.logging.LogUtils;
import net.goopich.blockcreatures.block.ModBlocks;
import net.goopich.blockcreatures.item.ModCreativeModeTabs;
import net.goopich.blockcreatures.item.ModItems;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BlockCreatures.MOD_ID)
public class BlockCreatures {
    public static final String MOD_ID = "blockcreatures";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockCreatures() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.BLOCKCREATURES) {
            event.accept(ModItems.SEED_BALL);
            event.accept(ModItems.ROASTED_SUNFLOWER_SEEDS);
            event.accept(ModItems.ROASTED_PUMPKIN_SEEDS);
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
            event.accept(ModBlocks.TANGLED_ROSE_BUSH_BLOCK);
            event.accept(ModBlocks.TANGLED_ROSE_BUSH);
            event.accept(ModBlocks.REDPOT);
            event.accept(ModBlocks.ORANGEPOT);
            event.accept(ModBlocks.YELLOWPOT);
            event.accept(ModBlocks.GREENPOT);
            event.accept(ModBlocks.BLUEPOT);
            event.accept(ModBlocks.PURPLEPOT);
        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
    }
}
