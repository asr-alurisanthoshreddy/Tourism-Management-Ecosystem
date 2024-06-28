import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageBookingsFrame extends JFrame {
    private JPanel panel;
    private JTextField bookingNameField;
    private JTextField bookingTourField;
    private JButton addBookingButton;
    private JTextArea bookingListArea;

    public ManageBookingsFrame() {
        setTitle("Manage Bookings");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        bookingNameField = new JTextField("Booking Name");
        bookingTourField = new JTextField("Tour Name");
        addBookingButton = new JButton("Add Booking");
        bookingListArea = new JTextArea();

        addBookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookingName = bookingNameField.getText();
                String bookingTour = bookingTourField.getText();
                bookingListArea.append("Booking: " + bookingName + " for tour " + bookingTour + "\n");
            }
        });

        panel.add(bookingNameField);
        panel.add(bookingTourField);
        panel.add(addBookingButton);
        panel.add(new JScrollPane(bookingListArea));

        add(panel);
        setVisible(true);
    }
}
