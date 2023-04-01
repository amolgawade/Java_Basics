package day12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class WorldClock extends JFrame {
    private ClockDial[] dials;

    public WorldClock() {
        super("World Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an array of ClockDial objects for each time zone
        dials = new ClockDial[3];
        dials[0] = new ClockDial();
        dials[0].setTimeZone(ZoneId.of("America/New_York"));
        dials[1] = new ClockDial();
        dials[1].setTimeZone(ZoneId.of("Europe/London"));
        dials[2] = new ClockDial();
        dials[2].setTimeZone(ZoneId.of("Asia/Tokyo"));

        // Add the ClockDial objects to the frame
        JPanel dialPanel = new JPanel(new GridLayout(1, 3));
        for (ClockDial dial : dials) {
            dialPanel.add(dial);
        }
        add(dialPanel, BorderLayout.CENTER);

        // Create a combo box to select the time zone
        String[] zoneIds = ZoneId.getAvailableZoneIds().stream().sorted().toArray(String[]::new);
        JComboBox<String> zoneSelector = new JComboBox<>(zoneIds);
        zoneSelector.setSelectedItem(ZoneId.systemDefault().getId());
        zoneSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the time zone for all the ClockDial objects
                String selectedZoneId = (String) zoneSelector.getSelectedItem();
                ZoneId selectedZone = ZoneId.of(selectedZoneId);
                for (ClockDial dial : dials) {
                    dial.setTimeZone(selectedZone);
                }
            }
        });
        add(zoneSelector, BorderLayout.NORTH);

        // Pack the frame and center it on the screen
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WorldClock().setVisible(true));
    }

    private static class ClockDial extends JPanel {
        private ZonedDateTime time;
        private ZoneId timeZone;
        private Image dialImage;

        public ClockDial() {
            // Load the dial image
            dialImage = Toolkit.getDefaultToolkit().getImage("dial.png");

            // Start a timer to update the time every second
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    time = ZonedDateTime.now(timeZone);
                    repaint();
                }
            });
            timer.start();
        }

        public void setTimeZone(ZoneId timeZone) {
            this.timeZone = timeZone;
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(dialImage.getWidth(this), dialImage.getHeight(this));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw the dial image
            g.drawImage(dialImage, 0, 0, this);

            // Calculate the angles of the hour and minute hands
            int hour = time.getHour() % 12;
            int minute = time.getMinute();
            int second = time.getSecond();
            double hourAngle = (hour + minute / 60.0) * 30.0;
            double minuteAngle = minute * 6.0;
            double secondAngle = second * 6.0;

            // Draw the hour hand
            drawHand(g, hourAngle, 40, 5, Color.BLACK
            );

            // Draw the minute hand
            drawHand(g, minuteAngle, 60, 3, Color.BLACK);

            // Draw the second hand
            drawHand(g, secondAngle, 70, 1, Color.RED);

            // Draw the time in digital format
            String timeString = time.format(DateTimeFormatter.ofPattern("HH:mm:ss z"));
            g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            g.drawString(timeString, 10, getHeight() - 10);
        }

        private void drawHand(Graphics g, double angle, int length, int width, Color color) {
            // Calculate the endpoint of the hand
            double radians = Math.toRadians(angle - 90);
            int x = (int) (getWidth() / 2 + length * Math.cos(radians));
            int y = (int) (getHeight() / 2 + length * Math.sin(radians));

            // Draw the hand
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(width));
            g2d.setColor(color);
            g2d.drawLine(getWidth() / 2, getHeight() / 2, x, y);
        }
    }
}

