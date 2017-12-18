
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
@Path("jogo")
public class JogoRest {
    JogoDaVelha jogo = new JogoDaVelha();
    
    
    @GET
    @Path("mostrar")
    public String mostrar(){
        return jogo.mostrar();
    }
    
    @GET
    @Path("jogada")
   public String jogada(@QueryParam("posicao") String posicao, @QueryParam("jogador") String jogador){
       return jogo.jogada(posicao, jogador);
   }
   
   @GET
   @Path("vencedor")
   public String vencedor(){
       return jogo.vencedor();
   }
   @GET
   @Path("resetar")
   public String resetarJogo(){
      this.jogo= new JogoDaVelha();
       return jogo.mostrar();
   }
   
}
