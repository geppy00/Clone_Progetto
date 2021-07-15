/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convalidazione;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;

/**
 *
 * @author 39347
 */
public class PermessoPerScrivere  extends PlainDocument{
  
  @Override
  public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
      super.insertString(offset, str.replaceAll("[^0-9|^.]", ""), attr);
  
  }
}
