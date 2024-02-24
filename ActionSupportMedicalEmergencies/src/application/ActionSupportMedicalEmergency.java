/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import objects.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author maria
 */
public class ActionSupportMedicalEmergency {
     public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        execute(kc);
    }

    public static void execute(KieContainer kc) {
        KieSession ksession = kc.newKieSession("MedicalEmergencyKS");
        Person me1 = new Person("no", "unknown", "no", "no", "unknown", "unknown", "unknown", "unknown", "unknown", "no", "no", "no", "unknown", "unknown");
        ksession.fireAllRules();
        ksession.dispose();
    }
}
