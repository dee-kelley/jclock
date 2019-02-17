package hello;

import java.util.Date;

public class ClockThread extends Thread{
    Hello dc;
    String time;
            
    public ClockThread(Hello dc){
        this.dc = dc;
        start();
        
    }
    public void run(){
        while(true) {
            time =""+new Date();
            dc.jlabClock.setText(time);
        }
    }
}
