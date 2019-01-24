public enum SWCardType{
	
	ADMIRALS_ORDER("Admiral's Order", "AdmO"),
	CREATURE("Creature", "Creat"),
	DEF_SHIELD("Defensive Shield", ""),
	DEVICE("Device", "Dev"),
	EPIC_EVENT("Epic Event", "EpEv"),
	JEDI_TEST("Jedi Test", "JedT"),
	OBJECTIVE("Objective", "Obj"),
	POD_RACER("Podracer", "Podr"),

	CHAR_ALIEN("Alien", "Char"),
	CHAR_DARTH_MAUL("Darth Maul", "Char"),
	CHAR_DROID("Droid", "Char"),
	CHAR_IMPERIAL("Imperial", "Char"),
	CHAR_JEDI_MASTER("Jedi Master", "Char"),
	CHAR_REBEL("Rebel", "Char"),
	CHAR_REPUBLIC("Republic", "Char"),

	EFF_IMMEDIATE("Immediate Effect", "Eff"),
	EFF_MOBILE("Mobile Effect", "Eff"),
	EFF_POLITICAL("Political Effect", "Eff"),
	EFF_STARTING("Starting Effect", "Eff"),
	EFF_UTINNI("Utinni Effect", "Eff"),
	EFFECT("Effect", "Eff"),

	INT_LOST("Lost Interrupt", "Inter"),
	INT_LOST_USED("Lost/Used Interrupt", "Inter"),
	INT_START_LOST("Starting/Lost Interrupt", "Inter"),
	INT_START_USED("Starting/Used Interrupt", "Inter"),
	INT_USED("Used Interrupt", "Inter"),

	LOC_SECTOR("Location: Sector", "Loc"),
	LOC_SITE("Location: Site", "Loc"),
	LOC_SYSTEM("Location: System", "Loc"),

	STSHIP_CAPITAL("Capital Starship", "StSh"),
	STSHIP_SQUADRON("Starfighter Squadron", "StSh"),
	STSHIP_STARFIGHTER("Starfighter", "StSh"),

	VEH_COMBAT("Combat Vehicle", "Veh"),
	VEH_CREATURE("Creature Vehicle", "Veh"),
	VEH_SHUTTLE("Shuttle Vehicle", "Veh"),
	VEH_TRANSPORT("Transport Vehicle", "Veh"),

	WEAP_ARTILLARY("Artillary Weapon", "Weap"),
	WEAP_AUTOMATED("Automated Weapon", "Weap"),
	WEAP_CHARACTER("Character Weapon", "Weap"),
	WEAP_DEATHSTAR("Death Star Weapon", "Weap"),
	WEAP_STARSHIP("Starship Weapon", "Weap"),
	WEAP_VEHICLE("Vehicle Weapon", "Weap");

	private String typeString;
	private String filePrefix;

	private SWCardType(String typeString, String filePrefix){
		this.typeString = typeString;
		this.filePrefix = filePrefix;
	}

	public String getFilePrefix(){
		return this.filePrefix;
	}

	@Override
	public String toString(){
		return this.typeString;
	}

}



