/*
Jsmod2 is a java-based scpsl cn.jsmod2.server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.api.event.player;

import cn.jsmod2.api.map.Generator;
import cn.jsmod2.api.player.Player;
import cn.jsmod2.core.annotations.UseForServerInit;
import cn.jsmod2.network.PacketSender;

import static cn.jsmod2.network.PacketSender.sendEventGetPacket;
import static cn.jsmod2.network.PacketSender.sendEventSetPacket;

/**
 * @author kevinj
 */

public class PlayerGeneratorInsertTabletEvent extends PlayerEvent implements IPlayerGeneratorInsertTabletEvent{
    private Generator generator = new Generator();
    private boolean allow;
    private boolean removeTablet;

    public PlayerGeneratorInsertTabletEvent(Player player, Generator generator, boolean allow, boolean removeTablet) {
        super(player);
        this.generator = generator;
        this.allow = allow;
        this.removeTablet = removeTablet;
    }

    public PlayerGeneratorInsertTabletEvent(){

    }

    public Generator getGenerator() {
        return generator;
    }

    public boolean isAllow() {
        allow = sendEventGetPacket(playerName,"Allow",Boolean.class);
        return allow;
    }



    public void setAllow(boolean allow) {
        sendEventSetPacket(playerName,"Allow",allow);
        this.allow = allow;
    }

    public boolean isRemoveTablet() {
        removeTablet = PacketSender.sendEventGetPacket(playerName,"RemoveTablet",Boolean.class);
        return removeTablet;
    }

    public void setRemoveTablet(boolean removeTablet) {
        PacketSender.sendEventSetPacket(playerName,"RemoveTablet",removeTablet);
        this.removeTablet = removeTablet;
    }

}
