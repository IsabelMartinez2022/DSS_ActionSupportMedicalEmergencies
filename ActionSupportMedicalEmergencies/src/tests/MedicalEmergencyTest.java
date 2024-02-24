/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import objects.Person;
import org.junit.Test; //para usar JUnit hay que añadir la libreria a mano
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author marty
 */
public class MedicalEmergencyTest {
 
    //con métodos booleanos
    @Test
    public void testEmergencyResponse1Rule() {
        KieSession kSession = getKieSession();

        Person emergency = new Person("no", null, "no", "no", null, null, null, null, null, null, "no", "no", null, null);
        kSession.insert(emergency);
        kSession.fireAllRules();

        assertTrue(emergency.isCall112Printed()); 
        assertTrue(emergency.isStartCPRPrinted());
        assertTrue(emergency.isUseAEDPrinted());

        kSession.dispose();
    }

    @Test
    public void testEmergencyResponse2Rule() {
        KieSession kSession = getKieSession();

        Person emergency = new Person("no", null, "no", "no", null, null, null, null, null, "yes", "no", "no", null, null);
        kSession.insert(emergency);
        kSession.fireAllRules();

        assertTrue(emergency.isTurnOffPowerSourcePrinted());
        assertTrue(emergency.isDoNotCoverBurntsPrinted());
        assertTrue(emergency.isCall112Printed());
        assertTrue(emergency.isStartCPRPrinted());
        assertTrue(emergency.isUseAEDPrinted());

        kSession.dispose();
    }

    private KieSession getKieSession() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        return kContainer.newKieSession("ksession-rules");
    }
    
/*para versiones de Drools anteriores a Drools 6
    @Test
    public void medicalEmergency1Test() {
        KnowledgeBase base = createBase();
        StatefulKnowledgeSession session = base.newStatefulKnowledgeSession();
        MedicalEmergency medicalEmergency = new MedicalEmergency();
        medicalEmergency.setConscious("no");
        medicalEmergency.setBreathing("no");
        medicalEmergency.setBleeding("no");
        medicalEmergency.setElectric_shock("no");
        medicalEmergency.setMajor_trauma("no");
        medicalEmergency.setCar_accident("no");
        session.insert(medicalEmergency);
        session.fireAllRules(); //activa todas las reglas y te coge la que encuentra que es exacta a los datos metidos en el objeto "MedicalEmergency"
        session.dispose();
    }
    
    
    private KnowledgeBase createBase(){ //se supone que esto solo se debe hacer una vez y hay otras formas
        KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();//collection que va cargando los recursos y va compilando para luego meterlos en la base de conocimiento
        builder.add(new ClassPathResource("rules.drl"), ResourceType.DRL); //le especificamos la ruta (path) y le decimos de que tipo es (.DRL)
        
        if(builder.hasErrors()){ //si ha fallado, recorre lista de errores y nos dice en qué ha fallado
            for (KnowledgeBuilderError error : builder.getErrors()) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("No se logró compilar la base de conocimiento");
        }
        
        KnowledgeBase base = KnowledgeBaseFactory.newKnowledgeBase(); //instancio esta base
        base.addKnowledgePackages(builder.getKnowledgePackages());//añade paquetes que KnowledgeBuilder compiló anteriormente
        
        return base;
    }
*/
}
