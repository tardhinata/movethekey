
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

public class Map {
    URI uri = null;
    URL url=null;
    private int mapData[][];
    public Map(){

    }
    public void isi (int mapData[][]){
        this.mapData=mapData;
    }
    public File getUri(){
        File tujuan=null;
        try{
            url = getClass().getClassLoader().getResource("resources/Map.txt");
            uri = new URI(url+"");
            tujuan = new File(uri);
            return tujuan;
        }catch(Exception e){

        }
        return tujuan;
    }

    public void save(){
        Vector VecMapData = new Vector();
        try
        {
            BufferedReader buf = new BufferedReader(new FileReader(getUri()));
            String line = null;
            while((line=buf.readLine())!=null) {
                VecMapData.add(line);
            }
            buf.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 1");
            }
        try
        {
            PrintWriter p2 = new PrintWriter(new FileWriter(getUri()));
            // menulis kembali data user sebelumnya
            for(int i=0;i<VecMapData.size();i++)
            {
                String MapPerLine = (String) VecMapData.elementAt(i);
                p2.print(MapPerLine);
                p2.println();
            }
            // menambah data yang baru
            for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
                    p2.print(mapData[i][j]+"");
                }
                p2.println();
            }
            p2.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 2");
        }
    }

    public void saveSelected(int index){
        Vector VecMapData = new Vector();
        int jumlahMap=0;
        try
        {
            BufferedReader buf = new BufferedReader(new FileReader(getUri()));
            String line = null;
            while((line=buf.readLine())!=null) {
                VecMapData.add(line);
            }
            buf.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error 1");
            }
        try
        {
            PrintWriter p2 = new PrintWriter(new FileWriter(getUri()));
            boolean tambah =false;
            for(int i=0;i<VecMapData.size();i++)
            {
                if(i%10==0)jumlahMap++;
                if(jumlahMap==index+1){
                    for(int k=0;k<10;k++) {
                        for(int j=0;j<10;j++) {
                            p2.print(mapData[k][j]+"");
                        }
                        p2.println();
                        jumlahMap++;
                        i++;
                    }
                    i--;
                }else{
                    tambah=false;
                    String MapPerLine = (String) VecMapData.elementAt(i);
                    p2.print(MapPerLine);
                    p2.println();

                }
            }
            System.out.println(jumlahMap);
            /*for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
                    p2.print(mapData[i][j]+"");
                }
                p2.println();
            }*/
            p2.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    public int cekJumlahMap(){
        int jumlahMap=0;
        try
		{
			BufferedReader buf = new BufferedReader(new FileReader(getUri()));
			int temp;
			int i=0;
			int j=0;
            int z=0;
			while(true) {
				temp=buf.read();
				if(temp==-1) {break;}
				else
				{
					if(Character.getNumericValue(temp)!=-1)
					{
						if(z<100){
							j++;
							if(j==10){ i++; j=0; }
						}
						z++;
					}
				}
				if(i==10 && z==100) {
                    jumlahMap++;
                    i=0;
                    z=0;
                }
			}
			buf.close();
		} catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return jumlahMap;
    }

    public int[][] getSelectedMap(int index){
        int mapDataTerpilih[][]=new int[10][10];
        int jumlahMap=0;
        try
		{
			BufferedReader buf = new BufferedReader(new FileReader(getUri()));
			int temp;
			int i=0;
			int j=0;
            int z=0;
			while(true) {
				temp=buf.read();
				if(temp==-1) {break;}
				else
				{
					if(Character.getNumericValue(temp)!=-1)
					{
						if(z<100){
                            if(jumlahMap==index){
                                mapDataTerpilih[i][j] = Character.getNumericValue(temp);
                            }
							j++;
							if(j==10){ i++; j=0; }
						}
						z++;
					}
				}
				if(i==10 && z==100) {
                    jumlahMap++;
                    i=0;
                    z=0;
                }
			}
			buf.close();
		} catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return mapDataTerpilih;
    }

}
