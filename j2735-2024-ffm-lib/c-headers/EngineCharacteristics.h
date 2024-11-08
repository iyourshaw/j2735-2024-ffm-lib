/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_EngineCharacteristics_H_
#define	_EngineCharacteristics_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum EngineCharacteristics {
	EngineCharacteristics_noEntry	= 0,
	EngineCharacteristics_noEngine	= 1,
	EngineCharacteristics_petrolUnleaded	= 2,
	EngineCharacteristics_petrolLeaded	= 3,
	EngineCharacteristics_diesel	= 4,
	EngineCharacteristics_lpg	= 5,
	EngineCharacteristics_battery	= 6,
	EngineCharacteristics_solar	= 7,
	EngineCharacteristics_hybrid	= 8,
	EngineCharacteristics_hydrogen	= 9,
	EngineCharacteristics_multiFuel	= 10,
	EngineCharacteristics_bivalentPetrolLpg	= 11,
	EngineCharacteristics_bivalentPetrolCng	= 12,
	EngineCharacteristics_combinedPetrolElectric	= 13,
	EngineCharacteristics_cng	= 14,
	EngineCharacteristics_lng	= 15,
	EngineCharacteristics_combinedDieselElectric	= 16,
	EngineCharacteristics_combinedHydrogenElectric	= 17,
	EngineCharacteristics_bivalentHydrogenPetrol	= 18,
	EngineCharacteristics_bivalentHydrogenPetrolElectricEngine	= 19,
	EngineCharacteristics_fuelCellHydrogen	= 20,
	EngineCharacteristics_fuelCellPetrol	= 21,
	EngineCharacteristics_fuelCellMethanol	= 22,
	EngineCharacteristics_fuelCellEthanol	= 23,
	EngineCharacteristics_fuelCellDiesel	= 24,
	EngineCharacteristics_combinedMultiFuelElectricEngine	= 25,
	EngineCharacteristics_combinedCngElectricEngine	= 26,
	EngineCharacteristics_combinedLngElectricEngine	= 27,
	EngineCharacteristics_petrolEthanol	= 28,
	EngineCharacteristics_combinedLpgElectricEngine	= 29,
	EngineCharacteristics_hybridPetrolExternalBattery	= 30,
	EngineCharacteristics_hybridDieselExternalBattery	= 31,
	EngineCharacteristics_hybridLpgExternalBattery	= 32,
	EngineCharacteristics_hybridHydrogenExternalBattery	= 33,
	EngineCharacteristics_hybridMultiFuelExternalBattery	= 34,
	EngineCharacteristics_hybridCngExternalBattery	= 35,
	EngineCharacteristics_hybridLngExternalBattery	= 36,
	EngineCharacteristics_hybridBivalentHydrogenPetrolExternalBattery	= 37,
	EngineCharacteristics_hydrogenCng	= 38,
	EngineCharacteristics_hydrogenLng	= 39,
	EngineCharacteristics_hybridHydrogenCngExternalBattery	= 40,
	EngineCharacteristics_hybridHydrogenLngExternalBattery	= 41,
	EngineCharacteristics_ethanol	= 42,
	EngineCharacteristics_hybridFuelCellHydrogen	= 43,
	EngineCharacteristics_hybridFuelCellHydrogenExternalBattery	= 44,
	EngineCharacteristics_dualFuelLngDiesel	= 45,
	EngineCharacteristics_electricExternal	= 46,
	EngineCharacteristics_biogas	= 47,
	EngineCharacteristics_bioDiesel	= 48,
	EngineCharacteristics_bioPetrol	= 49,
	EngineCharacteristics_bivalentPetrolBiogas	= 50,
	EngineCharacteristics_combinedBiogasElectricEngine	= 51,
	EngineCharacteristics_dualFuelCngDiesel	= 52,
	EngineCharacteristics_other	= 255
} e_EngineCharacteristics;

/* EngineCharacteristics */
typedef long	 EngineCharacteristics_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_EngineCharacteristics_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_EngineCharacteristics;
asn_struct_free_f EngineCharacteristics_free;
asn_struct_print_f EngineCharacteristics_print;
asn_constr_check_f EngineCharacteristics_constraint;
ber_type_decoder_f EngineCharacteristics_decode_ber;
der_type_encoder_f EngineCharacteristics_encode_der;
xer_type_decoder_f EngineCharacteristics_decode_xer;
xer_type_encoder_f EngineCharacteristics_encode_xer;
jer_type_encoder_f EngineCharacteristics_encode_jer;
oer_type_decoder_f EngineCharacteristics_decode_oer;
oer_type_encoder_f EngineCharacteristics_encode_oer;
per_type_decoder_f EngineCharacteristics_decode_uper;
per_type_encoder_f EngineCharacteristics_encode_uper;
per_type_decoder_f EngineCharacteristics_decode_aper;
per_type_encoder_f EngineCharacteristics_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _EngineCharacteristics_H_ */
#include "asn_internal.h"
