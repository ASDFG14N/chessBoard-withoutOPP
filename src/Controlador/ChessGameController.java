package Controlador;

import Modelo.ChessGame;
import Vista.ChessBoardPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Gian
 */
public class ChessGameController {
    ChessGame modelo;

    private JTextArea resumePlayerWhite = ChessBoardPanel.resumePlayerWhite;
    private JTextArea resumePlayerBlack = ChessBoardPanel.resumePlayerBlack;
    private JTextField[][] tablero = ChessBoardPanel.tableroObj;

    private int turnCounter = 0;

    private ArrayList<String> pieces = new ArrayList<>(); 
    private ArrayList<Integer> savePlay = new ArrayList<>();
    private final ArrayList<Long> time = new ArrayList<>();
    public final String[][] tableroAjedrez;
    private final char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    private String finalPositionString;

    public ChessGameController() {
        this.tableroAjedrez = new String[][] {
                { "A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8" },
                { "A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7" },
                { "A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6" },
                { "A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5" },
                { "A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4" },
                { "A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3" },
                { "A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2" },
                { "A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1" } };
        modelo = new ChessGame();
    }

    public void verifyContent(JTextField content, String position) {
        pieces.add(content.getText()); 
        getPosition(position); 
    }

    private void getPosition(String position) {
        int[] coordinates = findCoordinates(position); 
        if (coordinates != null) {
            long startTime = System.currentTimeMillis();
            time.add(startTime);
            System.out.println("Posición: (" + coordinates[0] + ", " + coordinates[1] + ")");
            savePlay.add(coordinates[0]);
            savePlay.add(coordinates[1]);
            turnCounter++;

            if (turnCounter == 2) {
                processMovement();
                reset();
            }
        } else {
            System.out.println("Posición inválida, se cayó el juego xd");
        }
    }

    private void processMovement() {
        String piece = pieces.get(0);
        int initialRow = savePlay.get(0);
        int initialColumn = savePlay.get(1);
        int targetRow = savePlay.get(2);
        int targetColumn = savePlay.get(3);

        String initialLetterRow = String.valueOf(letters[initialColumn]);
        String targetLetterRow = String.valueOf(letters[targetColumn]);
        String finalLetterColumn = String.valueOf(8 - initialRow);
        String finalTargetLetterColumn = String.valueOf(8 - targetRow);

        long elapsedTimeInSeconds = calculateElapsedTimeInSeconds();

        String messageResume = generateMessageResume(piece, initialLetterRow, targetLetterRow, finalLetterColumn,
                finalTargetLetterColumn, elapsedTimeInSeconds);
        String messageResumeTwo = generateMessageResumeTwo(piece, initialLetterRow, targetLetterRow, finalLetterColumn,
                finalTargetLetterColumn, elapsedTimeInSeconds);

        boolean isBlack = isBlackPiece(piece);

        finalPositionString = targetLetterRow + finalTargetLetterColumn;

        validateMovementWhiteOrBlack(piece, initialRow, initialColumn, targetRow, targetColumn);

        resumePlayersMove(isBlack ? this.resumePlayerBlack : this.resumePlayerWhite,
                !pieces.get(1).isEmpty() ? messageResumeTwo : messageResume);

        modelo.confirmCheckmate(pieces.get(1));
        turnOfPlayers(piece, isBlack);
    }

    private long calculateElapsedTimeInSeconds() {
        long elapsedTimeInMillis = time.get(1) - time.get(0);
        return elapsedTimeInMillis / 1000;
    }

    private String generateMessageResume(String piece, String initialLetterRow, String targetLetterRow,
            String finalLetterColumn, String finalTargetLetterColumn, long elapsedTimeInSeconds) {

        return "» " + piece + ": [" + initialLetterRow + finalLetterColumn + "] ➜ [" + targetLetterRow
                + finalTargetLetterColumn + "]\n"
                + "Tiempo empleado: " + elapsedTimeInSeconds + " seg\n-------------------------------\n";
    }

    private String generateMessageResumeTwo(String piece, String initialLetterRow, String targetLetterRow,
            String finalLetterColumn, String finalTargetLetterColumn, long elapsedTimeInSeconds) {

        return "» " + piece + ": [" + initialLetterRow + finalLetterColumn + "] ➜ [" + targetLetterRow
                + finalTargetLetterColumn + "]\n"
                + piece + " capturó: " + pieces.get(1) + "\n"
                + "Tiempo empleado: " + elapsedTimeInSeconds + " seg\n-------------------------------\n";
    }

    private boolean isBlackPiece(String piece) {
        return piece.startsWith("♟") || piece.startsWith("♜")
                || piece.startsWith("♞") || piece.startsWith("♝")
                || piece.startsWith("♛") || piece.startsWith("♚");
    }

    private int[] findCoordinates(String position) {
        for (int i = 0; i < tableroAjedrez.length; i++) {
            for (int j = 0; j < tableroAjedrez[i].length; j++) {
                if (tableroAjedrez[i][j].equals(position)) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    private void resumePlayersMove(JTextArea window, String menssage) {
        window.append(menssage);
    }

    private void validateMovementWhiteOrBlack(String piece, int startRow, int startCol, int targetRow, int targetCol) {
        switch (piece) {
            case "♙", "♟" ->
                modelo.pawnValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1), finalPositionString);
            case "♖", "♜" ->
                modelo.rookValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
            case "♘", "♞" ->
                modelo.knightValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
            case "♗", "♝" ->
                modelo.bishopValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
            case "♕", "♛" ->
                modelo.queenValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
            case "♔", "♚" ->
                modelo.kingValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
        }
    }

    private void turnOfPlayers(String piece, boolean isBlack) {
        if (!piece.equals("")) {
            JOptionPane.showMessageDialog(null, isBlack ? "»Turno de blancas" : "»Turno de negras");
            if (isBlack) {
                intercambiarPorBancas();
            } else {
                intercambiarPorNegras();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Jugada no válida, debes mover almenos una pieza");
        }
    }

    private void reset() {
        savePlay.clear();
        time.clear();
        pieces.clear();
        turnCounter = 0;
    }

    private void intercambiarPorBancas() {
        cleanChessboard();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                ChessBoardPanel.jPanel2.add(tablero[i][j]);
            }
        }
        ChessBoardPanel.jPanel2.revalidate();
        ChessBoardPanel.jPanel2.repaint();

        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel12);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel11);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel10);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel9);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel7);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel8);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel6);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel5);

        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel28);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel27);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel26);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel25);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel24);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel23);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel22);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel21);


        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel20);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel19);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel18);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel17);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel16);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel15);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel14);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel13);

        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel30);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel36);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel35);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel34);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel33);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel32);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel31);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel29);
    }

    private void intercambiarPorNegras() {
        cleanChessboard();
        for (int i = tablero.length - 1; i >= 0; i--) {
            for (int j = tablero[i].length - 1; j >= 0; j--) {
                ChessBoardPanel.jPanel2.add(tablero[i][j]);
            }
        }
        ChessBoardPanel.jPanel2.revalidate();
        ChessBoardPanel.jPanel2.repaint();

        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel5);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel6);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel8);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel7);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel9);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel10);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel11);
        ChessBoardPanel.jPanel1.add(ChessBoardPanel.jLabel12);

        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel21);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel22);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel23);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel24);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel25);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel26);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel27);
        ChessBoardPanel.jPanel4.add(ChessBoardPanel.jLabel28);


        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel13);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel14);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel15);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel16);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel17);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel18);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel19);
        ChessBoardPanel.jPanel3.add(ChessBoardPanel.jLabel20);

        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel29);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel31);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel32);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel33);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel34);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel35);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel36);
        ChessBoardPanel.jPanel5.add(ChessBoardPanel.jLabel30);
    }

    private void cleanChessboard() {
        for (JTextField[] fila : tablero) {
            for (JTextField casilla : fila) {
                ChessBoardPanel.jPanel2.remove(casilla);
            }
        }
    }

}
