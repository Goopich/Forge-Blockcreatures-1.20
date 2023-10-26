package net.goopich.blockcreatures.item;

import net.goopich.blockcreatures.BlockCreatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            BlockCreatures.MOD_ID);
    public static RegistryObject<CreativeModeTab> BLOCKCREATURES = CREATIVE_MODE_TABS.register("blockcreatures", () ->
            CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SEED_BALL.get()))
                    .title(Component.translatable("creativemodetab.blockcreatures_tab")).build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
