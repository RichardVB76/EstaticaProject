import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridLayout;

public class estatica extends JPanel {

	/**
	 * Create the panel.
	 */
	public estatica() {
		setLayout(new GridLayout(1, 0, 0, 0));

		JComboBox comboBox_1 = new JComboBox();
		add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		add(comboBox_2);

		JComboBox comboBox = new JComboBox();
		add(comboBox);

	}

}
