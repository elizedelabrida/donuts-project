import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Calculo_Rosca {
	
	public void Montar(){
		
		//Massa chocolate
	  if (Visual_Rosca.rbMChocolate.isSelected()){
		  Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_chocolate.png")));
			//cobertura chocolate
			if (Visual_Rosca.rbCChocolate.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Chocolate\\Cobertura.png")));
				
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Chocolate\\Confeitos.png")));
					
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Chocolate\\Confeitos Coloridos.png")));
				
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Chocolate\\Pacoca.png")));
				
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Chocolate\\Amendoim.png")));
				
				}			
			}
			//cobertura de morango
			else if (Visual_Rosca.rbCMorango.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Morango\\Cobertura.png")));
				
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Morango\\Confeitos.png")));
					
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Morango\\Confeitos Coloridos.png")));
				
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Morango\\Pacoca.png")));
				
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Morango\\Amendoim.png")));
				
				}
			}
			
			//cobertura de baunilha
			else if (Visual_Rosca.rbCBaunilha.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Baunilha\\Cobertura.png")));
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Baunilha\\Confeitos.png")));
					
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Baunilha\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Baunilha\\Pacoca.png")));
				
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Chocolate\\Cobertura de Baunilha\\Amendoim.png")));
				
				}
			
			}
			}
		
		//massa morango
		if (Visual_Rosca.rbMMorango.isSelected()){
			Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_morango.png")));
			//cobertura chocolate
			if (Visual_Rosca.rbCChocolate.isSelected()){
			
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Chocolate\\Cobertura.png")));
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Chocolate\\Confeitos.png")));
					
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Chocolate\\Confeitos Coloridos.png")));
				
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Chocolate\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Chocolate\\Amendoim.png")));
				}	
				
			}
			//cobertura morango
			else if (Visual_Rosca.rbCMorango.isSelected()){
			
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Morango\\Cobertura.png")));
				
                if (Visual_Rosca.rbEGranulado.isSelected()){
                	Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Morango\\Confeitos.png")));
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Morango\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Morango\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Morango\\Amendoim.png")));
				}	
				
			}
			//cobertura baunilha
			else if (Visual_Rosca.rbCBaunilha.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Baunilha\\Cobertura.png")));
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Baunilha\\Confeitos.png")));
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Baunilha\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Baunilha\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Morango\\Cobertura de Baunilha\\Cobertura.png")));
				}	
				
			}
		}
		//massa baunilha
		if (Visual_Rosca.rbMBaunilha.isSelected()){
			
			Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massas\\massa_baunilha.png")));
			//cobertura chocolate
			if (Visual_Rosca.rbCChocolate.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Chocolate\\Cobertura.png")));
				
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Chocolate\\Confeitos.png")));
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Chocolate\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Chocolate\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Chocolate\\Amendoim.png")));
				}
			
			}
			//cobertura morango
			else if (Visual_Rosca.rbCMorango.isSelected()){
			
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Morango\\Cobertura.png")));
				
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Morango\\Confeitos.png")));
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Morango\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Morango\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Morango\\Amendoim.png")));
				}
				
			}
			//cobertura baunilha
			else if (Visual_Rosca.rbCBaunilha.isSelected()){
				
				Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Baunilha\\Cobertura.png")));
				if (Visual_Rosca.rbEGranulado.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Baunilha\\Confeitos.png")));
				}
				else if (Visual_Rosca.rbEGranuladoColorido.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Baunilha\\Confeitos Coloridos.png")));
				}
				else if (Visual_Rosca.rbEPaçoca.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Baunilha\\Pacoca.png")));
				}
				else if (Visual_Rosca.rbEAmendoim.isSelected()){
					Visual_Rosca.LI11.setIcon(new ImageIcon(getClass().getResource("images\\Massa Baunilha\\Cobertura de Baunilha\\Amendoim.png")));
				}
				
			}

}
}
              public void Novo(){
            	  Visual_Rosca.LI11.setIcon(null);
            	  Visual_Rosca.btgMassa.clearSelection();
            	  Visual_Rosca.btgCobertura.clearSelection();
            	  Visual_Rosca.btgExtra.clearSelection();
              }
              
              public void Sair(){
            	  int resposta=JOptionPane.showConfirmDialog(null, "Deseja sair da aplicação?",
          				"***Você tem certeza?***",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          					if (resposta==0){
          						System.exit(0);
          					}
          					else{
          						Novo();
          					}
              }
}
