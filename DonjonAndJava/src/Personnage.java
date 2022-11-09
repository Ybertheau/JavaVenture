
public class Personnage {
	public Personnage() {
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
	private int stats[];
	
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

	//ajout de classe abstract
	public Race race;
	public Classe classe;
}
