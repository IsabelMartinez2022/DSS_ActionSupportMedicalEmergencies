/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import objects.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

//@RunWith(JUnitPlatform.class)
public class MainTest {

    @Test
    public void testEmergencyResponse1() {
        Person person = new Person("no", "unknown", "no", "no", "unknown", "unknown", "unknown", "unknown", "unknown", "no", "no", "no", "unknown", "unknown");

        executeRulesAndAssertProtocol(person, "Call 112, start CPR and AED");
    }
    
    @Test
    public void testEmergencyResponse2() {
        // TO  DO para response 2
        //Person person = new Person("no", "no", "no", "yes", "no", "no", "no", "no", "no", "yes", "no", "no", "no", "no");

        //executeRulesAndAssertProtocol(person, "Turn off power source, do not cover the burns, call 112, start CPR, use AED");
    }

    /**
    * La función executeRulesAndAssertProtocol es un método de ayuda en Java utilizado
    * para ejecutar reglas de Drools y verificar el protocolo resultante en pruebas unitarias.
    * Toma una instancia de la clase Person con síntomas específicos y el protocolo esperado como parámetros. 
    * El método crea una sesión de reglas(ksession), para esta sesión necesita el contenedor que a su vez
    * necesita el servicio si lo ves esta en orden. Finalmente con asserEquals se comprueba lo esperado frente a lo
    * que tenemos
    *
    * @param person          Instancia de la clase Person con síntomas específicos.
    * @param expectedProtocol Protocolo esperado que se compara con el protocolo resultante.
    */
    private void executeRulesAndAssertProtocol(Person person, String expectedProtocol) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("rulesSession");

        ksession.insert(person);
        ksession.fireAllRules();

        assertEquals(expectedProtocol, person.getProtocol());
        ksession.dispose();
    }

    //con métodos booleanos
    /*@Test
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
    }*/
    
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
