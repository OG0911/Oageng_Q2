/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;

/**
 *
 * @author OAGENG.M
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] cinemaSeats = new String[7][10];
        
        cinemaSeats[0][0] = "A01";
        cinemaSeats[0][1] = "A02";
        cinemaSeats[0][2] = "A03";
        cinemaSeats[0][3] = "A04";
        cinemaSeats[0][4] = "A05";
        cinemaSeats[0][5] = "A06";
        cinemaSeats[0][6] = "A07";
        cinemaSeats[0][7] = "A08";
        cinemaSeats[0][8] = "A09";
        cinemaSeats[0][9] = "A10";
        
        cinemaSeats[1][0] = "B01";
        cinemaSeats[1][1] = "B02";
        cinemaSeats[1][2] = "B03";
        cinemaSeats[1][3] = "B04";
        cinemaSeats[1][4] = "B05";
        cinemaSeats[1][5] = "B06";
        cinemaSeats[1][6] = "B07";
        cinemaSeats[1][7] = "B08";
        cinemaSeats[1][8] = "B09";
        cinemaSeats[1][9] = "B10";
        
        cinemaSeats[2][0] = "C01";
        cinemaSeats[2][1] = "C02";
        cinemaSeats[2][2] = "C03";
        cinemaSeats[2][3] = "C04";
        cinemaSeats[2][4] = "C05";
        cinemaSeats[2][5] = "C06";
        cinemaSeats[2][6] = "C07";
        cinemaSeats[2][7] = "C08";
        cinemaSeats[2][8] = "C09";
        cinemaSeats[2][9] = "C10";
        
        cinemaSeats[3][0] = "D01";
        cinemaSeats[3][1] = "D02";
        cinemaSeats[3][2] = "D03";
        cinemaSeats[3][3] = "D04";
        cinemaSeats[3][4] = "D05";
        cinemaSeats[3][5] = "D06";
        cinemaSeats[3][6] = "D07";
        cinemaSeats[3][7] = "D08";
        cinemaSeats[3][8] = "D09";
        cinemaSeats[3][9] = "D10";
        
        cinemaSeats[4][0] = "E01";
        cinemaSeats[4][1] = "E02";
        cinemaSeats[4][2] = "E03";
        cinemaSeats[4][3] = "E04";
        cinemaSeats[4][4] = "E05";
        cinemaSeats[4][5] = "E06";
        cinemaSeats[4][6] = "E07";
        cinemaSeats[4][7] = "E08";
        cinemaSeats[4][8] = "E09";
        cinemaSeats[4][9] = "E10";
        
        cinemaSeats[5][0] = "F01";
        cinemaSeats[5][1] = "F02";
        cinemaSeats[5][2] = "F03";
        cinemaSeats[5][3] = "F04";
        cinemaSeats[5][4] = "F05";
        cinemaSeats[5][5] = "F06";
        cinemaSeats[5][6] = "F07";
        cinemaSeats[5][7] = "F08";
        cinemaSeats[5][8] = "F09";
        cinemaSeats[5][9] = "F10";
        
        cinemaSeats[6][0] = "G01";
        cinemaSeats[6][1] = "G02";
        cinemaSeats[6][2] = "G03";
        cinemaSeats[6][3] = "G04";
        cinemaSeats[6][4] = "G05";
        cinemaSeats[6][5] = "G06";
        cinemaSeats[6][6] = "G07";
        cinemaSeats[6][7] = "G08";
        cinemaSeats[6][8] = "G09";
        cinemaSeats[6][9] = "G10";
        
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int a = 0; a < cinemaSeats[i].length; a++) {
                System.out.print(cinemaSeats[i][a] + "\t ");
            }
            System.out.println();
        }
    }
    
}
