/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import javax.annotation.Resource;

/**
 *
 * @author Jefe de Sistemas
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Resource recurso = new ClassPathResource("springconfig.xml");
      BeanFactory factory = new XmlBeanFactory(recurso);
 
      Estudiante estudiante = (Estudiante)factory.getBean("estudiante");
       
      estudiante.mostrarEstudianteActual();
    }
    
}
