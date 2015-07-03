
package GameCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HighScores extends javax.swing.JFrame {

    Sounds suara = new Sounds();
    URL url=null;
    URI uri = null;
    public HighScores() {
        super("High Score");
        setIconImage( (new ImageIcon("Images/score.png")).getImage() );
        initComponents();
        viewScore();
        lblAnalystStep.hide();
        lblProgramerStep.hide();
        lblDewaStep.hide();
        lblRookieStep.hide();
        lblNewbieStep.hide();
        jLabel5.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDewaName = new javax.swing.JLabel();
        lblAnalystName = new javax.swing.JLabel();
        lblProgramerName = new javax.swing.JLabel();
        lblRookieName = new javax.swing.JLabel();
        lblNewbieName = new javax.swing.JLabel();
        lblDewaScore = new javax.swing.JLabel();
        lblAnalystScore = new javax.swing.JLabel();
        lblProgramerScore = new javax.swing.JLabel();
        lblRookieScore = new javax.swing.JLabel();
        lblNewbieScore = new javax.swing.JLabel();
        lblDewaStep = new javax.swing.JLabel();
        lblAnalystStep = new javax.swing.JLabel();
        lblProgramerStep = new javax.swing.JLabel();
        lblRookieStep = new javax.swing.JLabel();
        lblNewbieStep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 380));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HIGH SCORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Step");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Dewa");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Analyst");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Programer");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Rookie");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Newbie");

        lblDewaName.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblDewaName.setForeground(new java.awt.Color(102, 0, 102));
        lblDewaName.setText("Name");

        lblAnalystName.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblAnalystName.setForeground(new java.awt.Color(102, 0, 102));
        lblAnalystName.setText("Name");

        lblProgramerName.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblProgramerName.setForeground(new java.awt.Color(102, 0, 102));
        lblProgramerName.setText("Name");

        lblRookieName.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblRookieName.setForeground(new java.awt.Color(102, 0, 102));
        lblRookieName.setText("Name");

        lblNewbieName.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblNewbieName.setForeground(new java.awt.Color(102, 0, 102));
        lblNewbieName.setText("Name");

        lblDewaScore.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblDewaScore.setForeground(new java.awt.Color(102, 0, 0));
        lblDewaScore.setText("Name");

        lblAnalystScore.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblAnalystScore.setForeground(new java.awt.Color(102, 0, 0));
        lblAnalystScore.setText("Name");

        lblProgramerScore.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblProgramerScore.setForeground(new java.awt.Color(102, 0, 0));
        lblProgramerScore.setText("Name");

        lblRookieScore.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblRookieScore.setForeground(new java.awt.Color(102, 0, 0));
        lblRookieScore.setText("Name");

        lblNewbieScore.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblNewbieScore.setForeground(new java.awt.Color(102, 0, 0));
        lblNewbieScore.setText("Name");

        lblDewaStep.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblDewaStep.setForeground(new java.awt.Color(0, 51, 51));
        lblDewaStep.setText("Name");

        lblAnalystStep.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblAnalystStep.setForeground(new java.awt.Color(0, 51, 51));
        lblAnalystStep.setText("Name");

        lblProgramerStep.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblProgramerStep.setForeground(new java.awt.Color(0, 51, 51));
        lblProgramerStep.setText("Name");

        lblRookieStep.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblRookieStep.setForeground(new java.awt.Color(0, 51, 51));
        lblRookieStep.setText("Name");

        lblNewbieStep.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        lblNewbieStep.setForeground(new java.awt.Color(0, 51, 51));
        lblNewbieStep.setText("Name");

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDewaName)
                    .addComponent(lblAnalystName)
                    .addComponent(lblProgramerName)
                    .addComponent(lblRookieName)
                    .addComponent(lblNewbieName))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDewaScore)
                    .addComponent(lblAnalystScore)
                    .addComponent(lblProgramerScore)
                    .addComponent(lblRookieScore)
                    .addComponent(lblNewbieScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDewaStep)
                    .addComponent(lblAnalystStep)
                    .addComponent(lblProgramerStep)
                    .addComponent(lblRookieStep)
                    .addComponent(lblNewbieStep))
                .addGap(33, 33, 33))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(33, 33, 33)
                            .addComponent(jLabel7)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel8)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel9)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDewaName)
                            .addGap(33, 33, 33)
                            .addComponent(lblAnalystName)
                            .addGap(36, 36, 36)
                            .addComponent(lblProgramerName)
                            .addGap(34, 34, 34)
                            .addComponent(lblRookieName)
                            .addGap(32, 32, 32)
                            .addComponent(lblNewbieName))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDewaScore)
                            .addGap(33, 33, 33)
                            .addComponent(lblAnalystScore)
                            .addGap(36, 36, 36)
                            .addComponent(lblProgramerScore)
                            .addGap(34, 34, 34)
                            .addComponent(lblRookieScore)
                            .addGap(32, 32, 32)
                            .addComponent(lblNewbieScore)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDewaStep)
                        .addGap(33, 33, 33)
                        .addComponent(lblAnalystStep)
                        .addGap(36, 36, 36)
                        .addComponent(lblProgramerStep)
                        .addGap(34, 34, 34)
                        .addComponent(lblRookieStep)
                        .addGap(32, 32, 32)
                        .addComponent(lblNewbieStep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-391)/2, (screenSize.height-428)/2, 391, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

    public void viewScore(){

        setEnabled(false);
        //-------------NAMPILIN HASIL DARI DATA HighScore.sav
            Vector VecHiScore = new Vector();
            try
            {
                url = getClass().getClassLoader().getResource("resources/HighScore.sav");
                uri = new URI(url+"");
                File tujuan = new File(uri);
                BufferedReader buf2 = new BufferedReader(new FileReader(tujuan));
                String line2 = null;
                while((line2=buf2.readLine())!=null) {
                    VecHiScore.add(line2);
                }
                buf2.close();
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Failed Load File HighScore.sav");
            }

            String TempUsrx[] = new String[5];
            String TempScrx[] = new String[5];
            String TempStepx[] = new String[5];

            for(int i=0;i<VecHiScore.size();i++)
            {
                String CurrentUser2 = (String) VecHiScore.elementAt(i);
                String split2x[] = CurrentUser2.split(";");

                TempUsrx[i] = split2x[0];
                TempScrx[i] = split2x[1];
                TempStepx[i] = split2x[2];
            }

            int cek[] = new int[5];
            for(int i=0;i<5;i++){  cek[i]= Integer.parseInt(TempScrx[i]);  }

            if(cek[0]!=0)
            {
                lblDewaName.setText(TempUsrx[0]);
                lblDewaScore.setText(TempScrx[0]);
                lblDewaStep.setText(TempStepx[0]);
            }
            else
            {
                lblDewaName.setText("---");
                lblDewaScore.setText("---");
                lblDewaStep.setText("---");
            }
            if(cek[1]!=0)
            {
                lblAnalystName.setText(TempUsrx[1]);
                lblAnalystScore.setText(TempScrx[1]);
                lblAnalystStep.setText(TempStepx[1]);
            }
            else
            {
                lblAnalystName.setText("---");
                lblAnalystScore.setText("---");
                lblAnalystStep.setText("---");
            }

            if(cek[2]!=0)
            {
                lblProgramerName.setText(TempUsrx[2]);
                lblProgramerScore.setText(TempScrx[2]);
                lblProgramerStep.setText(TempStepx[2]);
            }
            else
            {
                lblProgramerName.setText("---");
                lblProgramerScore.setText("---");
                lblProgramerStep.setText("---");
            }

            if(cek[3]!=0)
            {
                lblRookieName.setText(TempUsrx[3]);
                lblRookieScore.setText(TempScrx[3]);
                lblRookieStep.setText(TempStepx[3]);
            }
            else
            {
                lblRookieName.setText("---");
                lblRookieScore.setText("---");
                lblRookieStep.setText("---");
            }

            if(cek[4]!=0)
            {
                lblNewbieName.setText(TempUsrx[4]);
                lblNewbieScore.setText(TempScrx[4]);
                lblNewbieStep.setText(TempStepx[4]);
            }
            else
            {
                lblNewbieName.setText("---");
                lblNewbieScore.setText("---");
                lblNewbieStep.setText("---");
            }

        //------------- END NAMPILIN HASIL DARI DATA HighScore.sav

    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAnalystName;
    private javax.swing.JLabel lblAnalystScore;
    private javax.swing.JLabel lblAnalystStep;
    private javax.swing.JLabel lblDewaName;
    private javax.swing.JLabel lblDewaScore;
    private javax.swing.JLabel lblDewaStep;
    private javax.swing.JLabel lblNewbieName;
    private javax.swing.JLabel lblNewbieScore;
    private javax.swing.JLabel lblNewbieStep;
    private javax.swing.JLabel lblProgramerName;
    private javax.swing.JLabel lblProgramerScore;
    private javax.swing.JLabel lblProgramerStep;
    private javax.swing.JLabel lblRookieName;
    private javax.swing.JLabel lblRookieScore;
    private javax.swing.JLabel lblRookieStep;
    // End of variables declaration//GEN-END:variables

}
