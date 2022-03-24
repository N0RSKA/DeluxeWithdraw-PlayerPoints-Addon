package dev.norska.dwaddon.pp.addon;

import java.util.List;

import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.PlayerPointsAPI;
import org.bukkit.entity.Player;

import dev.norska.dw.api.DWAddonInterface;
import dev.norska.dwaddon.pp.PPAddon;

public class PPInterface implements DWAddonInterface {
	
	private PlayerPointsAPI ppAPI = PlayerPoints.getInstance().getAPI();

	@Override
	public void add(Player p, Double amount) {
		ppAPI.give(p.getUniqueId(), amount.intValue());
	}

	@Override
	public void add(Player p, Integer amount) {
		ppAPI.give(p.getUniqueId(), amount);
	}

	@Override
	public String adminCreator() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getCreatorForAdminItems();
	}

	@Override
	public int currencyFormat() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getCurrencyFormat();
	}

	@Override
	public String currencyString() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getCurrencyName();
	}

	@Override
	public Double getCurrent(Player p) {
		return (double) ppAPI.look(p.getUniqueId());
	}

	@Override
	public Boolean has(Player p, Double amount) {
		return ppAPI.look(p.getUniqueId()) >= amount;
	}

	@Override
	public Boolean has(Player p, Integer amount) {
		return ppAPI.look(p.getUniqueId()) >= amount;
	}

	@Override
	public String layout() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getItemLayout();
	}

	@Override
	public Double maxWithdraw() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getMaxWithdraw();
	}

	@Override
	public Double minWithdraw() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getMinWithdraw();
	}

	@Override
	public void set(Player p, Double arg1) {
		
		
	}

	@Override
	public void set(Player p, Integer amount) {
		
	}

	@Override
	public void take(Player p, Double amount) {
		ppAPI.take(p.getUniqueId(), amount.intValue());
	}

	@Override
	public void take(Player p, Integer amount) {
		ppAPI.take(p.getUniqueId(), amount);
	}

	@Override
	public List<String> withdrawCommands() {
		return PPAddon.getInstance().getNHandler().getCacheHandler().getCommands();
	}

	@Override
	public void reloadConfiguration() {
		PPAddon.getInstance().generateFiles();
		PPAddon.getInstance().cache();
	}

	@Override
	public Boolean useInt() {
		return true;
	}

}
