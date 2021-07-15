
package convalidazione;

import java.awt.Color;

public class MessageError {
    
    
    public void showMessage(boolean close, boolean open, String color, String message, javax.swing.JLabel erroMessage,javax.swing.JPanel jMessage, javax.swing.JButton btnCloseColor){
            
            if(color.equals("success")){
                 jMessage.setVisible(close);
                 erroMessage.setText(message);
                 jMessage.setBackground(new Color(46,204,113));
                 btnCloseColor.setBackground(new Color(46,204,113));
                 jMessage.setVisible(open);
            }else if(color.equals("warning")){
                 jMessage.setVisible(close);
                 erroMessage.setText(message);
                 jMessage.setBackground(new Color(231,76,60));
                 btnCloseColor.setBackground(new Color(231,76,60));
                 jMessage.setVisible(open);
            }
    
    }
    
    public void closeFiestraMessage(javax.swing.JPanel jMessage){
        jMessage.setVisible(false);
    }
    
}
