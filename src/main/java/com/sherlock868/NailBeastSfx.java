package com.sherlock868;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "NailBeastSfx"
)
public class NailBeastSfx extends Plugin
{
	@Inject
	private Client client;

	@Subscribe
	public void onSoundEffectPlayed(SoundEffectPlayed event){
		client.playSoundEffect(3482, 100);
		event.consume();
	}
}
