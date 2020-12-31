package fr.zom.wersiara;

import fr.zom.wersiara.event.RegisteringEvent;
import fr.zom.wersiara.proxy.CommonProxy;
import fr.zom.wersiara.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class WersiaraMain {

    @Mod.Instance(References.MODID)
    public static WersiaraMain instance;

    @SidedProxy(clientSide = References.CP, serverSide = References.SP)
    public static CommonProxy proxy;

    public WersiaraMain() {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvent());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }

}
