package com.anatawa12.soundlimitextends;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import paulscode.sound.SoundSystemConfig;

@Mod(modid = Common.MODID, version = Common.VERSION, name = Common.MODID)
public class SoundLimitExtends18 {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SoundSystemConfig.setNumberNormalChannels(1024);
        SoundSystemConfig.setNumberStreamingChannels(32);
    }
}
