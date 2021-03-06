/*
Jsmod2 is a java-based scpsl cn.jsmod2.server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.api.event.environment;

import cn.jsmod2.api.player.Player;

import cn.jsmod2.core.event.Event;

import static cn.jsmod2.network.PacketSender.sendEventGetPacket;
import static cn.jsmod2.network.PacketSender.sendEventSetPacket;

/**
 * @author Kevinj
 * @author magiclu550
 */

public abstract class WarheadEvent extends Event implements IWarheadEvent{
    private float timeLeft;
    private Player player = new Player("");
    private Player activator = new Player("");
    private boolean cancel;

    public float getTimeLeft() {
        timeLeft = sendEventGetPacket(playerName,"TimeLeft",Float.class);
        return timeLeft;
    }

    public void setTimeLeft(float timeLeft) {
        sendEventSetPacket(playerName,"TimeLeft",timeLeft);
        this.timeLeft = timeLeft;
    }

    public boolean isCancel() {
        cancel = sendEventGetPacket(playerName,"Cancel",Boolean.class);
        return cancel;
    }

    public void setCancel(boolean cancel) {
        sendEventSetPacket(playerName,"Cancel",cancel);
        this.cancel = cancel;
    }

    public Player getPlayer() {
        return player;
    }


    public Player getActivator() {
        return activator;
    }


    public WarheadEvent(){

    }


}
