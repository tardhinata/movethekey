
package GameCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.Vector;
import javax.swing.JOptionPane;

public class SaveGame {
    private String PlayedUser;
    private String CurrScore;
    private String CurrStep;
    URI uri = null;
    URL url=null;
    public SaveGame(){

    }

    public void isi(String PlayedUser, String CurrScore, String CurrStep){
        this.PlayedUser=PlayedUser;
        this.CurrScore=CurrScore;
        this.CurrStep=CurrStep;
        save();
    }
    public File getUri(){
        File tujuan=null;
        try{
            url = getClass().getClassLoader().getResource("resources/HighScore.sav");
            uri = new URI(url+"");
            tujuan = new File(uri);
            return tujuan;
        }catch(Exception e){

        }
        return tujuan;
    }
    public void save(){
       
        Vector VecHiScorex = new Vector();
        try
        {
            BufferedReader buf = new BufferedReader(new FileReader(getUri()));
            String line = null;
            while((line=buf.readLine())!=null) {
                VecHiScorex.add(line);
            }
            buf.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 1");
            }

        try
        {
            PrintWriter p2 = new PrintWriter(new FileWriter(getUri()));
            // menulis kembali data user sebelumnya
            for(int i=0;i<VecHiScorex.size();i++)
            {
                String CurrentUser = (String) VecHiScorex.elementAt(i);
                String split2[] = CurrentUser.split(";");
                p2.print(split2[0]+";");
                p2.print(split2[1]+";");
                p2.print(split2[2]);
                p2.println();
            }
            // menambah data yang baru
            p2.print(PlayedUser+";");
            p2.print(CurrScore+";");
            p2.print(CurrStep);
            p2.println();
            p2.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 2");
        }
        //-----------------SORTING HIGH SCORE SEBELUM SAVE
        Vector VecHiScore = new Vector();
        try
        {
            BufferedReader buf2 = new BufferedReader(new FileReader(getUri()));
            String line2 = null;
            while((line2=buf2.readLine())!=null) {
                VecHiScore.add(line2);
            }
            buf2.close();
        }catch(Exception ex) { JOptionPane.showMessageDialog(null,"Error 3"); }
        String TempUsrx[] =  new String[6];
        int TempScrx[] = new int[6];
        String TempStepx[] =  new String[6];
        String TempSortUsrx = "";
        int TempSortScrx;
        String TempSortStepx =  "";

        for(int i=0;i<VecHiScore.size();i++)
        {
            String CurrentUser2 = (String) VecHiScore.elementAt(i);
            String split2x[] = CurrentUser2.split(";");
            TempUsrx[i] = split2x[0];
            TempScrx[i] = Integer.parseInt(split2x[1]);
            TempStepx[i] = split2x[2];
        }
        //--------------------SORTING ASCENDING
        for(int i =0;i<VecHiScore.size();i++) {
            for(int j=VecHiScore.size()-1;j>i;j--) {
                if(TempScrx[j]>TempScrx[j-1]) {
                        System.out.print(TempScrx[j]+"-"+TempScrx[j-1]);
                        TempSortScrx = TempScrx[j];
                        TempScrx[j] = TempScrx[j-1];
                        TempScrx[j-1] = TempSortScrx;

                        TempSortUsrx = TempUsrx[j];
                        TempUsrx[j] = TempUsrx[j-1];
                        TempUsrx[j-1] = TempSortUsrx;

                        TempSortStepx = TempStepx[j];
                        TempStepx[j] = TempStepx[j-1];
                        TempStepx[j-1] = TempSortStepx;
                    }
                    System.out.println();
                }
            }
        //------------------END SORTING
        try
        {
            PrintWriter p2x = new PrintWriter(new FileWriter(getUri()));
            // menulis kembali data user sebelumnya hanya TOP 5 yang ditulis
            for(int i=0;i<5;i++)
            {
                p2x.print(TempUsrx[i]+";");
                p2x.print(TempScrx[i]+";");
                p2x.print(TempStepx[i]);
                p2x.println();
            }
            p2x.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 4");
        }
        //----------------END SORTING HIGH SCORE===================
    }

    public boolean cekScore(int score){
        boolean lebihBesar=false;
        Vector VecHiScore = new Vector();
        try
        {
            BufferedReader buf = new BufferedReader(new FileReader(getUri()));
            String line = null;
            while((line=buf.readLine())!=null) {
                VecHiScore.add(line);
            }
            buf.close();
        }catch(Exception ex) { JOptionPane.showMessageDialog(null,"Error 5"); }
        int TempScrx[] = new int[6];
        int TempSortScrx;
        for(int i=0;i<VecHiScore.size();i++)
        {
            String CurrentUser2 = (String) VecHiScore.elementAt(i);
            String split2x[] = CurrentUser2.split(";");
            TempScrx[i] = Integer.parseInt(split2x[1]);
            if(score>TempScrx[i]) lebihBesar=true;
        }
        if(lebihBesar) return true;
        else return false;
    }
}
