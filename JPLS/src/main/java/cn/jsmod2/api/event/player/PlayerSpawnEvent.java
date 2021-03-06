/*
Jsmod2 is a java-based scpsl cn.jsmod2.server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.api.event.player;

import cn.jsmod2.core.math.Vector;
import cn.jsmod2.network.PacketSender;


/**
 * @author kevinj
 */
public class PlayerSpawnEvent extends PlayerEvent implements IPlayerSpawnEvent{

    public Vector spawnPos;

    public Vector getSpawnPos() {
        spawnPos = PacketSender.sendEventGetPacket(playerName,"SpawnPos",Vector.class);
        return spawnPos;
    }

    public void setSpawnPos(Vector spawnPos) {
        PacketSender.sendEventSetPacket(playerName,"SpawnPos",spawnPos);
        this.spawnPos = spawnPos;
    }

    public PlayerSpawnEvent(){

    }

}
