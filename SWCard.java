public class SWCard extends Product{

    // enum SWSet {
    //     PREMIERE, A_NEW_HOPE, HOTH, DAGOBAH, CLOUD_CITY, JABBAS_PALACE, 
    //     SPECIAL_EDITION, ENDOR, DEATH_STAR_II, TATOOINE, CORUSCANT, THEED_PALACE,
    //     REFLECTIONS_II, REFLECTIONS_III, PREMIUM, STARTER_BOX, THIRD_ANTHOLOGY;
    // }

    enum SWSide {
        LIGHT, DARK;
    }


    //private String[] cardData;
    //private String name; //all
    private SWSide side; //all
    private SWCardType type; //all
    // private String subType; //all
    private String destiny; //all
    private String power; //Character, Creature, Vehicle, Spaceship
    private String ability; //creature vehicles, manned starships/vehicles, characters
    private String deploy; //characters, vehicles, starships, creatures
    private String forfeit; //character, creatures, vehicle, spaceship
    // to do
    private String politics; //character
    private int maneuver; //vehicle, spaceship, character
    private String armor; //vehicle, spaceship, character, creature
    private int hyperspeed; //starship, death star
    private String landspeed; //character, vehicle
    private int lightForce; //location, character
    private int darkForce; //location, character
    private String parsec; //system, death star
    
    private SWSet set; //all
    private SWRarity rarity; //all
    private String gameText; //all
    // to do
    private boolean episodeI; //all
    private boolean astromech; //droid, brainiac, spaceship w/ droid
    private boolean pilot; //character, vehicle/spaceship w/ pilot
    private boolean warrior; //character
    private boolean permWeapon; //character
    private boolean droidPresence; //character, vehicle, starship
    private boolean independent; //spaceship
    private boolean republic; //character
    private boolean tradeFed; //character
    private boolean bountyHunter; //character

    private String preciseRarity;
    


    public SWCard(String[] cardData){

        // define necessary values for superclass
        super(0.0f, ProductType.CARD);
        super.setName(cardData[2]);

        if (cardData[3].equals("D")) {
            this.side = SWSide.DARK;}
        else this.side = SWSide.LIGHT;
        //this.type = cardData[4];

        // if (cardData[5].equals("Driod")){
        //     this.subType = "Droid";
        // }
        // else this.subType = cardData[5];

        this.type = determineType(cardData[4], cardData[5]);

        this.destiny = cardData[6];
        this.power = cardData[7];
        this.ability = cardData[8];
        this.deploy = cardData[9];
        this.forfeit = cardData[10];

                String cardSet = cardData[19];

        if      (cardSet.equals("00-Premiere"))     this.set = SWSet.PREMIERE;
        else if (cardSet.equals("01-NewHope"))      this.set = SWSet.A_NEW_HOPE;
        else if (cardSet.equals("02-Hoth"))         this.set = SWSet.HOTH;
        else if (cardSet.equals("03-Dagobah"))      this.set = SWSet.DAGOBAH;
        else if (cardSet.equals("04-CloudCity"))    this.set = SWSet.CLOUD_CITY;
        else if (cardSet.equals("05-JabbaPal"))     this.set = SWSet.JABBAS_PALACE;
        else if (cardSet.equals("06-SpecEd"))       this.set = SWSet.SPECIAL_EDITION;
        else if (cardSet.equals("07-Endor"))        this.set = SWSet.ENDOR;
        else if (cardSet.equals("08-DStar2"))       this.set = SWSet.DEATH_STAR_II;
        else if (cardSet.equals("09-Tatooine"))     this.set = SWSet.TATOOINE;
        else if (cardSet.equals("10-Coruscant"))    this.set = SWSet.CORUSCANT;
        else if (cardSet.equals("11-Theed"))        this.set = SWSet.THEED_PALACE;
        else if (cardSet.equals("EnCloudCity"))     this.set = SWSet.ENHANCEDCC;
        else if (cardSet.equals("EnJabbaPal"))      this.set = SWSet.ENHANCEDJP;
        else if (cardSet.equals("EnPremiere"))      this.set = SWSet.ENHANCEDPREM;
        else if (cardSet.equals("Jedi Pack"))       this.set = SWSet.JEDI_PACK;
        else if (cardSet.equals("Promo"))           this.set = SWSet.PROMO;
        else if (cardSet.equals("Ref1"))            this.set = SWSet.REFLECTIONS_I;
        else if (cardSet.equals("Ref2"))            this.set = SWSet.REFLECTIONS_II;
        else if (cardSet.equals("Ref3"))            this.set = SWSet.REFLECTIONS_III;
        else if (cardSet.equals("SealJabPal"))      this.set = SWSet.SEALEDJP;
        else if (cardSet.equals("SealPrem"))        this.set = SWSet.SEALEDPREM;
        else if (cardSet.equals("Starter1"))        this.set = SWSet.STARTER_BOX_1;
        else if (cardSet.equals("Starter2"))        this.set = SWSet.STARTER_BOX_2;
        else if (cardSet.equals("ThirdAnth"))       this.set = SWSet.THIRD_ANTHOLOGY;

        //this.set = cardData[19]; //all

        if      (cardData[20].equals("R"))  this.rarity = SWRarity.R;
        else if (cardData[20].equals("UR")) this.rarity = SWRarity.UR;
        else if (cardData[20].equals("U"))  this.rarity = SWRarity.U;
        else if (cardData[20].equals("C"))  this.rarity = SWRarity.C;
        else if (cardData[20].equals("F"))  this.rarity = SWRarity.F;
        else if (cardData[20].equals("F1")) this.rarity = SWRarity.F1;
        else if (cardData[20].equals("F2")) this.rarity = SWRarity.F2;
        else if (cardData[20].equals("XR")) this.rarity = SWRarity.F;
        
        else if (cardData[20].equals("C1")) this.rarity = SWRarity.C1;
        else if (cardData[20].equals("C2")) this.rarity = SWRarity.C2;
        else if (cardData[20].equals("C3")) this.rarity = SWRarity.C3;
        else if (cardData[20].equals("U1")) this.rarity = SWRarity.U1;
        else if (cardData[20].equals("U2")) this.rarity = SWRarity.U2;
        else if (cardData[20].equals("R1")) this.rarity = SWRarity.R1;
        else if (cardData[20].equals("R2")) this.rarity = SWRarity.R2;
        else if (cardData[20].equals("R3")) this.rarity = SWRarity.R3;
        else if (cardData[20].equals("R4")) this.rarity = SWRarity.R4;

        else if (cardData[20].equals("VRF")) this.rarity = SWRarity.CF;
        else if (cardData[20].equals("CF"))  this.rarity = SWRarity.CF;
        else if (cardData[20].equals("SRF")) this.rarity = SWRarity.UF;
        else if (cardData[20].equals("UF"))  this.rarity = SWRarity.UF;
        else if (cardData[20].equals("URF")) this.rarity = SWRarity.RF;
        else if (cardData[20].equals("RF"))  this.rarity = SWRarity.RF;

        else System.out.println("XXXXXXXXXXXXXXXX" + cardData[20] + " doesn't isn't being categorized!");


        this.preciseRarity = cardData[20];

        //this.rarity = cardData[19]; //all
        this.gameText = cardData[21]; //all

        //determine filepath
        //C:\Users\Nathan\Documents\programming\SWCCG\data\Card\Light\Special_Edition
        String fileName = createFileName(super.getName());
        super.setImagePath(".\\data\\" + super.getProductType() + "\\" + this.side + "\\" + this.set + "\\" + fileName);
        

    }

    public SWSet getSet(){
    	return this.set;
    }

    public SWRarity getRarity(){
    	return this.rarity;
    }

    public String getCardName(){
    	return super.getName();
    }

    private String createFileName(String name){

        String thisFileName = "";

        for (int i = 0; i < name.length(); i++){
            if(Character.isLetter(name.charAt(i))){
                thisFileName += Character.toString(name.charAt(i));
            }
            if(Character.isDigit(name.charAt(i))){
                thisFileName += Character.toString(name.charAt(i));
            }
        }
        //System.out.println("The file prefix is: " + this.type.getFilePrefix());
        thisFileName = this.type.getFilePrefix() + "_" + thisFileName + ".gif";
        //System.out.println(thisFileName);
        return thisFileName;
    }

    private SWCardType determineType(String type, String subType){

        switch (type){

            case "Admiral's Order": return SWCardType.ADMIRALS_ORDER;   
            case "Creature":        return SWCardType.CREATURE;         
            case "Def Shield":      return SWCardType.DEF_SHIELD;       
            case "Device":          return SWCardType.DEVICE;           
            case "Epic Event":      return SWCardType.EPIC_EVENT;       
            case "Jedi Test":       return SWCardType.JEDI_TEST;        
            case "Objective":       return SWCardType.OBJECTIVE;        
            case "Pod Racer":       return SWCardType.POD_RACER;        

            case "Character":       switch (subType){

                                        case "Alien":       return SWCardType.CHAR_ALIEN;       
                                        case "Darth Maul":  return SWCardType.CHAR_DARTH_MAUL;  
                                        case "Driod":       return SWCardType.CHAR_DROID;       
                                        case "Imperial":    return SWCardType.CHAR_IMPERIAL;    
                                        case "Jedi Master": return SWCardType.CHAR_JEDI_MASTER;
                                        case "Rebel":       return SWCardType.CHAR_REBEL;       
                                        case "Republic":    return SWCardType.CHAR_REPUBLIC;    
                                    }                              
            case "Effect":          switch (subType){

                                        case "Immediate":   return SWCardType.EFF_IMMEDIATE;    
                                        case "Mobile":      return SWCardType.EFF_MOBILE;       
                                        case "Political":   return SWCardType.EFF_POLITICAL;    
                                        case "Starting":    return SWCardType.EFF_STARTING;     
                                        case "Utinni":      return SWCardType.EFF_UTINNI;       
                                        default:            return SWCardType.EFFECT;           
                                    }
            case "Interrupt":       switch (subType){

                                        case "Lost":        return SWCardType.INT_LOST;         
                                        case "Lost/Used":   return SWCardType.INT_LOST_USED;    
                                        case "Start/Lost":  return SWCardType.INT_START_LOST;   
                                        case "Start/Used":  return SWCardType.INT_START_USED;   
                                        case "Used":        return SWCardType.INT_USED;         
                                    }
            case "Location":       switch (subType){

                                        case "Sector":      return SWCardType.LOC_SECTOR;       
                                        case "Site":        return SWCardType.LOC_SITE;         
                                        case "System":      return SWCardType.LOC_SYSTEM;       
                                    }
            case "Starship":       switch (subType){

                                        case "Capital":     return SWCardType.STSHIP_CAPITAL;        
                                        case "Squadron":    return SWCardType.STSHIP_SQUADRON;       
                                        case "Starfighter": return SWCardType.STSHIP_STARFIGHTER;    
                                    }
            case "Vehicle":       switch (subType){

                                        case "Combat":      return SWCardType.VEH_COMBAT;       
                                        case "Creature":    return SWCardType.VEH_CREATURE;     
                                        case "Shuttle":     return SWCardType.VEH_SHUTTLE;      
                                        case "Transport":   return SWCardType.VEH_TRANSPORT;    
                                    }
            case "Weapon":       switch (subType){

                                        case "Artillary":   return SWCardType.WEAP_ARTILLARY;   
                                        case "Automated":   return SWCardType.WEAP_AUTOMATED;   
                                        case "Character":   return SWCardType.WEAP_CHARACTER;   
                                        case "Death Star":  return SWCardType.WEAP_DEATHSTAR;   
                                        case "Starship":    return SWCardType.WEAP_STARSHIP;    
                                        case "Vehicle":     return SWCardType.WEAP_VEHICLE;     
                                    }
            default: return SWCardType.WEAP_DEATHSTAR;
        }
    }

    public String getName(){
        return super.getName();
    }


    @Override
    public String toString(){

        //String newString = "Product Type: " + super.getProductType();
         String newString = this.rarity.toString() + " | " + String.format("%-23s", this.type) + " | " + String.format("%-30s", super.getName())
         + " | " + String.format("%.40s", this.gameText) + "...";
        /*    newString += "\nType: " + this.type;
            //newString += "\nsubType: " + this.subType;
            newString += "\nSide: " + this.side;
            newString += "\nSet: " + this.set.toString();
            newString += "\nRarity: " + this.rarity.toString();
            newString += "\nDestiny: " + this.destiny;
            newString += "\nGame Text: " + this.gameText;
            newString += "\nPrice: " + super.getPrice();
            newString += "\nImage Path: " + super.getImagePath(); */
        return newString;

    }

}