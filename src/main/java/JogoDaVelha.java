
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thais
 */
public class JogoDaVelha {

    // @GET
    //@Path("soma")
    //public String soma(@QueryParam("numero1") int num1, @QueryParam("numero2") int num2){
    //  int x = num1+num2;
    //return new Integer(x).toString();
    //}
    static String[][] tabuleiro = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    
    public String mostrar() {
        String l = "";
        for (int li = 0; li < 3; li++) {
            for (int co = 0; co < 3; co++) {
                l += " " + tabuleiro[li][co] + "|";
            }
            l += "</br>";
        }
        return l;
    }

    
    public String jogada(String posicao, String jogador) {
        for (int li = 0; li < 3; li++) {
            for (int co = 0; co < 3; co++) {
                if (tabuleiro[li][co].equals(posicao)) {
                    switch (posicao) {
                        case "1":
                            tabuleiro[0][0] = jogador;
                            break;
                        case "2":
                            tabuleiro[0][1] = jogador;
                            break;
                        case "3":
                            tabuleiro[0][2] = jogador;
                            break;
                        case "4":
                            tabuleiro[1][0] = jogador;
                            break;
                        case "5":
                            tabuleiro[1][1] = jogador;
                            break;
                        case "6":
                            tabuleiro[1][2] = jogador;
                            break;
                        case "7":
                            tabuleiro[2][0] = jogador;
                            break;
                        case "8":
                            tabuleiro[2][1] = jogador;
                            break;
                        case "9":
                            tabuleiro[2][2] = jogador;
                            break;
                        default:
                            break;
                    }
                            return mostrar();
                }
            }
        }
        return "<h1>Nao existe, tente outra vez!";
        
    }
    
    public String vencedor() {
        String[] jogadas = new String[8];
        String vencedor = "null";

        jogadas[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        jogadas[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        jogadas[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];

        jogadas[3] = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];
        jogadas[4] = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];
        jogadas[5] = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];

        jogadas[6] = tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2];
        jogadas[7] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[2][2];

        for (int i = 0; i < jogadas.length; i++) {
            String jogada = jogadas[i];
            if (jogada.equals("xxx")) {
                vencedor = "jogador 1, venceu!";
            } else if (jogada.equals("ooo")) {
                vencedor = "jogador 2, venceu!";
            }
        }
        return vencedor;
        
    }
   
      
}
