/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "editorBean")
@RequestScoped
public class EditorBean {
    private String comentarios;
    
    public String getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    public String grabar(){
        System.out.println("grabando: " + comentarios);
    return "test";
    }
    
}
