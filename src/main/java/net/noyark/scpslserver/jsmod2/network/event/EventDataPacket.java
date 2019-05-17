package net.noyark.scpslserver.jsmod2.network.event;

import net.noyark.scpslserver.jsmod2.Register;
import net.noyark.scpslserver.jsmod2.event.Event;
import net.noyark.scpslserver.jsmod2.network.DataPacket;

import java.util.Map;
@Deprecated
public abstract class EventDataPacket extends DataPacket {

    private Map<Integer,Class<? extends Event>> events = Register.getInstance().getEvents();

    public Event event;

    public EventDataPacket(int id){
        super(id);
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public Event decode(byte[] bytes) {
        return dataObjectDecode(bytes,events.get(getId()));
    }

    @Override
    public byte[] encode() {
        return dataObjectEncode(event);
    }
}
