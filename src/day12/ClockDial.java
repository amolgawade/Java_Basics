import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ClockDial extends JPanel {

    private static final int CLOCK_RADIUS = 200;
    private static final int CENTER_X = CLOCK_RADIUS;
    private static final int CENTER_Y = CLOCK_RADIUS;
    private static final int HOUR_TICK_LENGTH = 20;
    private static final int MINUTE_TICK_LENGTH = 10;
    private static final int HOUR_HAND_LENGTH = 80;
    private static final int MINUTE_HAND_LENGTH = 120;
    private static final int SECOND_HAND_LENGTH = 140;
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    private ZoneId timeZone;
    private Timer timer;

    public ClockDial(ZoneId timeZone) {
        this.timeZone = timeZone;
        setPreferredSize(new Dimension(CLOCK_RADIUS * 2, CLOCK_RADIUS * 2));
        setBackground(Color.WHITE);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(0, 0, CLOCK_RADIUS * 2, CLOCK_RADIUS * 2);
        ZonedDateTime currentTime = ZonedDateTime.now(timeZone);
        drawTicks(g2d);
        drawHands(g2d, currentTime);
        drawCenter(g2d);
        drawTime(g2d, currentTime);
        g2d.dispose();
    }

    private void drawTicks(Graphics2D g2d) {
        for (int i = 0; i < 12; i++) {
            double hourAngle = Math.PI * 2 * i / 12;
            int x1 = (int) (CENTER_X + (CLOCK_RADIUS - HOUR_TICK_LENGTH) * Math.sin(hourAngle));
            int y1 = (int) (CENTER_Y - (CLOCK_RADIUS - HOUR_TICK_LENGTH) * Math.cos(hourAngle));
            int x2 = (int) (CENTER_X + CLOCK_RADIUS * Math.sin(hourAngle));
            int y2 = (int) (CENTER_Y - CLOCK_RADIUS * Math.cos(hourAngle));
            g2d.drawLine(x1, y1, x2, y2);
        }
        for (int i = 0; i < 60; i++)
            if (i % 5 != 0) {
                double minuteAngle = Math.PI * 2 * i / 60;
                int x1 = (int) (CENTER_X + (CLOCK_RADIUS - MINUTE_TICK_LENGTH) * Math.sin(minuteAngle));
                int y1 = (int) (CENTER_Y - (CLOCK_RADIUS - MINUTE_TICK_LENGTH) * Math.cos(minuteAngle));
                int x2 = (int) (CENTER_X + CLOCK_RADIUS * Math.sin(minuteAngle));
                int y2 = (int) (CENTER_Y - CLOCK_RADIUS * Math.cos(minuteAngle));
                g2d.drawLine(x1, y1, x2, y2);
            }
    }


    private void drawHands(Graphics2D g2d, ZonedDateTime time) {
        double hourAngle = Math.PI * 2 * ((time.getHour() % 12) + time.getMinute() / 60.0) / 12;
        int hourX = (int) (CENTER_X + HOUR_HAND_LENGTH * Math.sin(hourAngle));
        int hourY = (int) (CENTER_Y - HOUR_HAND_LENGTH * Math.cos(hourAngle));
        g2d.drawLine(CENTER_X, CENTER_Y, hourX, hourY);

        double minuteAngle = Math.PI * 2 * (time.getMinute() + time.getSecond() / 60.0) / 60;
        int minuteX = (int) (CENTER_X + MINUTE_HAND_LENGTH * Math.sin(minuteAngle));
        int minuteY = (int) (CENTER_Y - MINUTE_HAND_LENGTH * Math.cos(minuteAngle));
        g2d.drawLine(CENTER_X, CENTER_Y, minuteX, minuteY);

        double secondAngle = Math.PI * 2 * (time.getSecond() + time.getNano() / 1e9) / 60;
        int secondX = (int) (CENTER_X + SECOND_HAND_LENGTH * Math.sin(secondAngle));
        int secondY = (int) (CENTER_Y - SECOND_HAND_LENGTH * Math.cos(secondAngle));
        g2d.setColor(Color.RED);
        g2d.drawLine(CENTER_X, CENTER_Y, secondX, secondY);
        g2d.setColor(Color.BLACK);
    }

    private void drawCenter(Graphics2D g2d) {
        g2d.fillOval(CENTER_X - 5, CENTER_Y - 5, 10, 10);
    }

    private void drawTime(Graphics2D g2d, ZonedDateTime time) {
        String formattedTime = time.format(TIME_FORMAT);
        int stringWidth = g2d.getFontMetrics().stringWidth(formattedTime);
        g2d.drawString(formattedTime, CENTER_X - stringWidth / 2, CENTER_Y + CLOCK_RADIUS / 2);
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock Dial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockDial clockDial = new ClockDial(ZoneId.systemDefault());
        frame.add(clockDial);
        frame.pack();
        frame.setVisible(true);
    }
}
