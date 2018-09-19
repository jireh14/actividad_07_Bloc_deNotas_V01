
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelNotas;
import views.ViewNotas;

public class ControllerNotas implements ActionListener{
   
    private final  ModelNotas modelNotas;
    private final  ViewNotas viewNotas;
    
    public ControllerNotas(ModelNotas modelNotas, ViewNotas viewNotas) {
        this.modelNotas = modelNotas;
        this.viewNotas = viewNotas;
        viewNotas.jMI_leer.addActionListener(this);
        viewNotas.jMI_guardar.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewNotas.jMI_leer){
            jMI_leer_action_performed();
    }
        if(e.getSource() == viewNotas.jMI_guardar){
            jMI_guardar_action_performed();
        }
    
}
    private void jMI_leer_action_performed(){
        modelNotas.setLeer("Leer Java");
        viewNotas.jTA_area.setText(modelNotas.getLeer());
    }
    private void jMI_guardar_action_performed(){
        modelNotas.setGuardar("Guardar Java");
        viewNotas.jTA_area.setText(modelNotas.getGuardar());
    }
    public final void initView(){
        viewNotas.setTitle("Hola java");
        viewNotas.setLocationRelativeTo(null);
        viewNotas.jTA_area.setText(modelNotas.getMenu());
        viewNotas.setVisible(true);
    }
}


    