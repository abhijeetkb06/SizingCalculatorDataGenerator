package ui.input.output;

import lumberjackjson.processor.LumberjackJSONProcessor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LaunchApplication extends JFrame
{
    private JButton button;
    private FileLoader lumberjackJSONFile;
    private FileLoader sizingCalcFile;
    
    public LaunchApplication() {
        super("Sizing Calculator JSON Generator");
        this.setLayout(new FlowLayout());
        try {
           /* UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");*/
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        catch (InstantiationException e2) {
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        catch (UnsupportedLookAndFeelException e4) {
            e4.printStackTrace();
        }
        (this.lumberjackJSONFile = new FileLoader("Lumberjack JSON File", "Browse...")).setMode(2);
        (this.sizingCalcFile = new FileLoader("Sizing Calculator File", "Browse...")).setMode(2);
        this.add(this.lumberjackJSONFile);
        this.add(this.sizingCalcFile);
        (this.button = new JButton("Generate")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                LaunchApplication.this.buttonActionPerformedToGenerate(evt);
            }
        });
        this.add(this.button);
        this.setDefaultCloseOperation(3);
//        this.setSize(520, 150);

        this.setSize(600, 200);
//        this.setSize(650, 225);
        this.setLocationRelativeTo(null);
    }
    
    protected void buttonActionPerformedToGenerate(final ActionEvent evt) {
        if (this.lumberjackJSONFile.getSelectedLumberjackJSONFilePath().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Lumberjack JSON File Selected!");
            return;
        }
        if (this.sizingCalcFile.getSelectedSizingCalcFilePath().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Output Directory Set For Sizing Calculator JSON");
            return;
        }
        //TODO:
        LumberjackJSONProcessor lumberjackJSONProcessor = new LumberjackJSONProcessor();
        try {
            lumberjackJSONProcessor.processLumberjackJSON(this.lumberjackJSONFile.getSelectedLumberjackJSONFilePath(),this.sizingCalcFile.getSelectedSizingCalcFilePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        BSMSecurityMatrixWriter.populateBSM(this.lumberjackJSONFile.getSelectedSAMFilePath(), this.sizingCalcFile.getSelectedBSMFilePath());
        JOptionPane.showMessageDialog(null, "Sizing Calculator JSON file generated");
    }
    
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LaunchApplication().setVisible(true);
            }
        });
    }
}
