/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.snake2023;

/**
 *
 * @author victor
 */
public class ScoreBoard extends javax.swing.JPanel implements ScoreInterface {
    
    private int score;

    /**
     * Creates new form ScoreBoard
     */
    public ScoreBoard() {
        initComponents();
        score = 0;
    }
    
    @Override
    public void reset() {
        score = 0;
        updateLabel();
    }

    @Override
    public void increment(int increment) {
        score += increment;
        updateLabel();
    }

    @Override
    public int getScore() {
        return score;
    }
    
    public void updateLabel() {
       scoreLabel.setText("" + score);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("0");
        add(scoreLabel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables

    
}
