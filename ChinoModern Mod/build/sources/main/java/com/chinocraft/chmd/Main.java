package com.chinocraft.chmd;

import com.chinocraft.chmd.proxy.CommonProxy;
import com.chinocraft.chmd.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void ServerStarting(FMLServerStartingEvent event) 
	{
		
	}
	
	@EventHandler
	public static void ServerStopping(FMLServerStoppingEvent event) 
	{
		
	}
}
