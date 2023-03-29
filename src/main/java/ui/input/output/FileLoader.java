// 
// Decompiled by Procyon v0.5.36
// 

package ui.input.output;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileLoader extends JPanel
{
    private String textFieldLumberjackJSONLabel;
    private String buttonLabelLumberjackJSON;
    private JLabel labelLumberjackJSON;
    private JTextField textFieldLumberjackJSON;
    private JButton buttonLumberjackJSONBrowse;
    private JFileChooser fileChooserLumberjackJSON;
    private String textFieldSizingCalcLabel;
    private String buttonLabelSizingCalc;
    private JLabel labelSizingCalc;
    private JTextField textFieldSizingCalc;
    private JButton buttonSizingCalcBrowse;
    private JFileChooser fileChooserSizingCalc;
    private int mode;
    public static final int MODE_OPEN = 1;
    public static final int MODE_SAVE = 2;
    
    public FileLoader(final String textFieldLabel, final String buttonLabel) {
        this.LumberjackJSONFilePath(textFieldLabel, buttonLabel);
    }
    
    private void LumberjackJSONFilePath(final String textFieldLabel, final String buttonLabel) {
        if (textFieldLabel.equalsIgnoreCase("Lumberjack JSON File")) {
            this.lumberjackJSONFilePath(textFieldLabel, buttonLabel);
        }
        else if (textFieldLabel.equalsIgnoreCase("Sizing Calculator File")) {
            this.sizingCalcFilePath(textFieldLabel, buttonLabel);
        }
    }
    
    private void lumberjackJSONFilePath(final String textFieldLabel, final String buttonLabel) {
        this.textFieldLumberjackJSONLabel = textFieldLabel;
        this.buttonLabelLumberjackJSON = buttonLabel;
        this.fileChooserLumberjackJSON = new JFileChooser();
        this.setLayout(new FlowLayout(1, 5, 5));
        this.labelLumberjackJSON = new JLabel(textFieldLabel);
        this.textFieldLumberjackJSON = new JTextField(30);
        (this.buttonLumberjackJSONBrowse = new JButton(buttonLabel)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                FileLoader.this.buttonActionPerformedSAMBrowse(evt);
            }
        });
        this.add(this.labelLumberjackJSON);
        this.add(this.textFieldLumberjackJSON);
        this.add(this.buttonLumberjackJSONBrowse);
    }
    
    private void sizingCalcFilePath(final String textFieldLabel, final String buttonLabel) {
        this.textFieldSizingCalcLabel = textFieldLabel;
        this.buttonLabelSizingCalc = buttonLabel;
        this.fileChooserSizingCalc = new JFileChooser();
        this.setLayout(new FlowLayout(1, 5, 5));
        this.labelSizingCalc = new JLabel(textFieldLabel);
        this.textFieldSizingCalc = new JTextField(30);
        (this.buttonSizingCalcBrowse = new JButton(buttonLabel)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                FileLoader.this.buttonActionPerformedBSMBrowse(evt);
            }
        });
        this.add(this.labelSizingCalc);
        this.add(this.textFieldSizingCalc);
        this.add(this.buttonSizingCalcBrowse);
    }
    
    private void buttonActionPerformedSAMBrowse(final ActionEvent evt) {
        if (this.mode == 1) {
            if (this.fileChooserLumberjackJSON.showOpenDialog(this) == 0) {
                this.textFieldLumberjackJSON.setText(this.fileChooserLumberjackJSON.getSelectedFile().getAbsolutePath());
            }
        }
        else if (this.mode == 2 && this.fileChooserLumberjackJSON.showSaveDialog(this) == 0) {
            this.textFieldLumberjackJSON.setText(this.fileChooserLumberjackJSON.getSelectedFile().getAbsolutePath());
        }
    }
    
    private void buttonActionPerformedBSMBrowse(final ActionEvent evt) {
        if (this.mode == 1) {
            if (this.fileChooserSizingCalc.showOpenDialog(this) == 0) {
                this.textFieldSizingCalc.setText(this.fileChooserSizingCalc.getSelectedFile().getAbsolutePath());
            }
        }
        else if (this.mode == 2 && this.fileChooserSizingCalc.showSaveDialog(this) == 0) {
            this.textFieldSizingCalc.setText(this.fileChooserSizingCalc.getSelectedFile().getAbsolutePath());
        }
    }
    
    public void setMode(final int mode) {
        this.mode = mode;
    }
    
    public String getSelectedLumberjackJSONFilePath() {
        return this.textFieldLumberjackJSON.getText();
    }
    
    public String getSelectedSizingCalcFilePath() {
        return this.textFieldSizingCalc.getText();
    }
    
    public JFileChooser getFileSAMChooser() {
        return this.fileChooserLumberjackJSON;
    }
    
    public JFileChooser getFileBSMChooser() {
        return this.fileChooserSizingCalc;
    }
}
