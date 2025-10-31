package br.com.dio.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {
    public ResetButton(final ActionListener listener){
        this.setText("Reiniciar jogo");
        this.addActionListener(listener);
    }
}
