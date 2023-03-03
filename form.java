import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JPanel panel;

    public form() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        textField1 = new JTextField();
        textField1.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField1.getPreferredSize().height));
        textField2 = new JTextField();
        textField2.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField2.getPreferredSize().height));
        textField2.setEditable(false);

        button1 = new JButton("Перевернуть");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField1.getText();
                int midIndex = inputText.length() / 2;
                String rightText = inputText.substring(midIndex);
                String outputText = "";
                for (int i = 0; i < rightText.length(); i += 3) {
                    if (i + 2 < rightText.length()) {
                        outputText += rightText.substring(i, i+2);
                    } else {
                        outputText += rightText.substring(i);
                    }
                }
                textField2.setText(outputText);
            }
        });
        panel.add(textField1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(textField2);
    }
    public void showForm() {
        setSize(330, 150);
        add(panel);
        setVisible(true);
    }
}


