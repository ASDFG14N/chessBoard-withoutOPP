package Vista;

import Controlador.ChessGameController;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Gian
 */
public final class ChessBoardPanel extends javax.swing.JFrame {

    public static JTextField tableroObj[][];
    ChessGameController controlador;

    public ChessBoardPanel() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());

        tableroObj = new JTextField[][]{
            {A8, B8, C8, D8, E8, F8, G8, H8},
            {A7, B7, C7, D7, E7, F7, G7, H7},
            {A6, B6, C6, D6, E6, F6, G6, H6},
            {A5, B5, C5, D5, E5, F5, G5, H5},
            {A4, B4, C4, D4, E4, F4, G4, H4},
            {A3, B3, C3, D3, E3, F3, G3, H3},
            {A2, B2, C2, D2, E2, F2, G2, H2},
            {A1, B1, C1, D1, E1, F1, G1, H1}};
        
        controlador = new ChessGameController();
    }

    
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        H1 = new javax.swing.JTextField();
        G1 = new javax.swing.JTextField();
        F1 = new javax.swing.JTextField();
        E1 = new javax.swing.JTextField();
        D1 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        B1 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        H2 = new javax.swing.JTextField();
        G2 = new javax.swing.JTextField();
        F2 = new javax.swing.JTextField();
        E2 = new javax.swing.JTextField();
        D2 = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        H3 = new javax.swing.JTextField();
        G3 = new javax.swing.JTextField();
        F3 = new javax.swing.JTextField();
        E3 = new javax.swing.JTextField();
        D3 = new javax.swing.JTextField();
        C3 = new javax.swing.JTextField();
        B3 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        H4 = new javax.swing.JTextField();
        G4 = new javax.swing.JTextField();
        F4 = new javax.swing.JTextField();
        E4 = new javax.swing.JTextField();
        D4 = new javax.swing.JTextField();
        C4 = new javax.swing.JTextField();
        B4 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        H5 = new javax.swing.JTextField();
        G5 = new javax.swing.JTextField();
        F5 = new javax.swing.JTextField();
        E5 = new javax.swing.JTextField();
        D5 = new javax.swing.JTextField();
        C5 = new javax.swing.JTextField();
        B5 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        H6 = new javax.swing.JTextField();
        G6 = new javax.swing.JTextField();
        F6 = new javax.swing.JTextField();
        E6 = new javax.swing.JTextField();
        D6 = new javax.swing.JTextField();
        C6 = new javax.swing.JTextField();
        B6 = new javax.swing.JTextField();
        A6 = new javax.swing.JTextField();
        H7 = new javax.swing.JTextField();
        G7 = new javax.swing.JTextField();
        F7 = new javax.swing.JTextField();
        E7 = new javax.swing.JTextField();
        D7 = new javax.swing.JTextField();
        C7 = new javax.swing.JTextField();
        B7 = new javax.swing.JTextField();
        A7 = new javax.swing.JTextField();
        H8 = new javax.swing.JTextField();
        G8 = new javax.swing.JTextField();
        F8 = new javax.swing.JTextField();
        E8 = new javax.swing.JTextField();
        D8 = new javax.swing.JTextField();
        C8 = new javax.swing.JTextField();
        B8 = new javax.swing.JTextField();
        A8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumePlayerBlack = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resumePlayerWhite = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        torreWhite = new javax.swing.JTextField();
        reinaWhite = new javax.swing.JTextField();
        caballoWhite = new javax.swing.JTextField();
        peonWhite = new javax.swing.JTextField();
        alfilWhite = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        peonBlack = new javax.swing.JTextField();
        reinaBlack = new javax.swing.JTextField();
        caballoBlack = new javax.swing.JTextField();
        alfilBlack = new javax.swing.JTextField();
        torreBlack = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess Game ");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.gray);
        setIconImages(null);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(566, 568));
        jPanel2.setLayout(new java.awt.GridLayout(8, 8));

        A8.setEditable(false);
        A8.setBackground(new java.awt.Color(255, 255, 255));
        A8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A8.setText("♜");
        A8.setMinimumSize(new java.awt.Dimension(54, 54));
        A8.setPreferredSize(new java.awt.Dimension(54, 54));
        A8.setSelectionColor(new java.awt.Color(255, 255, 0));
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });
        jPanel2.add(A8);

        B8.setEditable(false);
        B8.setBackground(new java.awt.Color(48, 48, 48));
        B8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B8.setText("♞");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });
        jPanel2.add(B8);

        C8.setEditable(false);
        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C8.setText("♝");
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        jPanel2.add(C8);

        D8.setEditable(false);
        D8.setBackground(new java.awt.Color(48, 48, 48));
        D8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D8.setText("♛");
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });
        jPanel2.add(D8);

        E8.setEditable(false);
        E8.setBackground(new java.awt.Color(255, 255, 255));
        E8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E8.setText("♚");
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });
        jPanel2.add(E8);

        F8.setEditable(false);
        F8.setBackground(new java.awt.Color(48, 48, 48));
        F8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F8.setText("♝");
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F8MouseClicked(evt);
            }
        });
        jPanel2.add(F8);

        G8.setEditable(false);
        G8.setBackground(new java.awt.Color(255, 255, 255));
        G8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G8.setText("♞");
        G8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G8MouseClicked(evt);
            }
        });
        jPanel2.add(G8);

        H8.setEditable(false);
        H8.setBackground(new java.awt.Color(48, 48, 48));
        H8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H8.setText("♜");
        H8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H8MouseClicked(evt);
            }
        });
        jPanel2.add(H8);

        A7.setEditable(false);
        A7.setBackground(new java.awt.Color(48, 48, 48));
        A7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A7.setText("♟");
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });
        jPanel2.add(A7);

        B7.setEditable(false);
        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B7.setText("♟");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });
        jPanel2.add(B7);

        C7.setEditable(false);
        C7.setBackground(new java.awt.Color(48, 48, 48));
        C7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C7.setText("♟");
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        jPanel2.add(C7);

        D7.setEditable(false);
        D7.setBackground(new java.awt.Color(255, 255, 255));
        D7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D7.setText("♟");
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });
        jPanel2.add(D7);

        E7.setEditable(false);
        E7.setBackground(new java.awt.Color(48, 48, 48));
        E7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E7.setText("♟");
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });
        jPanel2.add(E7);

        F7.setEditable(false);
        F7.setBackground(new java.awt.Color(255, 255, 255));
        F7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F7.setText("♟");
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F7MouseClicked(evt);
            }
        });
        jPanel2.add(F7);

        G7.setEditable(false);
        G7.setBackground(new java.awt.Color(48, 48, 48));
        G7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G7.setText("♟");
        G7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G7MouseClicked(evt);
            }
        });
        jPanel2.add(G7);

        H7.setEditable(false);
        H7.setBackground(new java.awt.Color(255, 255, 255));
        H7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H7.setText("♟");
        H7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H7MouseClicked(evt);
            }
        });
        jPanel2.add(H7);

        A6.setEditable(false);
        A6.setBackground(new java.awt.Color(255, 255, 255));
        A6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });
        jPanel2.add(A6);

        B6.setEditable(false);
        B6.setBackground(new java.awt.Color(48, 48, 48));
        B6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });
        jPanel2.add(B6);

        C6.setEditable(false);
        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        jPanel2.add(C6);

        D6.setEditable(false);
        D6.setBackground(new java.awt.Color(48, 48, 48));
        D6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });
        jPanel2.add(D6);

        E6.setEditable(false);
        E6.setBackground(new java.awt.Color(255, 255, 255));
        E6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });
        jPanel2.add(E6);

        F6.setEditable(false);
        F6.setBackground(new java.awt.Color(48, 48, 48));
        F6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F6MouseClicked(evt);
            }
        });
        jPanel2.add(F6);

        G6.setEditable(false);
        G6.setBackground(new java.awt.Color(255, 255, 255));
        G6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G6MouseClicked(evt);
            }
        });
        jPanel2.add(G6);

        H6.setEditable(false);
        H6.setBackground(new java.awt.Color(48, 48, 48));
        H6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H6MouseClicked(evt);
            }
        });
        jPanel2.add(H6);

        A5.setEditable(false);
        A5.setBackground(new java.awt.Color(48, 48, 48));
        A5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });
        jPanel2.add(A5);

        B5.setEditable(false);
        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        jPanel2.add(B5);

        C5.setEditable(false);
        C5.setBackground(new java.awt.Color(48, 48, 48));
        C5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });
        jPanel2.add(C5);

        D5.setEditable(false);
        D5.setBackground(new java.awt.Color(255, 255, 255));
        D5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });
        jPanel2.add(D5);

        E5.setEditable(false);
        E5.setBackground(new java.awt.Color(48, 48, 48));
        E5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });
        jPanel2.add(E5);

        F5.setEditable(false);
        F5.setBackground(new java.awt.Color(255, 255, 255));
        F5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });
        jPanel2.add(F5);

        G5.setEditable(false);
        G5.setBackground(new java.awt.Color(48, 48, 48));
        G5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G5MouseClicked(evt);
            }
        });
        jPanel2.add(G5);

        H5.setEditable(false);
        H5.setBackground(new java.awt.Color(255, 255, 255));
        H5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H5MouseClicked(evt);
            }
        });
        jPanel2.add(H5);

        A4.setEditable(false);
        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });
        jPanel2.add(A4);

        B4.setEditable(false);
        B4.setBackground(new java.awt.Color(48, 48, 48));
        B4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });
        jPanel2.add(B4);

        C4.setEditable(false);
        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });
        jPanel2.add(C4);

        D4.setEditable(false);
        D4.setBackground(new java.awt.Color(48, 48, 48));
        D4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });
        jPanel2.add(D4);

        E4.setEditable(false);
        E4.setBackground(new java.awt.Color(255, 255, 255));
        E4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });
        jPanel2.add(E4);

        F4.setEditable(false);
        F4.setBackground(new java.awt.Color(48, 48, 48));
        F4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F4MouseClicked(evt);
            }
        });
        jPanel2.add(F4);

        G4.setEditable(false);
        G4.setBackground(new java.awt.Color(255, 255, 255));
        G4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G4MouseClicked(evt);
            }
        });
        jPanel2.add(G4);

        H4.setEditable(false);
        H4.setBackground(new java.awt.Color(48, 48, 48));
        H4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H4MouseClicked(evt);
            }
        });
        jPanel2.add(H4);

        A3.setEditable(false);
        A3.setBackground(new java.awt.Color(48, 48, 48));
        A3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        jPanel2.add(A3);

        B3.setEditable(false);
        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        jPanel2.add(B3);

        C3.setEditable(false);
        C3.setBackground(new java.awt.Color(48, 48, 48));
        C3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        jPanel2.add(C3);

        D3.setEditable(false);
        D3.setBackground(new java.awt.Color(255, 255, 255));
        D3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });
        jPanel2.add(D3);

        E3.setEditable(false);
        E3.setBackground(new java.awt.Color(48, 48, 48));
        E3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });
        jPanel2.add(E3);

        F3.setEditable(false);
        F3.setBackground(new java.awt.Color(255, 255, 255));
        F3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F3MouseClicked(evt);
            }
        });
        jPanel2.add(F3);

        G3.setEditable(false);
        G3.setBackground(new java.awt.Color(48, 48, 48));
        G3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G3MouseClicked(evt);
            }
        });
        jPanel2.add(G3);

        H3.setEditable(false);
        H3.setBackground(new java.awt.Color(255, 255, 255));
        H3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H3MouseClicked(evt);
            }
        });
        jPanel2.add(H3);

        A2.setEditable(false);
        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A2.setText("♙");
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        jPanel2.add(A2);

        B2.setEditable(false);
        B2.setBackground(new java.awt.Color(48, 48, 48));
        B2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B2.setText("♙");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        jPanel2.add(B2);

        C2.setEditable(false);
        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C2.setText("♙");
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        jPanel2.add(C2);

        D2.setEditable(false);
        D2.setBackground(new java.awt.Color(48, 48, 48));
        D2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D2.setText("♙");
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });
        jPanel2.add(D2);

        E2.setEditable(false);
        E2.setBackground(new java.awt.Color(255, 255, 255));
        E2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E2.setText("♙");
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });
        jPanel2.add(E2);

        F2.setEditable(false);
        F2.setBackground(new java.awt.Color(48, 48, 48));
        F2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F2.setText("♙");
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });
        jPanel2.add(F2);

        G2.setEditable(false);
        G2.setBackground(new java.awt.Color(255, 255, 255));
        G2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G2.setText("♙");
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G2MouseClicked(evt);
            }
        });
        jPanel2.add(G2);

        H2.setEditable(false);
        H2.setBackground(new java.awt.Color(48, 48, 48));
        H2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H2.setText("♙");
        H2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H2MouseClicked(evt);
            }
        });
        jPanel2.add(H2);

        A1.setEditable(false);
        A1.setBackground(new java.awt.Color(48, 48, 48));
        A1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        A1.setText("♖");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        jPanel2.add(A1);

        B1.setEditable(false);
        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        B1.setText("♘");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        jPanel2.add(B1);

        C1.setEditable(false);
        C1.setBackground(new java.awt.Color(48, 48, 48));
        C1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        C1.setText("♗");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        jPanel2.add(C1);

        D1.setEditable(false);
        D1.setBackground(new java.awt.Color(255, 255, 255));
        D1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        D1.setText("♕");
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        jPanel2.add(D1);

        E1.setEditable(false);
        E1.setBackground(new java.awt.Color(48, 48, 48));
        E1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        E1.setText("♔");
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });
        jPanel2.add(E1);

        F1.setEditable(false);
        F1.setBackground(new java.awt.Color(255, 255, 255));
        F1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        F1.setText("♗");
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });
        jPanel2.add(F1);

        G1.setEditable(false);
        G1.setBackground(new java.awt.Color(48, 48, 48));
        G1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        G1.setText("♘");
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G1MouseClicked(evt);
            }
        });
        jPanel2.add(G1);

        H1.setEditable(false);
        H1.setBackground(new java.awt.Color(255, 255, 255));
        H1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        H1.setText("♖");
        H1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H1MouseClicked(evt);
            }
        });
        jPanel2.add(H1);


        jPanel1.setBackground(new java.awt.Color(122, 81, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(30, 74));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" 8");
        jPanel1.add(jLabel12);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" 7");
        jPanel1.add(jLabel11);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" 6");
        jPanel1.add(jLabel10);

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" 5");
        jPanel1.add(jLabel9);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" 4");
        jPanel1.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" 3");
        jPanel1.add(jLabel8);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" 2");
        jPanel1.add(jLabel6);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" 1");
        jPanel1.add(jLabel5);







        jPanel3.setBackground(new java.awt.Color(122, 81, 49));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("   A");
        jPanel3.add(jLabel20);

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("   B");
        jPanel3.add(jLabel19);

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("   C");
        jLabel18.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(jLabel18);

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("   D");
        jPanel3.add(jLabel17);

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   E");
        jPanel3.add(jLabel16);

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("   F");
        jPanel3.add(jLabel15);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("   G");
        jPanel3.add(jLabel14);

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("   H");
        jPanel3.add(jLabel13);



        jPanel5.setBackground(new java.awt.Color(122, 81, 49));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("   A");
        jPanel5.add(jLabel30);

        jLabel36.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("   B");
        jPanel5.add(jLabel36);

        jLabel35.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("   C");
        jPanel5.add(jLabel35);
        
        jLabel34.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("   D");
        jLabel34.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel5.add(jLabel34); 
        
        jLabel33.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("   E");
        jPanel5.add(jLabel33);

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("   F");
        jPanel5.add(jLabel32);
        
        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("   G");
        jPanel5.add(jLabel31);

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("   H");
        jPanel5.add(jLabel29);

        //Panel que contiene los numeros de la derecha
        jPanel4.setBackground(new java.awt.Color(122, 81, 49));
        jPanel4.setPreferredSize(new java.awt.Dimension(30, 74));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1));

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(" 8");
        jPanel4.add(jLabel28);

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(" 7");
        jPanel4.add(jLabel27);

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" 6");
        jPanel4.add(jLabel26);

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(" 5");
        jPanel4.add(jLabel25);        

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(" 4");
        jPanel4.add(jLabel24);

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" 3");
        jPanel4.add(jLabel23);

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" 2");
        jPanel4.add(jLabel22);

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" 1");
        jPanel4.add(jLabel21);


        jPanel10.setBackground(new java.awt.Color(122, 81, 49));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49), 2));

        resumePlayerBlack.setEditable(false);
        resumePlayerBlack.setBackground(new java.awt.Color(229, 181, 115));
        resumePlayerBlack.setColumns(20);
        resumePlayerBlack.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        resumePlayerBlack.setRows(5);
        jScrollPane1.setViewportView(resumePlayerBlack);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Historial de movimientos");

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("          (Piezas Negras)");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel38)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(229, 181, 115));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 181, 115), 2));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel2.setText("  Historial de movimientos");

        resumePlayerWhite.setEditable(false);
        resumePlayerWhite.setBackground(new java.awt.Color(122, 81, 49));
        resumePlayerWhite.setColumns(20);
        resumePlayerWhite.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        resumePlayerWhite.setForeground(new java.awt.Color(255, 255, 255));
        resumePlayerWhite.setRows(5);
        jScrollPane2.setViewportView(resumePlayerWhite);

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel37.setText("         (Piezas Blancas)");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel37)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(229, 181, 115));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 181, 115), 2));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(122, 81, 49));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));

        torreWhite.setEditable(false);
        torreWhite.setBackground(new java.awt.Color(204, 55, 55));
        torreWhite.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        torreWhite.setForeground(new java.awt.Color(255, 255, 255));
        torreWhite.setText(" 0");
        torreWhite.setBorder(null);
        torreWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torreWhiteActionPerformed(evt);
            }
        });

        reinaWhite.setEditable(false);
        reinaWhite.setBackground(new java.awt.Color(204, 55, 55));
        reinaWhite.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        reinaWhite.setForeground(new java.awt.Color(255, 255, 255));
        reinaWhite.setText(" 0");
        reinaWhite.setBorder(null);
        reinaWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinaWhiteActionPerformed(evt);
            }
        });

        caballoWhite.setEditable(false);
        caballoWhite.setBackground(new java.awt.Color(204, 55, 55));
        caballoWhite.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        caballoWhite.setForeground(new java.awt.Color(255, 255, 255));
        caballoWhite.setText(" 0");
        caballoWhite.setBorder(null);
        caballoWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballoWhiteActionPerformed(evt);
            }
        });

        peonWhite.setEditable(false);
        peonWhite.setBackground(new java.awt.Color(204, 55, 55));
        peonWhite.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        peonWhite.setForeground(new java.awt.Color(255, 255, 255));
        peonWhite.setText(" 0");
        peonWhite.setBorder(null);
        peonWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peonWhiteActionPerformed(evt);
            }
        });

        alfilWhite.setEditable(false);
        alfilWhite.setBackground(new java.awt.Color(204, 55, 55));
        alfilWhite.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        alfilWhite.setForeground(new java.awt.Color(255, 255, 255));
        alfilWhite.setText(" 0");
        alfilWhite.setBorder(null);
        alfilWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfilWhiteActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("♙");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));
        jLabel40.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel39.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("♘");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));
        jLabel39.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel41.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("♗");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));
        jLabel41.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel42.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("♖");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));
        jLabel42.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel43.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("♕");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49)));
        jLabel43.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(peonWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(caballoWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(alfilWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(torreWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(reinaWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peonWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caballoWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alfilWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(torreWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinaWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); // NOI18N
        jLabel3.setText(" ♚Negro");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(122, 81, 49));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 81, 49), 2));

        jLabel4.setBackground(new java.awt.Color(237, 49, 49));
        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" ♔Blanco");

        jPanel12.setBackground(new java.awt.Color(229, 181, 115));

        peonBlack.setEditable(false);
        peonBlack.setBackground(new java.awt.Color(204, 55, 55));
        peonBlack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        peonBlack.setForeground(new java.awt.Color(255, 255, 255));
        peonBlack.setText(" 0");
        peonBlack.setBorder(null);
        peonBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peonBlackActionPerformed(evt);
            }
        });

        reinaBlack.setEditable(false);
        reinaBlack.setBackground(new java.awt.Color(204, 55, 55));
        reinaBlack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        reinaBlack.setForeground(new java.awt.Color(255, 255, 255));
        reinaBlack.setText(" 0");
        reinaBlack.setBorder(null);
        reinaBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinaBlackActionPerformed(evt);
            }
        });

        caballoBlack.setEditable(false);
        caballoBlack.setBackground(new java.awt.Color(204, 55, 55));
        caballoBlack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        caballoBlack.setForeground(new java.awt.Color(255, 255, 255));
        caballoBlack.setText(" 0");
        caballoBlack.setBorder(null);
        caballoBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballoBlackActionPerformed(evt);
            }
        });

        alfilBlack.setEditable(false);
        alfilBlack.setBackground(new java.awt.Color(204, 55, 55));
        alfilBlack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        alfilBlack.setForeground(new java.awt.Color(255, 255, 255));
        alfilBlack.setText(" 0");
        alfilBlack.setBorder(null);
        alfilBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfilBlackActionPerformed(evt);
            }
        });

        torreBlack.setEditable(false);
        torreBlack.setBackground(new java.awt.Color(204, 55, 55));
        torreBlack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        torreBlack.setForeground(new java.awt.Color(255, 255, 255));
        torreBlack.setText(" 0");
        torreBlack.setBorder(null);
        torreBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torreBlackActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel44.setText("♟");
        jLabel44.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel45.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel45.setText("♞");
        jLabel45.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel46.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel46.setText("♝");
        jLabel46.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel47.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel47.setText("♜");
        jLabel47.setPreferredSize(new java.awt.Dimension(64, 64));

        jLabel48.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel48.setText("♛");
        jLabel48.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(peonBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(caballoBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(alfilBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(torreBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(reinaBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peonBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caballoBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alfilBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(torreBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinaBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void H1MouseClicked(java.awt.event.MouseEvent evt) {
        controlador.verifyContent(H1, "H1");
    }
    private void G1MouseClicked(java.awt.event.MouseEvent evt) {
        controlador.verifyContent(G1, "G1");
    }
    private void F1MouseClicked(java.awt.event.MouseEvent evt) {
        controlador.verifyContent(F1, "F1");
    }

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {
        controlador.verifyContent(E1, "E1");
    }

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        controlador.verifyContent(D1, "D1");
    }//GEN-LAST:event_D1MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        controlador.verifyContent(C1, "C1");
    }//GEN-LAST:event_C1MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B1, "B1");
    }//GEN-LAST:event_B1MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A1, "A1");
    }//GEN-LAST:event_A1MouseClicked

    private void H2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H2, "H2");
    }//GEN-LAST:event_H2MouseClicked

    private void G2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G2, "G2");
    }//GEN-LAST:event_G2MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F2, "F2");
    }//GEN-LAST:event_F2MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E2, "E2");
    }//GEN-LAST:event_E2MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D2, "D2");
    }//GEN-LAST:event_D2MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C2, "C2");
    }//GEN-LAST:event_C2MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B2, "B2");
    }//GEN-LAST:event_B2MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A2, "A2");
    }//GEN-LAST:event_A2MouseClicked

    private void H3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H3, "H3");
    }//GEN-LAST:event_H3MouseClicked

    private void G3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G3, "G3");
    }//GEN-LAST:event_G3MouseClicked

    private void F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F3, "F3");
    }//GEN-LAST:event_F3MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E3, "E3");
    }//GEN-LAST:event_E3MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D3, "D3");
    }//GEN-LAST:event_D3MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C3, "C3");
    }//GEN-LAST:event_C3MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B3, "B3");
    }//GEN-LAST:event_B3MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A3, "A3");
    }//GEN-LAST:event_A3MouseClicked

    private void H4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H4, "H4");
    }//GEN-LAST:event_H4MouseClicked

    private void G4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G4, "G4");
    }//GEN-LAST:event_G4MouseClicked

    private void F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F4, "F4");
    }//GEN-LAST:event_F4MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E4, "E4");
    }//GEN-LAST:event_E4MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D4, "D4");
    }//GEN-LAST:event_D4MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C4, "C4");
    }//GEN-LAST:event_C4MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B4, "B4");
    }//GEN-LAST:event_B4MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A4, "A4");
    }//GEN-LAST:event_A4MouseClicked

    private void H5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H5, "H5");
    }//GEN-LAST:event_H5MouseClicked

    private void G5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G5, "G5");
    }//GEN-LAST:event_G5MouseClicked

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F5, "F5");
    }//GEN-LAST:event_F5MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E5, "E5");
    }//GEN-LAST:event_E5MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D5, "D5");
    }//GEN-LAST:event_D5MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C5, "C5");
    }//GEN-LAST:event_C5MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B5, "B5");
    }//GEN-LAST:event_B5MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A5, "A5");
    }//GEN-LAST:event_A5MouseClicked

    private void H6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H6, "H6");
    }//GEN-LAST:event_H6MouseClicked

    private void G6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G6, "G6");
    }//GEN-LAST:event_G6MouseClicked

    private void F6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F6, "F6");
    }//GEN-LAST:event_F6MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E6, "E6");
    }//GEN-LAST:event_E6MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D6, "D6");
    }//GEN-LAST:event_D6MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C6, "C6");
    }//GEN-LAST:event_C6MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B6, "B6");
    }//GEN-LAST:event_B6MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A6, "A6");
    }//GEN-LAST:event_A6MouseClicked

    private void H7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H7, "H7");
    }//GEN-LAST:event_H7MouseClicked

    private void G7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G7, "G7");
    }//GEN-LAST:event_G7MouseClicked

    private void F7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F7, "F7");
    }//GEN-LAST:event_F7MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E7, "E7");
    }//GEN-LAST:event_E7MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D7, "D7");
    }//GEN-LAST:event_D7MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C7, "C7");
    }//GEN-LAST:event_C7MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B7, "B7");
    }//GEN-LAST:event_B7MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A7, "A7");
    }//GEN-LAST:event_A7MouseClicked

    private void H8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(H8, "H8");
    }//GEN-LAST:event_H8MouseClicked

    private void G8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(G8, "G8");
    }//GEN-LAST:event_G8MouseClicked

    private void F8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(F8, "F8");
    }//GEN-LAST:event_F8MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(E8, "E8");
    }//GEN-LAST:event_E8MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(D8, "D8");
    }//GEN-LAST:event_D8MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(C8, "C8");
    }//GEN-LAST:event_C8MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(B8, "B8");
    }//GEN-LAST:event_B8MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        // TODO add your handling code here:
        controlador.verifyContent(A8, "A8");
    }//GEN-LAST:event_A8MouseClicked

    private void torreWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torreWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torreWhiteActionPerformed

    private void reinaWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinaWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinaWhiteActionPerformed

    private void caballoWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballoWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caballoWhiteActionPerformed

    private void peonWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peonWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peonWhiteActionPerformed

    private void alfilWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfilWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfilWhiteActionPerformed

    private void torreBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torreBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torreBlackActionPerformed

    private void alfilBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfilBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfilBlackActionPerformed

    private void caballoBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballoBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caballoBlackActionPerformed

    private void reinaBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinaBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinaBlackActionPerformed

    private void peonBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peonBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peonBlackActionPerformed

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
            java.util.logging.Logger.getLogger(ChessBoardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChessBoardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChessBoardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChessBoardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChessBoardPanel frame = new ChessBoardPanel();
                frame.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField A1;
    public static javax.swing.JTextField A2;
    public static javax.swing.JTextField A3;
    public static javax.swing.JTextField A4;
    public static javax.swing.JTextField A5;
    public static javax.swing.JTextField A6;
    public static javax.swing.JTextField A7;
    public static javax.swing.JTextField A8;
    public static javax.swing.JTextField B1;
    public static javax.swing.JTextField B2;
    public static javax.swing.JTextField B3;
    public static javax.swing.JTextField B4;
    public static javax.swing.JTextField B5;
    public static javax.swing.JTextField B6;
    public static javax.swing.JTextField B7;
    public static javax.swing.JTextField B8;
    public static javax.swing.JTextField C1;
    public static javax.swing.JTextField C2;
    public static javax.swing.JTextField C3;
    public static javax.swing.JTextField C4;
    public static javax.swing.JTextField C5;
    public static javax.swing.JTextField C6;
    public static javax.swing.JTextField C7;
    public static javax.swing.JTextField C8;
    public static javax.swing.JTextField D1;
    public static javax.swing.JTextField D2;
    public static javax.swing.JTextField D3;
    public static javax.swing.JTextField D4;
    public static javax.swing.JTextField D5;
    public static javax.swing.JTextField D6;
    public static javax.swing.JTextField D7;
    public static javax.swing.JTextField D8;
    public static javax.swing.JTextField E1;
    public static javax.swing.JTextField E2;
    public static javax.swing.JTextField E3;
    public static javax.swing.JTextField E4;
    public static javax.swing.JTextField E5;
    public static javax.swing.JTextField E6;
    public static javax.swing.JTextField E7;
    public static javax.swing.JTextField E8;
    public static javax.swing.JTextField F1;
    public static javax.swing.JTextField F2;
    public static javax.swing.JTextField F3;
    public static javax.swing.JTextField F4;
    public static javax.swing.JTextField F5;
    public static javax.swing.JTextField F6;
    public static javax.swing.JTextField F7;
    public static javax.swing.JTextField F8;
    public static javax.swing.JTextField G1;
    public static javax.swing.JTextField G2;
    public static javax.swing.JTextField G3;
    public static javax.swing.JTextField G4;
    public static javax.swing.JTextField G5;
    public static javax.swing.JTextField G6;
    public static javax.swing.JTextField G7;
    public static javax.swing.JTextField G8;
    public static javax.swing.JTextField H1;
    public static javax.swing.JTextField H2;
    public static javax.swing.JTextField H3;
    public static javax.swing.JTextField H4;
    public static javax.swing.JTextField H5;
    public static javax.swing.JTextField H6;
    public static javax.swing.JTextField H7;
    public static javax.swing.JTextField H8;
    public static javax.swing.JTextField alfilBlack;
    public static javax.swing.JTextField alfilWhite;
    public static javax.swing.JTextField caballoBlack;
    public static javax.swing.JTextField caballoWhite;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static  javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField peonBlack;
    public static javax.swing.JTextField peonWhite;
    public static javax.swing.JTextField reinaBlack;
    public static javax.swing.JTextField reinaWhite;
    public static javax.swing.JTextArea resumePlayerBlack;
    public static javax.swing.JTextArea resumePlayerWhite;
    public static javax.swing.JTextField torreBlack;
    public static javax.swing.JTextField torreWhite;
    // End of variables declaration//GEN-END:variables
}
