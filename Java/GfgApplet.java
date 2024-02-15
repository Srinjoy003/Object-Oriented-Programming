  

    import java.awt.*;
    import java.applet.*;

    public class GfgApplet extends Applet
    {
        String msg="";
        public void init()
        {
            msg="Hello Geeks";
        }

        public void start()
        {
            msg=msg+",Welcome to GeeksForGeeks";
        }

        public void paint(Graphics g)
        {
            g.drawString("Heloooo",20,20);
        }
    }

/*
<applet code="GfgApplet" width=300 height=100>
</applet>
*/
