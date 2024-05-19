package net.blay09.mods.hardcorerevival.compat;

import com.tac.guns.event.GunFireEvent;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.hardcorerevival.HardcoreRevival;
import net.blay09.mods.hardcorerevival.config.HardcoreRevivalConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Objects;

public class TimelessClassicsGunsModAddon {

    public TimelessClassicsGunsModAddon() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onGunFirePre(GunFireEvent.Pre event) {
        if (HardcoreRevival.getRevivalData(event.getPlayer()).isKnockedOut()) {
            event.setCanceled(true);
        }
    }
}
