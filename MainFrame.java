import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel panel;
    private JButton manageToursButton;
    private JButton manageBookingsButton;

    public MainFrame() {
        setTitle("Tourism Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        manageToursButton = new JButton("Manage Tours");
        manageBookingsButton = new JButton("Manage Bookings");

        manageToursButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManageToursFrame();
            }
        });

        manageBookingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManageBookingsFrame();
            }
        });

        panel.add(manageToursButton);
        panel.add(manageBookingsButton);

        add(panel);
        setVisible(true);
    }
}
