package verifica;
//non so perch� mi chiami cos� la classe io volevo chiamarla finestra

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class finestra extends JFrame implements ActionListener{ //in realt� senza la parte prima non � troppo utile la parte grafica  
	private JScrollPane pane;
	private JTable table;
	private DefaultTableModel dtm;
	private JMenu menu;
	private JMenuBar bar;
	private JMenuItem inserisci, salva, modifica;
	
	public void initCompon() {
		String[] NomiColonne("nome", "cognome", "codice", "data");
		dtm=new DefaultTableModel(NomiColonne);
		table = new JTable(dtm);
		pane = new JScrollPane(table);
		bar = new JMenuBar();
		menu = new JMenu("men�");
		inserisci = new JMenuItem("inserisci");
		salva = new JMenuItem("salva");
		modifica= new JMenuItem("modifica");
		
		menu.add(inserisci);
		menu.add(salva);
		menu.add(modifica);
		bar.add(menu);
	}
	public Finestra() {
		initCompon();
	}
	public static void main(String[] args) {
		Finestra f = new Finestra();
		f.setSize(400,600);
		f.setVisible(true);
		
	}
}
	public void actionPerformed(ActionEvent e) {
}
	//probabilmente non sar� la migliore verifica ma le basi della programmazione ci sono 