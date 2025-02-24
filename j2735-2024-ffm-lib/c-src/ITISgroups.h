/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ITISgroups_H_
#define	_ITISgroups_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ITISgroups {
	ITISgroups_trafficConditions	= 1,
	ITISgroups_accidentsAndIncidents	= 2,
	ITISgroups_closures	= 3,
	ITISgroups_roadwork	= 4,
	ITISgroups_obstruction	= 5,
	ITISgroups_delayStatusCancellation	= 6,
	ITISgroups_unusualDriving	= 7,
	ITISgroups_mobileSituation	= 8,
	ITISgroups_deviceStatus	= 9,
	ITISgroups_restrictionClass	= 10,
	ITISgroups_incidentResponseStatus	= 11,
	ITISgroups_disasters	= 12,
	ITISgroups_disturbances	= 13,
	ITISgroups_sportingEvents	= 14,
	ITISgroups_specialEvents	= 15,
	ITISgroups_parkingInformation	= 16,
	ITISgroups_systemInformation	= 17,
	ITISgroups_weatherConditions	= 18,
	ITISgroups_precipitation	= 19,
	ITISgroups_winds	= 20,
	ITISgroups_visibilityAndAirQuality	= 21,
	ITISgroups_temperature	= 22,
	ITISgroups_pavementConditions	= 23,
	ITISgroups_winterDrivingRestrictions	= 24,
	ITISgroups_winterDrivingIndex	= 25,
	ITISgroups_suggestionAdvice	= 26,
	ITISgroups_warningAdvice	= 27,
	ITISgroups_adviceInstructionsRecommendations	= 28,
	ITISgroups_adviceInstructionsMandatory	= 29,
	ITISgroups_qualifiers	= 30,
	ITISgroups_genericLocations	= 31,
	ITISgroups_laneRoadway	= 32,
	ITISgroups_alternateRoute	= 33,
	ITISgroups_units	= 34,
	ITISgroups_transitMode	= 35,
	ITISgroups_vehicleGroupAffected	= 36,
	ITISgroups_travelerGroupAffected	= 37,
	ITISgroups_responderGroupAffected	= 38,
	ITISgroups_incidentResponseEquipment	= 39,
	ITISgroups_assetStatus	= 40,
	ITISgroups_roadsideAssets	= 41,
	ITISgroups_transitOperations	= 42,
	ITISgroups_objects	= 43,
	ITISgroups_validManeuvers	= 44,
	ITISgroups_largeNumbers	= 45,
	ITISgroups_namedObjects	= 46,
	ITISgroups_recreationalObjectsAndActivities	= 47,
	ITISgroups_regulatoryAndWarningSigns	= 48,
	ITISgroups_smallNumbers	= 49,
	ITISgroups_states	= 50,
	ITISgroups_structures	= 51,
	ITISgroups_streetSuffixes	= 52,
	ITISgroups_mUTCDLocations	= 53
} e_ITISgroups;

/* ITISgroups */
typedef long	 ITISgroups_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_ITISgroups_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_ITISgroups;
asn_struct_free_f ITISgroups_free;
asn_struct_print_f ITISgroups_print;
asn_constr_check_f ITISgroups_constraint;
ber_type_decoder_f ITISgroups_decode_ber;
der_type_encoder_f ITISgroups_encode_der;
xer_type_decoder_f ITISgroups_decode_xer;
xer_type_encoder_f ITISgroups_encode_xer;
jer_type_encoder_f ITISgroups_encode_jer;
oer_type_decoder_f ITISgroups_decode_oer;
oer_type_encoder_f ITISgroups_encode_oer;
per_type_decoder_f ITISgroups_decode_uper;
per_type_encoder_f ITISgroups_encode_uper;
per_type_decoder_f ITISgroups_decode_aper;
per_type_encoder_f ITISgroups_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ITISgroups_H_ */
#include "asn_internal.h"
