/*
Jsmod2 is a java-based scpsl cn.jsmod2.server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.api.event.team;

import cn.jsmod2.core.event.Event;
import cn.jsmod2.network.PacketSender;

public class SetNTFUnitNameEvent extends Event implements ISetNTFUnitNameEvent{

    private String unit;

    public SetNTFUnitNameEvent(String unit) {
        this.unit = unit;
    }

    public SetNTFUnitNameEvent(){

    }

    public String getUnit() {
        unit = PacketSender.sendEventGetPacket(playerName,"Unit",String.class);
        return unit;
    }

    public void setUnit(String unit) {
        PacketSender.sendEventSetPacket(playerName,"Unit",unit);
        this.unit = unit;
    }
}
