package com.sherlock868;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NailBeastSfxTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NailBeastSfx.class);
		RuneLite.main(args);
	}
}