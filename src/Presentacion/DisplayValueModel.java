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
    private Object displayMember;
    private Object valueMember;
    private Object valueMember2;
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
    /**
     * @return the valueMember2
     */
    public Object getValueMember2() {
        return valueMember2;
    }
     
    public DisplayValueModel(Object display,Object value)
    {
        displayMember=display;
        valueMember=value;
    }
    public DisplayValueModel(Object display,Object value,Object value2)
    {
        displayMember=display;
        valueMember=value;
        valueMember2=value2;
    }
    
    @Override
    public String toString()
    {
        return getDisplayMember().toString();
    }
}
