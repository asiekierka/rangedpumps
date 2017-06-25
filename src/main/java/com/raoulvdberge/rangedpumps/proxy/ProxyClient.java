package com.raoulvdberge.rangedpumps.proxy;

import com.raoulvdberge.rangedpumps.RangedPumps;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ProxyClient extends ProxyCommon {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(RangedPumps.PUMP), 0, new ModelResourceLocation(RangedPumps.ID + ":pump", "inventory"));
    }
}
