package GameCode;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MTK extends javax.swing.JFrame
{
    URI uri = null;
    URL url=null;
    Images img = new Images();
    int mapData[][] = new int[10][10]; // untuk menyimpan data map dari Map.txt
    JLabel IsiMap[][] = new JLabel[10][10];
    int Map[][][] = new int[10][10][10];
    int jumlahMap=0;
	int heroPosX =1;
	int heroPosY =1;
	int z=0;
	int CurrLv=1;
    int LockLv=0;
    int StepLv = 0;
    int TampungLock[]=new int[10];
    int TampungStep[]=new int[10];
	int CurrScore = 0;
	int CurrStep = 0;
    String PlayedUser ="";
	ImageIcon imgTembok = new ImageIcon((Image)img.getResourceImage("Tembok.gif"));
	ImageIcon imgKunci = new ImageIcon((Image)img.getResourceImage("Kunci.gif"));
	ImageIcon imgGembokTutup = new ImageIcon((Image)img.getResourceImage("GembokTutup.GIF"));
	ImageIcon imgGembokBuka = new ImageIcon((Image)img.getResourceImage("GembokBuka.GIF"));
	ImageIcon imgTanah = new ImageIcon((Image)img.getResourceImage("Tanah.GIF"));
	ImageIcon imgHeroUP = new ImageIcon((Image)img.getResourceImage("hero1.GIF"));
	ImageIcon imgHeroDOWN = new ImageIcon((Image)img.getResourceImage("hero2.GIF"));
	ImageIcon imgHeroLEFT = new ImageIcon((Image)img.getResourceImage("hero3.GIF"));
	ImageIcon imgHeroRIGHT = new ImageIcon((Image)img.getResourceImage("hero4.GIF"));
    Sounds suara = new Sounds();
    
    SaveGame Save = new SaveGame();
    HighScores hs = new HighScores();
    public MTK() {
        super("Move The Key");
        setIconImage( (new ImageIcon("Images/founder.png")).getImage() );
        initComponents();
        jButton2.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        papanMain = new javax.swing.JPanel();
        lblJumlahStep = new javax.swing.JLabel();
        lblJumlahScore = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        Steps = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 16));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UNLOCK ALL PADLOCK");
        jLabel4.setBounds(190, 0, 240, 23);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mtk/BannerKu.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setBounds(0, 0, 580, 28);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("RESTART");
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
        jButton1.setBounds(460, 270, 90, 40);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setBounds(430, 250, 0, 0);
        jLayeredPane2.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        papanMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        papanMain.setMinimumSize(new java.awt.Dimension(400, 400));
        papanMain.setPreferredSize(new java.awt.Dimension(400, 400));

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

        papanMain.setBounds(20, 60, 400, 400);
        jLayeredPane2.add(papanMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblJumlahStep.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblJumlahStep.setForeground(new java.awt.Color(0, 51, 0));
        lblJumlahStep.setText("0");
        lblJumlahStep.setBounds(520, 150, 50, 15);
        jLayeredPane2.add(lblJumlahStep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblJumlahScore.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblJumlahScore.setForeground(new java.awt.Color(0, 51, 0));
        lblJumlahScore.setText("0");
        lblJumlahScore.setBounds(520, 180, 50, 15);
        jLayeredPane2.add(lblJumlahScore, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblLevel.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblLevel.setForeground(new java.awt.Color(0, 51, 0));
        lblLevel.setText("LEVEL");
        lblLevel.setBounds(520, 210, 40, 15);
        jLayeredPane2.add(lblLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Steps.setFont(new java.awt.Font("Tahoma", 1, 12));
        Steps.setForeground(new java.awt.Color(0, 51, 0));
        Steps.setText("STEPS");
        Steps.setBounds(450, 150, 60, 15);
        jLayeredPane2.add(Steps, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Score.setFont(new java.awt.Font("Tahoma", 1, 12));
        Score.setForeground(new java.awt.Color(0, 51, 0));
        Score.setText("SCORE");
        Score.setBounds(450, 180, 60, 15);
        jLayeredPane2.add(Score, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Level.setFont(new java.awt.Font("Tahoma", 1, 12));
        Level.setForeground(new java.awt.Color(0, 51, 0));
        Level.setText("LEVEL");
        Level.setBounds(450, 210, 60, 15);
        jLayeredPane2.add(Level, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel2.setBounds(440, 140, 120, 100);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("GIVE UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(460, 330, 90, 40);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mtk/backFinal.jpg"))); // NOI18N
        jLabel3.setBounds(0, 30, 580, 450);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("File");

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.gif"))); // NOI18N
        aboutMenuItem.setText("New Game");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(aboutMenuItem);

        aboutMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/score.png"))); // NOI18N
        aboutMenuItem2.setText("High Score");
        aboutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(aboutMenuItem2);

        aboutMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        aboutMenuItem3.setText("Exit");
        aboutMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(aboutMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-596)/2, (screenSize.height-542)/2, 596, 542);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton2.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Game Restarted!!");
        this.papanMain.removeAll();
        jumlahMap=0;
        StartOn();
        this.papanMain.updateUI();
        this.lblJumlahScore.setText("0");
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_jButton1KeyPressed

    private void aboutMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem3ActionPerformed
        this.dispose();
}//GEN-LAST:event_aboutMenuItem3ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        jButton2.setEnabled(true);
        JOptionPane.showMessageDialog(null, "New Game!!");
        this.papanMain.removeAll();
        jumlahMap=0;
        StartOn();
        this.papanMain.updateUI();
        jButton1.setFocusPainted(true);
        this.lblJumlahScore.setText("0");
}//GEN-LAST:event_aboutMenuItemActionPerformed

    private void aboutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem2ActionPerformed
        hs.viewScore();
        hs.setEnabled(true);
        hs.show();
    }//GEN-LAST:event_aboutMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cekScore();
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed
//--VOID CEK LEVEL , START ON(untuk memulai permainan)
	public void StartOn()
	{
        papanMain.setLayout(new GridLayout(10,10));
		heroPosX =1;
		heroPosY =1;
		z=0;
		CurrLv=1;
		loadAwal();
		LoadMap(CurrLv);
	}
	public void loadAwal()
	{
		try
		{
            url = getClass().getClassLoader().getResource("resources/Map.txt");
            uri = new URI(url+"");
            File tujuan = new File(uri);
			BufferedReader buf = new BufferedReader(new FileReader(tujuan));
			int temp;
			int i=0;
			int j=0;
            int tandaGembok=0;
			z=0;
            TampungStep[0]=50;
			while(true) {
				temp=buf.read();
				if(temp==-1) {break;}
				else
				{
					if(Character.getNumericValue(temp)!=-1)
					{
						if(z<100){
							Map[jumlahMap][i][j] = Character.getNumericValue(temp);
                            if(Map[jumlahMap][i][j]==3) {tandaGembok++;}
							j++;
							if(j==10){ i++; j=0; }
						}
						z++;
					}
				}
				if(i==10 && z==100) {
                    TampungLock[jumlahMap]=tandaGembok;
                    jumlahMap++;
                    TampungStep[jumlahMap]=TampungStep[jumlahMap-1]+10;
                    tandaGembok=0;
                    i=0;
                    z=0;
                }
			}
			buf.close();
		} catch(Exception e) { 
            JOptionPane.showMessageDialog(null,e);
        }
		// inisialisasi map awal
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                IsiMap[i][j] = new JLabel();
                papanMain.add(IsiMap[i][j]);
			}
		}
	}
 
    public void StepOn()
	{
        System.out.println("\nLevel :"+CurrLv);
        System.out.println("Step :"+StepLv);
        System.out.println("Lock :"+LockLv);
        if(StepLv==1)
        {
            JOptionPane.showMessageDialog(papanMain,"GAME OVER, PLEASE TRY AGAIN ","GAME OVER",JOptionPane.WARNING_MESSAGE);
            cekScore();
        }
        StepLv--;
        lblJumlahStep.setText(""+StepLv);
	}
	public void LoadMap(int level)
	{
        ubahIcon(level);
        CurrLv=level;
        LockLv=TampungLock[CurrLv-1];
        StepLv=TampungStep[CurrLv-1];
        lblJumlahStep.setText(""+StepLv);
        //lblJumlahScore.setText("0");
        lblLevel.setText("1");
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                mapData[i][j]=Map[CurrLv-1][i][j];
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
		heroPosX=1;
		heroPosY=1;
		IsiMap[heroPosX][heroPosY].setIcon(imgHeroRIGHT); 	//posisi awal
	}

    private void ubahIcon(int level){
        if(level==1){
            imgTembok = new ImageIcon((Image)img.getResourceImage("Level1/Tembok.gif"));
            imgKunci = new ImageIcon((Image)img.getResourceImage("Level1/Kunci.png"));
            imgGembokTutup = new ImageIcon((Image)img.getResourceImage("Level1/GembokTutup.png"));
            imgGembokBuka = new ImageIcon((Image)img.getResourceImage("Level1/GembokBuka.png"));
            imgTanah = new ImageIcon((Image)img.getResourceImage("Level1/Tanah.png"));
            imgHeroUP = new ImageIcon((Image)img.getResourceImage("Level1/Hero1.png"));
            imgHeroRIGHT = new ImageIcon((Image)img.getResourceImage("Level1/Hero2.png"));
            imgHeroDOWN = new ImageIcon((Image)img.getResourceImage("Level1/Hero3.png"));
            imgHeroLEFT = new ImageIcon((Image)img.getResourceImage("Level1/Hero4.png"));
        }
        else if(level==2){
            imgTembok = new ImageIcon((Image)img.getResourceImage("Level2/Tembok.gif"));
            imgKunci = new ImageIcon((Image)img.getResourceImage("Level2/Kunci.png"));
            imgGembokTutup = new ImageIcon((Image)img.getResourceImage("Level2/GembokTutup.png"));
            imgGembokBuka = new ImageIcon((Image)img.getResourceImage("Level2/GembokBuka.png"));
            imgTanah = new ImageIcon((Image)img.getResourceImage("Level2/Tanah.png"));
            imgHeroUP = new ImageIcon((Image)img.getResourceImage("Level2/Hero1.png"));
            imgHeroRIGHT = new ImageIcon((Image)img.getResourceImage("Level2/Hero2.png"));
            imgHeroDOWN = new ImageIcon((Image)img.getResourceImage("Level2/Hero3.png"));
            imgHeroLEFT = new ImageIcon((Image)img.getResourceImage("Level2/Hero4.png"));
        }
        else if(level==3){
            imgTembok = new ImageIcon((Image)img.getResourceImage("Level3/Tembok.gif"));
            imgKunci = new ImageIcon((Image)img.getResourceImage("Level3/Kunci.png"));
            imgGembokTutup = new ImageIcon((Image)img.getResourceImage("Level3/GembokTutup.png"));
            imgGembokBuka = new ImageIcon((Image)img.getResourceImage("Level3/GembokBuka.png"));
            imgTanah = new ImageIcon((Image)img.getResourceImage("Level3/Tanah.png"));
            imgHeroUP = new ImageIcon((Image)img.getResourceImage("Level3/Hero1.png"));
            imgHeroRIGHT = new ImageIcon((Image)img.getResourceImage("Level3/Hero2.png"));
            imgHeroDOWN = new ImageIcon((Image)img.getResourceImage("Level3/Hero3.png"));
            imgHeroLEFT = new ImageIcon((Image)img.getResourceImage("Level3/Hero4.png"));
        }
        else{
            imgTembok = new ImageIcon((Image)img.getResourceImage("Level4/Tembok.gif"));
            imgKunci = new ImageIcon((Image)img.getResourceImage("Level4/Kunci.png"));
            imgGembokTutup = new ImageIcon((Image)img.getResourceImage("Level4/GembokTutup.png"));
            imgGembokBuka = new ImageIcon((Image)img.getResourceImage("Level4/GembokBuka.png"));
            imgTanah = new ImageIcon((Image)img.getResourceImage("Level4/Tanah.png"));
            imgHeroUP = new ImageIcon((Image)img.getResourceImage("Level4/Hero1.png"));
            imgHeroRIGHT = new ImageIcon((Image)img.getResourceImage("Level4/Hero2.png"));
            imgHeroDOWN = new ImageIcon((Image)img.getResourceImage("Level4/Hero3.png"));
            imgHeroLEFT = new ImageIcon((Image)img.getResourceImage("Level4/Hero4.png"));
        }
    }
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // -----------------------------ATAS
        if(key==38)
        {
            suara.playSound("Langkah.wav");
            StepOn();
            // untuk jalan kalo ketemu tanah baru bisa pindah
            if(mapData[heroPosX-1][heroPosY]==0)
            {
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosX--;
            }
            // kalo di atas hero ada kunci
            else if(mapData[heroPosX-1][heroPosY]==2)
            {
                //jika posisi 2 diatasnya terdapat tanah
                if(mapData[heroPosX-2][heroPosY]==0)
                {
                    //ubah posisi mapdata setelah kunci digeser
                    mapData[heroPosX-1][heroPosY]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                    mapData[heroPosX-2][heroPosY]=2;	// posisi kunci tergeser
                    //ubah posisi hero & kunci
                    IsiMap[heroPosX-2][heroPosY].setIcon(imgKunci);
                    IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                    heroPosX--;
                }
                //jika posisi 2 diatasnya terdapat gembokterkunci
                else if(mapData[heroPosX-2][heroPosY]==3)
                {
                    suara.playSound("Dor.wav");
                    //hilangkan kunci karena telah masuk ke gembok
                    mapData[heroPosX-1][heroPosY]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                    //mapData[heroPosX-2][heroPosY]=2;	// posisi kunci tergeser

                    //ubah posisi hero menjadi posisi kunci
                    IsiMap[heroPosX-2][heroPosY].setIcon(imgGembokBuka);// ubah image icon posisi gembok menjadi gembok terbuka
                    mapData[heroPosX-2][heroPosY]=4;		// mencegah agar gembok yang sudah terbuka tidak bisa dimasukin kunci lagi
                    IsiMap[heroPosX][heroPosY].setIcon(imgTanah);	// posisi hero awal menjadi tanah
                    heroPosX--;

                    IsiMap[heroPosX][heroPosY].setIcon(imgHeroUP);

                    CekLevel();
                }
            }
            IsiMap[heroPosX][heroPosY].setIcon(imgHeroUP);
        }
        // -----------------------------ENDED ATAS
        // -----------------------------BAWAH
        else if(key==40)
        {
            StepOn();
            suara.playSound("Langkah.wav");
            if(mapData[heroPosX+1][heroPosY]==0)
            {
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosX++;
            }

            else if(mapData[heroPosX+1][heroPosY]==2)
            {
                if(mapData[heroPosX+2][heroPosY]==0)
                {
                //ubah posisi mapdata setelah kunci digeser
                mapData[heroPosX+1][heroPosY]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                mapData[heroPosX+2][heroPosY]=2;	// posisi kunci tergeser
                //ubah posisi hero & kunci
                IsiMap[heroPosX+2][heroPosY].setIcon(imgKunci);
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosX++;
                }
                //jika posisi 2 dibawahnya terdapat gembokterkunci
                else if(mapData[heroPosX+2][heroPosY]==3)
                {
                    suara.playSound("Dor.wav");
                    //hilangkan kunci karena telah masuk ke gembok
                    mapData[heroPosX+1][heroPosY]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                    //mapData[heroPosX-2][heroPosY]=2;	// posisi kunci tergeser
                    //ubah posisi hero menjadi posisi kunci
                    IsiMap[heroPosX+2][heroPosY].setIcon(imgGembokBuka);// ubah image icon posisi gembok menjadi gembok terbuka
                    mapData[heroPosX+2][heroPosY]=4;		// mencegah agar gembok yang sudah terbuka tidak bisa dimasukin kunci lagi
                    IsiMap[heroPosX][heroPosY].setIcon(imgTanah);	// posisi hero awal menjadi tanah
                    heroPosX++;

                    IsiMap[heroPosX][heroPosY].setIcon(imgHeroDOWN);

                    CekLevel();
                }
            }
            IsiMap[heroPosX][heroPosY].setIcon(imgHeroDOWN);
        }
        // -----------------------------ENDED BAWAH
        // -----------------------------KIRI
        else if(key==37)
        {
            StepOn();
            suara.playSound("Langkah.wav");
            if(mapData[heroPosX][heroPosY-1]==0)
            {
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosY--;
            }
            else if(mapData[heroPosX][heroPosY-1]==2)
            {
                if(mapData[heroPosX][heroPosY-2]==0)
                {
                //ubah posisi mapdata setelah kunci digeser
                mapData[heroPosX][heroPosY-1]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                mapData[heroPosX][heroPosY-2]=2;	// posisi kunci tergeser
                //ubah posisi hero & kunci
                IsiMap[heroPosX][heroPosY-2].setIcon(imgKunci);
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosY--;
                }
                //jika posisi 2 dikirinya terdapat gembokterkunci
                else if(mapData[heroPosX][heroPosY-2]==3)
                {
                    suara.playSound("Dor.wav");
                    //hilangkan kunci karena telah masuk ke gembok
                    mapData[heroPosX][heroPosY-1]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                    //mapData[heroPosX-2][heroPosY]=2;	// posisi kunci tergeser
                    //ubah posisi hero menjadi posisi kunci
                    IsiMap[heroPosX][heroPosY-2].setIcon(imgGembokBuka);// ubah image icon posisi gembok menjadi gembok terbuka
                    mapData[heroPosX][heroPosY-2]=4;		// mencegah agar gembok yang sudah terbuka tidak bisa dimasukin kunci lagi
                    IsiMap[heroPosX][heroPosY].setIcon(imgTanah);	// posisi hero awal menjadi tanah
                    heroPosY--;
                    IsiMap[heroPosX][heroPosY].setIcon(imgHeroLEFT);
                    CekLevel();
                }
            }
            IsiMap[heroPosX][heroPosY].setIcon(imgHeroLEFT);
        }
        // -----------------------------ENDED KIRI
        // -----------------------------KANAN
        else if(key==39)
        {
            StepOn();
            suara.playSound("Langkah.wav");
            if(mapData[heroPosX][heroPosY+1]==0)
            {
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosY++;
            }
            else if(mapData[heroPosX][heroPosY+1]==2)
            {
                if(mapData[heroPosX][heroPosY+2]==0)
                {
                //ubah posisi mapdata setelah kunci digeser
                mapData[heroPosX][heroPosY+1]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                mapData[heroPosX][heroPosY+2]=2;	// posisi kunci tergeser
                //ubah posisi hero & kunci
                IsiMap[heroPosX][heroPosY+2].setIcon(imgKunci);
                IsiMap[heroPosX][heroPosY].setIcon(imgTanah);
                heroPosY++;
                }
                //jika posisi 2 dikanannya terdapat gembokterkunci
                else if(mapData[heroPosX][heroPosY+2]==3)
                {
                    suara.playSound("Dor.wav");
                    //hilangkan kunci karena telah masuk ke gembok
                    mapData[heroPosX][heroPosY+1]=0;	// posisi kunci sebelunya menjadi 0 (Tanah)
                    //mapData[heroPosX-2][heroPosY]=2;	// posisi kunci tergeser
                    //ubah posisi hero menjadi posisi kunci
                    IsiMap[heroPosX][heroPosY+2].setIcon(imgGembokBuka);// ubah image icon posisi gembok menjadi gembok terbuka
                    mapData[heroPosX][heroPosY-2]=4;		// mencegah agar gembok yang sudah terbuka tidak bisa dimasukin kunci lagi
                    IsiMap[heroPosX][heroPosY].setIcon(imgTanah);	// posisi hero awal menjadi tanah
                    heroPosY++;
                    IsiMap[heroPosX][heroPosY].setIcon(imgHeroRIGHT);
                    CekLevel();
                }//ENDED 'jika posisi 2 dikanannya terdapat gembokterkunci'
            }
            IsiMap[heroPosX][heroPosY].setIcon(imgHeroRIGHT);
        }
        // -----------------------------ENDED KANAN
        papanMain.updateUI();
	}

    public void CekLevel()
	{
        // cek level dan gembok yang sudah selesai
        System.out.println("Level Sekarang : "+CurrLv);
        if(CurrLv==jumlahMap)
        {
            LockLv--;
            if(LockLv==0)
            {
                //CurrStep=CurrStep+(100-StepLv);
                CurrScore=CurrScore+(StepLv*100);
                lblJumlahScore.setText(""+CurrScore);
                JOptionPane.showMessageDialog(null,"Congrats you have finished all challenge!!","Message",JOptionPane.INFORMATION_MESSAGE);
                cekScore();
            }
		}else{
            LockLv--;
            if(LockLv==0)
            {
                //CurrStep=CurrStep+(100-StepLv);
                CurrScore=CurrScore+(StepLv*100);
                lblJumlahScore.setText(""+CurrScore);
                JOptionPane.showMessageDialog(null,"Congrats, Level "+CurrLv+" Accomplish","Message",JOptionPane.INFORMATION_MESSAGE);
                CurrLv++;
                LoadMap(CurrLv);
                lblLevel.setText(""+CurrLv);
                lblJumlahStep.setText(""+StepLv);
            }
        }
	}

    public void cekScore(){
        jButton2.setEnabled(false);
        boolean lebihBesar = Save.cekScore(CurrScore);
        if(lebihBesar){
            JOptionPane.showMessageDialog(null, "Congrats, You get to best 5 high score!");
            saveGame();
            this.papanMain.removeAll();
            this.papanMain.updateUI();
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry, You didnt get to best 5 high score!");
            this.papanMain.removeAll();
            this.papanMain.updateUI();
        }
    }

    public void saveGame(){
        PlayedUser=JOptionPane.showInputDialog(null,"Enter your name :",null);
        Save.isi(PlayedUser, CurrScore+"", CurrStep+"");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Level;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Steps;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblJumlahScore;
    private javax.swing.JLabel lblJumlahStep;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JPanel papanMain;
    // End of variables declaration//GEN-END:variables

}
