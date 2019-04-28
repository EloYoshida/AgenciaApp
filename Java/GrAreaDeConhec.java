public class GrAreaDeConhec { 
   int id;
   String nome;
   AreaDeConhec area;

   public GrAreaDeConhec ( int id, String nome, AreaDeConhec area){ 
      this.id = id;
      this.nome = nome;
      this.area = area;
      
   }
   
   public int getId(){
      return  id;
   }

   public String nome(){
      return  nome;
   }
      
   public void setId( int id){
      this.id = id;
   }

   public void setNome( String nome){
      this.nome = nome;
   }


}