package bones;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public interface ISource { //kaynaklari belirten interface

    boolean labelSource(JLabel label);

    boolean buttonSource(JButton button);

    boolean textSource(JTextField textField);
}
