/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AccidentsAndIncidents_H_
#define	_AccidentsAndIncidents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum AccidentsAndIncidents {
	AccidentsAndIncidents_accident	= 513,
	AccidentsAndIncidents_serious_accident	= 514,
	AccidentsAndIncidents_injury_accident	= 515,
	AccidentsAndIncidents_minor_accident	= 516,
	AccidentsAndIncidents_multi_vehicle_accident	= 517,
	AccidentsAndIncidents_numerous_accidents	= 518,
	AccidentsAndIncidents_accident_involving_a_bicycle	= 519,
	AccidentsAndIncidents_accident_involving_a_bus	= 520,
	AccidentsAndIncidents_accident_involving_a_motorcycle	= 521,
	AccidentsAndIncidents_accident_involving_a_pedestrian	= 522,
	AccidentsAndIncidents_accident_involving_a_train	= 523,
	AccidentsAndIncidents_accident_involving_a_truck	= 524,
	AccidentsAndIncidents_accident_involving_a_semi_trailer	= 562,
	AccidentsAndIncidents_accident_involving_hazardous_materials	= 525,
	AccidentsAndIncidents_earlier_accident	= 526,
	AccidentsAndIncidents_medical_emergency	= 527,
	AccidentsAndIncidents_secondary_accident	= 528,
	AccidentsAndIncidents_rescue_and_recovery_work_REMOVED	= 529,
	AccidentsAndIncidents_accident_investigation_work	= 530,
	AccidentsAndIncidents_incident	= 531,
	AccidentsAndIncidents_stalled_vehicle	= 532,
	AccidentsAndIncidents_abandoned_vehicle	= 533,
	AccidentsAndIncidents_disabled_vehicle	= 534,
	AccidentsAndIncidents_disabled_truck	= 535,
	AccidentsAndIncidents_disabled_semi_trailer	= 536,
	AccidentsAndIncidents_disabled_bus	= 537,
	AccidentsAndIncidents_disabled_train	= 538,
	AccidentsAndIncidents_vehicle_spun_out	= 539,
	AccidentsAndIncidents_vehicle_on_fire	= 540,
	AccidentsAndIncidents_vehicle_in_water	= 541,
	AccidentsAndIncidents_vehicles_slowing_to_look_at_accident	= 542,
	AccidentsAndIncidents_jackknifed_semi_trailer	= 543,
	AccidentsAndIncidents_jackknifed_trailer_home	= 544,
	AccidentsAndIncidents_jackknifed_trailer	= 545,
	AccidentsAndIncidents_spillage_occurring_from_moving_vehicle	= 546,
	AccidentsAndIncidents_acid_spill	= 547,
	AccidentsAndIncidents_chemical_spill	= 548,
	AccidentsAndIncidents_fuel_spill	= 549,
	AccidentsAndIncidents_hazardous_materials_spill	= 550,
	AccidentsAndIncidents_oil_spill	= 551,
	AccidentsAndIncidents_spilled_load	= 552,
	AccidentsAndIncidents_toxic_spill	= 553,
	AccidentsAndIncidents_overturned_vehicle	= 554,
	AccidentsAndIncidents_overturned_truck	= 555,
	AccidentsAndIncidents_overturned_semi_trailer	= 556,
	AccidentsAndIncidents_overturned_bus	= 557,
	AccidentsAndIncidents_derailed_train	= 558,
	AccidentsAndIncidents_stuck_vehicle	= 559,
	AccidentsAndIncidents_truck_stuck_under_bridge	= 560,
	AccidentsAndIncidents_bus_stuck_under_bridge	= 561,
	AccidentsAndIncidents_accident_cleared	= 638,
	AccidentsAndIncidents_incident_cleared	= 639
} e_AccidentsAndIncidents;

/* AccidentsAndIncidents */
typedef long	 AccidentsAndIncidents_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_AccidentsAndIncidents_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_AccidentsAndIncidents;
asn_struct_free_f AccidentsAndIncidents_free;
asn_struct_print_f AccidentsAndIncidents_print;
asn_constr_check_f AccidentsAndIncidents_constraint;
ber_type_decoder_f AccidentsAndIncidents_decode_ber;
der_type_encoder_f AccidentsAndIncidents_encode_der;
xer_type_decoder_f AccidentsAndIncidents_decode_xer;
xer_type_encoder_f AccidentsAndIncidents_encode_xer;
jer_type_encoder_f AccidentsAndIncidents_encode_jer;
oer_type_decoder_f AccidentsAndIncidents_decode_oer;
oer_type_encoder_f AccidentsAndIncidents_encode_oer;
per_type_decoder_f AccidentsAndIncidents_decode_uper;
per_type_encoder_f AccidentsAndIncidents_encode_uper;
per_type_decoder_f AccidentsAndIncidents_decode_aper;
per_type_encoder_f AccidentsAndIncidents_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _AccidentsAndIncidents_H_ */
#include "asn_internal.h"