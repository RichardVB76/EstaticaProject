import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.SpinnerNumberModel;

public class GUI {

	private JFrame frame;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public int objects = 0;
	private JTextField txtObjetos;
	public int counter = 0;
	public JCheckBox arrayCheckBox[] = new JCheckBox[10];
	public JCheckBox arrayCheckBox1[] = new JCheckBox[10];
	public JComboBox arrayComboBox[] = new JComboBox[10];
	public JPanel arrayPanel[] = new JPanel[10];
	public JSpinner arraySpinner[] = new JSpinner[10];
	public Point pointsX[]=new Point[10]; 
	
	private JSpinner spinner;
	private JSpinner spinner1;
	
	public int mass = 0;
	public int pageNumber = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Panels
		
		JPanel cardLayout = new JPanel();
		JPanel menu = new JPanel();
		JPanel estatica = new JPanel();
		JPanel cuerpoDiagramaLibre = new JPanel();
		JPanel cuerpoDiagrama2 = new JPanel();
	
		
		frame.getContentPane().add(cardLayout, BorderLayout.CENTER);
		cardLayout.setLayout(new CardLayout(0, 0));

		//Panels added to cardLayout
		
		cardLayout.add(menu, "name_190219383776275");
		menu.setLayout(new BorderLayout(0, 0));
		cardLayout.add(estatica, "name_190332955143582");
		estatica.setLayout(null);
		cardLayout.add(cuerpoDiagramaLibre, "name_194637259257368");
		cardLayout.add(cuerpoDiagrama2, "name_194931131011883");
		
		

		//Buttons on Menu
		JButton btnEstatica = new JButton("ESTATICA");
		JButton btnDinamica = new JButton("DINAMICA");
		JButton btnFormulas = new JButton("FORMULAS");
		menu.add(btnEstatica, BorderLayout.WEST);
		
		//Adding buttons to menu
		menu.add(btnDinamica, BorderLayout.EAST);
		menu.add(btnFormulas, BorderLayout.CENTER);

		
		//Buttons on estatica
		JLabel pregunta1 = new JLabel("\u00BFQu\u00E9 variable estas buscando?");
		JComboBox comboBox = new JComboBox();
		
		//Adding buttons to estatica
		
		pregunta1.setBounds(11, 10, 175, 16);
		estatica.add(pregunta1);

		comboBox.setBounds(191, 5, 99, 26);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Fuerza", "Monmetum", "Direcci\u00F3n", "Distancia", "Reacciones" }));
		estatica.add(comboBox);

		
		//Buttons on cuerpoDiagramaLibre

		JLabel label_2 = new JLabel("\u00BFCuantos puntos hay en la figura?");
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		JLabel label = new JLabel("\u00BFCuantos objetos hay?");
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		JLabel label_1 = new JLabel("\u00BFCuanta masa tiene el objeto #");
		JLabel label_3 = new JLabel("Puntos horizontalmente iguales(color): ");
	//	txtObjetos = new JTextField();
		textField_7 = new JTextField();
		JComboBox comboBox_4 = new JComboBox();
		JCheckBox checkA = new JCheckBox("A");
		JCheckBox checkB = new JCheckBox("B");
		JCheckBox checkC = new JCheckBox("C");
		JCheckBox checkD = new JCheckBox("D");
		JCheckBox checkE = new JCheckBox("E");
		JCheckBox checkF = new JCheckBox("F");
		JCheckBox checkG = new JCheckBox("G");
		JCheckBox checkH = new JCheckBox("H");
		JCheckBox checkI = new JCheckBox("I");
		JCheckBox checkJ = new JCheckBox("J");
		
		JLabel label_4 = new JLabel("Puntos verticalemente iguales(color): ");
		JComboBox comboBox_5 = new JComboBox();
		JCheckBox checkA1 = new JCheckBox("A");
		JCheckBox checkB1 = new JCheckBox("B");
		JCheckBox checkC1 = new JCheckBox("C");
		JCheckBox checkD1 = new JCheckBox("D");
		JCheckBox checkE1 = new JCheckBox("E");
		JCheckBox checkF1 = new JCheckBox("F");
		JCheckBox checkG1 = new JCheckBox("G");
		JCheckBox checkH1 = new JCheckBox("H");
		JCheckBox checkI1 = new JCheckBox("I");
		JCheckBox checkJ1 = new JCheckBox("J");
		
		Point point1=new Point();
		Point point2=new Point();
		Point point3=new Point();
		Point point4=new Point();
		Point point5=new Point();
		Point point6=new Point();
		Point point7=new Point();
		Point point8=new Point();
		Point point9=new Point();
		Point point10=new Point();
		
		//Adding buttons to cuerpoDiagramaLibre
		
		cuerpoDiagramaLibre.add(label_2);
		cuerpoDiagramaLibre.add(spinner_1);
		cuerpoDiagramaLibre.add(label);

		cuerpoDiagramaLibre.add(spinner);
		this.spinner = spinner;
		this.spinner1 = spinner_1;

		spinner_1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				pointsAppear();
			}
		});

		// textField_6 = new JTextField();
		// textField_6.setText("Solo el d\u00EDgito");
		// textField_6.setColumns(10);
		// cuerpoDiagramaLibre.add(textField_6);
		//
		// textField_6.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		//
		// String textEdit;
		// char[] characterEdit;
		//
		//
		// textEdit=textField_6.getText();
		// characterEdit=textEdit.toCharArray();
		//
		// update();
		//
		//
		//// for (int i = 0; i < characterEdit.length; i++) {
		////
		//// if(Character.isDigit(characterEdit[i])) {
		////
		//// objects=Character.getNumericValue(characterEdit[i])+objects*10;
		//// //txtObjetos.setText( " " + objects + "?" );
		////
		//// txtObjetos.setText(spinner.getValue()+"?");
		//// txtObjetos.revalidate();
		//// txtObjetos.repaint();
		////
		////
		////
		//// }
		//// else {System.out.println("type again"); i=characterEdit.length;}
		////
		//// }
		//
		// objects=0;
		//
		//
		// }
		// });
		cuerpoDiagramaLibre.add(label_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		cuerpoDiagramaLibre.add(spinner_2);
	
//		txtObjetos.setEditable(false);
//		txtObjetos.setText(objects + " ");
//		cuerpoDiagramaLibre.add(txtObjetos);
//		txtObjetos.setColumns(10);
		
		textField_7.setText("Solo el d\u00EDgito");
		textField_7.setColumns(10);
		cuerpoDiagramaLibre.add(textField_7);

		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkDigit(textField_7);
			}
		});
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update();
			}
		});
		cuerpoDiagramaLibre.add(btnSave);
		
		
		cuerpoDiagramaLibre.add(label_3);
	
	
//		cuerpoDiagramaLibre.add(checkBox_3);
//
//		cuerpoDiagramaLibre.add(checkBox_4);
//		cuerpoDiagramaLibre.add(checkBox_5);
//	
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "RED", "GREEN", "BLUE", "WHITE", "CYAN" }));
		cuerpoDiagramaLibre.add(comboBox_4);
		
		cuerpoDiagramaLibre.add(label_4);
//		cuerpoDiagramaLibre.add(checkBox_6);
//		cuerpoDiagramaLibre.add(checkBox_7);
//		cuerpoDiagramaLibre.add(checkBox_8);
		
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "RED", "GREEN", "BLUE", "WHITE", "CYAN" }));
		cuerpoDiagramaLibre.add(comboBox_5);

		//Buttons cuerpoDiagrama2
		

		JLabel label_5 = new JLabel("Fuerzas en el cuerpo y su cantidad:");
		cuerpoDiagrama2.add(label_5);

		JCheckBox checkBox = new JCheckBox("Normal");
		checkBox.setToolTipText("");
		checkBox.setHorizontalAlignment(SwingConstants.LEFT);
		cuerpoDiagrama2.add(checkBox);

		textField = new JTextField();
		textField.setText("Solo el d\u00EDgito");
		textField.setColumns(10);
		cuerpoDiagrama2.add(textField);

		JCheckBox checkBox_1 = new JCheckBox("Ejercida/Exterior");
		cuerpoDiagrama2.add(checkBox_1);

		textField_1 = new JTextField();
		textField_1.setText("Solo el d\u00EDgito");
		textField_1.setColumns(10);
		cuerpoDiagrama2.add(textField_1);

		JCheckBox checkBox_2 = new JCheckBox("Momentum");
		cuerpoDiagrama2.add(checkBox_2);

		textField_2 = new JTextField();
		textField_2.setText("Solo el d\u00EDgito");
		textField_2.setColumns(10);
		cuerpoDiagrama2.add(textField_2);

		JCheckBox checkBox_9 = new JCheckBox("Tensi\u00F3n");
		cuerpoDiagrama2.add(checkBox_9);

		textField_3 = new JTextField();
		textField_3.setText("Solo el d\u00EDgito");
		textField_3.setColumns(10);
		cuerpoDiagrama2.add(textField_3);

		JCheckBox checkBox_10 = new JCheckBox("Gravedad");
		cuerpoDiagrama2.add(checkBox_10);

		textField_4 = new JTextField();
		textField_4.setText("Solo el d\u00EDgito");
		textField_4.setColumns(10);
		cuerpoDiagrama2.add(textField_4);
		btnFormulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				frame.getContentPane().remove(cardLayout);
				frame.revalidate();
				frame.repaint();

			}
		});
		btnDinamica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				frame.getContentPane().remove(cardLayout);
				frame.revalidate();
				frame.repaint();

			}
		});
		btnEstatica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cardLayout.remove(menu);
				cardLayout.remove(estatica);
				frame.revalidate();
				frame.repaint();

			}
		});
	
		arrayCheckBox[0] = checkA;
		arrayCheckBox[1] = checkB;
		arrayCheckBox[2] = checkC;
		arrayCheckBox[3] = checkD;
		arrayCheckBox[4] = checkE;
		arrayCheckBox[5] = checkF;
		arrayCheckBox[6] = checkG;
		arrayCheckBox[7] = checkH;
		arrayCheckBox[8] = checkI;
		arrayCheckBox[9] = checkJ;
		
		arrayCheckBox1[0] = checkA1;
		arrayCheckBox1[1] = checkB1;
		arrayCheckBox1[2] = checkC1;
		arrayCheckBox1[3] = checkD1;
		arrayCheckBox1[4] = checkE1;
		arrayCheckBox1[5] = checkF1;
		arrayCheckBox1[6] = checkG1;
		arrayCheckBox1[7] = checkH1;
		arrayCheckBox1[8] = checkI1;
		arrayCheckBox1[9] = checkJ1;
	
		
		arrayComboBox[0] = comboBox_4;
		arrayComboBox[1] = comboBox_5;
		
		
		arrayPanel[0] = cardLayout;
		arrayPanel[1] = menu;
		arrayPanel[2] = estatica;
		arrayPanel[3] = cuerpoDiagramaLibre;
		
		arraySpinner[0]=spinner;
		arraySpinner[1]=spinner_1;
		arraySpinner[2]=spinner_2;
		
		pointsX[0]=point1;
		pointsX[1]=point2;
		pointsX[2]=point3;
		pointsX[3]=point4;
		pointsX[4]=point5;
		pointsX[5]=point6;
		pointsX[6]=point7;
		pointsX[7]=point8;
		pointsX[8]=point9;
		pointsX[9]=point10;


		JToolBar toolBar = new JToolBar();
		cuerpoDiagramaLibre.add(toolBar,0);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				superUpdate();
			}
		});
		toolBar.add(btnUpdate);
		
		JButton btnDcl = new JButton("DCL");
		toolBar.add(btnDcl);
		
		JButton button_1 = new JButton("DATOS");
		toolBar.add(button_1);
		
		JButton btnPrevious = new JButton("PREVIOUS");
		toolBar.add(btnPrevious);
		
		JLabel lblIndex = new JLabel("PAGE");
		toolBar.add(lblIndex);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arrayPanel[0].remove(arrayPanel[3]);
				arrayPanel[0].add(arrayPanel[4]);
				arrayPanel[4].add(toolBar,0);
				arrayPanel[0].revalidate();arrayPanel[0].repaint();
				
			}
		});
		toolBar.add(btnNext);
		arrayPanel[4] = cuerpoDiagrama2;

	}
	public void organizePoints() {
		
		for (int i = 0; i <(int)arraySpinner[1].getValue(); i++) {
	
			switch (arrayCheckBox[i].getForeground().toString()) {
			
			case "RED":
				pointsX[i].setLocation(0, 0);
				break;
			case "BLUE":
				pointsX[i].setLocation(0, 1);
				break;
			case "WHITE":
				pointsX[i].setLocation(0, 2);
				break;
			case "GREEN":
				pointsX[i].setLocation(0, 3);
				break;
			case "CYAN":
				pointsX[i].setLocation(0, 4);
				break;

			default:
				break;
			}
		}
	
		
		
		
		
	}
	public void pageInterface(JButton j) {
		
		switch (j.getText()) {
		case "NEXT":
			arrayPanel[0].remove(arrayPanel[pageNumber]);
			pageNumber+=1;
			arrayPanel[0].add(arrayPanel[pageNumber]);
			break;
		case "PREVIOUS":
			arrayPanel[0].remove(arrayPanel[pageNumber]);
			pageNumber-=1;
			arrayPanel[0].add(arrayPanel[pageNumber]);
			break;

		default:
			break;
		}
		update();
		
	}
	public void checkDigit(JTextField jtext) {

				String textEdit;
				char[] characterEdit;
				

				textEdit = jtext.getText();
				characterEdit = textEdit.toCharArray();

				for (int i = 0; i < characterEdit.length; i++) {

					if (Character.isDigit(characterEdit[i])) {

						mass = Character.getNumericValue(characterEdit[i]) + mass * 10;
						

					} else {
						System.out.println("type again");
						i = characterEdit.length;
					}

			}
				massSetter();
	}
	public void massSetter() {if((int)arraySpinner[2].getValue()!=0) {
		
		System.out.println("the mass for"+(int)arraySpinner[2].getValue()+"is"+mass);
		mass=0;
		update();
			}
		}
	
	public void pointsAppear() {

	if((int)spinner1.getValue()>0) {
		
	 for (int i = 0; i < (int)spinner1.getValue(); i++) {
		 
		 counter++;
		 arrayPanel[3].add(arrayCheckBox[i],i+11);
		 
	 			}	
	 	update();
	 
	for (int i = 0; i < (int)spinner1.getValue(); i++) {
		
		arrayPanel[3].add(arrayCheckBox1[i],i+13+(int)spinner1.getValue());
		
				}	
		update();
		colorPoints1();
		colorPoints2();
			}
		}

	public void colorPoints1() {
		
		switch (arrayComboBox[0].getSelectedItem().toString()) {
	case "RED":
		for (int i = 0; i < counter; i++) {
			if (arrayCheckBox[i].isSelected()) {
				arrayCheckBox[i].setForeground(Color.RED);
			}
		}
		break;
	case "BLUE":
		for (int i = 0; i < counter; i++) {
			if (arrayCheckBox[i].isSelected()) {
				arrayCheckBox[i].setForeground(Color.BLUE);
			}
		}
		break;
	case "GREEN":
		for (int i = 0; i < counter; i++) {
			if (arrayCheckBox[i].isSelected()) {
				arrayCheckBox[i].setForeground(Color.GREEN);
			}
		}
		break;
	case "WHITE":
		for (int i = 0; i < counter; i++) {
			if (arrayCheckBox[i].isSelected()) {
				arrayCheckBox[i].setForeground(Color.WHITE);
			}
		}
		break;
	case "CYAN":
		for (int i = 0; i < counter; i++) {
			if (arrayCheckBox[i].isSelected()) {
				arrayCheckBox[i].setForeground(Color.CYAN);
			}
		}
		break;

	default:
		break;
	}}
	public void colorPoints2() {
		switch (arrayComboBox[1].getSelectedItem().toString()) {
		case "RED":
			for (int i = 0; i < counter; i++) {
				if (arrayCheckBox1[i].isSelected()) {
					arrayCheckBox1[i].setForeground(Color.RED);
				}
			}
			break;
		case "BLUE":
			for (int i = 0; i < counter; i++) {
				if (arrayCheckBox1[i].isSelected()) {
					arrayCheckBox1[i].setForeground(Color.BLUE);
				}
			}
			break;
		case "GREEN":
			for (int i = 0; i < counter; i++) {
				if (arrayCheckBox1[i].isSelected()) {
					arrayCheckBox1[i].setForeground(Color.GREEN);
				}
			}
			break;
		case "WHITE":
			for (int i = 0; i < counter; i++) {
				if (arrayCheckBox1[i].isSelected()) {
					arrayCheckBox1[i].setForeground(Color.WHITE);
				}
			}
			break;
		case "CYAN":
			for (int i = 0; i < counter; i++) {
				if (arrayCheckBox1[i].isSelected()) {
					arrayCheckBox1[i].setForeground(Color.CYAN);
				}
			}
			break;

		default:
			break;
			
		}
		update();
		counter=0;
	}
	public void update() {
		arrayPanel[0].revalidate();
		arrayPanel[0].repaint();
	}
	public void superUpdate() {
	massSetter();
	pointsAppear();
	colorPoints1();
	colorPoints2();
	update();
	
}
}
