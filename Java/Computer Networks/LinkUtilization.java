
public class LinkUtilization {
    public static void main(String[] args) {
        double packetSize = 1024 * 8; //in bits (1 kB is 1024 B, 1 B is 8b)
        // double bandwidth = 1.5 * 1024 * 1024; //in Mbps(mega bits ps)
        double bandwidth = 1.5 * 1000 * 1000; //in Mbps(mega bits ps)
        double roundTripTime = 45; // in msec
        double tt = (packetSize / bandwidth) * 1000 ; //transmission time(in msec)
        
        double tp = (roundTripTime / 2); //propagation delay (in msec)
        double a = tp / tt;

        double n = 1/(1 + 2*a); //link utilization

        System.out.println(tt + " " + a + " " + n);

    }
}