import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game(){
        frame = new JFrame("New KeyBinding Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1024,1024);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.black);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
        label.getActionMap().put("upAction",upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY()-10);
        }

    }public class DownAction extends AbstractAction{

        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY()+10);
        }

    }public class LeftAction extends AbstractAction{

        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()-10, label.getY());
        }

    }public class RightAction extends AbstractAction{

        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()+10, label.getY());
        }

    }
}
