public class Projeto{   

   private int cod_interno;   
   private String titulo;
   private String instituicao;
   private int orcamento;
   private String duracao;
   private String avaliacao = "";
   
     
      public Projeto (int cod_interno,String titulo, String instituicao, int orcamento, String duracao){  
   
      this.cod_interno = cod_interno;
      this.titulo = titulo;
      this.instituicao = instituicao;
      this.orcamento = orcamento;
      this.duracao = duracao;
   
      }
   
   public int getCod_interno(){
      return  cod_interno;
      }
      
   public String getTitulo(){
      return  titulo;
      }
            
   public String getInstituicao(){
      return  instituicao;
      }
      
   public int getOrcamento(){
      return  orcamento;
      }
      
   public String getDuracao(){
      return  duracao;
      }
      public String geAvaliacao(){
      return  avaliacao;
      }
   
   public void setCod_interno( int cod_interno){
      this.cod_interno = cod_interno;
   }
   
   public void setTitulo(String titulo){
      this.titulo = titulo;
   }
   
   public void setInstituicao(String instituicao){
      this.instituicao = instituicao;
   }

   public void setorcamento(int orcamento){
      this.orcamento = orcamento;
   }
   
   public void setDuracao(String duracao){
      this.duracao = duracao;
   }
   public void setAvaliacao(String avaliacao){
      this.avaliacao = avaliacao;
   }
}