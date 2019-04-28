import java.util.ArrayList; 
public class Agencia{

   private ArrayList <Projeto> projetos;

   public Agencia()
   {
      projetos = new ArrayList<>(50);
   }
    
   public void inserirProjeto(int cod_interno, String titulo, String instituicao, int orcamento, String duracao){
   
      Projeto novoprojeto = new Projeto(cod_interno,titulo, instituicao, orcamento, duracao);
      projetos.add(novoprojeto);
   }
    
   public boolean removeProjeto(int cod_interno) {
      int posicao = buscar (cod_interno);
      if(posicao >=0){
         projetos.remove(posicao);
         return true;
      }
      return false;
   }
    
   public int buscar (int cod_interno){
      for(int contador =0; contador<projetos.size(); contador++){
         Projeto projeto = projetos.get(contador);
         int idproj = projeto.getCod_interno();
         if (idproj == cod_interno){
            return contador;
         }
      
      }
      return -1;
   } 
   
   
   public Projeto buscarProjeto (int cod_interno){
      for(int contador =0; contador<projetos.size(); contador++){
         Projeto projeto = projetos.get(contador);
         int idproj = projeto.getCod_interno();
         if (idproj == cod_interno){
            return projeto;
         }
      
      }
      return null;
   }
   
    
   public ArrayList <Projeto> getProjetos(){
      return projetos;
   }
   
}
