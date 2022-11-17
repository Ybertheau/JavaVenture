package personnage;
import classe.Classe;
import race.Race;

public class Personnage {
	//un personnage à une classe et une race pour jouer
	public Personnage(Race r,Classe c) {
		this.classe=c;
		this.race=r;
		this.stats=calStats(race);	
	}
	private String name;
	private boolean sexe;
	private int pointDeVie;
	private int force;
	private int dexterite;
	private int constitution;
	private int intelligence;
	private int sagesse;
	private int charisme;
	private int experience;
	private int[] stats;
	//getter setter
	public void setClasse (Classe c) {
		classe=c;
	}
	public void setRace(Race r) {
		race=r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSexe() {
		return sexe;
	}
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getDexterite() {
		return dexterite;
	}
	public void setDexterite(int dexterite) {
		this.dexterite = dexterite;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getSagesse() {
		return sagesse;
	}
	public void setSagesse(int sagesse) {
		this.sagesse = sagesse;
	}
	public int getCharisme() {
		return charisme;
	}
	public void setCharisme(int charisme) {
		this.charisme = charisme;
	}
	public int getPointDeVie() {
		return pointDeVie;
	}
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	private int[] calStats(Race r) {
		int f=this.force+ r.getBonusFor();
		int d=this.dexterite+ r.getBonusDex();
		int co=this.constitution+r.getBonusCon();
		int intel =this.intelligence+r.getBonusInt(); 
		int s=this.sagesse+r.getBonusSag();
		int cha=this.charisme+r.getBonusCha();
		int[] sta={f,d,co,intel,s,cha};	
		return sta;
	}
	//ajout de classe abstract
	public Race race;
	public Classe classe;
}
