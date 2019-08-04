/*
Jsmod2 is a java-based scpsl server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.api.event.player;

import cn.jsmod2.api.item.ItemType;
import cn.jsmod2.api.player.Player;
import cn.jsmod2.core.annotations.UseForServerInit;
import cn.jsmod2.core.math.Vector;

/**
 * @author kevinj
 */
public class PlayerThrowGrenade extends PlayerEvent implements IPlayerThrowGrenade{

    private ItemType GrenadeType;
    private Vector direction;
    private boolean slowThrow;

    public PlayerThrowGrenade(Player player, ItemType grenadeType, Vector direction, boolean slowThrow) {
        super(player);
        GrenadeType = grenadeType;
        this.direction = direction;
        this.slowThrow = slowThrow;
    }

    public PlayerThrowGrenade(){

    }

    public ItemType getGrenadeType() {
        return GrenadeType;
    }


    public Vector getDirection() {
        return direction;
    }


    public boolean isSlowThrow() {
        return slowThrow;
    }



}
