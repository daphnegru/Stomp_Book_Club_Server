package bgu.spl.net.impl.Frames;

public class connectframe implements frame {
    String version;

    public connectframe(String version){
        this.version=version;
    }

    public String toString(){
        String s="CONNECTED"+'\n'+ "version:"+version;
        return s;
    }
}