
package Modelo;

import Vista.ChessBoardPanelBlack;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gian
 */
public class ChessGame {
    JTextField[][] tablero = ChessBoardPanelBlack.tableroObj;
    JTextField[][] tableroWhite;
    private final Map<String, Integer> pieceCounters = new HashMap<>();

    public ChessGame() {
        pieceCounters.put("♙", 0);
        pieceCounters.put("♟", 0);
        pieceCounters.put("♖", 0);
        pieceCounters.put("♜", 0);
        pieceCounters.put("♘", 0);
        pieceCounters.put("♞", 0);
        pieceCounters.put("♗", 0);
        pieceCounters.put("♝", 0);
        pieceCounters.put("♕", 0);
        pieceCounters.put("♛", 0);
    }

    public void pawnValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece, String piece2) {
        int rowDiff = Math.abs(targetRow - startRow);
        int colDiff = Math.abs(targetCol - startCol);
        String pieceLocal = piece;
        String pieceLocal2 = piece2;

        if (colDiff == 0 && rowDiff == 1) {
            if (tablero[targetRow][targetCol].getText().isEmpty()) {
                moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], pieceLocal);
            } else {
                JOptionPane.showMessageDialog(null, "No puedes moverte a esa casilla, hay una pieza en el camino");
            }
        } else if (colDiff == 1 && rowDiff == 1) {
            if (tablero[targetRow][targetCol].getText().isEmpty()) {

                if (isSameColorPiece(pieceLocal, pieceLocal2)) {
                    JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
                } else {
                    moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
                    upStagePiecesCaptured(piece2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puedes moverte a esa casilla, no hay una pieza para capturar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para el peón");
        }
    }

    // moviento del caballo
    public void knightValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece,
            String piece2) {

        int rowDiff = Math.abs(targetRow - startRow);
        int colDiff = Math.abs(targetCol - startCol);

        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            if (tablero[targetRow][targetCol].getText().isEmpty()) {
                // Movimiento sin captura
                moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
            } else {
                if (isSameColorPiece(piece, piece2)) {
                    JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
                } else {
                    moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
                    upStagePiecesCaptured(piece2);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para el caballo");
        }
    }

    // movimiento del alfil
    public void bishopValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece,
            String piece2) {

        int rowDiff = Math.abs(targetRow - startRow);
        int colDiff = Math.abs(targetCol - startCol);

        if (rowDiff == colDiff) {

            if (tablero[targetRow][targetCol].getText().isEmpty()) {
                moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
            } else {
                if (isSameColorPiece(piece, piece2)) {
                    JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
                } else {
                    moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
                    upStagePiecesCaptured(piece2);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para el alfil");
        }
    }

    // movimiento de la torre
    public void rookValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece,
            String piece2) {

        boolean isHorizontalMove = startRow == targetRow;
        boolean isVerticalMove = startCol == targetCol;

        if (isHorizontalMove || isVerticalMove) {
            if (!tablero[targetRow][targetCol].getText().isEmpty()) {

                if (isSameColorPiece(piece, piece2)) {
                    JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
                } else {
                    moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
                    upStagePiecesCaptured(piece2);
                }
            } else {
                moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para la torre");
        }
    }

    // movimiento de la reina
    public void queenValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece,
            String piece2) {

        boolean isHorizontalOrVertical = (startRow == targetRow) || (startCol == targetCol);
        boolean isDiagonal = (Math.abs(startRow - targetRow) == Math.abs(startCol - targetCol));

        if (isHorizontalOrVertical || isDiagonal) {
            if (tablero[targetRow][targetCol].getText().isEmpty()) {
                moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
            } else {
                if (isSameColorPiece(piece, piece2)) {
                    JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
                } else {
                    moveIcon(tablero[startRow][startCol], tablero[targetRow][targetCol], piece);
                    upStagePiecesCaptured(piece2);
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para la reina");
        }
    }

    // movimiento del rey
    public void kingValidationMove(int startRow, int startCol, int targetRow, int targetCol, String piece,
            String piece2) {
        int rowDiff = Math.abs(startRow - startCol);
        int colDiff = Math.abs(targetRow - targetCol);

        if (rowDiff <= 1 && colDiff <= 1) {
            if (isSameColorPiece(piece, piece2)) {
                JOptionPane.showMessageDialog(null, "No puedes capturar a los de tu color");
            } else {
                moveIcon(tablero[startRow][startCol],
                        tablero[targetRow][targetCol],
                        piece);
                upStagePiecesCaptured(piece2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido para el rey");
        }
    }

    private void moveIcon(JTextField salida, JTextField llegada, String iconReplace) {
        salida.setText("");
        llegada.setText(iconReplace);
    }

    public void confirmCheckmate(String king) {
        if (king.equals("♔")) {
            JOptionPane.showMessageDialog(null, "Ganaron negras - Fin del juego");
            System.exit(0);
        } else if (king.equals("♚")) {
            JOptionPane.showMessageDialog(null, "Ganaron blancas - Fin del juego");
            System.exit(0);
        }
    }

    private boolean isSameColorPiece(String piece, String capturedPiece) {
        boolean isBlackPiece = piece.startsWith("♟") || piece.startsWith("♜")
                || piece.startsWith("♞") || piece.startsWith("♝")
                || piece.startsWith("♛") || piece.startsWith("♚");

        boolean isWhitePiece = piece.startsWith("♙") || piece.startsWith("♖")
                || piece.startsWith("♘") || piece.startsWith("♗")
                || piece.startsWith("♕") || piece.startsWith("♔");

        boolean isBlackCapturedPiece = capturedPiece.startsWith("♟") || capturedPiece.startsWith("♜")
                || capturedPiece.startsWith("♞")
                || capturedPiece.startsWith("♝") || capturedPiece.startsWith("♛") || capturedPiece.startsWith("♚");

        boolean isWhiteCapturedPiece = capturedPiece.startsWith("♙") || capturedPiece.startsWith("♖")
                || capturedPiece.startsWith("♘")
                || capturedPiece.startsWith("♗") || capturedPiece.startsWith("♕") || capturedPiece.startsWith("♔");
        // Las piezas son de colores diferentes

        return (isBlackPiece && isBlackCapturedPiece) || (isWhitePiece && isWhiteCapturedPiece);
    }

    public void upStagePiecesCaptured(String capturedPiece) {
        int currentCount = pieceCounters.getOrDefault(capturedPiece, 0);
        currentCount++;
        pieceCounters.put(capturedPiece, currentCount);
        switch (capturedPiece) {
            case "♙" ->
                ChessBoardPanelBlack.peonWhite.setText(" " + currentCount);
            case "♟" ->
                ChessBoardPanelBlack.peonBlack.setText(" " + currentCount);
            case "♖" ->
                ChessBoardPanelBlack.torreWhite.setText(" " + currentCount);
            case "♜" ->
                ChessBoardPanelBlack.torreBlack.setText(" " + currentCount);
            case "♘" ->
                ChessBoardPanelBlack.caballoWhite.setText(" " + currentCount);
            case "♞" ->
                ChessBoardPanelBlack.caballoBlack.setText(" " + currentCount);
            case "♗" ->
                ChessBoardPanelBlack.alfilWhite.setText(" " + currentCount);
            case "♝" ->
                ChessBoardPanelBlack.alfilBlack.setText(" " + currentCount);
            case "♕" ->
                ChessBoardPanelBlack.reinaWhite.setText(" " + currentCount);
            case "♛" ->
                ChessBoardPanelBlack.reinaBlack.setText(" " + currentCount);
        }
    }
}
