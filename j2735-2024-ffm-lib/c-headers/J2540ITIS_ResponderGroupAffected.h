/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_J2540ITIS_ResponderGroupAffected_H_
#define	_J2540ITIS_ResponderGroupAffected_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum J2540ITIS_ResponderGroupAffected {
	J2540ITIS_ResponderGroupAffected_emergency_vehicle_units	= 9729,
	J2540ITIS_ResponderGroupAffected_federal_law_enforcement_units	= 9730,
	J2540ITIS_ResponderGroupAffected_state_police_units	= 9731,
	J2540ITIS_ResponderGroupAffected_county_police_units	= 9732,
	J2540ITIS_ResponderGroupAffected_local_police_units	= 9733,
	J2540ITIS_ResponderGroupAffected_ambulance_units	= 9734,
	J2540ITIS_ResponderGroupAffected_rescue_units	= 9735,
	J2540ITIS_ResponderGroupAffected_fire_units	= 9736,
	J2540ITIS_ResponderGroupAffected_hAZMAT_units	= 9737,
	J2540ITIS_ResponderGroupAffected_light_tow_unit	= 9738,
	J2540ITIS_ResponderGroupAffected_heavy_tow_unit	= 9739,
	J2540ITIS_ResponderGroupAffected_private_tow_units	= 9743,
	J2540ITIS_ResponderGroupAffected_freeway_service_patrols	= 9740,
	J2540ITIS_ResponderGroupAffected_transportation_response_units	= 9741,
	J2540ITIS_ResponderGroupAffected_private_contractor_response_units	= 9742
} e_J2540ITIS_ResponderGroupAffected;

/* J2540ITIS_ResponderGroupAffected */
typedef long	 J2540ITIS_ResponderGroupAffected_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_J2540ITIS_ResponderGroupAffected_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_J2540ITIS_ResponderGroupAffected;
asn_struct_free_f J2540ITIS_ResponderGroupAffected_free;
asn_struct_print_f J2540ITIS_ResponderGroupAffected_print;
asn_constr_check_f J2540ITIS_ResponderGroupAffected_constraint;
ber_type_decoder_f J2540ITIS_ResponderGroupAffected_decode_ber;
der_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_der;
xer_type_decoder_f J2540ITIS_ResponderGroupAffected_decode_xer;
xer_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_xer;
jer_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_jer;
oer_type_decoder_f J2540ITIS_ResponderGroupAffected_decode_oer;
oer_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_oer;
per_type_decoder_f J2540ITIS_ResponderGroupAffected_decode_uper;
per_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_uper;
per_type_decoder_f J2540ITIS_ResponderGroupAffected_decode_aper;
per_type_encoder_f J2540ITIS_ResponderGroupAffected_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _J2540ITIS_ResponderGroupAffected_H_ */
#include "asn_internal.h"
