
package currency.converter.english;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO; 

public class currency extends javax.swing.JFrame {

    /**
     * Creates new form currency
     */
    public currency() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("The Amount:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("From  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("To   :");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sudanese Pound", "US Dollar", "Saudi Rial", "Arab Emir Dirham", "Mexican Peso", " ", "A", "Afghanistan AfghaniAFN", "Afghanistan Afghani*AFA", "Albanian LekALL", "Algerian DinarDZD", "Andorran Franc*ADF", "Andorran Peseta*ADP", "Angolan KwanzaAOA", "Angolan Old Kwanza*AON", "Argentine PesoARS", "Armenian DramAMD", "Aruban FlorinAWG", "Australian DollarAUD", "Austrian Schilling*ATS", "Azerbaijan New ManatAZN", "Azerbaijan Old Manat*AZM", "B", "Bahamian DollarBSD", "Bahraini DinarBHD", "Bangladeshi TakaBDT", "Barbados DollarBBD", "Belarusian Old Ruble*BYR", "Belarusian RubleBYN", "Belgian Franc*BEF", "Belize DollarBZD", "Bermudian DollarBMD", "Bhutan NgultrumBTN", "BitcoinXBT", "BitcoinBTC", "Bolivian BolivianoBOB", "Bosnian MarkBAM", "Botswana PulaBWP", "Brazilian RealBRL", "British PoundGBP", "Brunei DollarBND", "Bulgarian LevBGN", "Bulgarian Old LevBGL", "Burundi FrancBIF", "C", "Cambodian RielKHR", "Canadian DollarCAD", "Cape Verde EscudoCVE", "Cayman Islands DollarKYD", "Central Pacific FrancCFP", "CFA Franc BCEAOXOF", "CFA Franc BEACXAF", "CFP FrancXPF", "Chilean PesoCLP", "Chilean Unidad de FomentoCLF", "Chinese Yuan RenminbiCNY", "Chinese Yuan Renminbi (offshore)CNH", "Colombian PesoCOP", "Comoros FrancKMF", "Congolese FrancCDF", "Costa Rican ColonCRC", "Croatian KunaHRK", "Cuban Convertible PesoCUC", "Cuban PesoCUP", "Cyprus Pound*CYP", "Czech KorunaCZK", "Czechoslovak Koruna*CSK", "D", "Danish KroneDKK", "Djibouti FrancDJF", "Dominican R. PesoDOP", "Dutch Guilder*NLG", "E", "East Caribbean DollarXCD", "ECU*XEU", "Ecuador Sucre*ECS", "Egyptian PoundEGP", "El Salvador Colon*SVC", "Eritrean NakfaERN", "Estonian Kroon*EEK", "EthereumETH", "Ethiopian BirrETB", "EuroEUR", "F", "Falkland Islands PoundFKP", "Fiji DollarFJD", "Finnish Markka*FIM", "French Franc*FRF", "G", "Gambian DalasiGMD", "Georgian LariGEL", "German Mark*DEM", "Ghanaian Cedi*GHC", "Ghanaian New CediGHS", "Gibraltar PoundGIP", "Gold (oz.)XAU", "Greek Drachma*GRD", "Guatemalan QuetzalGTQ", "Guinea FrancGNF", "Guyanese DollarGYD", "H", "Haitian GourdeHTG", "Honduran LempiraHNL", "Hong Kong DollarHKD", "Hungarian ForintHUF", "I", "Iceland KronaISK", "Indian RupeeINR", "Indonesian RupiahIDR", "Iranian RialIRR", "Iraqi DinarIQD", "Irish Punt*IEP", "Israeli New ShekelILS", "Italian Lira*ITL", "J", "Jamaican DollarJMD", "Japanese YenJPY", "Jordanian DinarJOD", "K", "Kazakhstan TengeKZT", "Kenyan ShillingKES", "Kuwaiti DinarKWD", "Kyrgyzstanian SomKGS", "L", "Lao KipLAK", "Latvian Lats*LVL", "Lebanese PoundLBP", "Lesotho LotiLSL", "Liberian DollarLRD", "Libyan DinarLYD", "LitecoinLTC", "Lithuanian Litas*LTL", "Luxembourg Franc*LUF", "M", "Macau PatacaMOP", "Macedonian DenarMKD", "Malagasy AriaryMGA", "Malagasy Franc*MGF", "Malawi KwachaMWK", "Malaysian RinggitMYR", "Maldive RufiyaaMVR", "Maltese Lira*MTL", "Mauritanian Old Ouguiya*MRO", "Mauritanian OuguiyaMRU", "Mauritius RupeeMUR", "Mexican Old PesoMXP", "Mexican PesoMXN", "Moldovan LeuMDL", "Mongolian TugrikMNT", "Moroccan DirhamMAD", "Mozambique Metical*MZM", "Mozambique New MeticalMZN", "Myanmar KyatMMK", "N", "Namibia DollarNAD", "Nepalese RupeeNPR", "New Zealand DollarNZD", "Nicaraguan Cordoba OroNIO", "Nigerian NairaNGN", "NL Antillian GuilderANG", "North Korean WonKPW", "Norwegian KronerNOK", "O", "Omani RialOMR", "P", "Pakistan RupeePKR", "Palladium (oz.)XPD", "Panamanian BalboaPAB", "Papua New Guinea KinaPGK", "Paraguay GuaraniPYG", "Peruvian Nuevo SolPEN", "Philippine PesoPHP", "Platinum (oz.)XPT", "Polish Old ZlotyPLZ", "Polish ZlotyPLN", "Portuguese Escudo*PTE", "Q", "Qatari RialQAR", "R", "Romanian Lei*ROL", "Romanian New LeiRON", "Russian RoubleRUB", "Rwandan FrancRWF", "S", "Samoan TalaWST", "Sao Tome/Principe DobraSTN", "Sao Tome/Principe Old Dobra*STD", "Saudi RiyalSAR", "Serbian DinarRSD", "Serbian Old DinarCSD", "Seychelles RupeeSCR", "Sierra Leone LeoneSLL", "Silver (oz.)XAG", "Singapore DollarSGD", "Slovak Koruna*SKK", "Slovenian Tolar*SIT", "Solomon Islands DollarSBD", "Somali ShillingSOS", "South African RandZAR", "South-Korean WonKRW", "Spanish Peseta*ESP", "Sri Lanka RupeeLKR", "St. Helena PoundSHP", "Sudanese Dinar*SDD", "Sudanese Old Pound*SDP", "Sudanese PoundSDG", "Suriname DollarSRD", "Suriname Guilder*SRG", "Swaziland LilangeniSZL", "Swedish KronaSEK", "Swiss FrancCHF", "Syrian PoundSYP", "T", "Taiwan DollarTWD", "Tajikistani SomoniTJS", "Tanzanian ShillingTZS", "Thai BahtTHB", "Tonga Pa'angaTOP", "Trinidad/Tobago DollarTTD", "Tunisian DinarTND", "Turkish LiraTRY", "Turkish Old Lira*TRL", "Turkmenistan Manat*TMM", "Turkmenistan New ManatTMT", "U", "Uganda ShillingUGX", "Uganga Old ShillingUGS", "Ukraine HryvniaUAH", "Uruguayan Old PesoUYP", "Uruguayan PesoUYU", "US DollarUSD", "Utd. Arab Emir. DirhamAED", "Uzbekistan SomUZS", "V", "Vanuatu VatuVUV", "Venezuelan Bolivar FuerteVEF", "Venezuelan Bolivar SoberanoVES", "Venezuelan Bolivar*VEB", "Vietnamese DongVND", "Y", "Yemeni RialYER", "Yugoslav Dinar*YUN", "Z", "Zambian KwachaZMW", "Zambian Kwacha*ZMK", "Zimbabwe DollarZWL" }));
        txtfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfromActionPerformed(evt);
            }
        });

        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sudanese Pound", "US Dollar", "Saudi Rial", "Arab Emir Dirham", "Mexican Peso", " ", "A", "Afghanistan AfghaniAFN", "Afghanistan Afghani*AFA", "Albanian LekALL", "Algerian DinarDZD", "Andorran Franc*ADF", "Andorran Peseta*ADP", "Angolan KwanzaAOA", "Angolan Old Kwanza*AON", "Argentine PesoARS", "Armenian DramAMD", "Aruban FlorinAWG", "Australian DollarAUD", "Austrian Schilling*ATS", "Azerbaijan New ManatAZN", "Azerbaijan Old Manat*AZM", "B", "Bahamian DollarBSD", "Bahraini DinarBHD", "Bangladeshi TakaBDT", "Barbados DollarBBD", "Belarusian Old Ruble*BYR", "Belarusian RubleBYN", "Belgian Franc*BEF", "Belize DollarBZD", "Bermudian DollarBMD", "Bhutan NgultrumBTN", "BitcoinXBT", "BitcoinBTC", "Bolivian BolivianoBOB", "Bosnian MarkBAM", "Botswana PulaBWP", "Brazilian RealBRL", "British PoundGBP", "Brunei DollarBND", "Bulgarian LevBGN", "Bulgarian Old LevBGL", "Burundi FrancBIF", "C", "Cambodian RielKHR", "Canadian DollarCAD", "Cape Verde EscudoCVE", "Cayman Islands DollarKYD", "Central Pacific FrancCFP", "CFA Franc BCEAOXOF", "CFA Franc BEACXAF", "CFP FrancXPF", "Chilean PesoCLP", "Chilean Unidad de FomentoCLF", "Chinese Yuan RenminbiCNY", "Chinese Yuan Renminbi (offshore)CNH", "Colombian PesoCOP", "Comoros FrancKMF", "Congolese FrancCDF", "Costa Rican ColonCRC", "Croatian KunaHRK", "Cuban Convertible PesoCUC", "Cuban PesoCUP", "Cyprus Pound*CYP", "Czech KorunaCZK", "Czechoslovak Koruna*CSK", "D", "Danish KroneDKK", "Djibouti FrancDJF", "Dominican R. PesoDOP", "Dutch Guilder*NLG", "E", "East Caribbean DollarXCD", "ECU*XEU", "Ecuador Sucre*ECS", "Egyptian PoundEGP", "El Salvador Colon*SVC", "Eritrean NakfaERN", "Estonian Kroon*EEK", "EthereumETH", "Ethiopian BirrETB", "EuroEUR", "F", "Falkland Islands PoundFKP", "Fiji DollarFJD", "Finnish Markka*FIM", "French Franc*FRF", "G", "Gambian DalasiGMD", "Georgian LariGEL", "German Mark*DEM", "Ghanaian Cedi*GHC", "Ghanaian New CediGHS", "Gibraltar PoundGIP", "Gold (oz.)XAU", "Greek Drachma*GRD", "Guatemalan QuetzalGTQ", "Guinea FrancGNF", "Guyanese DollarGYD", "H", "Haitian GourdeHTG", "Honduran LempiraHNL", "Hong Kong DollarHKD", "Hungarian ForintHUF", "I", "Iceland KronaISK", "Indian RupeeINR", "Indonesian RupiahIDR", "Iranian RialIRR", "Iraqi DinarIQD", "Irish Punt*IEP", "Israeli New ShekelILS", "Italian Lira*ITL", "J", "Jamaican DollarJMD", "Japanese YenJPY", "Jordanian DinarJOD", "K", "Kazakhstan TengeKZT", "Kenyan ShillingKES", "Kuwaiti DinarKWD", "Kyrgyzstanian SomKGS", "L", "Lao KipLAK", "Latvian Lats*LVL", "Lebanese PoundLBP", "Lesotho LotiLSL", "Liberian DollarLRD", "Libyan DinarLYD", "LitecoinLTC", "Lithuanian Litas*LTL", "Luxembourg Franc*LUF", "M", "Macau PatacaMOP", "Macedonian DenarMKD", "Malagasy AriaryMGA", "Malagasy Franc*MGF", "Malawi KwachaMWK", "Malaysian RinggitMYR", "Maldive RufiyaaMVR", "Maltese Lira*MTL", "Mauritanian Old Ouguiya*MRO", "Mauritanian OuguiyaMRU", "Mauritius RupeeMUR", "Mexican Old PesoMXP", "Mexican PesoMXN", "Moldovan LeuMDL", "Mongolian TugrikMNT", "Moroccan DirhamMAD", "Mozambique Metical*MZM", "Mozambique New MeticalMZN", "Myanmar KyatMMK", "N", "Namibia DollarNAD", "Nepalese RupeeNPR", "New Zealand DollarNZD", "Nicaraguan Cordoba OroNIO", "Nigerian NairaNGN", "NL Antillian GuilderANG", "North Korean WonKPW", "Norwegian KronerNOK", "O", "Omani RialOMR", "P", "Pakistan RupeePKR", "Palladium (oz.)XPD", "Panamanian BalboaPAB", "Papua New Guinea KinaPGK", "Paraguay GuaraniPYG", "Peruvian Nuevo SolPEN", "Philippine PesoPHP", "Platinum (oz.)XPT", "Polish Old ZlotyPLZ", "Polish ZlotyPLN", "Portuguese Escudo*PTE", "Q", "Qatari RialQAR", "R", "Romanian Lei*ROL", "Romanian New LeiRON", "Russian RoubleRUB", "Rwandan FrancRWF", "S", "Samoan TalaWST", "Sao Tome/Principe DobraSTN", "Sao Tome/Principe Old Dobra*STD", "Saudi RiyalSAR", "Serbian DinarRSD", "Serbian Old DinarCSD", "Seychelles RupeeSCR", "Sierra Leone LeoneSLL", "Silver (oz.)XAG", "Singapore DollarSGD", "Slovak Koruna*SKK", "Slovenian Tolar*SIT", "Solomon Islands DollarSBD", "Somali ShillingSOS", "South African RandZAR", "South-Korean WonKRW", "Spanish Peseta*ESP", "Sri Lanka RupeeLKR", "St. Helena PoundSHP", "Sudanese Dinar*SDD", "Sudanese Old Pound*SDP", "Sudanese PoundSDG", "Suriname DollarSRD", "Suriname Guilder*SRG", "Swaziland LilangeniSZL", "Swedish KronaSEK", "Swiss FrancCHF", "Syrian PoundSYP", "T", "Taiwan DollarTWD", "Tajikistani SomoniTJS", "Tanzanian ShillingTZS", "Thai BahtTHB", "Tonga Pa'angaTOP", "Trinidad/Tobago DollarTTD", "Tunisian DinarTND", "Turkish LiraTRY", "Turkish Old Lira*TRL", "Turkmenistan Manat*TMM", "Turkmenistan New ManatTMT", "U", "Uganda ShillingUGX", "Uganga Old ShillingUGS", "Ukraine HryvniaUAH", "Uruguayan Old PesoUYP", "Uruguayan PesoUYU", "US DollarUSD", "Utd. Arab Emir. DirhamAED", "Uzbekistan SomUZS", "V", "Vanuatu VatuVUV", "Venezuelan Bolivar FuerteVEF", "Venezuelan Bolivar SoberanoVES", "Venezuelan Bolivar*VEB", "Vietnamese DongVND", "Y", "Yemeni RialYER", "Yugoslav Dinar*YUN", "Z", "Zambian KwachaZMW", "Zambian Kwacha*ZMK", "Zimbabwe DollarZWL" }));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel6.setText("Currency Convertor");

        jLabel4.setFont(new java.awt.Font("Gisha", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("BUSHRA");

        jLabel5.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Groups");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtamount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel6))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Change View");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        jMenuItem3.setText("Change View");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Double tot;
        Double amount = Double.parseDouble(txtamount.getText());
        //Sudanes Pount
        if(txtfrom.getSelectedItem().toString() == "Sudanese Pound" && txtto.getSelectedItem().toString() == "US Dollar"){
            tot = amount * 300;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
            if(txtfrom.getSelectedItem().toString() == "Sudanese Pound" && txtto.getSelectedItem().toString() == "Saudi Rial"){
            tot = amount * 300;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                if(txtfrom.getSelectedItem().toString() == "Sudanese Pound" && txtto.getSelectedItem().toString() == "Arab Emir Dirham"){
            tot = amount * 300;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else 
                    if(txtfrom.getSelectedItem().toString() == "Sudanese Pound" && txtto.getSelectedItem().toString() == "Mexican Peso"){
            tot = amount * 300;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else 
                        //US Doller
        if(txtfrom.getSelectedItem().toString() == "US Dollar" && txtto.getSelectedItem().toString() == "US Dollar"){
            tot = amount * 1;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else                
        if(txtfrom.getSelectedItem().toString() == "US Dollar" && txtto.getSelectedItem().toString() == "Sudanese Pound"){
            tot = amount * 3.0;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
            if(txtfrom.getSelectedItem().toString() == "US Dollar" && txtto.getSelectedItem().toString() == "Saudi Rial"){
            tot = amount * 50;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                if(txtfrom.getSelectedItem().toString() == "US Dollar" && txtto.getSelectedItem().toString() == "Arab Emir Dirham"){
            tot = amount * 30;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                    if(txtfrom.getSelectedItem().toString() == "US Dollar" && txtto.getSelectedItem().toString() == "Mexican Peso"){
            tot = amount * 20;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                        //Saudi Rial
        if(txtfrom.getSelectedItem().toString() == "Saudi Rial" && txtto.getSelectedItem().toString() == "US Dollar"){
            tot = amount * 90;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else                
        if(txtfrom.getSelectedItem().toString() == "Saudi Rial" && txtto.getSelectedItem().toString() == "Sudanese Pound"){
            tot = amount * 87;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
            if(txtfrom.getSelectedItem().toString() == "Saudi Rial" && txtto.getSelectedItem().toString() == "Saudi Rial"){
            tot = amount * 78;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                if(txtfrom.getSelectedItem().toString() == "Saudi Rial" && txtto.getSelectedItem().toString() == "Arab Emir Dirham"){
            tot = amount * 45;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                    if(txtfrom.getSelectedItem().toString() == "Saudi Rial" && txtto.getSelectedItem().toString() == "Mexican Peso"){
            tot = amount * 60;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                        //Arab Emir Dirham
        if(txtfrom.getSelectedItem().toString() == "Arab Emir Dirham" && txtto.getSelectedItem().toString() == "US Dollar"){
            tot = amount * 6;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else                
        if(txtfrom.getSelectedItem().toString() == "Arab Emir Dirham" && txtto.getSelectedItem().toString() == "Sudanese Pound"){
            tot = amount * 12;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
            if(txtfrom.getSelectedItem().toString() == "Arab Emir Dirham" && txtto.getSelectedItem().toString() == "Saudi Rial"){
            tot = amount * 62;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                if(txtfrom.getSelectedItem().toString() == "Arab Emir Dirham" && txtto.getSelectedItem().toString() == "Arab Emir Dirham"){
            tot = amount * 77;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                    if(txtfrom.getSelectedItem().toString() == "Arab Emir Dirham" && txtto.getSelectedItem().toString() == "Mexican Peso"){
            tot = amount * 48;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                        //Mexican Peso
        if(txtfrom.getSelectedItem().toString() == "Mexican Peso" && txtto.getSelectedItem().toString() == "US Dollar"){
            tot = amount * 40;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else                
        if(txtfrom.getSelectedItem().toString() == "Mexican Peso" && txtto.getSelectedItem().toString() == "Sudanese Pound"){
            tot = amount * 150;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
            if(txtfrom.getSelectedItem().toString() == "Mexican Peso" && txtto.getSelectedItem().toString() == "Saudi Rial"){
            tot = amount * 11;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                if(txtfrom.getSelectedItem().toString() == "Mexican Peso" && txtto.getSelectedItem().toString() == "Arab Emir Dirham"){
            tot = amount * 9.6;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } else
                    if(txtfrom.getSelectedItem().toString() == "Mexican Peso" && txtto.getSelectedItem().toString() == "Mexican Peso"){
            tot = amount * 300;
            JOptionPane.showMessageDialog(this,"Your Converter Will Be : "+tot.toString());
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Image img;
        try {
            img = ImageIO.read(getClass().getResource("icon.png"));
            //I Put the icon image for the form
            this.setIconImage(img);
            
            //This Code Make The Location Of the Form in the middle of the screen when its opened
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(currency.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void txtfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfromActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           this.setVisible(false);
        new currency2().setVisible(true); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        new currency2().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}
