package verifica;

import java.io.FileWriter;

import javax.swing.JFileChooser;

public class Array extends ArrayList <Studente>{
	public Array() {
		super(); //prende i valori da studente creando un array e succesivamente un file csv 
	}
	public String crcsv() {
		String csv = "";
		for(int i=0;i<this.size(); i++) {
			csv = this.get(i).getNome() + ";" + this.get(i).getCognome() + ";" + this.get(i).getCf() + ";" + this.get(i).getData + ";";
			
		}
		return csv;
	}
	public void creaFile(JFrame finestra)throws IOException {//numerosi problemi di sintassi non mi consentono la corretta esplicitazione del jfilechooser
		JFileChooser chooose= new JFileChooser();
		chooose.setFileFilter(new TxtFileFilter());
		int k = chooose.showSaveDialog(finestra);
		if(k=JFileChooser.APPROVE_OPTION) {
			File fil=chooose.getSelectedFile();
			FileWriter fw= new FileWriter fil;
			fw.write(this.createcsv());
			fw.flush();
			fw.close();
		}
	}
}
