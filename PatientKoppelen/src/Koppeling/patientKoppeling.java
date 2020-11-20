package Koppeling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class patientKoppeling {
    private JTextField patientIField;
    private JButton submitButton;
    private JButton HomeLogo;
    private JButton MenuButton;
    private JComboBox PCPcomboBox1;
    private JTextField PCPField;
    private JLabel KoppelOud;
    private JLabel KoppelNieuw;
    private JLabel Footer;
    private JPanel MainView;
    private JLabel PatientKoppeling;

    public patientKoppeling() {
        HomeLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NewPcp = PCPField.getText();
                String NewPatient = patientIField.getText();
                if (!NewPatient.isEmpty() && !NewPcp.isEmpty()) {
                    PCPcomboBox1.addItem(NewPcp);
                    String LabelText = NewPatient + " " + NewPcp;
                    PatientKoppeling.setText(LabelText);
                } else if(!NewPatient.isEmpty()){
                    String ComboText = PCPcomboBox1.getSelectedItem().toString();
                    String LabelText = NewPatient + " " + ComboText;
                    PatientKoppeling.setText(LabelText);
                }
                else {
                    String Wrong = "je moet patientgegevens invullen";
                    PatientKoppeling.setText(Wrong);
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Patient_Koppelen");
        frame.setContentPane((new patientKoppeling().MainView));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
