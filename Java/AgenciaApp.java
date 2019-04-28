import javax.swing.JOptionPane;
import java.util.ArrayList; 

public class AgenciaApp {
   public static void main (String args []){
      Agencia agencia = new Agencia ();
      int escolha = 0;
      
      
      do {
         String opcao = JOptionPane.showInputDialog("Digite uma opcao:\n"+
               "1. Inserir um novo projeto: \n"+ 
               "2. Listar todos projetos: \n"+
               "3. Atualizar  a avaliacao do projeto: \n"+
               "4. excluir um projeto: \n"+
               "5. listar um projeto pelo numero: \n"+
               "6.  sair: \n");
               
         escolha = Integer.parseInt(opcao);
      
               /*
                  O try catch, caso a opção seja NÃO numérica, ele captura o erro e trata a execução. 
               **/
               
      //   			try{
      //                  escolha = Integer.parseInt(opcao); //tentando converter texto em numero
      //             } catch (Exception e){
      //                System.out.println("opção invalida.:" + opcao); //caso o texto não seja numero, captura o erro e atribui 0 a escolha.
      //                escolha = 0;
      //             }
            
         System.out.println("Opcao digitada.:" + escolha);
      
         if(escolha == 1) 
         {
            String cod_interno = JOptionPane.showInputDialog("Informe o codigo do Projeto.");
            String titProjeto = JOptionPane.showInputDialog("Informe o titulo do Projeto.");
    
            String nomIntituicao = JOptionPane.showInputDialog("Informe o nome da instituicao.");
            String orcProjeto = JOptionPane.showInputDialog("Informe o orcamento do Projeto.");
            String durProjeto = JOptionPane.showInputDialog("Informe a duracao do Projeto.");
            int orcamentoProjeto = Integer.parseInt(orcProjeto);
             int codigointerno = Integer.parseInt(cod_interno);

                
                //criar um novo projeto new Projeto
                //adicionar as variaveius
            agencia.inserirProjeto(codigointerno, titProjeto,nomIntituicao, orcamentoProjeto, durProjeto);
                
                
                
         }
         else if(escolha == 2)
         {
            ArrayList <Projeto> listaProjetos = agencia.getProjetos(); 
            for (Projeto projeto : listaProjetos ){
             JOptionPane.showMessageDialog(null, "Codigo projeto......: " + projeto.getCod_interno() + "\n" +
                                                 "Titulo projeto......: " + projeto.getTitulo() + "\n" +
                                                 "Nome da Instituicao.: " + projeto.getInstituicao() + "\n" +
                                                 "Orcamento projeto...: " + projeto.getOrcamento() + "\n" +
                                                 "Duracao projeto.....: " + projeto.getDuracao() + "\n");
                                            
              
            }
         }
         else if(escolha ==3)
         {
            
         }
         else if(escolha == 4){
            String cod_interno = JOptionPane.showInputDialog("Informe o codigo que deseja excluir.");
            int codigointerno = Integer.parseInt(cod_interno);
             agencia.removeProjeto (codigointerno);
          
         }
         else if(escolha == 5)
         {
             String cod_interno = JOptionPane.showInputDialog("listar um projeto pelo codigo.");
            int codigointerno = Integer.parseInt(cod_interno);
            Projeto projeto = agencia.buscarProjeto (codigointerno);
            if (projeto == null ){
               JOptionPane.showMessageDialog(null,"Projeto " + codigointerno + " nao encontrado" );
   
            }else {
               JOptionPane.showMessageDialog(null, "Codigo projeto......: " + projeto.getCod_interno() + "\n" +
                                                 "Titulo projeto......: " + projeto.getTitulo() + "\n" +
                                                 "Nome da Instituicao.: " + projeto.getInstituicao() + "\n" +
                                                 "Orcamento projeto...: " + projeto.getOrcamento() + "\n" +
                                                 "Duracao projeto.....: " + projeto.getDuracao() + "\n");
 
            }
         }
         else if(escolha == 6)
         {
            System.exit(0);
         }else{
            JOptionPane.showMessageDialog(null,"Opção Inválida.");
         }
            
      }while(true || escolha == 6);
   
        
   }
   
}
   

