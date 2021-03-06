package dev.norska.dwaddon.pp.ndev;

import dev.norska.dwaddon.pp.ndev.handlers.CacheHandler;
import dev.norska.dwaddon.pp.ndev.handlers.ConfigHandler;
import lombok.Getter;

public class NorskaHandler {
	
	@Getter private CacheHandler cacheHandler = new CacheHandler();
	@Getter private ConfigHandler configurationHandler = new ConfigHandler();
	
}
