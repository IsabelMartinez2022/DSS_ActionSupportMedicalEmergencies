/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author isama
 */
public class MedicalEmergency {
    private String conscious;
    private String dizzy;
    private String breathing;
    private String bleeding;
    private String emit_words; 
    private String chest_pain; 
    private String cough;
    private String seizure;
    private String possible_poisoning;
    private String electric_shock; 
    private String major_trauma;
    private String car_accident;
    private String vomit;
    private String difficulty_breathing;
    //para los test
    private boolean turnOffPowerSourcePrinted;
    private boolean doNotCoverBurntsPrinted;
    private boolean call112Printed;
    private boolean startCPRPrinted;
    private boolean useAEDPrinted;
    
    public MedicalEmergency(String conscious, String dizzy, String breathing, String bleeding, String emit_words, String chest_pain, String cough, String seizure, String possible_poisoning, String electric_shock, String major_trauma, String car_accident, String vomit, String difficulty_breathing) {
        this.conscious = conscious;
        this.dizzy = dizzy;
        this.breathing = breathing;
        this.bleeding = bleeding;
        this.emit_words = emit_words;
        this.chest_pain = chest_pain;
        this.cough = cough;
        this.seizure = seizure;
        this.possible_poisoning = possible_poisoning;
        this.electric_shock = electric_shock;
        this.major_trauma = major_trauma;
        this.car_accident = car_accident;
        this.vomit = vomit;
        this.difficulty_breathing = difficulty_breathing;
    }

    public String getConscious() {
        return conscious;
    }

    public String getDizzy() {
        return dizzy;
    }

    public String getBreathing() {
        return breathing;
    }

    public String getBleeding() {
        return bleeding;
    }

    public String getEmit_words() {
        return emit_words;
    }

    public String getChest_pain() {
        return chest_pain;
    }

    public String getCough() {
        return cough;
    }

    public String getSeizure() {
        return seizure;
    }

    public String getPossible_poisoning() {
        return possible_poisoning;
    }

    public String getElectric_shock() {
        return electric_shock;
    }

    public String getMajor_trauma() {
        return major_trauma;
    }

    public String getCar_accident() {
        return car_accident;
    }

    public String getVomit() {
        return vomit;
    }

    public String getDifficulty_breathing() {
        return difficulty_breathing;
    }

    public void setConscious(String conscious) {
        this.conscious = conscious;
    }

    public void setDizzy(String dizzy) {
        this.dizzy = dizzy;
    }

    public void setBreathing(String breathing) {
        this.breathing = breathing;
    }

    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    public void setEmit_words(String emit_words) {
        this.emit_words = emit_words;
    }

    public void setChest_pain(String chest_pain) {
        this.chest_pain = chest_pain;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public void setSeizure(String seizure) {
        this.seizure = seizure;
    }

    public void setPossible_poisoning(String possible_poisoning) {
        this.possible_poisoning = possible_poisoning;
    }

    public void setElectric_shock(String electric_shock) {
        this.electric_shock = electric_shock;
    }

    public void setMajor_trauma(String major_trauma) {
        this.major_trauma = major_trauma;
    }

    public void setCar_accident(String car_accident) {
        this.car_accident = car_accident;
    }

    public void setVomit(String vomit) {
        this.vomit = vomit;
    }

    public void setDifficulty_breathing(String difficulty_breathing) {
        this.difficulty_breathing = difficulty_breathing;
    }
    
    //para los test
    public boolean isTurnOffPowerSourcePrinted() {
        return turnOffPowerSourcePrinted;
    }

    public void setTurnOffPowerSourcePrinted(boolean turnOffPowerSourcePrinted) {
        this.turnOffPowerSourcePrinted = turnOffPowerSourcePrinted;
    }

    public boolean isDoNotCoverBurntsPrinted() {
        return doNotCoverBurntsPrinted;
    }

    public void setDoNotCoverBurntsPrinted(boolean doNotCoverBurntsPrinted) {
        this.doNotCoverBurntsPrinted = doNotCoverBurntsPrinted;
    }

    public boolean isCall112Printed() {
        return call112Printed;
    }

    public void setCall112Printed(boolean call112Printed) {
        this.call112Printed = call112Printed;
    }

    public boolean isStartCPRPrinted() {
        return startCPRPrinted;
    }

    public void setStartCPRPrinted(boolean startCPRPrinted) {
        this.startCPRPrinted = startCPRPrinted;
    }

    public boolean isUseAEDPrinted() {
        return useAEDPrinted;
    }

    public void setUseAEDPrinted(boolean useAEDPrinted) {
        this.useAEDPrinted = useAEDPrinted;
    }
    
    @Override
    public String toString() {
        return "MedicalEmergency [conscious=" + conscious + ", dizzy=" + dizzy + ", breathing=" + breathing
		+ ", bleeding=" + bleeding + ", emit_words=" + emit_words + ", chest_pain=" + chest_pain + ", cough="
		+ cough + ", seizure=" + seizure + ", possible_poisoning=" + possible_poisoning + ", electric_shock="
		+ electric_shock + ", major_trauma=" + major_trauma + ", car_accident=" + car_accident + ", vomit="
		+ vomit + ", difficulty_breathing=" + difficulty_breathing + "]";
    }
/*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id_operation;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operation other = (Operation) obj;
        if (this.id_operation != other.id_operation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Operation{" + "id_operation=" + id_operation + ", verified=" + verified + ", date_expired=" + date_expired + ", pin=" 
                + pin + ", tries=" + tries + ", balance=" + balance + ", price=" + price + ", limit=" + limit + ", authorized=" + authorized + '}';
    }
    
*/
}
