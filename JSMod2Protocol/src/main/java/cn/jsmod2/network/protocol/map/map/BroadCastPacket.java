package cn.jsmod2.network.protocol.map.map;



public class BroadCastPacket extends SetMapPacket {

    public int duration;
    public String message;
    public boolean isMonoSpaced;

    public static final int ID = 147;

    public BroadCastPacket() {
        super(ID);
    }

    @Override
    public void send() {
        requester.with("duration",duration).with("message",message).with("isMonoSpaced",isMonoSpaced).to();
    }
}
