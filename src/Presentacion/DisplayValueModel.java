/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author SISTEMAS5
 */
public class DisplayValueModel {

    /**
     * @return the displayMember
     */
    public Object getDisplayMember() {
        return displayMember.toString();
    }

    /**
     * @return the valueMember
     */
    public Object getValueMember() {
        return valueMember;
    }
     private Object displayMember;
    private Object valueMember;
    
     
    public DisplayValueModel(Object display,Object value)
    {
        displayMember=display;
        valueMember=value;
    }
    
    @Override
    public String toString()
    {
        return getDisplayMember().toString();
    }
}
