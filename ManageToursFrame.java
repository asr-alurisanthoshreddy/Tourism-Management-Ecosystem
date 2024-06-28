import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageToursFrame extends JFrame {
    private JPanel panel;
    private JTextField tourNameField;
    private JTextField tourLocationField;
    private JButton addTourButton;
    private JTextArea tourListArea;

    public ManageToursFrame() {
        setTitle("Manage Tours");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        tourNameField = new JTextField("Tour Name");
        tourLocationField = new JTextField("Tour Location");
        addTourButton = new JButton("Add Tour");
        tourListArea = new JTextArea();

        addTourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tourName = tourNameField.getText();
                String tourLocation = tourLocationField.getText();
                tourListArea.append("Tour: " + tourName + " at " + tourLocation + "\n");
            }
        });

        panel.add(tourNameField);
        panel.add(tourLocationField);
        panel.add(addTourButton);
        panel.add(new JScrollPane(tourListArea));

        add(panel);
        setVisible(true);
    }
}
