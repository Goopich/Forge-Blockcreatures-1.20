package net.goopich.blockcreatures.item;

import net.goopich.blockcreatures.BlockCreatures;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BlockCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BLOCKCREATURES;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BLOCKCREATURES = event.registerCreativeModeTab(new ResourceLocation(BlockCreatures.MOD_ID, "blockcreatures"),
                builder -> builder.icon(()-> new ItemStack(ModItems.SEED_BALL.get()))
                        .title(Component.translatable("creativemodetab.blockcreatures_tab")));
    }
}
