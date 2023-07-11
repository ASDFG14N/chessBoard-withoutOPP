package Controlador;

import Modelo.ChessGame;
import Vista.ChessBoardPanelBlack;
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
    JTextArea resumePlayerWhite = ChessBoardPanelBlack.resumePlayerWhite;
    JTextArea resumePlayerBlack = ChessBoardPanelBlack.resumePlayerBlack;
    private JTextField[][] tablero = ChessBoardPanelBlack.tableroObj;

    int turnCounter = 0;

    private ArrayList<String> pieces = new ArrayList<>();
    private ArrayList<Integer> savePlay = new ArrayList<>();
    private final ArrayList<Long> time = new ArrayList<>();
    public final String[][] tableroAjedrez;
    private final char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

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
                modelo.pawnValidationMove(startRow, startCol, targetRow, targetCol, pieces.get(0), pieces.get(1));
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

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H8);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H7);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H6);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H5);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H4);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H3);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H2);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H1);

        ChessBoardPanelBlack.jPanel2.revalidate();
        ChessBoardPanelBlack.jPanel2.repaint();

    }

    private void intercambiarPorNegras() {
        cleanChessboard();

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B1);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A1);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B2);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A2);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B3);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A3);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B4);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A4);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B5);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A5);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B6);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A6);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B7);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A7);

        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.H8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.G8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.F8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.E8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.D8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.C8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.B8);
        ChessBoardPanelBlack.jPanel2.add(ChessBoardPanelBlack.A8);

        ChessBoardPanelBlack.jPanel2.revalidate();
        ChessBoardPanelBlack.jPanel2.repaint();
    }

    private void cleanChessboard() {
        for (JTextField[] fila : tablero) {
            for (JTextField casilla : fila) {
                ChessBoardPanelBlack.jPanel2.remove(casilla);
            }
        }
    }

}
