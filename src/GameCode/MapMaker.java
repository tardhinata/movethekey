package GameCode;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class MapMaker extends javax.swing.JFrame {
    Images img = new Images();
    int mapData[][] = new int[10][10];
    int mapDataTerpilih[][] = new int[10][10];
    JLabel IsiMap[][] = new JLabel[10][10];
    int Map[][][] = new int[10][10][10];
    int jumlahMap=0;
    Border terpilih=null;
    Border takTerpilih=null;
    Map map = new Map();
    ImageIcon imgTembok = new ImageIcon((Image)img.getResourceImage("Tembok.gif"));
	ImageIcon imgKunci = new ImageIcon((Image)img.getResourceImage("Kunci.gif"));
	ImageIcon imgGembokTutup = new ImageIcon((Image)img.getResourceImage("GembokTutup.GIF"));
	ImageIcon imgTanah = new ImageIcon((Image)img.getResourceImage("Tanah.GIF"));
    Sounds suara = new Sounds();

    public MapMaker() {
        initComponents();
        loadAwal();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        papanMain = new javax.swing.JPanel();
        Steps = new javax.swing.JLabel();
        Steps2 = new javax.swing.JLabel();
        lblUnselected = new javax.swing.JLabel();
        lblTembok = new javax.swing.JLabel();
        lblTanah = new javax.swing.JLabel();
        lblGembok = new javax.swing.JLabel();
        lblSelected = new javax.swing.JLabel();
        lblKunci = new javax.swing.JLabel();
        Steps3 = new javax.swing.JLabel();
        Steps4 = new javax.swing.JLabel();
        Steps5 = new javax.swing.JLabel();
        Steps6 = new javax.swing.JLabel();
        lblTerpilih = new javax.swing.JLabel();
        radioEditMap = new javax.swing.JRadioButton();
        radioTambahMap = new javax.swing.JRadioButton();
        cmbListMap = new javax.swing.JComboBox();
        Steps1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Save Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jButton1.setBounds(510, 370, 90, 60);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setBounds(430, 250, 0, 0);
        jLayeredPane2.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        papanMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        papanMain.setMinimumSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout papanMainLayout = new javax.swing.GroupLayout(papanMain);
        papanMain.setLayout(papanMainLayout);
        papanMainLayout.setHorizontalGroup(
            papanMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        papanMainLayout.setVerticalGroup(
            papanMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        papanMain.setBounds(20, 70, 400, 400);
        jLayeredPane2.add(papanMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps.setFont(new java.awt.Font("Tahoma", 1, 15));
        Steps.setForeground(new java.awt.Color(0, 51, 51));
        Steps.setText("Preview Map");
        Steps.setBounds(170, 40, 110, 19);
        jLayeredPane2.add(Steps, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps2.setFont(new java.awt.Font("Tahoma", 1, 11));
        Steps2.setText("Kunci");
        Steps2.setBounds(520, 330, 60, 14);
        jLayeredPane2.add(Steps2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblUnselected.setBackground(new java.awt.Color(204, 204, 255));
        lblUnselected.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblUnselected.setBounds(440, 450, 40, 40);
        jLayeredPane2.add(lblUnselected, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblTembok.setBackground(new java.awt.Color(204, 204, 255));
        lblTembok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tembok.gif"))); // NOI18N
        lblTembok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTembok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTembokMouseClicked(evt);
            }
        });
        lblTembok.setBounds(450, 170, 40, 40);
        jLayeredPane2.add(lblTembok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblTanah.setBackground(new java.awt.Color(204, 204, 255));
        lblTanah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tanah.GIF"))); // NOI18N
        lblTanah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTanah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTanahMouseClicked(evt);
            }
        });
        lblTanah.setBounds(450, 220, 40, 40);
        jLayeredPane2.add(lblTanah, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblGembok.setBackground(new java.awt.Color(204, 204, 255));
        lblGembok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GembokTutup.GIF"))); // NOI18N
        lblGembok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblGembok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGembokMouseClicked(evt);
            }
        });
        lblGembok.setBounds(450, 270, 40, 40);
        jLayeredPane2.add(lblGembok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblSelected.setBackground(new java.awt.Color(204, 204, 255));
        lblSelected.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 5, true));
        lblSelected.setBounds(490, 450, 40, 40);
        jLayeredPane2.add(lblSelected, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblKunci.setBackground(new java.awt.Color(204, 204, 255));
        lblKunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kunci.gif"))); // NOI18N
        lblKunci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblKunci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKunciMouseClicked(evt);
            }
        });
        lblKunci.setBounds(450, 320, 40, 40);
        jLayeredPane2.add(lblKunci, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps3.setFont(new java.awt.Font("Tahoma", 1, 15));
        Steps3.setForeground(new java.awt.Color(0, 51, 51));
        Steps3.setText("Choose Item");
        Steps3.setBounds(500, 40, 100, 19);
        jLayeredPane2.add(Steps3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps4.setFont(new java.awt.Font("Tahoma", 1, 11));
        Steps4.setText("Wall");
        Steps4.setBounds(520, 180, 60, 14);
        jLayeredPane2.add(Steps4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Steps5.setText("Floor");
        Steps5.setBounds(520, 230, 60, 14);
        jLayeredPane2.add(Steps5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps6.setFont(new java.awt.Font("Tahoma", 1, 11));
        Steps6.setText("Lock");
        Steps6.setBounds(520, 280, 60, 14);
        jLayeredPane2.add(Steps6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblTerpilih.setBackground(new java.awt.Color(204, 204, 255));
        lblTerpilih.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTerpilih.setBounds(540, 450, 40, 40);
        jLayeredPane2.add(lblTerpilih, javax.swing.JLayeredPane.DEFAULT_LAYER);

        radioEditMap.setText("Edit Exiting Map");
        radioEditMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioEditMapMouseClicked(evt);
            }
        });
        radioEditMap.setBounds(450, 100, 180, 23);
        jLayeredPane2.add(radioEditMap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        radioTambahMap.setText("Make New (Max 10)");
        radioTambahMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTambahMapMouseClicked(evt);
            }
        });
        radioTambahMap.setBounds(450, 70, 180, 23);
        jLayeredPane2.add(radioTambahMap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbListMap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbListMap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbListMapItemStateChanged(evt);
            }
        });
        cmbListMap.setBounds(470, 130, 160, 20);
        jLayeredPane2.add(cmbListMap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps1.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        Steps1.setForeground(new java.awt.Color(255, 255, 255));
        Steps1.setText("MAP MAKER");
        Steps1.setBounds(280, 3, 120, 20);
        jLayeredPane2.add(Steps1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mtk/BannerMapMaker.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setBounds(0, 0, 650, 28);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mtk/BackMapMaker.png"))); // NOI18N
        jLabel2.setBounds(0, 30, 650, 470);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-666)/2, (screenSize.height-540)/2, 666, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                if(IsiMap[i][j].getIcon() == lblTanah.getIcon())
                {
                    mapData[i][j] = 0;
                }
                else if(IsiMap[i][j].getIcon() == lblTembok.getIcon())
                {
                    mapData[i][j] = 1;
                }
                else if(IsiMap[i][j].getIcon() == lblKunci.getIcon())
                {
                    mapData[i][j] = 2;
                }
                else if(IsiMap[i][j].getIcon() == lblGembok.getIcon())
                {
                    mapData[i][j] = 3;
                }
            }
        }
        if(radioTambahMap.isSelected()){
            this.papanMain.updateUI();
            int jum = map.cekJumlahMap();
            if(jum>10){
                JOptionPane.showMessageDialog(null, "Sorry Map is Full");
            }
            else{
                map.isi(mapData);
                map.save();
                JOptionPane.showMessageDialog(null, "Map Added!!");
                papanMain.removeAll();
                radioEditMap.setSelected(false);
                radioTambahMap.setSelected(false);
                loadAwal();
            }
        }
        else {
            map.isi(mapData);
            map.saveSelected(cmbListMap.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "Map Saved!!");
            //papanMain.removeAll();
            //radioEditMap.setSelected(false);
            //radioTambahMap.setSelected(false);
            loadListMap();
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
}//GEN-LAST:event_jButton1KeyPressed

    private void lblTembokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTembokMouseClicked
        clearSelected();
        lblTembok.setBorder(terpilih);
        lblTerpilih.setIcon(lblTembok.getIcon());
    }//GEN-LAST:event_lblTembokMouseClicked

    private void lblTanahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTanahMouseClicked
        clearSelected();
        lblTanah.setBorder(terpilih);
        lblTerpilih.setIcon(lblTanah.getIcon());
    }//GEN-LAST:event_lblTanahMouseClicked

    private void lblGembokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGembokMouseClicked
        clearSelected();
        lblGembok.setBorder(terpilih);
        lblTerpilih.setIcon(lblGembok.getIcon());
    }//GEN-LAST:event_lblGembokMouseClicked

    private void lblKunciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKunciMouseClicked
        clearSelected();
        lblKunci.setBorder(terpilih);
        lblTerpilih.setIcon(lblKunci.getIcon());
    }//GEN-LAST:event_lblKunciMouseClicked

    private void radioEditMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioEditMapMouseClicked
        radioTambahMap.setSelected(false);
        radioEditMap.setSelected(true);
        cmbListMap.setEnabled(true);
        loadListMap();
    }//GEN-LAST:event_radioEditMapMouseClicked

    private void radioTambahMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTambahMapMouseClicked
        radioEditMap.setSelected(false);
        radioTambahMap.setSelected(true);
        cmbListMap.setEnabled(false);
        papanMain.removeAll();
        loadAwal();
    }//GEN-LAST:event_radioTambahMapMouseClicked

    private void cmbListMapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbListMapItemStateChanged
        loadListMap();
    }//GEN-LAST:event_cmbListMapItemStateChanged

    private void clearSelected(){
        lblTembok.setBorder(takTerpilih);
        lblKunci.setBorder(takTerpilih);
        lblTanah.setBorder(takTerpilih);
        lblGembok.setBorder(takTerpilih);
    }

    private void inisialisasiItemPapan(){
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                IsiMap[i][j] = new JLabel();
                IsiMap[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        lblIsiMapClick(evt);
                    }
                });
                papanMain.add(IsiMap[i][j]);
			}
        }
    }
    private void loadAwal(){
        terpilih=lblSelected.getBorder();
        takTerpilih=lblUnselected.getBorder();
        lblUnselected.hide();
        lblSelected.hide();
        lblTerpilih.hide();
        inisialisasiItemPapan();
        getListMap();
        radioTambahMap.setSelected(true);
        cmbListMap.setEnabled(false);
        papanMain.setLayout(new GridLayout(10,10));
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                if(i==0 || i==9 || j==0 || j==9 ) {
                    IsiMap[i][j].setIcon(lblTembok.getIcon());
                }
                else {
                    IsiMap[i][j].setIcon(lblTanah.getIcon());
                }
                papanMain.add(IsiMap[i][j]);
			}
        }
        papanMain.updateUI();
        
    }

    private void getListMap(){
        String namaMap="";
        cmbListMap.removeAllItems();
        int jumlahMap=map.cekJumlahMap();
        for(int i=0;i<jumlahMap;i++){
            namaMap="Map Level "+(i+1);
            cmbListMap.addItem(namaMap);
        }
    }

    private void loadListMap(){
        mapDataTerpilih=map.getSelectedMap(cmbListMap.getSelectedIndex());
        tampilMapTerpilih();
        papanMain.updateUI();
    }

    private void tampilMapTerpilih(){
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                mapData[i][j]=mapDataTerpilih[i][j];
                if(mapData[i][j]==0)
                {
                    IsiMap[i][j].setIcon(imgTanah);
                }
                else if(mapData[i][j]==1)
                {
                    IsiMap[i][j].setIcon(imgTembok);
                }
                else if(mapData[i][j]==2)
                {
                    IsiMap[i][j].setIcon(imgKunci);
                }
                else if(mapData[i][j]==3)
                {
                    IsiMap[i][j].setIcon(imgGembokTutup);
                }
            }
        }
    }

    private void lblIsiMapClick(java.awt.event.MouseEvent evt) {
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                if( IsiMap[i][j].toString().equals(evt.getSource().toString())){
                    IsiMap[i][j].setIcon(lblTerpilih.getIcon());
                }
			}
        }
        papanMain.updateUI();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Steps;
    private javax.swing.JLabel Steps1;
    private javax.swing.JLabel Steps2;
    private javax.swing.JLabel Steps3;
    private javax.swing.JLabel Steps4;
    private javax.swing.JLabel Steps5;
    private javax.swing.JLabel Steps6;
    private javax.swing.JComboBox cmbListMap;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel lblGembok;
    private javax.swing.JLabel lblKunci;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JLabel lblTanah;
    private javax.swing.JLabel lblTembok;
    private javax.swing.JLabel lblTerpilih;
    private javax.swing.JLabel lblUnselected;
    private javax.swing.JPanel papanMain;
    private javax.swing.JRadioButton radioEditMap;
    private javax.swing.JRadioButton radioTambahMap;
    // End of variables declaration//GEN-END:variables

}
