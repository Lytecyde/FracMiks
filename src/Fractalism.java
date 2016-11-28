/**
 * Created by diku on 11/28/16.
 */
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.Soundbank;

public class Fractalism {
    static String[] scaleNotes = {"C","D", "E","F","G","A","B"};
    static String[] octaves = {"2","3","4","5","6"};
    final double[] rate = {3.0, //2
            3.449489, //4
            3.544090, //8
            3.564407, //16
            3.568759, //32
            3.569691, //64
            3,569891};//128
    //String melody;

    public static void main(String[] args) {
        Player player = new Player();
        Pattern pattern =
                new Pattern(createMelody(3.87435));
        player.play(pattern);
        player = new Player();
    }

    public static String createMelody(){
        int n = 32*4;
        double x = 0.2;
        double r = 3.6;
        int note = 0;
        String melody ="";
        for(int i =0; i< n;i++){
            x = x*r*(1-x);
            System.out.println(x);
            note = (int)Math.floor(7*x);
            System.out.println(note);
            if(note <8)
            melody += scaleNotes[note] + " ";
            else {
                System.out.println("note outside a range");
            }
        }
        return melody;
    }
    public static String createMelody(double r){
        int n = 32*4;
        double x = 0.02;

        int note = 0;
        String melody ="";
        for(int i =0; i< n;i++){
            x = x*r*(1-x);
            System.out.println(x);
            note = (int)Math.floor(7*x);
            System.out.println(note);
            if(note <8)
                melody += scaleNotes[note]+ octaves[note%5] + " ";
            else {
                System.out.println("note outside a range");
            }
        }
        return melody;
    }

    public static String createMelodyFromStartValue(int r, double x){
        int n = 32*4;


        int note = 0;
        String melody ="";
        for(int i =0; i< n;i++){
            x = x*r*(1-x);
            System.out.println(x);
            note = (int)Math.floor(7*x);
            System.out.println(note);
            if(note <8)
                melody += scaleNotes[note] + " ";
            else {
                System.out.println("note outside a range");
            }
        }
        return melody;
    }
    public static String createMelodyFromStartValue(int r, double x, int n){



        int note = 0;
        String melody ="";
        for(int i =0; i< n;i++){
            x = x*r*(1-x);
            System.out.println(x);
            note = (int)Math.floor(7*x);
            System.out.println(note);
            if(note <8)
                melody += scaleNotes[note] + " ";
            else {
                System.out.println("note outside a range");
            }
        }
        return melody;
    }
    public static String createMelodyFromStartValue(int r,  int n){
        double x = 0.02;


        int note = 0;
        String melody ="";
        for(int i =0; i< n;i++){
            x = x*r*(1-x);
            System.out.println(x);
            note = (int)Math.floor(7*x);
            System.out.println(note);
            if(note <8)
                melody += scaleNotes[note] + " ";
            else {
                System.out.println("note outside a range");
            }
        }
        return melody;
    }
}
