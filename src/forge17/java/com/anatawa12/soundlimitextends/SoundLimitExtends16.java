package com.anatawa12.soundlimitextends;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import paulscode.sound.SoundSystemConfig;

@Mod(modid = Common.MODID, version = Common.VERSION, name = Common.MODID)
public class SoundLimitExtends16 {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SoundSystemConfig.setNumberNormalChannels(1024);
        SoundSystemConfig.setNumberStreamingChannels(32);
    }
}
