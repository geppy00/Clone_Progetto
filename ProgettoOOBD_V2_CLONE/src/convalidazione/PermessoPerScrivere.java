
package convalidazione;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;

public class PermessoPerScrivere extends PlainDocument{
  
  @Override
  public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
      super.insertString(offset, str.replaceAll("[^0-9|^.]", ""), attr);
  
  }
}
