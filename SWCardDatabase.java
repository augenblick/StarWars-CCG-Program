import java.util.concurrent.ThreadLocalRandom;

public class SWCardDatabase{
	
	private static SWCardDatabase singleInstance = null; 
	private SWCard[] fullCardSet;
	private int[] recentCardsDrawn = new int[30];
	private int recentCardsCount;

	int cardsInFile = 2875;

	//Set offsets
	int prem_Offset;
	int prem_U_Offset;
	int prem_R_Offset;

	int nH_Offset;
	int nH_U_Offset;
	int nH_R_Offset;

	int hoth_Offset;
	int hoth_U_Offset;
	int hoth_R_Offset;

	int dag_Offset;
	int dag_U_Offset;
	int dag_R_Offset;

	int cC_Offset;
	int cC_U_Offset;
	int cC_R_Offset;

	int jP_Offset;
	int jP_U_Offset;
	int jP_R_Offset;

	int spEd_Offset;
	int spEd_U_Offset;
	int spEd_R_Offset;

	int end_Offset;
	int end_U_Offset;
	int end_R_Offset;

	int dS2_Offset;
	int dS2_U_Offset;
	int dS2_R_Offset;

	int tat_Offset;
	int tat_U_Offset;
	int tat_R_Offset;

	int cor_Offset;
	int cor_U_Offset;
	int cor_R_Offset;

	int th_Offset;
	int th_U_Offset;
	int th_R_Offset;

	// card arrays
	SWCard[] premiereCommons = new SWCard[198];
	SWCard[] premiereUncommons = new SWCard[156];
	SWCard[] premiereRares = new SWCard[156];

	SWCard[] newHopeCommons = new SWCard[100];
	SWCard[] newHopeUncommons = new SWCard[78];
	SWCard[] newHopeRares = new SWCard[78];

	SWCard[] hothCommons = new SWCard[100];
	SWCard[] hothUncommons = new SWCard[78];
	SWCard[] hothRares = new SWCard[78];

	SWCard[] dagobahCommons = new SWCard[50];
	SWCard[] dagobahUncommons = new SWCard[50];
	SWCard[] dagobahRares = new SWCard[80];

	SWCard[] cloudCityCommons = new SWCard[50];
	SWCard[] cloudCityUncommons = new SWCard[50];
	SWCard[] cloudCityRares = new SWCard[80];

	SWCard[] jabbasPalaceCommons = new SWCard[50];
	SWCard[] jabbasPalaceUncommons = new SWCard[50];
	SWCard[] jabbasPalaceRares = new SWCard[80];

	SWCard[] specEditionCommons = new SWCard[80];
	SWCard[] specEditionUncommons = new SWCard[80];
	SWCard[] specEditionRares = new SWCard[120];
	SWCard[] specEditionFixed = new SWCard[44];

	SWCard[] endorCommons = new SWCard[50];
	SWCard[] endorUncommons = new SWCard[50];
	SWCard[] endorRares = new SWCard[80];
	SWCard[] endorFoils = new SWCard[104];

	SWCard[] dS2Commons = new SWCard[50];
	SWCard[] dS2Uncommons = new SWCard[50];
	SWCard[] dS2Rares = new SWCard[242];
	SWCard[] dS2Fixed = new SWCard[2];

	SWCard[] tatooineCommons = new SWCard[30];
	SWCard[] tatooineUncommons = new SWCard[30];
	SWCard[] tatooineRares = new SWCard[120];

	SWCard[] coruscantCommons = new SWCard[60];
	SWCard[] coruscantUncommons = new SWCard[60];
	SWCard[] coruscantRares = new SWCard[240];

	SWCard[] theedCommons = new SWCard[41];
	SWCard[] theedUncommons = new SWCard[39];
	SWCard[] theedRares = new SWCard[160];

	SWCard[] ref1Foils = new SWCard[313];

	SWCard[] ref2Foils = new SWCard[228];
	SWCard[] ref2Combos = new SWCard[26];
	SWCard[] ref2Expands = new SWCard[28];

	SWCard[] ref3Foils = new SWCard[238];
	SWCard[] ref3Premiums = new SWCard[100];

	SWCard[] enhancedPremieres = new SWCard[6];
	SWCard[] enhancedCCs = new SWCard[12];
	SWCard[] enhancedJPs = new SWCard[12];
	SWCard[] jediPacks = new SWCard[10];
	SWCard[] thirdAnths = new SWCard[6];
	SWCard[] sealedPrems = new SWCard[18];
	SWCard[] sealedJPs = new SWCard[20];
	SWCard[] promos = new SWCard[2];
	SWCard[] starter1s = new SWCard[6];
	SWCard[] starter2s = new SWCard[7];

	
// Singleton constructor stuff ////////////////////////////

	private SWCardDatabase(){
		//System.out.println("ADSDSADHFDSONHFDS:");
		createCardArray("C:\\Users\\Nathan\\Documents\\programming\\SWCCG\\data\\SWCCGCardList_Formatted.csv");
	}

	private SWCardDatabase(String filePath){
		fullCardSet = new SWCard[cardsInFile]; //2517
		CardlistScanner scanMain = new CardlistScanner(filePath);
			for (int i = 0; i < fullCardSet.length; i++){
					fullCardSet[i] = new SWCard(scanMain.readCard());
			}
		}


	public static SWCardDatabase getInstance(){
		if (singleInstance == null){
			singleInstance = new SWCardDatabase();
		}
		return singleInstance;
	}

	public static SWCardDatabase getInstance(String filePath){
		if (singleInstance == null){
			singleInstance = new SWCardDatabase(filePath);
		}
		return singleInstance;
	}

// Creating Card Array //////////////////////////////////////////

	private void createCardArray(String filePath){

		// temporary arrays for card storage
		// SWCard[] premiereCommons = new SWCard[198];
		// SWCard[] premiereUncommons = new SWCard[156];
		// SWCard[] premiereRares = new SWCard[156];

		// SWCard[] newHopeCommons = new SWCard[100];
		// SWCard[] newHopeUncommons = new SWCard[78];
		// SWCard[] newHopeRares = new SWCard[78];

		// SWCard[] hothCommons = new SWCard[100];
		// SWCard[] hothUncommons = new SWCard[78];
		// SWCard[] hothRares = new SWCard[78];

		// SWCard[] dagobahCommons = new SWCard[50];
		// SWCard[] dagobahUncommons = new SWCard[50];
		// SWCard[] dagobahRares = new SWCard[80];

		// SWCard[] cloudCityCommons = new SWCard[50];
		// SWCard[] cloudCityUncommons = new SWCard[50];
		// SWCard[] cloudCityRares = new SWCard[80];

		// SWCard[] jabbasPalaceCommons = new SWCard[50];
		// SWCard[] jabbasPalaceUncommons = new SWCard[50];
		// SWCard[] jabbasPalaceRares = new SWCard[80];

		// SWCard[] specEditionCommons = new SWCard[80];
		// SWCard[] specEditionUncommons = new SWCard[80];
		// SWCard[] specEditionRares = new SWCard[120];
		// SWCard[] specEditionFixed = new SWCard[44];

		// SWCard[] endorCommons = new SWCard[50];
		// SWCard[] endorUncommons = new SWCard[50];
		// SWCard[] endorRares = new SWCard[80];
		// SWCard[] endorFoils = new SWCard[104];

		// SWCard[] dS2Commons = new SWCard[50];
		// SWCard[] dS2Uncommons = new SWCard[50];
		// SWCard[] dS2Rares = new SWCard[242];
		// SWCard[] dS2Fixed = new SWCard[2];

		// SWCard[] tatooineCommons = new SWCard[30];
		// SWCard[] tatooineUncommons = new SWCard[30];
		// SWCard[] tatooineRares = new SWCard[120];

		// SWCard[] coruscantCommons = new SWCard[60];
		// SWCard[] coruscantUncommons = new SWCard[60];
		// SWCard[] coruscantRares = new SWCard[240];

		// SWCard[] theedCommons = new SWCard[41];
		// SWCard[] theedUncommons = new SWCard[39];
		// SWCard[] theedRares = new SWCard[160];

		// SWCard[] ref1Foils = new SWCard[313];

		// SWCard[] ref2Foils = new SWCard[228];
		// SWCard[] ref2Combos = new SWCard[26];
		// SWCard[] ref2Expands = new SWCard[28];

		// SWCard[] ref3Foils = new SWCard[238];
		// SWCard[] ref3Premiums = new SWCard[100];

		// SWCard[] enhancedPremieres = new SWCard[6];
		// SWCard[] enhancedCCs = new SWCard[12];
		// SWCard[] enhancedJPs = new SWCard[12];
		// SWCard[] jediPacks = new SWCard[10];
		// SWCard[] thirdAnths = new SWCard[6];
		// SWCard[] sealedPrems = new SWCard[18];
		// SWCard[] sealedJPs = new SWCard[20];
		// SWCard[] promos = new SWCard[2];
		// SWCard[] starter1s = new SWCard[6];
		// SWCard[] starter2s = new SWCard[7];

		// Integers for keeping track of card counts
		int premiereCommonCount = 0;
		int premiereUncommonCount = 0;
		int premiereRareCount = 0;

		int newHopeCommonCount = 0;
		int newHopeUncommonCount = 0;
		int newHopeRareCount = 0;

		int hothCommonCount = 0;
		int hothUncommonCount = 0;
		int hothRareCount = 0;

		int dagobahCommonCount = 0;
		int dagobahUncommonCount = 0;
		int dagobahRareCount = 0;

		int cloudCityCommonCount = 0;
		int cloudCityUncommonCount = 0;
		int cloudCityRareCount = 0;

		int jabbasPalaceCommonCount = 0;
		int jabbasPalaceUncommonCount = 0;
		int jabbasPalaceRareCount = 0;

		int specEditionCommonCount = 0;
		int specEditionUncommonCount = 0;
		int specEditionRareCount = 0;
		int specEditionFixedCount = 0;

		int endorCommonCount = 0;
		int endorUncommonCount = 0;
		int endorRareCount = 0;
		int endorFoilCount = 0;

		int dS2CommonCount = 0;
		int dS2UncommonCount = 0;
		int dS2RareCount = 0;
		int dS2FixedCount = 0;

		int tatooineCommonCount = 0;
		int tatooineUncommonCount = 0;
		int tatooineRareCount = 0;

		int coruscantCommonCount = 0;
		int coruscantUncommonCount = 0;
		int coruscantRareCount = 0;

		int theedCommonCount = 0;
		int theedUncommonCount = 0;
		int theedRareCount = 0;

		int ref1FoilCount = 0;

		int ref2FoilCount = 0;
		int ref2ComboCount = 0;
		int ref2ExpandCount = 0;

		int ref3FoilCount = 0;
		int ref3PremiumCount = 0;

		int enhancedPremCount = 0;
		int enhancedCCCount = 0;
		int enhancedJPCount = 0;
		int jediPackCount = 0;
		int thirdAnthCount = 0;
		int sealedPremCount = 0;
		int sealedJPCount = 0;
		int promoCount = 0;
		int starter1Count = 0;
		int starter2Count = 0;	

		CardlistScanner scanMain = new CardlistScanner(filePath);
			for (int i = 0; i < cardsInFile; i++){

					SWCard thisCard = new SWCard(scanMain.readCard());
					//System.out.println(thisCard.getName());
					
					if(thisCard.getSet() != null){
						switch(thisCard.getSet()) {

							
							
							case PREMIERE: switch(thisCard.getRarity()) {

														case C1: premiereCommonCount = addToCardArray(premiereCommons, thisCard, premiereCommonCount, 1); break;
														case C2: premiereCommonCount = addToCardArray(premiereCommons, thisCard, premiereCommonCount, 2); break;
														case C3: premiereCommonCount = addToCardArray(premiereCommons, thisCard, premiereCommonCount, 3); break;
														case U1: premiereUncommonCount = addToCardArray(premiereUncommons, thisCard, premiereUncommonCount, 1); break;
														case U2: premiereUncommonCount = addToCardArray(premiereUncommons, thisCard, premiereUncommonCount, 2); break;
														case R1: premiereRareCount = addToCardArray(premiereRares, thisCard, premiereRareCount, 1); break;
														case R2: premiereRareCount = addToCardArray(premiereRares, thisCard, premiereRareCount, 2); break;
													}
													break;
							case A_NEW_HOPE: switch(thisCard.getRarity()) {

														case C1: newHopeCommonCount = addToCardArray(newHopeCommons, thisCard, newHopeCommonCount, 1); break;
														case C2: newHopeCommonCount = addToCardArray(newHopeCommons, thisCard, newHopeCommonCount, 2); break;
														case C3: newHopeCommonCount = addToCardArray(newHopeCommons, thisCard, newHopeCommonCount, 3); break;
														case U1: newHopeUncommonCount = addToCardArray(newHopeUncommons, thisCard, newHopeUncommonCount, 1); break;
														case U2: newHopeUncommonCount = addToCardArray(newHopeUncommons, thisCard, newHopeUncommonCount, 2); break;
														case R1: newHopeRareCount = addToCardArray(newHopeRares, thisCard, newHopeRareCount, 1); break;
														case R2: newHopeRareCount = addToCardArray(newHopeRares, thisCard, newHopeRareCount, 2); break;
													}
													break;
							case HOTH: switch(thisCard.getRarity()) {

														case C1: hothCommonCount = addToCardArray(hothCommons, thisCard, hothCommonCount, 1); break;
														case C2: hothCommonCount = addToCardArray(hothCommons, thisCard, hothCommonCount, 2); break;
														case C3: hothCommonCount = addToCardArray(hothCommons, thisCard, hothCommonCount, 3); break;
														case U1: hothUncommonCount = addToCardArray(hothUncommons, thisCard, hothUncommonCount, 1); break;
														case U2: hothUncommonCount = addToCardArray(hothUncommons, thisCard, hothUncommonCount, 2); break;
														case R1: hothRareCount = addToCardArray(hothRares, thisCard, hothRareCount, 1); break;
														case R2: hothRareCount = addToCardArray(hothRares, thisCard, hothRareCount, 2); break;
													}
													break;
							case DAGOBAH: switch(thisCard.getRarity()) {

														case C: dagobahCommonCount = addToCardArray(dagobahCommons, thisCard, dagobahCommonCount, 1); break;
														case U: dagobahUncommonCount = addToCardArray(dagobahUncommons, thisCard, dagobahUncommonCount, 1); break;
														case R: dagobahRareCount = addToCardArray(dagobahRares, thisCard, dagobahRareCount, 1); break;
													}
													break;
							case CLOUD_CITY: switch(thisCard.getRarity()) {

														case C: cloudCityCommonCount = addToCardArray(cloudCityCommons, thisCard, cloudCityCommonCount, 1); break;
														case U: cloudCityUncommonCount = addToCardArray(cloudCityUncommons, thisCard, cloudCityUncommonCount, 1); break;
														case R: cloudCityRareCount = addToCardArray(cloudCityRares, thisCard, cloudCityRareCount, 1); break;
													}
													break;
							case JABBAS_PALACE: switch(thisCard.getRarity()) {

														case C: jabbasPalaceCommonCount = addToCardArray(jabbasPalaceCommons, thisCard, jabbasPalaceCommonCount, 1); break;
														case U: jabbasPalaceUncommonCount = addToCardArray(jabbasPalaceUncommons, thisCard, jabbasPalaceUncommonCount, 1); break;
														case R: jabbasPalaceRareCount = addToCardArray(jabbasPalaceRares, thisCard, jabbasPalaceRareCount, 1); break;
													}
													break;
							case SPECIAL_EDITION: switch(thisCard.getRarity()) {

														case C: specEditionCommonCount = addToCardArray(specEditionCommons, thisCard, specEditionCommonCount, 1); break;
														case U: specEditionUncommonCount = addToCardArray(specEditionUncommons, thisCard, specEditionUncommonCount, 1); break;
														case R: specEditionRareCount = addToCardArray(specEditionRares, thisCard, specEditionRareCount, 1); break;
														case F: specEditionFixedCount = addToCardArray(specEditionFixed, thisCard, specEditionFixedCount, 1); break;
													}
													break;
							case ENDOR: switch(thisCard.getRarity()) {

														case C: endorCommonCount = addToCardArray(endorCommons, thisCard, endorCommonCount, 1); break;
														case U: endorUncommonCount = addToCardArray(endorUncommons, thisCard, endorUncommonCount, 1); break;
														case R: endorRareCount = addToCardArray(endorRares, thisCard, endorRareCount, 1); break;
														case CF: endorFoilCount = addToCardArray(endorFoils, thisCard, endorFoilCount, 9); break;
														case UF: endorFoilCount = addToCardArray(endorFoils, thisCard, endorFoilCount, 4); break;
														case RF: endorFoilCount = addToCardArray(endorFoils, thisCard, endorFoilCount, 2); break;
													}
													break;
							case DEATH_STAR_II: switch(thisCard.getRarity()) {

														case C: dS2CommonCount = addToCardArray(dS2Commons, thisCard, dS2CommonCount, 1); break;
														case U: dS2UncommonCount = addToCardArray(dS2Uncommons, thisCard, dS2UncommonCount, 1); break;
														case UR: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 2); break;
														case R3: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 3); break;
														case R4: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 4); break;
														case F: dS2FixedCount = addToCardArray(dS2Fixed, thisCard, dS2FixedCount, 1); break;
													}
													break;
							case TATOOINE: switch(thisCard.getRarity()) {

														case C: tatooineCommonCount = addToCardArray(tatooineCommons, thisCard, tatooineCommonCount, 1); break;
														case U: tatooineUncommonCount = addToCardArray(tatooineUncommons, thisCard, tatooineUncommonCount, 1); break;
														case R1: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 1); break;
														case R3: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 3); break;
														case R4: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 4); break;
													}
													break;
							case CORUSCANT: switch(thisCard.getRarity()) {

														case C: coruscantCommonCount = addToCardArray(coruscantCommons, thisCard, coruscantCommonCount, 1); break;
														case U: coruscantUncommonCount = addToCardArray(coruscantUncommons, thisCard, coruscantUncommonCount, 1); break;
														case R1: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 1); break;
														case R3: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 3); break;
														case R4: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 4); break;
													}
													break;
							case THEED_PALACE: switch(thisCard.getRarity()) {

														case C: theedCommonCount = addToCardArray(theedCommons, thisCard, theedCommonCount, 1); break;
														case U: theedUncommonCount = addToCardArray(theedUncommons, thisCard, theedUncommonCount, 1); break;
														case R1: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 1); break;
														case R3: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 3); break;
														case R4: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 4); break;
													}
													break;
							case REFLECTIONS_I: switch(thisCard.getRarity()) {

														case CF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 3); break;
														case UF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 2); break;
														case RF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 1); break;
													}
													break;
							case REFLECTIONS_II: switch(thisCard.getRarity()) {

														case CF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 3); break;
														case UF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 2); break;
														case RF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 1); break;
														case F1: ref2ComboCount = addToCardArray(ref2Combos, thisCard, ref2ComboCount, 1); break;
														case F2: ref2ExpandCount = addToCardArray(ref2Expands, thisCard, ref2ExpandCount, 1); break;
													}
													break;
							case REFLECTIONS_III: switch(thisCard.getRarity()) {

														case CF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 3); break;
														case UF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 2); break;
														case RF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 1); break;
														case F: ref3PremiumCount = addToCardArray(ref3Premiums, thisCard, ref3PremiumCount, 1); break;
													}
													break;
							case ENHANCEDPREM: switch(thisCard.getRarity()) {

														case F: enhancedPremCount = addToCardArray(enhancedPremieres, thisCard, enhancedPremCount, 1); break;
													}
													break;
							case ENHANCEDCC: switch(thisCard.getRarity()) {

														case F: enhancedCCCount = addToCardArray(enhancedCCs, thisCard, enhancedCCCount, 1); break;
													}
													break;
							case ENHANCEDJP: switch(thisCard.getRarity()) {

														case F: enhancedJPCount = addToCardArray(enhancedJPs, thisCard, enhancedJPCount, 1); break;
													}
													break;
							case JEDI_PACK: switch(thisCard.getRarity()) {

														case F: jediPackCount = addToCardArray(jediPacks, thisCard, jediPackCount, 1); break;
													}
													break;
							case THIRD_ANTHOLOGY: switch(thisCard.getRarity()) {

														case F: thirdAnthCount = addToCardArray(thirdAnths, thisCard, thirdAnthCount, 1); break;
													}
													break;
							case SEALEDPREM: switch(thisCard.getRarity()) {

														case F: sealedPremCount = addToCardArray(sealedPrems, thisCard, sealedPremCount, 1); break;
													}
													break;
							case SEALEDJP: switch(thisCard.getRarity()) {

														case F: sealedJPCount = addToCardArray(sealedJPs, thisCard, sealedJPCount, 1); break;
													}
													break;
							case PROMO: switch(thisCard.getRarity()) {

														case F: promoCount = addToCardArray(promos, thisCard, promoCount, 1); break;
													}
													break;
							case STARTER_BOX_1: switch(thisCard.getRarity()) {

														case F: starter1Count = addToCardArray(starter1s, thisCard, starter1Count, 1); break;
													}
													break;
							case STARTER_BOX_2: switch(thisCard.getRarity()) {

														case F: starter2Count = addToCardArray(starter2s, thisCard, starter2Count, 1); break;
													}
													break;
							
							











						}
				}


			}
			// USED TO DETERMINE NECESSARY ARRAY SIZES
			// System.out.println("Premiere Common Count: " + premiereCommonCount);
			// System.out.println("Premiere Uncommon Count: " + premiereUncommonCount);
			// System.out.println("Premiere Rare Count: " + premiereRareCount);

			// System.out.println("New Hope Common Count: " + newHopeCommonCount);
			// System.out.println("New Hope Uncommon Count: " + newHopeUncommonCount);
			// System.out.println("New Hope Rare Count: " + newHopeRareCount);

			// System.out.println("Hoth Common Count: " + hothCommonCount);
			// System.out.println("Hoth Uncommon Count: " + hothUncommonCount);
			// System.out.println("Hoth Rare Count: " + hothRareCount);

			// System.out.println("Dagobah Common Count: " + dagobahCommonCount);
			// System.out.println("Dagobah Uncommon Count: " + dagobahUncommonCount);
			// System.out.println("Dagobah Rare Count: " + dagobahRareCount);

			// System.out.println("CloudCity Common Count: " + cloudCityCommonCount);
			// System.out.println("CloudCity Uncommon Count: " + cloudCityUncommonCount);
			// System.out.println("CloudCity Rare Count: " + cloudCityRareCount);

			// System.out.println("JP Common Count: " + jabbasPalaceCommonCount);
			// System.out.println("JP Uncommon Count: " + jabbasPalaceUncommonCount);
			// System.out.println("JP Rare Count: " + jabbasPalaceRareCount);

			// System.out.println("SpecEdition Common Count: " + specEditionCommonCount);
			// System.out.println("SpecEdition Uncommon Count: " + specEditionUncommonCount);
			// System.out.println("SpecEdition Rare Count: " + specEditionRareCount);
			// System.out.println("SpecEdition Fixed Count: " + specEditionFixedCount);

			// System.out.println("Endor Common Count: " + endorCommonCount);
			// System.out.println("Endor Uncommon Count: " + endorUncommonCount);
			// System.out.println("Endor Rare Count: " + endorRareCount);
			// System.out.println("Endor Foils Count: " + endorFoilCount);

			// System.out.println("DS2 Common Count: " + dS2CommonCount);
			// System.out.println("DS2 Uncommon Count: " + dS2UncommonCount);
			// System.out.println("DS2 Rare Count: " + dS2RareCount);
			// System.out.println("DS2 Fixed Count: " + dS2FixedCount);

			// System.out.println("Tatooine Common Count: " + tatooineCommonCount);
			// System.out.println("Tatooine Uncommon Count: " + tatooineUncommonCount);
			// System.out.println("Tatooine Rare Count: " + tatooineRareCount);

			// System.out.println("Coruscant Common Count: " + coruscantCommonCount);
			// System.out.println("Coruscant Uncommon Count: " + coruscantUncommonCount);
			// System.out.println("Coruscant Rare Count: " + coruscantRareCount);

			// System.out.println("Theed Common Count: " + theedCommonCount);
			// System.out.println("Theed Uncommon Count: " + theedUncommonCount);
			// System.out.println("Theed Rare Count: " + theedRareCount);

			// System.out.println("Ref I Foils Count: " + ref1FoilCount);

			// System.out.println("Ref II Foils Count: " + ref2FoilCount);
			// System.out.println("Ref II Combos Count: " + ref2ComboCount);
			// System.out.println("Ref II Expansion Count: " + ref2ExpandCount);

			// System.out.println("Ref III Foils Count: " + ref3FoilCount);
			// System.out.println("Ref III Premiums Count: " + ref3PremiumCount);

			// System.out.println("Enhanced Premiere Count: " + enhancedPremCount);
			// System.out.println("Enhanced CC Count: " + enhancedCCCount);
			// System.out.println("Enhanced JP Count: " + enhancedJPCount);

			// System.out.println("Jedi Pack Count: " + jediPackCount);
			// System.out.println("Third Anthology Count: " + thirdAnthCount);
			// System.out.println("Sealed Premiere Count: " + sealedPremCount);
			// System.out.println("Sealed JP Count: " + sealedJPCount);
			// System.out.println("Promo Count: " + promoCount);
			// System.out.println("Starter Set Count: " + starter1Count);
			// System.out.println("Empire Starter Set Count: " + starter2Count);
		
	}

	private int addToCardArray(SWCard[] cardArray, SWCard cardToAdd, int cardCount, int numberCardsToAdd){
		//System.out.println(" current count is ");
		for (int i = 0; i < numberCardsToAdd; i++){

			cardArray[cardCount] = cardToAdd;
			cardCount += 1;
		}

		return cardCount;
	}

	public SWCard retrieveRandomCard(SWSet thisSet, SWRarity thisRarity){

		SWCard[] thisArray = new SWCard[1];

		switch (thisSet){

			case PREMIERE: switch(thisRarity) {

									case C: thisArray = premiereCommons; break;
									case U: thisArray = premiereUncommons; break;
									case R: thisArray = premiereRares; break;
								}
								break;
			case A_NEW_HOPE: switch(thisRarity) {

									case C: thisArray = newHopeCommons; break;
									case U: thisArray = newHopeUncommons; break;
									case R: thisArray = newHopeRares; break;
								}
								break;
			case HOTH: switch(thisRarity) {

									case C: thisArray = hothCommons; break;
									case U: thisArray = hothUncommons; break;
									case R: thisArray = hothRares; break;
								}
								break;
			case DAGOBAH: switch(thisRarity) {

			 						case C: thisArray = dagobahCommons; break;
									case U: thisArray = dagobahUncommons; break;
									case R: thisArray = dagobahRares; break;
								}
								break;
			case CLOUD_CITY: switch(thisRarity) {

									case C: thisArray = cloudCityCommons; break;
									case U: thisArray = cloudCityUncommons; break;
									case R: thisArray = cloudCityRares; break;
								}
								break;
			case JABBAS_PALACE: switch(thisRarity) {

									case C: thisArray = jabbasPalaceCommons; break;
									case U: thisArray = jabbasPalaceUncommons; break;
									case R: thisArray = jabbasPalaceRares; break;
								}
								break;
			case SPECIAL_EDITION: switch(thisRarity) {

									case C: thisArray = specEditionCommons; break;
									case U: thisArray = specEditionUncommons; break;
									case R: thisArray = specEditionRares; break;
									case F: thisArray = specEditionFixed; break;
								}
								break;
			case ENDOR: switch(thisRarity) {

									case C: thisArray = endorCommons; break;
									case U: thisArray = endorUncommons; break;
									case R: thisArray = endorRares; break;
									case F: thisArray = endorFoils; break;
								}
								break;
			// case DEATH_STAR_II: switch(thisCard.getRarity()) {

			// 						case C: dS2CommonCount = addToCardArray(dS2Commons, thisCard, dS2CommonCount, 1); break;
			// 						case U: dS2UncommonCount = addToCardArray(dS2Uncommons, thisCard, dS2UncommonCount, 1); break;
			// 						case UR: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 2); break;
			// 						case R3: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 3); break;
			// 						case R4: dS2RareCount = addToCardArray(dS2Rares, thisCard, dS2RareCount, 4); break;
			// 						case F: dS2FixedCount = addToCardArray(dS2Fixed, thisCard, dS2FixedCount, 1); break;
			// 					}
			// 					break;
			// case TATOOINE: switch(thisCard.getRarity()) {

			// 						case C: tatooineCommonCount = addToCardArray(tatooineCommons, thisCard, tatooineCommonCount, 1); break;
			// 						case U: tatooineUncommonCount = addToCardArray(tatooineUncommons, thisCard, tatooineUncommonCount, 1); break;
			// 						case R1: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 1); break;
			// 						case R3: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 3); break;
			// 						case R4: tatooineRareCount = addToCardArray(tatooineRares, thisCard, tatooineRareCount, 4); break;
			// 					}
			// 					break;
			// case CORUSCANT: switch(thisCard.getRarity()) {

			// 						case C: coruscantCommonCount = addToCardArray(coruscantCommons, thisCard, coruscantCommonCount, 1); break;
			// 						case U: coruscantUncommonCount = addToCardArray(coruscantUncommons, thisCard, coruscantUncommonCount, 1); break;
			// 						case R1: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 1); break;
			// 						case R3: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 3); break;
			// 						case R4: coruscantRareCount = addToCardArray(coruscantRares, thisCard, coruscantRareCount, 4); break;
			// 					}
			// 					break;
			// case THEED_PALACE: switch(thisCard.getRarity()) {

			// 						case C: theedCommonCount = addToCardArray(theedCommons, thisCard, theedCommonCount, 1); break;
			// 						case U: theedUncommonCount = addToCardArray(theedUncommons, thisCard, theedUncommonCount, 1); break;
			// 						case R1: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 1); break;
			// 						case R3: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 3); break;
			// 						case R4: theedRareCount = addToCardArray(theedRares, thisCard, theedRareCount, 4); break;
			// 					}
			// 					break;
			// case REFLECTIONS_I: switch(thisCard.getRarity()) {

			// 						case CF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 3); break;
			// 						case UF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 2); break;
			// 						case RF: ref1FoilCount = addToCardArray(ref1Foils, thisCard, ref1FoilCount, 1); break;
			// 					}
			// 					break;
			// case REFLECTIONS_II: switch(thisCard.getRarity()) {

			// 						case CF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 3); break;
			// 						case UF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 2); break;
			// 						case RF: ref2FoilCount = addToCardArray(ref2Foils, thisCard, ref2FoilCount, 1); break;
			// 						case F1: ref2ComboCount = addToCardArray(ref2Combos, thisCard, ref2ComboCount, 1); break;
			// 						case F2: ref2ExpandCount = addToCardArray(ref2Expands, thisCard, ref2ExpandCount, 1); break;
			// 					}
			// 					break;
			// case REFLECTIONS_III: switch(thisCard.getRarity()) {

			// 						case CF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 3); break;
			// 						case UF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 2); break;
			// 						case RF: ref3FoilCount = addToCardArray(ref3Foils, thisCard, ref3FoilCount, 1); break;
			// 						case F: ref3PremiumCount = addToCardArray(ref3Premiums, thisCard, ref3PremiumCount, 1); break;
			// 					}
			// 					break;
			// case ENHANCEDPREM: switch(thisCard.getRarity()) {

			// 						case F: enhancedPremCount = addToCardArray(enhancedPremieres, thisCard, enhancedPremCount, 1); break;
			// 					}
			// 					break;
			// case ENHANCEDCC: switch(thisCard.getRarity()) {

			// 						case F: enhancedCCCount = addToCardArray(enhancedCCs, thisCard, enhancedCCCount, 1); break;
			// 					}
			// 					break;
			// case ENHANCEDJP: switch(thisCard.getRarity()) {

			// 						case F: enhancedJPCount = addToCardArray(enhancedJPs, thisCard, enhancedJPCount, 1); break;
			// 					}
			// 					break;
			// case JEDI_PACK: switch(thisCard.getRarity()) {

			// 						case F: jediPackCount = addToCardArray(jediPacks, thisCard, jediPackCount, 1); break;
			// 					}
			// 					break;
			// case THIRD_ANTHOLOGY: switch(thisCard.getRarity()) {

			// 						case F: thirdAnthCount = addToCardArray(thirdAnths, thisCard, thirdAnthCount, 1); break;
			// 					}
			// 					break;
			// case SEALEDPREM: switch(thisCard.getRarity()) {

			// 						case F: sealedPremCount = addToCardArray(sealedPrems, thisCard, sealedPremCount, 1); break;
			// 					}
			// 					break;
			// case SEALEDJP: switch(thisCard.getRarity()) {

			// 						case F: sealedJPCount = addToCardArray(sealedJPs, thisCard, sealedJPCount, 1); break;
			// 					}
			// 					break;
			// case PROMO: switch(thisCard.getRarity()) {

			// 						case F: promoCount = addToCardArray(promos, thisCard, promoCount, 1); break;
			// 					}
			// 					break;
			// case STARTER_BOX_1: switch(thisCard.getRarity()) {

			// 						case F: starter1Count = addToCardArray(starter1s, thisCard, starter1Count, 1); break;
			// 					}
			// 					break;
			// case STARTER_BOX_2: switch(thisCard.getRarity()) {

			// 						case F: starter2Count = addToCardArray(starter2s, thisCard, starter2Count, 1); break;
			// 					}
			// 					break;




		}

		// once the Card Array has been decided, return a random card from it
		int max = thisArray.length;
		int randoCalrissian;
		boolean redraw;

		
		do {
		randoCalrissian = ThreadLocalRandom.current().nextInt(0, max);
		
		// TO DO: FURTHER TESTING TO ENSURE THIS IS WORKING/SUFFICIENT
		// check that we haven't too recently drawn this same number
		redraw = false;
			for (int i = 0; i < recentCardsDrawn.length; i++){
				if (randoCalrissian == recentCardsDrawn[i]) {
					redraw = true;
				}
			}
		} while (redraw);

		recentCardsDrawn[(recentCardsCount % (recentCardsDrawn.length - 1))] = randoCalrissian;

		return thisArray[randoCalrissian];
	}


}