/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DESAFIO1;

/**
 *
 * @author domin
 */
public class Prato {

    private String prato_caract;
    private String prato_desc;

    public Prato(String prato_desc,String prato_caract) {
        this.prato_caract = prato_caract;
        this.prato_desc = prato_desc;
    }

    public void setPrato_caract(String prato_caract) {
        this.prato_caract = prato_caract;
    }

    public void setPrato_desc(String prato_desc) {
        this.prato_desc = prato_desc;
    }

    public String getPrato_caract() {
        return prato_caract;
    }

    public String getPrato_desc() {
        return prato_desc;
    }
    

}
